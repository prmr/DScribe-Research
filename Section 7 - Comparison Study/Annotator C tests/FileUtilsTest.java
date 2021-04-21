package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.Collection;
import java.util.Date;

import org.apache.commons.io.Scaffolding.MockFile;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.junit.jupiter.api.Test;

public class FileUtilsTest {
	
	@Test
	public void testContentEqualsIgnoreEOL() throws Throwable {
		boolean boolean0 = FileUtils.contentEqualsIgnoreEOL((File) null, (File) null, "http");
		assertTrue(boolean0);
	}

	@Test
	public void testAssertThrowsMessage_copyDirectory_boolAndfilter_srcNull() {
		final NullPointerException thrown = assertThrows(NullPointerException.class,
				() -> FileUtils.copyDirectory((File) null, Scaffolding.dir(), Scaffolding.TXT_FILTER, true));
		assertEquals("Source must not be null", thrown.getMessage());
	}

	@Test
	public void testAssertThrowsMessage_copyDirectory_filter_destNotDir() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils.copyDirectory(Scaffolding.dir(), Scaffolding.file(), Scaffolding.TXT_FILTER));
		assertEquals("Destination 'testResources/file.txt' exists but is not a directory", thrown.getMessage());
	}

	@Test
	public void testAssertThrowsMessage_writeLines_lineEndingAndAppend_fileNotWritable() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils.writeLines(Scaffolding.fileNotWritable(), Scaffolding.LINES, "*", true));
		assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
	}

	@Test
	public void testToFiles1() throws Exception {
		final URL[] urls = new URL[]{ new URL("file", null, "file1.txt"), new URL("file", null, "file2.txt"), };
		final File[] files = FileUtils.toFiles(urls);
		
		assertEquals(urls.length, files.length);
		assertEquals(true, files[0].toString().contains("file1.txt"), "File: " + files[0]);
		assertEquals(true, files[1].toString().contains("file2.txt"), "File: " + files[1]);
	}

	@Test
	public void testAssertThrows_listFiles_withFileFilter_dirNull() {
		assertThrows(NullPointerException.class,
				() -> FileUtils.listFiles((File) null, FileFilterUtils.trueFileFilter(), null));
	}

	@Test
	public void testIsFileNewer() throws Throwable {
		File file = FileUtils.getTempDirectory();
		try {
			FileUtils.isFileNewer(file, (Date) null);
			fail("Expecting exception: IllegalArgumentException");
		}
		catch (IllegalArgumentException e) {
			Scaffolding.verifyException("org.apache.commons.io.FileUtils", e);
		}
	}

	@Test
	public void testFileUtils1() throws Exception {
		final File file1 = new File(Scaffolding.temporaryFolder, "test.txt");
		final String filename = file1.getAbsolutePath();
		
		try (OutputStream out = new FileOutputStream(file1)) {
			out.write("This is a test".getBytes("UTF-8"));
		}
		
		final File file2 = new File(Scaffolding.temporaryFolder, "test2.txt");
		
		FileUtils.writeStringToFile(file2, filename, "UTF-8");
		assertTrue(file2.exists());
		assertTrue(file2.length() > 0);
		
		final String file2contents = FileUtils.readFileToString(file2, "UTF-8");
		assertTrue(filename.equals(file2contents), "Second file's contents correct");
		
		assertTrue(file2.delete());
		
		final String contents = FileUtils.readFileToString(new File(filename), "UTF-8");
		assertEquals("This is a test", contents, "FileUtils.fileRead()");
		
	}
	
	@Test
	public void testCopyInputStreamToFile() throws Throwable {
		byte[] byteArray = new byte[4];
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
		File file = FileUtils.getUserDirectory();
		FileUtils.copyInputStreamToFile(byteArrayInputStream, file);
		assertEquals(4L, file.length());
	}

	@Test
	public void testWrite() throws Throwable {
		MockFile mockFile = new MockFile("tCjQ");
		FileUtils.write((File) mockFile, (CharSequence) "tCjQ");
		assertEquals(0L, mockFile.getUsableSpace());
	}

	@Test
	public void testAssertThrowsMessage_openOutputStream_append_fileNotWritable() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils.openOutputStream(Scaffolding.fileNotWritable(), true));
		assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
	}
	
	@Test
	public void testForceMkdirParent() throws Throwable {
		File file = FileUtils.getTempDirectory();
		FileUtils.forceMkdirParent(file);
		assertEquals(0L, file.lastModified());
		assertFalse(file.exists());
	}

	@Test
	public void testAssertThrows_writeLines_lineEnding_fileNull() {
		assertThrows(NullPointerException.class, () -> FileUtils.writeLines((File) null, Scaffolding.LINES, "*"));
	}

	@Test
	public void testAssertThrowsMessage_moveToDirectory_destNotADir() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils.moveToDirectory(Scaffolding.file(), Scaffolding.file(), false));
		assertEquals("Destination 'testResources/file.txt' is not a directory", thrown.getMessage());
	}

	@Test
	public void testCleanDirWithSymlinkFile() throws Exception {
		if (System.getProperty("os.name").startsWith("Win")) {
			return;
		}
		
		final File realOuter = new File(Scaffolding.top, "realouter");
		assertTrue(realOuter.mkdirs());
		
		final File realInner = new File(realOuter, "realinner");
		assertTrue(realInner.mkdirs());
		
		final File realFile = new File(realInner, "file1");
		FileUtils.touch(realFile);
		assertEquals(1, realInner.list().length);
		
		final File randomFile = new File(Scaffolding.top, "randomfile");
		FileUtils.touch(randomFile);
		
		final File symlinkFile = new File(realInner, "fakeinner");
		Scaffolding.setupSymlink(randomFile, symlinkFile);
		
		assertEquals(2, realInner.list().length);
		
		FileUtils.cleanDirectory(realOuter);
		assertEquals(0, realOuter.list().length);
		
		assertTrue(randomFile.exists());
		assertFalse(symlinkFile.exists());
	}

	@Test
	public void testAssertThrowsMessage_copyDirectory_bool_srcNotReadable() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils.copyDirectory(Scaffolding.dirNotReadable(), Scaffolding.dir(), true));
		assertEquals("Failed to list contents of testResources/dirNotReadable", thrown.getMessage());
	}
	
	@Test
	public void testDecodeUrlNullSafe() {
		assertNull(FileUtils.decodeUrl(null));
	}

	@Test
	public void testListFiles() throws Throwable {
		MockFile mockFile = new MockFile("", "");
		File file0 = mockFile.getCanonicalFile();
		String[] stringArray = new String[8];
		Collection<File> collection = FileUtils.listFiles(file0, stringArray, true);
		assertNotNull(collection);
	}

	@Test
	public void test_openOutputStream_noParentNoFile() throws Exception {
		Scaffolding.openOutputStream_noParent(false);
	}

	@Test
	public void testFileUtils2() throws Throwable {
		File file0 = MockFile.createTempFile("X/?", "X/?");
		FileUtils.openOutputStream(file0, true);
		File file1 = FileUtils.getUserDirectory();
		try {
			FileUtils.copyToDirectory(file1, file0);
			fail("Expecting exception: IllegalArgumentException");
		}
		catch (IllegalArgumentException e) {
			Scaffolding.verifyException("org.apache.commons.io.FileUtils", e);
		}
	}
}
