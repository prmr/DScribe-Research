package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.apache.commons.io.Scaffolding.YellOnFlushAndCloseOutputStream;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.junit.jupiter.api.Test;

public class IOUtilsTest {
	
	@Test
	public void testAssertThrowsMessage_copyLarge_inputStreamToOutputStreamWithOffsetAndBuffer_readIOException() {
		final IOException thrown = assertThrows(IOException.class,
				() -> IOUtils.copyLarge(Scaffolding
						.inputStreamIOException(), Scaffolding.outputStream(), 10, 10, new byte[500]));
		assertEquals("read", thrown.getMessage());
	}
	
	@Test
	public void testWriteLines_OutputStream_nullData() throws Exception {
		final ByteArrayOutputStream baout = new ByteArrayOutputStream();
		final YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout, false, true);
		
		IOUtils.writeLines(null, "*", out);
		out.off();
		out.flush();
		
		assertEquals(0, baout.size(), "Sizes differ");
	}
	
	@Test
	public void testLength() {
		Object[] objectArray = new Object[0];
		int int0 = IOUtils.length(objectArray);
		assertEquals(0, int0);
	}
	
	@Test
	public void testToInputStream() throws Throwable {
		try {
			InputStream inputStream = IOUtils.toInputStream((CharSequence) "", "hi!");
			fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
		}
		catch (IllegalCharsetNameException e) {
		}
	}
	
	@Test
	public void testToString() throws Throwable {
		try {
			IOUtils.toString((byte[]) null, "L!wSs|$^Sc<*{^Wjo");
			fail("Expecting exception: IllegalCharsetNameException");
		}
		catch (IllegalCharsetNameException e) {
			Scaffolding.verifyException("java.nio.charset.Charset", e);
		}
	}
	
	@Test
	public void testAssertThrowsMessage_read_readerWithBuffer_readIOException() {
		final IOException thrown = assertThrows(IOException.class,
				() -> IOUtils.read(Scaffolding.readerIOException(), new char[100]));
		assertEquals("read", thrown.getMessage());
	}
	
	@Test
	public void testAssertThrowsMessage_toCharArray_inputStreamWithCharset_readIOException() {
		final IOException thrown = assertThrows(IOException.class,
				() -> IOUtils.toCharArray(Scaffolding.inputStreamIOException(), StandardCharsets.UTF_8));
		assertEquals("read", thrown.getMessage());
	}
	
	@Test
	public void testIOUtils2() throws Throwable {
		InputStream inputStream0 = IOUtils.toInputStream((CharSequence) "");
		byte[] byteArray0 = new byte[]{};
		int int0 = IOUtils.length(byteArray0);
		int int1 = IOUtils.read(inputStream0, byteArray0);
		byte[] byteArray1 = IOUtils.toByteArray(inputStream0);
		Consumer<IOException> iOExceptionConsumer0 = null;
		IOUtils.closeQuietly((Closeable) inputStream0, iOExceptionConsumer0);
		IOUtils.close((Closeable) inputStream0);
		BufferedInputStream bufferedInputStream0 = IOUtils.buffer(inputStream0, (int) (byte) 10);
		InputStream inputStream1 = IOUtils.toBufferedInputStream(inputStream0, (int) (byte) 1);
		Consumer<IOException> iOExceptionConsumer1 = null;
		IOUtils.closeQuietly((Closeable) inputStream0, iOExceptionConsumer1);
		OutputStream outputStream = null;
		InputStream inputStream2 = IOUtils.toInputStream((CharSequence) "");
		byte[] byteArray2 = new byte[]{};
		int int2 = IOUtils.length(byteArray2);
		int int3 = IOUtils.read(inputStream2, byteArray2);
		byte[] byteArray3 = IOUtils.toByteArray(inputStream2);
		InputStream inputStream3 = IOUtils.toInputStream((CharSequence) "");
		byte[] byteArray4 = new byte[]{};
		int int4 = IOUtils.length(byteArray4);
		int int5 = IOUtils.read(inputStream3, byteArray4);
		byte[] byteArray5 = IOUtils.toByteArray(inputStream3);
		int int6 = IOUtils.length(byteArray5);
		IOUtils.readFully(inputStream2, byteArray5);
		long long0 = IOUtils.copyLarge(inputStream0, outputStream, byteArray5);
		BufferedInputStream bufferedInputStream1 = IOUtils.buffer(inputStream0, (int) (short) 100);
		Consumer<IOException> iOExceptionConsumer2 = null;
		IOUtils.closeQuietly((Closeable) bufferedInputStream1, iOExceptionConsumer2);
		IOUtils.close((Closeable) bufferedInputStream1);
		try {
			IOUtils.skipFully((java.io.InputStream) bufferedInputStream1, (long) 3);
			fail("Expected exception of type java.io.IOException; message: Stream closed");
		}
		catch (IOException e) {
		}
		assertNotNull(inputStream0);
		assertNotNull(byteArray0);
		assertEquals(Arrays.toString(byteArray0), "[]");
		assertTrue(int0 == 0, "'" + int0 + "' != '" + 0 + "'");
		assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
		assertNotNull(byteArray1);
		assertEquals(Arrays.toString(byteArray1), "[]");
		assertNotNull(bufferedInputStream0);
		assertNotNull(inputStream1);
		assertNotNull(inputStream2);
		assertNotNull(byteArray2);
		assertEquals(Arrays.toString(byteArray2), "[]");
		assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
		assertTrue(int3 == 0, "'" + int3 + "' != '" + 0 + "'");
		assertNotNull(byteArray3);
		assertEquals(Arrays.toString(byteArray3), "[]");
		assertNotNull(inputStream3);
		assertNotNull(byteArray4);
		assertEquals(Arrays.toString(byteArray4), "[]");
		assertTrue(int4 == 0, "'" + int4 + "' != '" + 0 + "'");
		assertTrue(int5 == 0, "'" + int5 + "' != '" + 0 + "'");
		assertNotNull(byteArray5);
		assertEquals(Arrays.toString(byteArray5), "[]");
		assertTrue(int6 == 0, "'" + int6 + "' != '" + 0 + "'");
		assertTrue(long0 == 0L, "'" + long0 + "' != '" + 0L + "'");
		assertNotNull(bufferedInputStream1);
	}
	
	@Test
	public void testAssertThrows_copyLarge_inputStreamToOutputStream_outNull() {
		assertThrows(NullPointerException.class,
				() -> IOUtils.copyLarge(Scaffolding.inputStream(), (OutputStream) null));
	}
	
	@Test
	public void testToCharArray_Reader() throws Exception {
		try (FileReader fr = new FileReader(Scaffolding.m_testFile)) {
			final char[] out = IOUtils.toCharArray(fr);
			assertNotNull(out);
			assertEquals(Scaffolding.FILE_SIZE, out.length, "Wrong output size");
			Scaffolding.assertEqualContent(out, Scaffolding.m_testFile);
		}
	}
	
	@Test
	public void testWrite_byteArrayToWriter() throws Exception {
		final ByteArrayOutputStream baout = new ByteArrayOutputStream();
		@SuppressWarnings("resource")
		final YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout, true, true);
		final Writer writer = new OutputStreamWriter(baout, "US-ASCII");
		
		IOUtils.write(Scaffolding.inData, writer);
		out.off();
		writer.flush();
		
		assertEquals(Scaffolding.inData.length, baout.size(), "Sizes differ");
		assertTrue(Arrays.equals(Scaffolding.inData, baout.toByteArray()), "Content differs");
	}
	
	@Test
	public void testAssertThrowsMessage_copyLarge_inputStreamToOutputStream_writeIOException() {
		final IOException thrown = assertThrows(IOException.class,
				() -> IOUtils.copyLarge(Scaffolding.inputStream(), Scaffolding.outputStreamIOException()));
		assertEquals("write", thrown.getMessage());
	}
	
	@Test
	public void testWrite_stringToOutputStream_nullEncoding() throws Exception {
		final String str = new String(Scaffolding.inData, "US-ASCII");
		
		final ByteArrayOutputStream baout = new ByteArrayOutputStream();
		final YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout, true, true);
		
		IOUtils.write(str, out, (String) null);
		out.off();
		out.flush();
		
		assertEquals(Scaffolding.inData.length, baout.size(), "Sizes differ");
		assertTrue(Arrays.equals(Scaffolding.inData, baout.toByteArray()), "Content differs");
	}
	
	@Test
	public void testAssertThrowsMessage_toCharArray_inputStreamWithString_encodingUnsupported() {
		final UnsupportedCharsetException thrown = assertThrows(UnsupportedCharsetException.class,
				() -> IOUtils.toCharArray(Scaffolding.inputStream(), Scaffolding.CHARSET_UNSUPPORTED));
		assertEquals(Scaffolding.CHARSET_UNSUPPORTED, thrown.getMessage());
	}
	
	@Test
	public void testAsBufferedInputStreamWithBufferSize() {
		final InputStream is = new InputStream() {
			
			@Override
			public int read() throws IOException {
				return 0;
			}
		};
		final BufferedInputStream bis = IOUtils.buffer(is, 2048);
		assertNotSame(is, bis);
		assertSame(bis, IOUtils.buffer(bis));
		assertSame(bis, IOUtils.buffer(bis, 1024));
	}
	
	@Test
	public void testIOUtils1() throws Throwable {
		InputStream inputStream0 = IOUtils.toInputStream((CharSequence) "");
		IOUtils.closeQuietly((Closeable) inputStream0);
		InputStream inputStream1 = IOUtils.toBufferedInputStream(inputStream0);
		Writer writer = null;
		Charset charset = null;
		org.apache.commons.io.IOUtils.copy(inputStream0, writer, charset);
		OutputStream outputStream0 = null;
		InputStream inputStream2 = null;
		byte[] byteArray0 = IOUtils.toByteArray("");
		int int0 = IOUtils.read(inputStream2, byteArray0);
		String str = IOUtils.toString(byteArray0);
		long long0 = IOUtils.copyLarge(inputStream0, outputStream0, byteArray0);
		List<String> strList = IOUtils.readLines(inputStream0);
		InputStream inputStream3 = IOUtils.toInputStream((CharSequence) "");
		byte[] byteArray1 = new byte[]{};
		int int1 = IOUtils.length(byteArray1);
		int int2 = IOUtils.read(inputStream3, byteArray1);
		byte[] byteArray2 = IOUtils.toByteArray(inputStream3);
		Consumer<IOException> iOExceptionConsumer = null;
		IOUtils.closeQuietly((Closeable) inputStream3, iOExceptionConsumer);
		IOUtils.close((Closeable) inputStream3);
		BufferedInputStream bufferedInputStream0 = IOUtils.buffer(inputStream3, (int) (byte) 10);
		InputStream inputStream4 = IOUtils.toBufferedInputStream(inputStream3, (int) (byte) 1);
		OutputStream outputStream1 = null;
		int int3 = IOUtils.copy(inputStream4, outputStream1);
		BufferedInputStream bufferedInputStream1 = IOUtils.buffer(inputStream4, (int) (byte) 10);
		byte[] byteArray3 = IOUtils.toByteArray(inputStream4, 0);
		int int4 = IOUtils.read(inputStream0, byteArray3);
		try {
			IOUtils.skipFully(inputStream0, (long) (-1));
			fail("Expected exception of type java.lang.IllegalArgumentException; message: Bytes to skip must not be negative: -1");
		}
		catch (IllegalArgumentException e) {
		}
		assertNotNull(inputStream0);
		assertNotNull(inputStream1);
		assertNotNull(byteArray0);
		assertEquals(Arrays.toString(byteArray0), "[]");
		assertTrue(int0 == 0, "'" + int0 + "' != '" + 0 + "'");
		assertEquals(str, "", "'" + str + "' != '" + "" + "'");
		assertTrue(long0 == 0L, "'" + long0 + "' != '" + 0L + "'");
		assertNotNull(strList);
		assertNotNull(inputStream3);
		assertNotNull(byteArray1);
		assertEquals(Arrays.toString(byteArray1), "[]");
		assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
		assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
		assertNotNull(byteArray2);
		assertEquals(Arrays.toString(byteArray2), "[]");
		assertNotNull(bufferedInputStream0);
		assertNotNull(inputStream4);
		assertTrue(int3 == 0, "'" + int3 + "' != '" + 0 + "'");
		assertNotNull(bufferedInputStream1);
		assertNotNull(byteArray3);
		assertEquals(Arrays.toString(byteArray3), "[]");
		assertTrue(int4 == 0, "'" + int4 + "' != '" + 0 + "'");
	}
	
	@Test
	public void testCloseQuietly() {
		IOUtils.closeQuietly((OutputStream) null);
	}
	
	@Test
	public void testWrite_charSequenceToOutputStream_Encoding_nullData() throws Exception {
		final ByteArrayOutputStream baout = new ByteArrayOutputStream();
		final YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout, true, true);
		
		IOUtils.write((CharSequence) null, out);
		out.off();
		out.flush();
		
		assertEquals(0, baout.size(), "Sizes differ");
	}
	
	@Test
	public void testAssertThrowsMessage_contentEquals_readers_input2ReadIOException() {
		final IOException thrown = assertThrows(IOException.class,
				() -> IOUtils.contentEquals(Scaffolding.charArrayReader(), Scaffolding.readerIOException()));
		assertEquals("read", thrown.getMessage());
	}
	
	@Test
	public void testReadFully() throws Throwable {
		char[] charArray = new char[5];
		try {
			IOUtils.readFully((Reader) null, charArray, 1, (-1450));
			fail("Expecting exception: IllegalArgumentException");
		}
		catch (IllegalArgumentException e) {
			Scaffolding.verifyException("org.apache.commons.io.IOUtils", e);
		}
	}
	
	@Test
	public void testReadLines_InputStream_String() throws Exception {
		final File file = Scaffolding.newFile(Scaffolding.temporaryFolder, "lines.txt");
		InputStream in = null;
		try {
			final String[] data = new String[]{ "hello", "/u1234", "", "this is", "some text" };
			Scaffolding.createLineBasedFile(file, data);
			
			in = new FileInputStream(file);
			final List<String> lines = IOUtils.readLines(in, "UTF-8");
			assertEquals(Arrays.asList(data), lines);
			assertEquals(-1, in.read());
		}
		finally {
			IOUtils.closeQuietly(in);
			Scaffolding.deleteFile(file);
		}
	}
	
	@Test
	public void testWrite_charSequenceToWriter_Encoding_nullStream() throws Exception {
		final CharSequence csq = new StringBuilder(new String(Scaffolding.inData, "US-ASCII"));
		try {
			IOUtils.write(csq, (Writer) null);
			fail();
		}
		catch (final NullPointerException ignore) {
		}
	}
	
	@Test
	public void testAssertThrows_write_stringToOutputStreamWithCharset_outNull() {
		assertThrows(java.lang.NullPointerException.class,
				() -> IOUtils.write("test", (OutputStream) null, StandardCharsets.UTF_8));
	}
	
	@Test
	public void testCloseQuietly_Socket() {
		IOUtils.closeQuietly((Socket) null);
		IOUtils.closeQuietly(new Socket());
	}
	
	@Test
	public void testAssertThrows_copyLarge_inputStreamToOutputStreamWithOffsetAndBuffer_inNull() {
		assertThrows(NullPointerException.class,
				() -> IOUtils.copyLarge((InputStream) null, Scaffolding.outputStream(), 10, 10, new byte[500]));
	}
	
	@Test
	public void testToByteArray() throws Throwable {
		try {
			IOUtils.toByteArray((URI) null);
			fail("Expecting exception: NullPointerException");
		}
		catch (NullPointerException e) {
			Scaffolding.verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
		}
	}
}
