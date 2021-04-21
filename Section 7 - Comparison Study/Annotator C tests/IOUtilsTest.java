package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.Scaffolding.MockFileOutputStream;
import org.apache.commons.io.Scaffolding.MockPrintWriter;
import org.apache.commons.io.Scaffolding.YellOnCloseInputStream;
import org.apache.commons.io.Scaffolding.YellOnFlushAndCloseOutputStream;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.junit.jupiter.api.Test;

public class IOUtilsTest {
	
	@Test
	public void testAssertThrowsMessage_toString_URIWithString_uriNotAbsolute() {
		final IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
				() -> IOUtils.toString(Scaffolding.uriNotAbsolute(), Scaffolding.CHARSET_VALID));
		assertEquals("URI is not absolute", thrown.getMessage());
	}
	
	@Test
	public void testAssertThrows_buffer_writerWithSize_writerNull() {
		assertThrows(NullPointerException.class, () -> IOUtils.buffer((Writer) null, 1));
	}
	
	@Test
	public void testWrite_charArrayToWriter_Encoding_nullStream() throws Exception {
		final String str = new String(Scaffolding.inData, "US-ASCII");
		try {
			IOUtils.write(str.toCharArray(), (Writer) null);
			fail();
		}
		catch (final NullPointerException ignore) {
		}
	}
	
	@Test
	public void testToByteArray_InputStream_Size() throws Exception {
		try (FileInputStream fin = new FileInputStream(Scaffolding.m_testFile)) {
			final byte[] out = IOUtils.toByteArray(fin, Scaffolding.m_testFile.length());
			assertNotNull(out);
			assertEquals(0, fin.available(), "Not all bytes were read");
			assertEquals(Scaffolding.FILE_SIZE,
					out.length,
					"Wrong output size: out.length=" + out.length + "!=" + Scaffolding.FILE_SIZE);
			Scaffolding.assertEqualContent(out, Scaffolding.m_testFile);
		}
	}
	
	@Test
	public void testToByteArray_InputStream_SizeLong() throws Exception {
		
		try (FileInputStream fin = new FileInputStream(Scaffolding.m_testFile)) {
			IOUtils.toByteArray(fin, (long) Integer.MAX_VALUE + 1);
			fail("IOException expected");
		}
		catch (final IllegalArgumentException exc) {
			assertTrue(exc.getMessage().startsWith("Size cannot be greater than Integer max value"),
					"Exception message does not start with \"Size cannot be greater than Integer max value\"");
		}
		
	}
	
	@Test
	public void testAssertThrows_toString_inputStreamWithString_inNull() {
		assertThrows(NullPointerException.class, () -> IOUtils.toString((InputStream) null, Scaffolding.CHARSET_VALID));
	}
	
	@SuppressWarnings("resource")
	@Test
	public void testCopy_readerToWriter_nullOut() throws Exception {
		InputStream in = new ByteArrayInputStream(Scaffolding.inData);
		in = new YellOnCloseInputStream(in);
		final Reader reader = new InputStreamReader(in, "US-ASCII");
		assertThrows(NullPointerException.class, () -> IOUtils.copy(reader, (Writer) null));
	}
	
	@Test
	public void testAssertThrowsMessage_toByteArray_inputStreamLongSize_sizeNegative() {
		final IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
				() -> IOUtils.toByteArray(Scaffolding.inputStreamIOException(), (long) -1));
		assertEquals("Size must be equal or greater than zero: -1", thrown.getMessage());
	}
	
	@Test
	public void testAssertThrowsMessage_copy_readerToOutputStreamWithString_readIOException() {
		final IOException thrown = assertThrows(IOException.class,
				() -> IOUtils
						.copy(Scaffolding.readerIOException(), Scaffolding.outputStream(), Scaffolding.CHARSET_VALID));
		assertEquals("read", thrown.getMessage());
	}
	
	@Test
	public void testWrite() throws Throwable {
		IOUtils.write((StringBuffer) null, (OutputStream) null);
	}
	
	@Test
	public void testIOUtils1() throws Throwable {
		Reader reader0 = null;
		Writer writer0 = null;
		Reader reader1 = null;
		char[] charArray = new char[]{};
		int int0 = IOUtils.length(charArray);
		Writer writer1 = null;
		IOUtils.writeChunked(charArray, writer1);
		int int1 = IOUtils.read(reader1, charArray);
		Writer writer2 = null;
		IOUtils.writeChunked(charArray, writer2);
		int int2 = IOUtils.length(charArray);
		int int3 = IOUtils.length(charArray);
		try {
			long long0 = IOUtils.copyLarge(reader0, writer0, (long) 'a', 0L, charArray);
			fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
		}
		catch (NullPointerException e) {
		}
		assertNotNull(charArray);
		assertEquals(String.copyValueOf(charArray), "");
		assertEquals(String.valueOf(charArray), "");
		assertEquals(Arrays.toString(charArray), "[]");
		assertTrue(int0 == 0, "'" + int0 + "' != '" + 0 + "'");
		assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
		assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
		assertTrue(int3 == 0, "'" + int3 + "' != '" + 0 + "'");
	}
	
	@Test
	public void testSkip_FileReader() throws Exception {
		try (FileReader in = new FileReader(Scaffolding.m_testFile)) {
			assertEquals(Scaffolding.FILE_SIZE - 10, IOUtils.skip(in, Scaffolding.FILE_SIZE - 10));
			assertEquals(10, IOUtils.skip(in, 20));
			assertEquals(0, IOUtils.skip(in, 10));
		}
	}
	
	@Test
	public void tesContentEquals() throws Throwable {
		byte[] byteArray = new byte[2];
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray, (byte) 73, (byte) 73);
		boolean boolean0 = IOUtils.contentEquals((InputStream) byteArrayInputStream,
				(InputStream) byteArrayInputStream);
		assertTrue(boolean0);
	}
	
	@Test
	public void testAssertThrowsMessage_copyLarge_readerToWriterWithOffsetAndBuffer_readIOException() {
		final IOException thrown = assertThrows(IOException.class,
				() -> IOUtils.copyLarge(Scaffolding.readerIOException(), Scaffolding.writer(), 10, 10, new char[10]));
		assertEquals("read", thrown.getMessage());
	}
	
	@Test
	public void testAssertThrows_toByteArray_URLCon_urlConNull() {
		assertThrows(NullPointerException.class, () -> IOUtils.toByteArray((URLConnection) null));
	}
	
	@Test
	public void testIOUtils2() throws Throwable {
		char[] charArray = new char[7];
		StringReader stringReader = new StringReader("<");
		BufferedReader bufferedReader = IOUtils.toBufferedReader((Reader) stringReader, 2);
		LineNumberReader lineNumberReader = new LineNumberReader(bufferedReader, 2);
		MockFileOutputStream mockFileOutputStream = new MockFileOutputStream("``Cj 6Y3!_");
		MockPrintWriter mockPrintWriter = new MockPrintWriter(mockFileOutputStream);
		long long0 = IOUtils.copyLarge((Reader) lineNumberReader, (Writer) mockPrintWriter, (-371L), 1528L, charArray);
		assertEquals(1L, long0);
	}
	
	@Test
	public void testAssertThrowsMessage_toString_URIWithCharset_uriNotAbsolute() {
		final IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
				() -> IOUtils.toString(Scaffolding.uriNotAbsolute(), StandardCharsets.UTF_8));
		assertEquals("URI is not absolute", thrown.getMessage());
	}
	
	@Test
	public void testAssertThrowsMessage_toString_inputStreamWithCharset_readIOException() {
		final IOException thrown = assertThrows(IOException.class,
				() -> IOUtils.toString(Scaffolding.inputStreamIOException(), StandardCharsets.UTF_8));
		assertEquals("read", thrown.getMessage());
	}
	
	@Test
	public void testWriter() {
		CharArrayWriter charArrayWriter = new CharArrayWriter();
		Writer writer = IOUtils.writer(charArrayWriter);
		assertEquals("", writer.toString());
	}
	
	@Test
	public void testAssertThrowsMessage_toByteArray_readerWithString_encodingUnsupported() {
		final UnsupportedCharsetException thrown = assertThrows(UnsupportedCharsetException.class,
				() -> IOUtils.toByteArray(Scaffolding.reader(), Scaffolding.CHARSET_UNSUPPORTED));
		assertEquals(Scaffolding.CHARSET_UNSUPPORTED, thrown.getMessage());
	}
	
	@Test
	public void testAsBufferedWriter() {
		final Writer is = new Writer() {
			
			@Override
			public void write(final int b) throws IOException {}
			
			@Override
			public void write(final char[] cbuf, final int off, final int len) throws IOException {}
			
			@Override
			public void flush() throws IOException {}
			
			@Override
			public void close() throws IOException {}
		};
		final BufferedWriter bis = IOUtils.buffer(is);
		assertNotSame(is, bis);
		assertSame(bis, IOUtils.buffer(bis));
	}
	
	@Test
	public void testAssertThrowsMessage_read_readableByteChannel_readIOException() {
		final IOException thrown = assertThrows(IOException.class,
				() -> IOUtils.read(Scaffolding.readableByteChannelIOException(), ByteBuffer.allocate(1024 * 4 + 1)));
		assertEquals("read", thrown.getMessage());
	}
	
	@Test
	public void testContentEqualsIgnoreEOL() throws Exception {
		{
			final Reader input1 = new CharArrayReader("".toCharArray());
			assertTrue(IOUtils.contentEqualsIgnoreEOL((Reader) null, null));
		}
		{
			final Reader input1 = new CharArrayReader("".toCharArray());
			assertFalse(IOUtils.contentEqualsIgnoreEOL(null, input1));
		}
		{
			final Reader input1 = new CharArrayReader("".toCharArray());
			assertFalse(IOUtils.contentEqualsIgnoreEOL(input1, null));
		}
		{
			final Reader input1 = new CharArrayReader("".toCharArray());
			assertTrue(IOUtils.contentEqualsIgnoreEOL(input1, input1));
		}
		{
			final Reader input1 = new CharArrayReader("321\r\n".toCharArray());
			assertTrue(IOUtils.contentEqualsIgnoreEOL(input1, input1));
		}
		
		Reader r1;
		Reader r2;
		
		r1 = new CharArrayReader("".toCharArray());
		r2 = new CharArrayReader("".toCharArray());
		assertTrue(IOUtils.contentEqualsIgnoreEOL(r1, r2));
		
		r1 = new CharArrayReader("1".toCharArray());
		r2 = new CharArrayReader("1".toCharArray());
		assertTrue(IOUtils.contentEqualsIgnoreEOL(r1, r2));
		
		r1 = new CharArrayReader("1".toCharArray());
		r2 = new CharArrayReader("2".toCharArray());
		assertFalse(IOUtils.contentEqualsIgnoreEOL(r1, r2));
		
		r1 = new CharArrayReader("123\rabc".toCharArray());
		r2 = new CharArrayReader("123\nabc".toCharArray());
		assertTrue(IOUtils.contentEqualsIgnoreEOL(r1, r2));
		
		r1 = new CharArrayReader("321".toCharArray());
		r2 = new CharArrayReader("321\r\n".toCharArray());
		assertTrue(IOUtils.contentEqualsIgnoreEOL(r1, r2));
	}
	
	@Test
	public void testWriteLines_OutputStream() throws Exception {
		final Object[] data = new Object[]{ "hello", new StringBuffer("world"), "", "this is", null, "some text" };
		final List<Object> list = Arrays.asList(data);
		
		final ByteArrayOutputStream baout = new ByteArrayOutputStream();
		final YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout, false, true);
		
		IOUtils.writeLines(list, "*", out);
		
		out.off();
		out.flush();
		
		final String expected = "hello*world**this is**some text*";
		final String actual = baout.toString();
		assertEquals(expected, actual);
	}
}
