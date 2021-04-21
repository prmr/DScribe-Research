package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URL;
import java.nio.CharBuffer;
import java.nio.channels.Selector;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.Scaffolding.SelectorAdapter;
import org.apache.commons.io.Scaffolding.YellOnCloseInputStream;
import org.apache.commons.io.Scaffolding.YellOnFlushAndCloseOutputStream;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.junit.jupiter.api.Test;

public class IOUtilsTest {
	
	@Test
	public void testAssertThrowsMessage_contentEquals_inputStreams_input1ReadIOException() {
		final IOException thrown = assertThrows(IOException.class,
				() -> IOUtils.contentEquals(Scaffolding.inputStreamIOException(), Scaffolding.byteArrayInputStream()));
		assertEquals("read", thrown.getMessage());
	}

	@Test
	public void testWriteLines_OutputStream_nullSeparator() throws Exception {
		final Object[] data = new Object[]{ "hello", "world" };
		final List<Object> list = Arrays.asList(data);
		
		final ByteArrayOutputStream baout = new ByteArrayOutputStream();
		final YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout, false, true);
		
		IOUtils.writeLines(list, null, out);
		out.off();
		out.flush();
		
		final String expected = "hello" + IOUtils.LINE_SEPARATOR + "world" + IOUtils.LINE_SEPARATOR;
		final String actual = baout.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testAssertThrowsMessage_copyLarge_readerToWriterWithOffset_offsetInvalid() {
		final EOFException thrown = assertThrows(EOFException.class,
				() -> IOUtils.copyLarge(Scaffolding.charArrayReader(), Scaffolding.charArrayWriter(), 1000, 100));
		assertEquals("Chars to skip: 1000 actual: 200", thrown.getMessage());
	}

	@SuppressWarnings("resource")
	@Test
	public void testCopy_inputStreamToWriter_Encoding() throws Exception {
		InputStream in = new ByteArrayInputStream(Scaffolding.inData);
		in = new YellOnCloseInputStream(in);
		
		final ByteArrayOutputStream baout = new ByteArrayOutputStream();
		final YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout, true, true);
		final Writer writer = new OutputStreamWriter(baout, "US-ASCII");
		
		IOUtils.copy(in, writer, "UTF8");
		out.off();
		writer.flush();
		
		assertEquals(0, in.available(), "Not all bytes were read");
		byte[] bytes = baout.toByteArray();
		bytes = new String(bytes, "UTF8").getBytes("US-ASCII");
		assertTrue(Arrays.equals(Scaffolding.inData, bytes), "Content differs");
	}
	
	@Test
	public void testResourceToURL_NonExistingResource() {
		assertThrows(IOException.class, () -> IOUtils.resourceToURL("/non-existing-file.bin"));
	}

	@Test
	public void testCopyLarge_SkipWithInvalidOffset() throws IOException {
		ByteArrayInputStream is = null;
		ByteArrayOutputStream os = null;
		try {
			is = new ByteArrayInputStream(Scaffolding.iarr);
			os = new ByteArrayOutputStream();
			
			assertEquals(100, IOUtils.copyLarge(is, os, -10, 100));
			final byte[] oarr = os.toByteArray();
			
			assertEquals(100, oarr.length);
			assertEquals(1, oarr[1]);
			assertEquals(79, oarr[79]);
			assertEquals(-1, oarr[80]);
			
		}
		finally {
			IOUtils.closeQuietly(is);
			IOUtils.closeQuietly(os);
		}
	}
	
	@Test
	public void testRead() throws Throwable {
		char[] charArray = new char[10];
		try {
			IOUtils.read((Reader) null, charArray);
			fail("Expecting exception: NullPointerException");
			
		}
		catch (NullPointerException e) {
			Scaffolding.verifyException("org.apache.commons.io.IOUtils", e);
		}
	}
	
	@Test
	public void testResourceToByteArray_ExistingResourceAtRootPackage() throws Exception {
		final long fileSize = new File(getClass().getResource("/test-file-utf8.bin").toURI()).length();
		final byte[] bytes = IOUtils.resourceToByteArray("/test-file-utf8.bin");
		assertNotNull(bytes);
		assertEquals(fileSize, bytes.length);
	}

	@Test
	public void testAssertThrowsMessage_write_charSeqToOutputStreamWithString_encodingIllegal() {
		final IllegalCharsetNameException thrown = assertThrows(IllegalCharsetNameException.class,
				() -> IOUtils.write(Scaffolding.CHAR_SEQ, Scaffolding.outputStream(), Scaffolding.CHARSET_ILLEGAL));
		assertEquals(Scaffolding.CHARSET_ILLEGAL, thrown.getMessage());
	}

	@Test
	public void testLength() {
		CharBuffer charBuffer = CharBuffer.wrap((CharSequence) "'`@");
		int int0 = IOUtils.length((CharSequence) charBuffer);
		assertEquals(3, int0);
	}
	
	@Test
	public void testContentEqualsIgnoreEOL() throws Throwable {
		char[] charArray = new char[7];
		CharArrayReader charArrayReader = new CharArrayReader(charArray, 1, 2);
		boolean boolean0 = IOUtils.contentEqualsIgnoreEOL(charArrayReader, charArrayReader);
		assertTrue(boolean0);
	}

	@Test
	public void testCloseQuietly_SelectorIOException() {
		final Selector selector = new SelectorAdapter() {
			
			@Override
			public void close() throws IOException {
				throw new IOException();
			}
		};
		IOUtils.closeQuietly(selector);
	}

	@Test
	public void testAssertThrows_copy_readerToOutputStreamWithCharset_inNull() {
		assertThrows(NullPointerException.class,
				() -> IOUtils.copy((Reader) null, Scaffolding.outputStream(), StandardCharsets.UTF_8));
	}

	@SuppressWarnings("resource")
	@Test
	public void testCopy_readerToOutputStream_Encoding_nullOut() throws Exception {
		InputStream in = new ByteArrayInputStream(Scaffolding.inData);
		in = new YellOnCloseInputStream(in);
		final Reader reader = new InputStreamReader(in, "US-ASCII");
		assertThrows(NullPointerException.class, () -> IOUtils.copy(reader, null, "UTF16"));
	}

	@Test
	public void testResourceToURL_ExistingResourceAtRootPackage() throws Exception {
		final URL url = IOUtils.resourceToURL("/test-file-utf8.bin");
		assertNotNull(url);
		assertTrue(url.getFile().endsWith("/test-file-utf8.bin"));
	}

	@Test
	public void testAssertThrows_toByteArray_URI_uriNull() {
		assertThrows(NullPointerException.class, () -> IOUtils.toByteArray((URI) null));
	}

	@Test
	public void testAssertThrowsMessage_write_charSeqToOutputStreamWithString_writeIOException() {
		final IOException thrown = assertThrows(IOException.class,
				() -> IOUtils
						.write(Scaffolding.CHAR_SEQ, Scaffolding.outputStreamIOException(), Scaffolding.CHARSET_VALID));
		assertEquals("write", thrown.getMessage());
	}

	@Test
	public void testAssertThrows_toCharArray_inputStreamWithString_inNull() {
		assertThrows(NullPointerException.class,
				() -> IOUtils.toCharArray((InputStream) null, Scaffolding.CHARSET_VALID));
	}

	@Test
	public void testToByteArray_String() throws Exception {
		try (FileReader fin = new FileReader(Scaffolding.m_testFile)) {
			final String str = IOUtils.toString(fin);
			
			final byte[] out = IOUtils.toByteArray(str);
			Scaffolding.assertEqualContent(str.getBytes(), out);
		}
	}
}
