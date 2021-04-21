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
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.zip.Adler32;

import org.apache.commons.io.Scaffolding.MockFile;
import org.apache.commons.io.filefilter.CanExecuteFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.NotFileFilter;
import org.junit.jupiter.api.Test;

public class FileUtilsTest {
	
	@Test
	public void testAssertThrowsMessage_isFileOlder_date_fileNull() {
		final IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
				() -> FileUtils.isFileOlder((File) null, new Date()));
		assertEquals("No specified file", thrown.getMessage());
	}
	
	@Test
	public void testIdentifiesSymlinkDir() throws Exception {
		if (System.getProperty("os.name").startsWith("Win")) {
			return;
		}
		
		final File randomDirectory = new File(Scaffolding.top, "randomDir");
		assertTrue(randomDirectory.mkdirs());
		
		final File symlinkDirectory = new File(Scaffolding.top, "fakeDir");
		Scaffolding.setupSymlink(randomDirectory, symlinkDirectory);
		
		assertTrue(FileUtils.isSymlink(symlinkDirectory));
		assertFalse(FileUtils.isSymlink(randomDirectory));
	}
	
	@Test
	public void testAssertThrowsMessage_getFile_withParent_dirNull() {
		final NullPointerException thrown = assertThrows(NullPointerException.class,
				() -> FileUtils.getFile((File) null, "src"));
		assertEquals("directory must not be null", thrown.getMessage());
	}
	
	@Test
	public void testReadFileToStringWithDefaultEncoding() throws Exception {
		final File file = new File(Scaffolding.temporaryFolder, "read.obj");
		final FileOutputStream out = new FileOutputStream(file);
		final byte[] text = "Hello /u1234".getBytes();
		out.write(text);
		out.close();
		
		final String data = FileUtils.readFileToString(file);
		assertEquals("Hello /u1234", data);
	}
	
	@Test
	public void testChecksum() throws Throwable {
		Adler32 adler32 = new Adler32();
		MockFile mockFile = new MockFile("F:M%thieu5gitcommons-ioM");
		mockFile.mkdirs();
		try {
			FileUtils.checksum(mockFile, adler32);
			fail("Expecting exception: IllegalArgumentException");
			
		}
		catch (IllegalArgumentException e) {
			Scaffolding.verifyException("org.apache.commons.io.FileUtils", e);
		}
	}
	
	@Test
	public void testAssertThrowsMessage_writeByteArrayToFile_offset_parentMkdirFails() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils.writeByteArrayToFile(Scaffolding.fileParentMkdirFails(), new byte[10], 0, 5));
		assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
	}
	
	@Test
	public void testAssertThrows_readFileToString_string_fileNull() {
		assertThrows(NullPointerException.class,
				() -> FileUtils.readFileToString((File) null, Scaffolding.CHARSET_VALID));
	}
	
	@Test
	public void testMoveDirectory_CopyDelete() throws Exception {
		
		final File dir = Scaffolding.temporaryFolder;
		final File src = new File(dir, "testMoveDirectory2Source") {
			
			private static final long serialVersionUID = 1L;
			
			@Override
			public boolean renameTo(final File dest) {
				return false;
			}
		};
		final File testDir = new File(src, "foo");
		final File testFile = new File(testDir, "bar");
		testDir.mkdirs();
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
		final File destination = new File(dir, "testMoveDirectory1Dest");
		FileUtils.deleteDirectory(destination);
		
		FileUtils.moveDirectory(src, destination);
		
		assertTrue(destination.exists(), "Check Exist");
		assertTrue(!src.exists(), "Original deleted");
		final File movedDir = new File(destination, testDir.getName());
		final File movedFile = new File(movedDir, testFile.getName());
		assertTrue(movedDir.exists(), "Check dir moved");
		assertTrue(movedFile.exists(), "Check file moved");
	}
	
	@Test
	public void test_openOutputStream_notExists() throws Exception {
		final File file = new File(Scaffolding.temporaryFolder, "a/test.txt");
		try (FileOutputStream out = FileUtils.openOutputStream(file)) {
			out.write(0);
		}
		assertTrue(file.exists());
	}
	
	@Test
	public void testCopyFile2ToDir() throws Exception {
		final File directory = new File(Scaffolding.temporaryFolder, "subdir");
		if (!directory.exists()) {
			directory.mkdirs();
		}
		final File destination = new File(directory, Scaffolding.testFile1.getName());
		
		FileUtils.copyFileToDirectory(Scaffolding.testFile1, directory);
		assertTrue(destination.exists(), "Check Exist");
		assertEquals(Scaffolding.testFile2Size, destination.length(), "Check Full copy");
	}
	
	@Test
	public void testWrite_WithAppendOptionFalse_ShouldDeletePreviousFileLines() throws Exception {
		final File file = Scaffolding.newFile(Scaffolding.temporaryFolder, "lines.txt");
		FileUtils.writeStringToFile(file, "This line was there before you...");
		
		FileUtils.write(file, "this is brand new data", false);
		
		final String expected = "this is brand new data";
		final String actual = FileUtils.readFileToString(file);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAssertThrowsMessage_copyToDirectory_iterable_srcsContainsFileExistsInDest() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils.copyToDirectory(Collections.singleton(Scaffolding.fileNotWritable()),
						Scaffolding.ROOT));
		assertEquals(
				"Source 'testResources/file-not-writable.txt' and destination 'testResources/file-not-writable.txt' are the same",
				thrown.getMessage());
	}
	
	@Test
	public void testAssertThrowsMessage_copyDirectory_srcNull() {
		final NullPointerException thrown = assertThrows(NullPointerException.class,
				() -> FileUtils.copyDirectory((File) null, Scaffolding.dir()));
		assertEquals("Source must not be null", thrown.getMessage());
	}
	
	@Test
	public void testAssertThrows_listFilesAndDirs_dirNull() {
		assertThrows(NullPointerException.class,
				() -> FileUtils.listFilesAndDirs((File) null, FileFilterUtils.trueFileFilter(), null));
	}
	
	@Test
	public void testAssertThrowsMessage_readFileToString_string_fileIsDir() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils.readFileToString(Scaffolding.dir(), Scaffolding.CHARSET_VALID));
		assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
	}
	
	@Test
	public void testAssertThrowsMessage_writeStringToFile_string_parentMkdirFails() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils
						.writeStringToFile(Scaffolding.fileParentMkdirFails(), "test", Scaffolding.CHARSET_VALID));
		assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
	}
	
	@Test
	public void testMoveDirectory_Rename() throws Exception {
		final File dir = Scaffolding.temporaryFolder;
		final File src = new File(dir, "testMoveDirectory1Source");
		final File testDir = new File(src, "foo");
		final File testFile = new File(testDir, "bar");
		testDir.mkdirs();
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
		final File destination = new File(dir, "testMoveDirectory1Dest");
		FileUtils.deleteDirectory(destination);
		
		FileUtils.moveDirectory(src, destination);
		
		assertTrue(destination.exists(), "Check Exist");
		assertTrue(!src.exists(), "Original deleted");
		final File movedDir = new File(destination, testDir.getName());
		final File movedFile = new File(movedDir, testFile.getName());
		assertTrue(movedDir.exists(), "Check dir moved");
		assertTrue(movedFile.exists(), "Check file moved");
	}
	
	@Test
	public void testListFilesAndDirs() {
		MockFile mockFile = new MockFile("");
		NotFileFilter notFileFilter = (NotFileFilter) CanExecuteFileFilter.CANNOT_EXECUTE;
		Collection<File> collection = FileUtils.listFilesAndDirs(mockFile, notFileFilter, notFileFilter);
		assertNotNull(collection);
	}
	
	@Test
	public void testByteCountToDisplaySize() {
		BigInteger bigInteger = FileUtils.ONE_MB_BI;
		String string = FileUtils.byteCountToDisplaySize(bigInteger);
		assertEquals("1 MB", string);
	}
	
	@Test
	public void testIsFileOlder() throws Throwable {
		try {
			FileUtils.isFileOlder((File) null, (-1215L));
			fail("Expecting exception: IllegalArgumentException");
		}
		catch (IllegalArgumentException e) {
			Scaffolding.verifyException("org.apache.commons.io.FileUtils", e);
		}
	}
	
	@Test
	public void testIsFileNewer2() {
		File file = FileUtils.getUserDirectory();
		boolean boolean0 = FileUtils.isFileNewer(file, (-2383L));
		assertFalse(boolean0);
	}
	
	@Test
	public void testWriteByteArrayToFile() throws Throwable {
		File file = FileUtils.getUserDirectory();
		Scaffolding.setFileSystemShouldAllThrowIOExceptions();
		try {
			FileUtils.writeByteArrayToFile(file, (byte[]) null, 8, 37, true);
			fail("Expecting exception: IOException");
			
		}
		catch (IOException e) {
			Scaffolding.verifyException("org.apache.commons.io.FileUtils", e);
		}
	}
	
	@Test
	public void testAssertThrowsMessage_moveDirectory_srcNull() {
		final NullPointerException thrown = assertThrows(NullPointerException.class,
				() -> FileUtils.moveDirectory((File) null, Scaffolding.dir()));
		assertEquals("Source must not be null", thrown.getMessage());
	}
	
	@Test
	public void testFileUtils1() throws Throwable {
		File file = FileUtils.getUserDirectory();
		FileUtils.openOutputStream(file);
		try {
			FileUtils.moveToDirectory(file, file, true);
			fail("Expecting exception: IOException");
		}
		catch (IOException e) {
			Scaffolding.verifyException("org.apache.commons.io.FileUtils", e);
		}
	}
	
	@Test
	public void testFileUtils2() throws Throwable {
		String[] strArray0 = new String[]{ "hi!", "hi!" };
		File file0 = FileUtils.getFile(strArray0);
		String[] strArray1 = new String[]{ "hi!", "hi!" };
		File file1 = FileUtils.getFile(strArray1);
		boolean boolean0 = FileUtils.isFileOlder(file0, file1);
		boolean boolean1 = FileUtils.waitFor(file1, (int) '4');
		String[] strArray2 = new String[]{ "hi!", "hi!" };
		File file2 = FileUtils.getFile(strArray2);
		boolean boolean2 = FileUtils.contentEqualsIgnoreEOL(file1, file2, "");
		LineIterator lineIterator = FileUtils.lineIterator(file1);
		FileUtils.writeStringToFile(file1, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
		Charset charset22 = null;
		FileUtils.write(file1, (CharSequence) "", charset22, true);
		boolean boolean3 = FileUtils.waitFor(file1, 0);
		FileUtils.writeStringToFile(file1, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
		IOFileFilter iOFileFilter0 = null;
		IOFileFilter iOFileFilter1 = null;
		try {
			Iterator<File> fileItor = FileUtils.iterateFiles(file1, iOFileFilter0, iOFileFilter1);
			fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'directory' is not a directory: hi!\\hi!");
		}
		catch (IllegalArgumentException e) {
		}
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
		assertNotNull(strArray2);
		assertNotNull(file2);
		assertEquals(file2.getParent(), "hi!");
		assertEquals(file2.toString(), "hi!\\hi!");
		assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
		assertTrue(boolean3 == true, "'" + boolean3 + "' != '" + true + "'");
		assertNotNull(lineIterator);
	}
	
	@Test
	public void testIsFileNewer1() throws Throwable {
		File file = MockFile.createTempFile("X/?", "F:Mathieugitcommons-oM");
		try {
			FileUtils.isFileNewer(file, file);
			fail("Expecting exception: IllegalArgumentException");
		}
		catch (IllegalArgumentException e) {
			Scaffolding.verifyException("org.apache.commons.io.FileUtils", e);
		}
	}
}
