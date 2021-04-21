package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import org.apache.commons.io.Scaffolding.CheckingInputStream;
import org.apache.commons.io.Scaffolding.MockFile;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.NotFileFilter;
import org.junit.jupiter.api.Test;

public class FileUtilsTest {
	
	@Test
	public void testAssertThrows_forceMkdir_dirNull() {
		assertThrows(NullPointerException.class, () -> FileUtils.forceMkdir((File) null));
	}
	
	@Test
	public void testToFile3() throws Exception {
		assertEquals(null, FileUtils.toFile(null));
		assertEquals(null, FileUtils.toFile(new URL("http://jakarta.apache.org")));
	}
	
	@Test
	public void testAssertThrows_copyFileToDirectory_srcNull() {
		assertThrows(NullPointerException.class, () -> FileUtils.copyFileToDirectory((File) null, Scaffolding.dir()));
	}
	
	@Test
	public void testCopyInputStreamToFile1() throws Throwable {
		PushbackInputStream pushbackInputStream = new PushbackInputStream((InputStream) null, 1431);
		File file = FileUtils.getUserDirectory();
		try {
			FileUtils.copyInputStreamToFile(pushbackInputStream, file);
			fail("Expecting exception: IOException");
			
		}
		catch (IOException e) {
			Scaffolding.verifyException("java.io.PushbackInputStream", e);
		}
	}
	
	@Test
	public void testAssertThrowsMessage_moveDirectory_srcNotADir() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils.moveDirectory(Scaffolding.file(), Scaffolding.dir()));
		assertEquals("Source 'testResources/file.txt' is not a directory", thrown.getMessage());
	}
	
	@Test
	public void testAssertThrowsMessage_writeByteArrayToFile_fileNotWritable() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils.writeByteArrayToFile(Scaffolding.fileNotWritable(), new byte[10]));
		assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
	}
	
	@Test
	public void testIdentifiesSymlinkFile() throws Exception {
		if (System.getProperty("os.name").startsWith("Win")) {
			// cant create symlinks in windows.
			return;
		}
		
		final File randomFile = new File(Scaffolding.top, "randomfile");
		FileUtils.touch(randomFile);
		
		final File symlinkFile = new File(Scaffolding.top, "fakeinner");
		Scaffolding.setupSymlink(randomFile, symlinkFile);
		
		assertTrue(FileUtils.isSymlink(symlinkFile));
		assertFalse(FileUtils.isSymlink(randomFile));
	}
	
	@Test
	public void testAssertThrowsMessage_writeStringToFile_charset_parentMkdirFails() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils.writeStringToFile(Scaffolding.fileParentMkdirFails(), "test", StandardCharsets.UTF_8));
		assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
	}
	
	@Test
	public void testAssertThrowsMessage_moveFileToDirectory_srcNonExistent() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils.moveFileToDirectory(Scaffolding.fileNonExistent(), Scaffolding.dir(), false));
		assertEquals("Source 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
	}
	
	@Test
	public void testAssertThrowsMessage_write_stringWithAppend_encodingUnsupported() {
		final UnsupportedCharsetException thrown = assertThrows(UnsupportedCharsetException.class,
				() -> FileUtils.write(Scaffolding.file(), "test", Scaffolding.CHARSET_UNSUPPORTED, true));
		assertEquals(Scaffolding.CHARSET_UNSUPPORTED, thrown.getMessage());
	}
	
	@Test
	public void testCopyToDirectoryWithFileSourceDoesNotExist() {
		assertThrows(IOException.class,
				() -> FileUtils.copyToDirectory(new File(Scaffolding.temporaryFolder, "doesNotExists"),
						Scaffolding.temporaryFolder));
	}
	
	@Test
	public void testSizeOf() throws Throwable {
		File file = FileUtils.getTempDirectory();
		try {
			FileUtils.sizeOf(file);
			fail("Expecting exception: IllegalArgumentException");
		}
		catch (IllegalArgumentException e) {
			Scaffolding.verifyException("org.apache.commons.io.FileUtils", e);
		}
	}
	
	@Test
	public void testFileUtils() throws Throwable {
		File file = FileUtils.getUserDirectory();
		Vector<File> vector = new Vector<File>();
		FileUtils.copyToDirectory((Iterable<File>) vector, file);
		assertEquals("Mathieu", file.getName());
	}
	
	@Test
	public void testAssertThrowsMessage_cleanDirectory_dirNonExistent() {
		final IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
				() -> FileUtils.cleanDirectory(Scaffolding.dirNonExistent()));
		assertEquals("testResources/dirNonExistent does not exist", thrown.getMessage());
	}
	
	@Test
	public void testCopyDirectory() throws Throwable {
		String[] stringArray = new String[7];
		stringArray[0] = "target";
		stringArray[1] = "";
		stringArray[2] = "^[a-zA-Z0-9][a-zA-Z0-9-]*$";
		stringArray[3] = "Insensitive";
		stringArray[4] = "The reference file '";
		stringArray[5] = "~vd";
		stringArray[6] = "=K:?.VtKJP%1xqV}";
		NotFileFilter notFileFilter = (NotFileFilter) EmptyFileFilter.NOT_EMPTY;
		File file0 = FileUtils.getFile(stringArray);
		File file1 = MockFile.createTempFile("Insensitive", "~vd", file0);
		try {
			FileUtils.copyDirectory(file1, file0, (FileFilter) notFileFilter);
			fail("Expecting exception: IOException");
			
		}
		catch (IOException e) {
			Scaffolding.verifyException("org.apache.commons.io.FileUtils", e);
		}
	}
	
	@Test
	public void testCopyInputStreamToFile2() throws IOException {
		try (CheckingInputStream inputStream = new CheckingInputStream(Scaffolding.testData)) {
			FileUtils.copyInputStreamToFile(inputStream, Scaffolding.testFile);
			assertTrue(inputStream.isClosed(), "inputStream should be closed");
		}
	}
	
	@Test
	public void testAssertThrowsMessage_copyFile_destReadOnly() {
		final IOException thrown = assertThrows(IOException.class,
				() -> FileUtils.copyFile(Scaffolding.file(), Scaffolding.fileNotWritable()));
		assertEquals("Destination 'testResources/file-not-writable.txt' exists but is read-only", thrown.getMessage());
	}
	
	@Test
	public void testAssertThrowsMessage_iterateFilesAndDirs_dirNotADir() {
		final IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
				() -> FileUtils.iterateFilesAndDirs(Scaffolding.file(), FileFilterUtils.trueFileFilter(), null));
		assertEquals("Parameter 'directory' is not a directory: testResources/file.txt", thrown.getMessage());
	}
	
	@Test
	public void testUnrealizedContainment() throws IOException {
		final File dir = new File("DOESNOTEXIST");
		final File file = new File(dir, "DOESNOTEXIST2");
		assertFalse(dir.exists());
		assertFalse(file.exists());
		try {
			assertTrue(FileUtils.directoryContains(dir, file));
		}
		catch (final IllegalArgumentException e) {
		}
	}
	
	@Test
	public void testWriteStringToFile() throws Throwable {
		MockFile mockFile = new MockFile("");
		try {
			FileUtils.writeStringToFile((File) mockFile, (String) null);
			fail("Expecting exception: IOException");
			
		}
		catch (IOException e) {
			Scaffolding.verifyException("org.apache.commons.io.FileUtils", e);
		}
	}
	
	@Test
	public void testToFile4() throws Exception {
		final URL url = new URL("file", null, "a/b/c/file%%20%me.txt%");
		final File file = FileUtils.toFile(url);
		assertTrue(file.toString().contains("file% %me.txt%"));
	}
	
	@Test
	public void testIdentifiesBrokenSymlinkFile() throws Exception {
		if (System.getProperty("os.name").startsWith("Win")) {
			return;
		}
		
		final File noexistFile = new File(Scaffolding.top, "noexist");
		final File symlinkFile = new File(Scaffolding.top, "fakeinner");
		final File badSymlinkInPathFile = new File(symlinkFile, "fakeinner");
		final File noexistParentFile = new File("noexist", "file");
		
		Scaffolding.setupSymlink(noexistFile, symlinkFile);
		
		assertTrue(FileUtils.isSymlink(symlinkFile));
		assertFalse(FileUtils.isSymlink(noexistFile));
		assertFalse(FileUtils.isSymlink(noexistParentFile));
		assertFalse(FileUtils.isSymlink(badSymlinkInPathFile));
	}
	
	@Test
	public void testWriteLines_3argsWithAppendOptionFalse_ShouldDeletePreviousFileLines() throws Exception {
		final File file = Scaffolding.newFile(Scaffolding.temporaryFolder, "lines.txt");
		FileUtils.writeStringToFile(file, "This line was there before you...");
		
		final List<String> linesToAppend = Arrays.asList("my first line", "The second Line");
		FileUtils.writeLines(file, linesToAppend, false);
		
		final String expected = "my first line" + IOUtils.LINE_SEPARATOR + "The second Line" + IOUtils.LINE_SEPARATOR;
		final String actual = FileUtils.readFileToString(file);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testWriteByteArrayToFile_WithAppendOptionFalse_ShouldDeletePreviousFileLines() throws Exception {
		final File file = Scaffolding.newFile(Scaffolding.temporaryFolder, "lines.txt");
		FileUtils.writeStringToFile(file, "This line was there before you...");
		
		FileUtils.writeByteArrayToFile(file, "this is brand new data".getBytes(), false);
		
		final String expected = "this is brand new data";
		final String actual = FileUtils.readFileToString(file);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAssertThrows_iterateFiles_withFileFilter_dirNull() {
		assertThrows(NullPointerException.class,
				() -> FileUtils.iterateFiles((File) null, FileFilterUtils.trueFileFilter(), null));
	}
}
