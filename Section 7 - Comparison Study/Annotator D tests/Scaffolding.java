package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.output.ProxyOutputStream;
import org.junit.internal.AssumptionViolatedException;
import org.junit.jupiter.api.io.TempDir;

public class Scaffolding {
	
	@TempDir
	public static File top;
	public static final String BASE = "testResources/";
	@TempDir
	public static File temporaryFolder;
	public static File testFile = new File(temporaryFolder, "file-test.txt");
	public static FileCleaningTracker theInstance = new FileCleaningTracker();
	public static byte[] testData = generateTestData(1024);
	public static final int FILE_SIZE = 1024 * 4 + 1;
	public static File m_testFile;
	static {
		try {
			m_testFile = new File(temporaryFolder, "file2-test.txt");
			
			if (!m_testFile.getParentFile().exists()) {
				throw new IOException("Cannot create file " + m_testFile + " as the parent directory does not exist");
			}
			final BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(m_testFile));
			try {
				generateTestData(output, FILE_SIZE);
			}
			finally {
				IOUtils.closeQuietly(output);
			}
		}
		catch (final IOException ioe) {
			throw new RuntimeException(
					"Can't run this test because the environment could not be built: " + ioe.getMessage());
		}
	}
	public static final Short SHORT = (short) 0x0102;
	public static final String FILENAME_NULL_BYTES = "~u\u0000ser\\bob\u0000\\fil\u0000e.txt";
	public static final String CHARSET_UNSUPPORTED = "unsupported";
	public static final String CHARSET_VALID = "UTF-8";
	
	public static File newFile(final File testDirectory, final String filename) throws IOException {
		final File destination = new File(testDirectory, filename);
		if (destination.exists()) {
			FileUtils.forceDelete(destination);
		}
		return destination;
	}
	
	public static void setupSymlink(final File res, final File link) throws Exception {
		final List<String> args = new ArrayList<>();
		args.add("ln");
		args.add("-s");
		
		args.add(res.getAbsolutePath());
		args.add(link.getAbsolutePath());
		
		Process proc;
		
		proc = Runtime.getRuntime().exec(args.toArray(new String[args.size()]));
		proc.waitFor();
	}
	
	public static List<String> createLinesFile(final File file, final String encoding, final int lineCount)
			throws IOException {
		final List<String> lines = createStringLines(lineCount);
		FileUtils.writeLines(file, encoding, lines);
		return lines;
	}
	
	public static List<String> createStringLines(final int lineCount) {
		final List<String> lines = new ArrayList<>();
		for (int i = 0; i < lineCount; i++) {
			lines.add("LINE " + i);
		}
		return lines;
	}
	
	public static File file() throws IOException {
		File file = createFile(BASE + "file.txt");
		final String text = "This is a test text file.";
		FileUtils.writeStringToFile(file, text, "US-ASCII");
		return file;
	}
	
	public static File dir() throws IOException {
		File dir = createDir(BASE + "dir");
		dir.mkdir();
		return dir;
	}
	
	public static File createFile(String name) throws IOException {
		Files.deleteIfExists(Paths.get(name));
		return new File(name);
	}
	
	public static File createDir(String name) throws IOException {
		File file = new File(name);
		if (file.exists()) {
			FileUtils.forceDelete(file);
		}
		return new File(name);
	}
	
	public static File fileNotWritable() throws IOException {
		File file = createFile(BASE + "file-not-writable.txt");
		FileUtils.touch(file);
		file.setWritable(false);
		return file;
	}
	
	public static File fileNonExistent() throws IOException {
		return createFile(BASE + "file-non-existent.txt");
	}
	
	public static FileMkdirFails fileMkdirFails() throws IOException {
		String name = BASE + "dirMkdirFails";
		Files.deleteIfExists(Paths.get(name));
		return new FileMkdirFails(name);
	}
	
	public static FileParentMkdirFails fileParentMkdirFails() throws IOException {
		String name = BASE + "parentNoMkdirFile";
		Files.deleteIfExists(Paths.get(name));
		FileParentMkdirFails f = new FileParentMkdirFails(name);
		FileUtils.touch(f);
		return f;
	}
	
	public static File dirNonExistent() throws IOException {
		return createDir(BASE + "dirNonExistent");
	}
	
	public static Reader reader() {
		return new Reader() {
			
			@Override
			public int read(final char[] cbuf, final int off, final int len) throws IOException {
				return 0;
			}
			
			@Override
			public void close() throws IOException {}
		};
	}
	
	public static Writer writer() {
		return new Writer() {
			
			@Override
			public void write(final int b) throws IOException {}
			
			@Override
			public void write(final char[] cbuf, final int off, final int len) throws IOException {}
			
			@Override
			public void flush() throws IOException {}
			
			@Override
			public void close() throws IOException {}
		};
	}
	
	public static Reader readerEOF() {
		return new Reader() {
			
			@Override
			public int read(final char[] cbuf, final int off, final int len) throws IOException {
				return -1;
			}
			
			@Override
			public void close() throws IOException {}
		};
	}
	
	public static Writer writerIOException() {
		return new Writer() {
			
			@Override
			public void write(final int b) throws IOException {}
			
			@Override
			public void write(final char[] cbuf, final int off, final int len) throws IOException {
				throw new IOException("write");
			}
			
			@Override
			public void flush() throws IOException {}
			
			@Override
			public void close() throws IOException {}
			
			@Override
			public void write(String str) throws IOException {
				throw new IOException("write");
			}
			
			@Override
			public void write(char[] cbuf) throws IOException {
				throw new IOException("write");
			}
		};
	}
	
	public static ReadableByteChannel readableByteChannelIOException() {
		return new ReadableByteChannel() {
			
			@Override
			public boolean isOpen() {
				return false;
			}
			
			@Override
			public void close() throws IOException {}
			
			@Override
			public int read(ByteBuffer dst) throws IOException {
				throw new IOException("read");
			}
		};
	}
	
	public static ByteOrder parseByteOrder(final String value) {
		return ByteOrderParser.parseByteOrder(value);
	}
	
	public static byte[] generateTestData(final long size) {
		try {
			final ByteArrayOutputStream baout = new ByteArrayOutputStream();
			generateTestData(baout, size);
			return baout.toByteArray();
		}
		catch (final IOException ioe) {
			throw new RuntimeException("This should never happen: " + ioe.getMessage());
		}
	}
	
	public static void generateTestData(final OutputStream out, final long size) throws IOException {
		for (int i = 0; i < size; i++) {
			out.write((byte) ((i % 127) + 1));
		}
	}
	
	public static byte[] bytes() {
		return new byte[]{ 0x08, 0x07, 0x06, 0x05, 0x04, 0x03, 0x02, 0x01 };
	}
	
	public static void pauseForDeleteToComplete(File file) {
		int count = 0;
		while (file.exists() && count++ < 40) {
			try {
				sleep(500L);
			}
			catch (final InterruptedException ignore) {
			}
			file = new File(file.getPath());
		}
	}
	
	public static void waitUntilTrackCount() throws Exception {
		System.gc();
		sleep(500);
		int count = 0;
		while (theInstance.getTrackCount() != 0 && count++ < 5) {
			List<String> list = new ArrayList<>();
			try {
				long i = 0;
				while (theInstance.getTrackCount() != 0) {
					list.add(
							"A Big String A Big String A Big String A Big String A Big String A Big String A Big String A Big String A Big String A Big String "
									+ (i++));
				}
			}
			catch (final Throwable ignored) {
			}
			list = null;
			System.gc();
			sleep(1000);
		}
		if (theInstance.getTrackCount() != 0) {
			throw new IllegalStateException(
					"Your JVM is not releasing References, try running the testcase with less memory (-Xmx)");
		}
		
	}
	
	public static String showFailures() throws Exception {
		if (theInstance.deleteFailures.size() == 1) {
			return "[Delete Failed: " + theInstance.deleteFailures.get(0) + "]";
		}
		else {
			return "[Delete Failures: " + theInstance.deleteFailures.size() + "]";
		}
	}
	
	public static void sleep(final long ms) throws InterruptedException {
		final long finishAt = System.currentTimeMillis() + ms;
		long remaining = ms;
		do {
			Thread.sleep(remaining);
			remaining = finishAt - System.currentTimeMillis();
		}
		while (remaining > 0);
	}
	
	public static void assertEqualContent(final byte[] b0, final File file) throws IOException {
		int count = 0, numRead = 0;
		final byte[] b1 = new byte[b0.length];
		try (InputStream is = new FileInputStream(file)) {
			while (count < b0.length && numRead >= 0) {
				numRead = is.read(b1, count, b0.length);
				count += numRead;
			}
			assertEquals(b0.length, count, "Different number of bytes: ");
			for (int i = 0; i < count; i++) {
				assertEquals(b0[i], b1[i], "byte " + i + " differs");
			}
		}
	}
	
	public static void verifyException(String sourceClass, Throwable t) throws AssertionError {
		
		if (t instanceof AssumptionViolatedException) {
			throw (AssumptionViolatedException) t;
		}
		
		assertThrownBy(sourceClass, t);
	}
	
	public static void assertThrownBy(String sourceClass, Throwable t) throws AssertionError {
		StackTraceElement[] stackTrace = t.getStackTrace();
		
		if (stackTrace.length == 0)
			return;
		
		StackTraceElement el = stackTrace[0];
		
		if (sourceClass == null) {
			return;
		}
		
		String name = el.getClassName();
		if (sourceClass.equals(name)) {
			return;
		}
		
		Class<?> klass;
		
		try {
			klass = Scaffolding.class.getClassLoader().loadClass(sourceClass);
		}
		catch (ClassNotFoundException e) {
			throw new AssertionError("Cannot load/analyze class " + sourceClass);
		}
		
		for (Annotation annotation : klass.getAnnotations()) {
			if (annotation.getClass().getName().equals(name)) {
				return;
			}
		}
		
		while (klass != null) {
			klass = klass.getSuperclass();
			if (klass != null && klass.getName().equals(name)) {
				return;
			}
		}
		
		if (name.equals("java.lang.System")) {
			return;
		}
		
		throw new AssertionError("Exception was not thrown in " + sourceClass + " but in " + el + ": " + t);
	}
	
	public static class FileMkdirFails extends File {
		
		public FileMkdirFails(String name) {
			super(name);
		}
		
		@Override
		public boolean mkdirs() {
			return false;
		}
		
		@Override
		public boolean mkdir() {
			return false;
		}
		
		@Override
		public boolean isDirectory() {
			return false;
		}
	}
	
	public static class FileParentMkdirFails extends File {
		
		public FileParentMkdirFails(String name) {
			super(name);
		}
		
		@Override
		public File getParentFile() {
			File parent = null;
			try {
				parent = fileMkdirFails();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return parent;
		}
	}
	
	public static class YellOnFlushAndCloseOutputStream extends ProxyOutputStream {
		
		private boolean yellOnFlush;
		private boolean yellOnClose;
		
		/**
		 * @param proxy
		 *            OutputStream to delegate to.
		 * @param yellOnFlush
		 *            True if flush() is forbidden
		 * @param yellOnClose
		 *            True if close() is forbidden
		 */
		public YellOnFlushAndCloseOutputStream(final OutputStream proxy,
				final boolean yellOnFlush,
				final boolean yellOnClose) {
			super(proxy);
			this.yellOnFlush = yellOnFlush;
			this.yellOnClose = yellOnClose;
		}
		
		/** @see java.io.OutputStream#flush() */
		@Override
		public void flush() throws IOException {
			if (yellOnFlush) {
				fail(getClass().getSimpleName() + ".flush() called.");
			}
			super.flush();
		}
		
		/** @see java.io.OutputStream#close() */
		@Override
		public void close() throws IOException {
			if (yellOnClose) {
				fail(getClass().getSimpleName() + ".close() called.");
			}
			super.close();
		}
		
		public void off() {
			yellOnFlush = false;
			yellOnClose = false;
		}
		
	}
	
	public static class CheckingInputStream extends ByteArrayInputStream {
		
		private boolean closed;
		
		public CheckingInputStream(final byte[] data) {
			super(data);
			closed = false;
		}
		
		@Override
		public void close() throws IOException {
			super.close();
			closed = true;
		}
		
		public boolean isClosed() {
			return closed;
		}
	}
	
	/**
	 * Simulates a File on a virtual file system.
	 */
	public static class MockFile extends File {
		// Original implementation replaced with stub due to size
		
		public MockFile(String name) {
			super(name);
		}
		
		public MockFile(String parent, String child) {
			super(parent, child);
		}
	}
}
