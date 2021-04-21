package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.apache.commons.io.Scaffolding.YellOnFlushAndCloseOutputStream;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.junit.jupiter.api.Test;

public class IOUtilsTest {
	
	@Test
	public void testBuffer() throws Throwable {
		Reader reader = Reader.nullReader();
		BufferedReader bufferedReader0 = IOUtils.buffer(reader, 318);
		BufferedReader bufferedReader1 = IOUtils.buffer((Reader) bufferedReader0, 318);
		assertSame(bufferedReader1, bufferedReader0);
	}

	@Test
	public void testAssertThrowsMessage_write_byteArrayToWriterWithString_writeIOException() {
		final IOException thrown = assertThrows(IOException.class,
				() -> IOUtils.write(new byte[10], Scaffolding.writerIOException(), Scaffolding.CHARSET_VALID));
		assertEquals("write", thrown.getMessage());
	}
	
	@Test
	public void testIOUtils1() throws Throwable {
		InputStream inputStream = IOUtils.toInputStream((CharSequence) "");
		byte[] byteArray0 = new byte[]{};
		int int0 = IOUtils.length(byteArray0);
		int int1 = IOUtils.read(inputStream, byteArray0);
		byte[] byteArray1 = IOUtils.toByteArray(inputStream);
		Consumer<IOException> iOExceptionConsumer = null;
		IOUtils.closeQuietly((Closeable) inputStream, iOExceptionConsumer);
		IOUtils.close((Closeable) inputStream);
		BufferedInputStream bufferedInputStream = IOUtils.buffer(inputStream, (int) (byte) 10);
		IOConsumer<IOException> iOExceptionIOConsumer = null;
		IOUtils.close((Closeable) bufferedInputStream, iOExceptionIOConsumer);
		Charset charset = null;
		LineIterator lineIterator = IOUtils.lineIterator((InputStream) bufferedInputStream, charset);
		IOUtils.closeQuietly((Closeable) bufferedInputStream);
		IOUtils.closeQuietly((Closeable) bufferedInputStream);
		assertNotNull(inputStream);
		assertNotNull(byteArray0);
		assertEquals(Arrays.toString(byteArray0), "[]");
		assertTrue(int0 == 0, "'" + int0 + "' != '" + 0 + "'");
		assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
		assertNotNull(byteArray1);
		assertEquals(Arrays.toString(byteArray1), "[]");
		assertNotNull(bufferedInputStream);
		assertNotNull(lineIterator);
	}

	@Test
	public void testToByteArray1() throws Throwable {
		try {
			IOUtils.toByteArray((URLConnection) null);
			fail("Expecting exception: NullPointerException");
			
		}
		catch (NullPointerException e) {
			Scaffolding.verifyException("org.apache.commons.io.IOUtils", e);
		}
	}

	@Test
	public void testIOUtils2() throws Throwable {
		char[] charArray = new char[7];
		CharArrayReader charArrayReader = new CharArrayReader(charArray);
		BufferedReader bufferedReader = IOUtils.buffer((Reader) charArrayReader);
		String string = IOUtils.toString((Reader) bufferedReader);
		assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string);
	}

	@Test
	public void testResourceToString() throws Throwable {
		Charset charset0 = Charset.defaultCharset();
		ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
		String string0 = IOUtils.resourceToString("", charset0, classLoader0);
		assertEquals("org\n", string0);
	}

	@Test
	public void testToBufferedInputStream_InputStream() throws Exception {
		try (FileInputStream fin = new FileInputStream(Scaffolding.m_testFile)) {
			final InputStream in = IOUtils.toBufferedInputStream(fin);
			final byte[] out = IOUtils.toByteArray(in);
			assertNotNull(out);
			assertEquals(0, fin.available(), "Not all bytes were read");
			assertEquals(Scaffolding.FILE_SIZE, out.length, "Wrong output size");
			Scaffolding.assertEqualContent(out, Scaffolding.m_testFile);
		}
	}

	@Test
	public void testWriteLines_OutputStream_Encoding() throws Exception {
		final Object[] data = new Object[]{ "hello\u8364", new StringBuffer("world"), "", "this is", null,
				"some text" };
		final List<Object> list = Arrays.asList(data);
		
		final ByteArrayOutputStream baout = new ByteArrayOutputStream();
		final YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout, false, true);
		
		IOUtils.writeLines(list, "*", out, "UTF-8");
		
		out.off();
		out.flush();
		
		final String expected = "hello\u8364*world**this is**some text*";
		final String actual = baout.toString("UTF-8");
		assertEquals(expected, actual);
	}

	@Test
	public void testAssertThrowsMessage_skip_readableByteChannel_readIOException() {
		final IOException thrown = assertThrows(IOException.class,
				() -> IOUtils.skip(Scaffolding.readableByteChannelIOException(), 1));
		assertEquals("read", thrown.getMessage());
	}

	@Test
	public void testAssertThrowsMessage_skipFully_reader_toSkipInvalid() {
		final EOFException thrown = assertThrows(EOFException.class,
				() -> IOUtils.skipFully(Scaffolding.readerEOF(), 10));
		assertEquals("Chars to skip: 10 actual: 0", thrown.getMessage());
	}

	@Test
	public void testAssertThrows_copyLarge_readerToWriterWithBuffer_bufferNull() {
		assertThrows(NullPointerException.class,
				() -> IOUtils.copyLarge(Scaffolding.reader(), Scaffolding.writer(), (char[]) null));
	}

	@Test
	public void testWriteLines_Writer_nullData() throws Exception {
		final ByteArrayOutputStream baout = new ByteArrayOutputStream();
		@SuppressWarnings("resource")
		final YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout, true, true);
		final Writer writer = new OutputStreamWriter(baout, "US-ASCII");
		
		IOUtils.writeLines(null, "*", writer);
		out.off();
		writer.flush();
		
		assertEquals(0, baout.size(), "Sizes differ");
	}

	@Test
	public void testIOUtils3() throws Throwable {
		byte[] byteArray = new byte[2];
		StringBuffer stringBuffer = new StringBuffer((CharSequence) "d8T");
		InputStream inputStream = IOUtils.toInputStream((CharSequence) stringBuffer);
		int int0 = IOUtils.read(inputStream, byteArray);
		assertEquals(1, inputStream.available());
		assertEquals(2, int0);
	}

	@Test
	public void testWriteChunked() throws Throwable {
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2);
		IOUtils.writeChunked((byte[]) null, (OutputStream) byteArrayOutputStream);
		assertEquals(0, byteArrayOutputStream.size());
	}

	@Test
	public void testToBufferedReader() {
		char[] charArray = new char[8];
		CharArrayReader charArrayReader = new CharArrayReader(charArray, 0, 0);
		BufferedReader bufferedReader0 = IOUtils.toBufferedReader((Reader) charArrayReader);
		BufferedReader bufferedReader1 = IOUtils.toBufferedReader((Reader) bufferedReader0, 1591);
		assertSame(bufferedReader1, bufferedReader0);
	}

	@Test
	public void testToByteArray2() throws Throwable {
		byte[] byteArray0 = new byte[5];
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray0, (byte) 0, (byte) (-92));
		byte[] byteArray1 = IOUtils.toByteArray((InputStream) byteArrayInputStream, (int) (byte) 0);
		assertNotSame(byteArray0, byteArray1);
	}

	@Test
	public void testAssertThrows_copyLarge_readerToWriterWithOffsetAndBuffer_bufferNull() {
		assertThrows(NullPointerException.class,
				() -> IOUtils.copyLarge(Scaffolding.reader(), Scaffolding.writer(), 0, 100, (char[]) null));
	}

	@Test
	public void testCloseQuietly_ServerSocketIOException() throws IOException {
		IOUtils.closeQuietly(new ServerSocket() {
			
			@Override
			public void close() throws IOException {
				throw new IOException();
			}
		});
	}
}
