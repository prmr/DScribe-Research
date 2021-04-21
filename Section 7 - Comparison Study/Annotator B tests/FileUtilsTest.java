package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.InvalidPathException;

import org.apache.commons.io.Scaffolding.MockFile;
import org.junit.jupiter.api.Test;

public class FileUtilsTest {
	
	@Test
	public void test_openOutputStream_exists() throws Exception {
		final File file = new File(Scaffolding.temporaryFolder, "test.txt");
		Scaffolding.createLineBasedFile(file, new String[]{ "Hello" });
		try (FileOutputStream out = FileUtils.openOutputStream(file)) {
			out.write(0);
		}
		assertTrue(file.exists());
	}
	
	@Test
	public void testCopyToDirectory() throws Throwable {
		MockFile mockFile = new MockFile("", "");
		File file = mockFile.getCanonicalFile();
		FileUtils.copyToDirectory(file, (File) mockFile);
		assertFalse(file.isFile());
	}
	
	@Test
	public void testMoveDirectory() throws Throwable {
		MockFile mockFile = new MockFile("+");
		mockFile.createNewFile();
		try {
			FileUtils.moveDirectory(mockFile, mockFile);
			fail("Expecting exception: IOException");
		}
		catch (IOException e) {
			Scaffolding.verifyException("org.apache.commons.io.FileUtils", e);
		}
	}
	
	@Test
	public void testAssertThrowsMessage_openOutputStream_fileNotWritable() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils.openOutputStream(Scaffolding.fileNotWritable()));
		assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
	}
	
	@Test
	public void testSameFile() throws IOException {
		try {
			assertTrue(FileUtils.directoryContains(Scaffolding.file1, Scaffolding.file1));
			fail("Expected " + IllegalArgumentException.class.getName());
		}
		catch (final IllegalArgumentException e) {
		}
	}
	
	@Test
	public void testAssertThrowsMessage_moveDirectory_srcNonExistent() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils.moveDirectory(Scaffolding.dirNonExistent(), Scaffolding.dir()));
		assertEquals("Source 'testResources/dirNonExistent' does not exist", thrown.getMessage());
	}
	
	@Test
	public void testCopyFile() throws Throwable {
		MockFile mockFile = new MockFile("");
		try {
			FileUtils.copyFile((File) mockFile, (File) mockFile, true);
			fail("Expecting exception: IOException");
		}
		catch (IOException e) {
			Scaffolding.verifyException("org.apache.commons.io.FileUtils", e);
		}
	}
	
	@Test
	public void testDeleteQuietlyDir() throws IOException {
		final File testDirectory = new File(Scaffolding.temporaryFolder, "testDeleteQuietlyDir");
		final File testFile = new File(testDirectory, "testDeleteQuietlyFile");
		testDirectory.mkdirs();
		if (!testFile.getParentFile().exists()) {
			throw new IOException("Cannot create file " + testFile + " as the parent directory does not exist");
		}
		final BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(testFile));
		try {
			Scaffolding.generateTestData(output, 0);
		}
		finally {
			IOUtils.closeQuietly(output);
		}
		
		assertTrue(testDirectory.exists());
		assertTrue(testFile.exists());
		FileUtils.deleteQuietly(testDirectory);
		assertFalse(testDirectory.exists(), "Check No Exist");
		assertFalse(testFile.exists(), "Check No Exist");
	}
	
	@Test
	public void testToURLs1() throws Exception {
		final File[] files = new File[]{ new File(Scaffolding.temporaryFolder, "file1.txt"),
				new File(Scaffolding.temporaryFolder, "file2.txt"),
				new File(Scaffolding.temporaryFolder, "test file.txt"), };
		final URL[] urls = FileUtils.toURLs(files);
		
		assertEquals(files.length, urls.length);
		assertTrue(urls[0].toExternalForm().startsWith("file:"));
		assertTrue(urls[0].toExternalForm().contains("file1.txt"));
		assertTrue(urls[1].toExternalForm().startsWith("file:"));
		assertTrue(urls[1].toExternalForm().contains("file2.txt"));
		
		assertTrue(urls[2].toExternalForm().startsWith("file:"));
		assertTrue(urls[2].toExternalForm().contains("test%20file.txt"));
	}
	
	@Test
	public void testMoveToDirectory() throws Throwable {
		MockFile mockFile = new MockFile("", "c9\\Ie~Q_DR{D");
		MockFile.createTempFile("V1R>|{xwOc^:8Y4", "", (File) mockFile);
		try {
			FileUtils.moveToDirectory(mockFile, mockFile, true);
			fail("Expecting exception: InvalidPathException");
		}
		catch (InvalidPathException e) {
		}
	}
	
	@Test
	public void testAssertThrowsMessage_copyFileToDirectory_srcNonExistent() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils.copyFileToDirectory(Scaffolding.fileNonExistent(), Scaffolding.dir()));
		assertEquals("Source 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
	}
	
	@Test
	public void testAssertThrowsMessage_directoryContains_dirNull() {
		final IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
				() -> FileUtils.directoryContains((File) null, Scaffolding.file()));
		assertEquals("Directory must not be null", thrown.getMessage());
	}
	
	@Test
	public void testCleanDirWithASymlinkDir() throws Exception {
		if (System.getProperty("os.name").startsWith("Win")) {
			return;
		}
		
		final File realOuter = new File(Scaffolding.top, "realouter");
		assertTrue(realOuter.mkdirs());
		
		final File realInner = new File(realOuter, "realinner");
		assertTrue(realInner.mkdirs());
		
		FileUtils.touch(new File(realInner, "file1"));
		assertEquals(1, realInner.list().length);
		
		final File randomDirectory = new File(Scaffolding.top, "randomDir");
		assertTrue(randomDirectory.mkdirs());
		
		FileUtils.touch(new File(randomDirectory, "randomfile"));
		assertEquals(1, randomDirectory.list().length);
		
		final File symlinkDirectory = new File(realOuter, "fakeinner");
		Scaffolding.setupSymlink(randomDirectory, symlinkDirectory);
		
		assertEquals(1, symlinkDirectory.list().length);
		
		FileUtils.cleanDirectory(realOuter);
		assertEquals(0, realOuter.list().length);
		
		assertEquals(1, randomDirectory.list().length, "Contents of sym link should not have been removed");
	}
	
	@Test
	public void testGetFile() {
		final File expected_A = new File("src");
		final File expected_B = new File(expected_A, "main");
		final File expected_C = new File(expected_B, "java");
		assertEquals(expected_A, FileUtils.getFile("src"), "A");
		assertEquals(expected_B, FileUtils.getFile("src", "main"), "B");
		assertEquals(expected_C, FileUtils.getFile("src", "main", "java"), "C");
		try {
			FileUtils.getFile((String[]) null);
			fail("Expected NullPointerException");
		}
		catch (final NullPointerException e) {
		}
	}
	
	@Test
	public void testToFiles() {
		URL[] urlArray = new URL[0];
		File[] fileArray = FileUtils.toFiles(urlArray);
		assertEquals(0, fileArray.length);
	}
	
	@Test
	public void testFileUtils() throws Throwable {
		String[] strArray0 = new String[]{ "hi!", "hi!" };
		File file0 = FileUtils.getFile(strArray0);
		String[] strArray1 = new String[]{ "hi!", "hi!" };
		File file1 = FileUtils.getFile(strArray1);
		boolean boolean0 = FileUtils.isFileOlder(file0, file1);
		boolean boolean1 = FileUtils.waitFor(file1, (int) '4');
		LineIterator lineIterator0 = FileUtils.lineIterator(file1);
		boolean boolean2 = FileUtils.isFileOlder(file1, (-1L));
		Charset charset = null;
		String str = FileUtils.readFileToString(file1, charset);
		FileOutputStream fileOutputStream0 = FileUtils.openOutputStream(file1, false);
		LineIterator lineIterator1 = FileUtils.lineIterator(file1);
		FileOutputStream fileOutputStream1 = FileUtils.openOutputStream(file1);
		assertNotNull(strArray0);
		assertNotNull(file0);
		assertEquals(file0.getParent(), "hi!");
		assertEquals(file0.toString(), "hi!\\hi!");
		assertNotNull(strArray1);
		assertNotNull(file1);
		assertEquals(file1.getParent(), "hi!");
		assertEquals(file1.toString(), "hi!\\hi!");
		assertTrue(boolean0 == false, "'" + boolean0 + "' != '" + false + "'");
		assertTrue(boolean1 == true, "'" + boolean1 + "' != '" + true + "'");
		assertNotNull(lineIterator0);
		assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
		assertEquals(str, "35 bytes", "'" + str + "' != '" + "35 bytes" + "'");
		assertNotNull(fileOutputStream0);
		assertNotNull(lineIterator1);
		assertNotNull(fileOutputStream1);
	}
	
	@Test
	public void testAssertThrows_readFileToByteArray_fileNull() {
		assertThrows(NullPointerException.class, () -> FileUtils.readFileToByteArray((File) null));
	}
	
	@Test
	public void testAssertThrowsMessage_copyFile_toOutputStream_inIsDir() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils.copyFile(Scaffolding.dir(), Scaffolding.outputStream()));
		assertEquals("testResources/dir (Is a directory)", thrown.getMessage());
	}
	
	@Test
	public void testAssertThrowsMessage_cleanDirectory_dirNonDeletableFile() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils.cleanDirectory(Scaffolding.dirNonDeletableFile()));
		assertEquals("Unable to delete file: testResources/dirNonDeletableFile/file-non-deletable.txt",
				thrown.getMessage());
	}
	
	@Test
	public void testAssertThrowsMessage_sizeOfDirectory_dirNonExistent() {
		final IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
				() -> FileUtils.sizeOfDirectory(Scaffolding.dirNonExistent()));
		assertEquals("testResources/dirNonExistent does not exist", thrown.getMessage());
	}
	
	@Test
	public void testDeleteQuietlyFile() throws IOException {
		final File testFile = new File(Scaffolding.temporaryFolder, "testDeleteQuietlyFile");
		if (!testFile.getParentFile().exists()) {
			throw new IOException("Cannot create file " + testFile + " as the parent directory does not exist");
		}
		final BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(testFile));
		try {
			Scaffolding.generateTestData(output, 0);
		}
		finally {
			IOUtils.closeQuietly(output);
		}
		
		assertTrue(testFile.exists());
		FileUtils.deleteQuietly(testFile);
		assertFalse(testFile.exists(), "Check No Exist");
	}
	
	@Test
	public void copyDirectoryToDirectoryThrowsIllegalExceptionWithCorrectMessageWhenSrcDirIsNotDirectory()
			throws IOException {
		final File srcDir = File.createTempFile("notadireotry", null, Scaffolding.temporaryFolder);
		final File destDir = new File(Scaffolding.temporaryFolder, "destinationDirectory");
		destDir.mkdirs();
		final String expectedMessage = String.format("Source '%s' is not a directory", srcDir);
		Scaffolding.assertExceptionTypeAndMessage(srcDir, destDir, IllegalArgumentException.class, expectedMessage);
	}
	
	@Test
	public void testContentEqualsIgnoreEOL() throws Throwable {
		MockFile mockFile = new MockFile("org.apache.commons.io.filefilter.CanWriteFileFilter",
				"org.apache.commons.io.filefilter.CanWriteFileFilter");
		boolean boolean0 = FileUtils.contentEqualsIgnoreEOL((File) null, mockFile, "/m]&,[JJKH&pUP2Ar");
		assertFalse(boolean0);
	}
	
	@Test
	public void testAssertThrowsMessage_readFileToString_string_fileNonExistent() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils.readFileToString(Scaffolding.fileNonExistent(), Scaffolding.CHARSET_VALID));
		assertEquals("File 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
	}
}
