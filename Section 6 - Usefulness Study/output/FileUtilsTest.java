package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class FileUtilsTest {

    @Test
    public void testAssertThrowsMessage_contentEquals_file1Dir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.contentEquals(FileUtilsUtils.dir(), FileUtilsUtils.file()));
        assertEquals("Can't compare directories, only files", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_contentEquals_file2Dir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.contentEquals(FileUtilsUtils.file(), FileUtilsUtils.dir()));
        assertEquals("Can't compare directories, only files", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_contentEquals_file1Null() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.contentEquals((File) null, FileUtilsUtils.file()));
    }

    @Test
    public void testAssertThrows_contentEquals_file2Null() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.contentEquals(FileUtilsUtils.file(), (File) null));
    }

    @Test
    public void testAssertThrowsMessage_write_charsetWithAppend_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.write(FileUtilsUtils.dir(), "test", StandardCharsets.UTF_8, true));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_write_charsetWithAppend_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.write(FileUtilsUtils.fileNotWritable(), "test", StandardCharsets.UTF_8, true));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_write_charsetWithAppend_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.write(FileUtilsUtils.fileParentMkdirFails(), "test", StandardCharsets.UTF_8, true));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_write_charsetWithAppend_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.write((File) null, "test", StandardCharsets.UTF_8, true));
    }

    @Test
    public void testAssertThrowsMessage_write_stringWithAppend_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.write(FileUtilsUtils.dir(), "test", FileUtilsUtils.CHARSET_VALID, true));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_write_stringWithAppend_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.write(FileUtilsUtils.fileNotWritable(), "test", FileUtilsUtils.CHARSET_VALID, true));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_write_stringWithAppend_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.write(FileUtilsUtils.fileParentMkdirFails(), "test", FileUtilsUtils.CHARSET_VALID, true));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_write_stringWithAppend_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.write((File) null, "test", FileUtilsUtils.CHARSET_VALID, true));
    }

    @Test
    public void testAssertThrowsMessage_write_stringWithAppend_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> FileUtils.write(FileUtilsUtils.file(), "test", FileUtilsUtils.CHARSET_UNSUPPORTED, true));
        assertEquals(FileUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_write_stringWithAppend_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> FileUtils.write(FileUtilsUtils.file(), "test", FileUtilsUtils.CHARSET_ILLEGAL, true));
        assertEquals(FileUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_write_charset_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.write(FileUtilsUtils.dir(), "test", StandardCharsets.UTF_8));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_write_charset_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.write(FileUtilsUtils.fileNotWritable(), "test", StandardCharsets.UTF_8));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_write_charset_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.write(FileUtilsUtils.fileParentMkdirFails(), "test", StandardCharsets.UTF_8));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_write_charset_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.write((File) null, "test", StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrowsMessage_write_string_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.write(FileUtilsUtils.dir(), "test", FileUtilsUtils.CHARSET_VALID));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_write_string_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.write(FileUtilsUtils.fileNotWritable(), "test", FileUtilsUtils.CHARSET_VALID));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_write_string_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.write(FileUtilsUtils.fileParentMkdirFails(), "test", FileUtilsUtils.CHARSET_VALID));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_write_string_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.write((File) null, "test", FileUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_write_string_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> FileUtils.write(FileUtilsUtils.file(), "test", FileUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(FileUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_write_string_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> FileUtils.write(FileUtilsUtils.file(), "test", FileUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(FileUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_getFile_namesNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.getFile(FileUtilsUtils.dir(), (String[]) null));
        assertEquals("names must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_getFile_withParent_dirNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.getFile((File) null, "src"));
        assertEquals("directory must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_getFile_withParent_namesNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.getFile(FileUtilsUtils.dir(), (String[]) null));
        assertEquals("names must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_listFiles_withFileFilter_dirNotADir() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.listFiles(FileUtilsUtils.file(), FileFilterUtils.trueFileFilter(), null));
        assertEquals("Parameter 'directory' is not a directory: testResources/file.txt", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_listFiles_withFileFilter_fileFilterNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.listFiles(FileUtilsUtils.dir(), (IOFileFilter) null, null));
        assertEquals("Parameter 'fileFilter' is null", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_listFiles_withFileFilter_dirNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.listFiles((File) null, FileFilterUtils.trueFileFilter(), null));
    }

    @Test
    public void testAssertThrowsMessage_listFiles_withExtensions_dirNotADir() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.listFiles(FileUtilsUtils.file(), new String[]{"xml", "txt"}, false));
        assertEquals("Parameter 'directory' is not a directory: testResources/file.txt", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_listFiles_withExtensions_dirNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.listFiles((File) null, new String[]{"xml", "txt"}, false));
    }

    @Test
    public void testAssertThrows_checksum_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.checksum((File) null, new CRC32()));
    }

    @Test
    public void testAssertThrows_checksum_checksumNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.checksum(FileUtilsUtils.file(), (Checksum) null));
    }

    @Test
    public void testAssertThrowsMessage_checksum_fileDir() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.checksum(FileUtilsUtils.dir(), new CRC32()));
        assertEquals("Checksums can't be computed on directories", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_checksum_fileNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.checksum(FileUtilsUtils.fileNonExistent(), new CRC32()));
        assertEquals("testResources/file-non-existent.txt (No such file or directory)", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_checksum_fileNotReadable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.checksum(FileUtilsUtils.fileNotReadable(), new CRC32()));
        assertEquals("testResources/file-not-readable.txt (Permission denied)", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_openInputStream_fileNonExistent() {
        final java.io.FileNotFoundException thrown = assertThrows(java.io.FileNotFoundException.class, () -> FileUtils.openInputStream(FileUtilsUtils.fileNonExistent()));
        assertEquals("File 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_openInputStream_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.openInputStream(FileUtilsUtils.dir()));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_openInputStream_fileNotReadable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.openInputStream(FileUtilsUtils.fileNotReadable()));
        assertEquals("File 'testResources/file-not-readable.txt' cannot be read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_openInputStream_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.openInputStream((File) null));
    }

    @Test
    public void testAssertThrowsMessage_openOutputStream_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.openOutputStream(FileUtilsUtils.dir()));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_openOutputStream_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.openOutputStream(FileUtilsUtils.fileNotWritable()));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_openOutputStream_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.openOutputStream(FileUtilsUtils.fileParentMkdirFails()));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_openOutputStream_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.openOutputStream((File) null));
    }

    @Test
    public void testAssertThrowsMessage_openOutputStream_append_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.openOutputStream(FileUtilsUtils.dir(), true));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_openOutputStream_append_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.openOutputStream(FileUtilsUtils.fileNotWritable(), true));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_openOutputStream_append_parentMkdirFail() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.openOutputStream(FileUtilsUtils.fileParentMkdirFails(), true));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_openOutputStream_append_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.openOutputStream((File) null, true));
    }

    @Test
    public void testAssertThrows_byteCountToDisplaySize_bigInteger_sizeNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.byteCountToDisplaySize((BigInteger) null));
    }

    @Test
    public void testAssertThrowsMessage_touch_setLastModifiedFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.touch(FileUtilsUtils.fileSetLastModifiedFails()));
        assertEquals("Unable to set the last modification time for testResources/set-last-modified-fails.txt", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_touch_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.touch(FileUtilsUtils.fileParentMkdirFails()));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_touch_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.touch((File) null));
    }

    @Test
    public void testAssertThrows_convertFileCollectionToFileArray_filesNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.convertFileCollectionToFileArray((Collection<File>) null));
    }

    @Test
    public void testAssertThrowsMessage_listFilesAndDirs_dirNotADir() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.listFilesAndDirs(FileUtilsUtils.file(), FileFilterUtils.trueFileFilter(), null));
        assertEquals("Parameter 'directory' is not a directory: testResources/file.txt", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_listFilesAndDirs_fileFilterNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.listFilesAndDirs(FileUtilsUtils.dir(), (IOFileFilter) null, null));
        assertEquals("Parameter 'fileFilter' is null", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_listFilesAndDirs_dirNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.listFilesAndDirs((File) null, FileFilterUtils.trueFileFilter(), null));
    }

    @Test
    public void testAssertThrowsMessage_iterateFiles_withExtensions_dirNotADir() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.iterateFiles(FileUtilsUtils.file(), new String[]{"xml", "txt"}, false));
        assertEquals("Parameter 'directory' is not a directory: testResources/file.txt", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_iterateFiles_withExtensions_dirNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.iterateFiles((File) null, new String[]{"xml", "txt"}, false));
    }

    @Test
    public void testAssertThrowsMessage_iterateFiles_withFileFilter_dirNotADir() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.iterateFiles(FileUtilsUtils.file(), FileFilterUtils.trueFileFilter(), null));
        assertEquals("Parameter 'directory' is not a directory: testResources/file.txt", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_iterateFiles_withFileFilter_fileFilterNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.iterateFiles(FileUtilsUtils.dir(), (IOFileFilter) null, null));
        assertEquals("Parameter 'fileFilter' is null", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_iterateFiles_withFileFilter_dirNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.iterateFiles((File) null, FileFilterUtils.trueFileFilter(), null));
    }

    @Test
    public void testAssertThrowsMessage_iterateFilesAndDirs_dirNotADir() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.iterateFilesAndDirs(FileUtilsUtils.file(), FileFilterUtils.trueFileFilter(), null));
        assertEquals("Parameter 'directory' is not a directory: testResources/file.txt", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_iterateFilesAndDirs_fileFilterNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.iterateFilesAndDirs(FileUtilsUtils.dir(), (IOFileFilter) null, null));
        assertEquals("Parameter 'fileFilter' is null", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_iterateFilesAndDirs_dirNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.iterateFilesAndDirs((File) null, FileFilterUtils.trueFileFilter(), null));
    }

    @Test
    public void testAssertThrowsMessage_contentEqualsIgnoreEOL_file1Dir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.contentEqualsIgnoreEOL(FileUtilsUtils.dir(), FileUtilsUtils.file(), null));
        assertEquals("Can't compare directories, only files", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_contentEqualsIgnoreEOL_file2Dir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.contentEqualsIgnoreEOL(FileUtilsUtils.file(), FileUtilsUtils.dir(), null));
        assertEquals("Can't compare directories, only files", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_contentEqualsIgnoreEOL_file1Null() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.contentEqualsIgnoreEOL((File) null, FileUtilsUtils.file(), null));
    }

    @Test
    public void testAssertThrows_contentEqualsIgnoreEOL_file2Null() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.contentEqualsIgnoreEOL(FileUtilsUtils.file(), (File) null, null));
    }

    @Test
    public void testAssertThrowsMessage_toFiles_notURLFile() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.toFiles(FileUtilsUtils.URLS()));
        assertEquals("URL could not be converted to a File: http://test.orgfile.txt", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copyFileToDirectory_srcNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyFileToDirectory((File) null, FileUtilsUtils.dir()));
    }

    @Test
    public void testAssertThrowsMessage_copyFileToDirectory_destNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyFileToDirectory(FileUtilsUtils.file(), (File) null));
        assertEquals("Destination must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFileToDirectory_destNotDir() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.copyFileToDirectory(FileUtilsUtils.file(), FileUtilsUtils.file()));
        assertEquals("Destination 'testResources/file.txt' is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFileToDirectory_srcNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFileToDirectory(FileUtilsUtils.fileNonExistent(), FileUtilsUtils.dir()));
        assertEquals("Source 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFileToDirectory_srcIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFileToDirectory(FileUtilsUtils.dir(), FileUtilsUtils.dir()));
        assertEquals("Source 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFileToDirectory_srcExistsInDest() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFileToDirectory(FileUtilsUtils.fileNotWritable(), FileUtilsUtils.ROOT));
        assertEquals("Source 'testResources/file-not-writable.txt' and destination 'testResources/file-not-writable.txt' are the same", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copyFileToDirectory_copyIOException() {
        assertThrows(java.io.IOException.class, () -> FileUtils.copyFileToDirectory(FileUtilsUtils.fileNotReadable(), FileUtilsUtils.dir()));
    }

    @Test
    public void testAssertThrows_copyFileToDirectory_bool_srcNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyFileToDirectory((File) null, FileUtilsUtils.dir(), true));
    }

    @Test
    public void testAssertThrowsMessage_copyFileToDirectory_bool_destNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyFileToDirectory(FileUtilsUtils.file(), (File) null, true));
        assertEquals("Destination must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFileToDirectory_bool_destNotDir() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.copyFileToDirectory(FileUtilsUtils.file(), FileUtilsUtils.file(), true));
        assertEquals("Destination 'testResources/file.txt' is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFileToDirectory_bool_srcNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFileToDirectory(FileUtilsUtils.fileNonExistent(), FileUtilsUtils.dir(), true));
        assertEquals("Source 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFileToDirectory_bool_srcIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFileToDirectory(FileUtilsUtils.dir(), FileUtilsUtils.dir(), true));
        assertEquals("Source 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFileToDirectory_bool_srcExistsInDest() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFileToDirectory(FileUtilsUtils.fileNotWritable(), FileUtilsUtils.ROOT, true));
        assertEquals("Source 'testResources/file-not-writable.txt' and destination 'testResources/file-not-writable.txt' are the same", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copyFileToDirectory_bool_copyIOException() {
        assertThrows(java.io.IOException.class, () -> FileUtils.copyFileToDirectory(FileUtilsUtils.fileNotReadable(), FileUtilsUtils.dir(), true));
    }

    @Test
    public void testAssertThrowsMessage_copyFile_bool_srcNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyFile((File) null, FileUtilsUtils.file(), true));
        assertEquals("Source must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_bool_destNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyFile(FileUtilsUtils.file(), (File) null, true));
        assertEquals("Destination must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_bool_srcNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.fileNonExistent(), FileUtilsUtils.file(), true));
        assertEquals("Source 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_bool_srcIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.dir(), FileUtilsUtils.file(), true));
        assertEquals("Source 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_bool_srcAndDestSame() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.file(), FileUtilsUtils.file(), true));
        assertEquals("Source 'testResources/file.txt' and destination 'testResources/file.txt' are the same", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_bool_destReadOnly() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.file(), FileUtilsUtils.fileNotWritable(), true));
        assertEquals("Destination 'testResources/file-not-writable.txt' exists but is read-only", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_bool_destIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.file(), FileUtilsUtils.dir(), true));
        assertEquals("Destination 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_bool_destParentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.file(), FileUtilsUtils.fileParentMkdirFails(), true));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_bool_destOutputShorter() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.file(), FileUtilsUtils.fileShorter(), true));
        assertEquals("Failed to copy full contents from 'testResources/file.txt' to 'testResources/file-shorter.txt' Expected length: 25 Actual: 24", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copyFile_bool_copyIOException() {
        assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.fileNotReadable(), FileUtilsUtils.file(), true));
    }

    @Test
    public void testAssertThrows_copyFile_toOutputStream_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyFile((File) null, FileUtilsUtils.outputStream()));
    }

    @Test
    public void testAssertThrows_copyFile_toOutputStream_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyFile(FileUtilsUtils.file(), (OutputStream) null));
    }

    @Test
    public void testAssertThrowsMessage_copyFile_toOutputStream_inNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.fileNonExistent(), FileUtilsUtils.outputStream()));
        assertEquals("testResources/file-non-existent.txt (No such file or directory)", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_toOutputStream_inIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.dir(), FileUtilsUtils.outputStream()));
        assertEquals("testResources/dir (Is a directory)", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_toOutputStream_inNotReadable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.fileNotReadable(), FileUtilsUtils.outputStream()));
        assertEquals("testResources/file-not-readable.txt (Permission denied)", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_toOutputStream_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.file(), FileUtilsUtils.outputStreamIOException()));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_srcNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyFile((File) null, FileUtilsUtils.file()));
        assertEquals("Source must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_destNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyFile(FileUtilsUtils.file(), (File) null));
        assertEquals("Destination must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_srcNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.fileNonExistent(), FileUtilsUtils.file()));
        assertEquals("Source 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_srcIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.dir(), FileUtilsUtils.file()));
        assertEquals("Source 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_srcAndDestSame() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.file(), FileUtilsUtils.file()));
        assertEquals("Source 'testResources/file.txt' and destination 'testResources/file.txt' are the same", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_destReadOnly() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.file(), FileUtilsUtils.fileNotWritable()));
        assertEquals("Destination 'testResources/file-not-writable.txt' exists but is read-only", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_destIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.file(), FileUtilsUtils.dir()));
        assertEquals("Destination 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_destParentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.file(), FileUtilsUtils.fileParentMkdirFails()));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyFile_destOutputShorter() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.file(), FileUtilsUtils.fileShorter()));
        assertEquals("Failed to copy full contents from 'testResources/file.txt' to 'testResources/file-shorter.txt' Expected length: 25 Actual: 24", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copyFile_copyIOException() {
        assertThrows(java.io.IOException.class, () -> FileUtils.copyFile(FileUtilsUtils.fileNotReadable(), FileUtilsUtils.file()));
    }

    @Test
    public void testAssertThrowsMessage_copyDirectoryToDirectory_srcNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyDirectoryToDirectory((File) null, FileUtilsUtils.dir()));
        assertEquals("Source must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectoryToDirectory_destNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyDirectoryToDirectory(FileUtilsUtils.dir(), (File) null));
        assertEquals("Destination must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectoryToDirectory_srcNotDir() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.copyDirectoryToDirectory(FileUtilsUtils.file(), FileUtilsUtils.dir()));
        assertEquals("Source 'testResources/dir' is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectoryToDirectory_srcNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectoryToDirectory(FileUtilsUtils.dirNonExistent(), FileUtilsUtils.dir()));
        assertEquals("Source 'testResources/dirNonExistent' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectoryToDirectory_destNotDir() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.copyDirectoryToDirectory(FileUtilsUtils.dir(), FileUtilsUtils.file()));
        assertEquals("Destination 'testResources/file.txt' is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectoryToDirectory_srcNotReadable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectoryToDirectory(FileUtilsUtils.dirNotReadable(), FileUtilsUtils.dir()));
        assertEquals("Failed to list contents of testResources/dirNotReadable", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectoryToDirectory_destNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectoryToDirectory(FileUtilsUtils.dir(), FileUtilsUtils.dirNotWritable()));
        assertEquals("Destination 'testResources/dirNotWritable/dir' directory cannot be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_bool_srcNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyDirectory((File) null, FileUtilsUtils.dir(), true));
        assertEquals("Source must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_bool_destNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), (File) null, true));
        assertEquals("Destination must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_bool_destNotDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), FileUtilsUtils.file(), true));
        assertEquals("Destination 'testResources/file.txt' exists but is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_bool_srcNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.fileNonExistent(), FileUtilsUtils.dir(), true));
        assertEquals("Source 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_bool_srcNotDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.file(), FileUtilsUtils.dir(), true));
        assertEquals("Source 'testResources/file.txt' exists but is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_bool_sameSrcAndDest() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), FileUtilsUtils.dir(), true));
        assertEquals("Source 'testResources/dir' and destination 'testResources/dir' are the same", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_bool_srcNotReadable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dirNotReadable(), FileUtilsUtils.dir(), true));
        assertEquals("Failed to list contents of testResources/dirNotReadable", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_bool_destDirMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), FileUtilsUtils.fileMkdirFails(), true));
        assertEquals("Destination 'testResources/dirMkdirFails' directory cannot be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_bool_destDirNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), FileUtilsUtils.dirNotWritable(), true));
        assertEquals("Destination 'testResources/dirNotWritable' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_filter_srcNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyDirectory((File) null, FileUtilsUtils.dir(), FileUtilsUtils.TXT_FILTER));
        assertEquals("Source must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_filter_destNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), (File) null, FileUtilsUtils.TXT_FILTER));
        assertEquals("Destination must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_filter_destNotDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), FileUtilsUtils.file(), FileUtilsUtils.TXT_FILTER));
        assertEquals("Destination 'testResources/file.txt' exists but is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_filter_srcNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.fileNonExistent(), FileUtilsUtils.dir(), FileUtilsUtils.TXT_FILTER));
        assertEquals("Source 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_filter_srcNotDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.file(), FileUtilsUtils.dir(), FileUtilsUtils.TXT_FILTER));
        assertEquals("Source 'testResources/file.txt' exists but is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_filter_sameSrcAndDest() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), FileUtilsUtils.dir(), FileUtilsUtils.TXT_FILTER));
        assertEquals("Source 'testResources/dir' and destination 'testResources/dir' are the same", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_filter_srcNotReadable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dirNotReadable(), FileUtilsUtils.dir(), FileUtilsUtils.TXT_FILTER));
        assertEquals("Failed to list contents of testResources/dirNotReadable", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_filter_destDirMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), FileUtilsUtils.fileMkdirFails(), FileUtilsUtils.TXT_FILTER));
        assertEquals("Destination 'testResources/dirMkdirFails' directory cannot be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_filter_destDirNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), FileUtilsUtils.dirNotWritable(), FileUtilsUtils.TXT_FILTER));
        assertEquals("Destination 'testResources/dirNotWritable' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_srcNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyDirectory((File) null, FileUtilsUtils.dir()));
        assertEquals("Source must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_destNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), (File) null));
        assertEquals("Destination must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_destNotDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), FileUtilsUtils.file()));
        assertEquals("Destination 'testResources/file.txt' exists but is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_srcNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.fileNonExistent(), FileUtilsUtils.dir()));
        assertEquals("Source 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_srcNotDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.file(), FileUtilsUtils.dir()));
        assertEquals("Source 'testResources/file.txt' exists but is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_sameSrcAndDest() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), FileUtilsUtils.dir()));
        assertEquals("Source 'testResources/dir' and destination 'testResources/dir' are the same", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_srcNotReadable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dirNotReadable(), FileUtilsUtils.dir()));
        assertEquals("Failed to list contents of testResources/dirNotReadable", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_destDirMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), FileUtilsUtils.fileMkdirFails()));
        assertEquals("Destination 'testResources/dirMkdirFails' directory cannot be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_destDirNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), FileUtilsUtils.dirNotWritable()));
        assertEquals("Destination 'testResources/dirNotWritable' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_boolAndfilter_srcNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyDirectory((File) null, FileUtilsUtils.dir(), FileUtilsUtils.TXT_FILTER, true));
        assertEquals("Source must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_boolAndfilter_destNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), (File) null, FileUtilsUtils.TXT_FILTER, true));
        assertEquals("Destination must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_boolAndfilter_destNotDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), FileUtilsUtils.file(), FileUtilsUtils.TXT_FILTER, true));
        assertEquals("Destination 'testResources/file.txt' exists but is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_boolAndfilter_srcNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.fileNonExistent(), FileUtilsUtils.dir(), FileUtilsUtils.TXT_FILTER, true));
        assertEquals("Source 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_boolAndfilter_srcNotDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.file(), FileUtilsUtils.dir(), FileUtilsUtils.TXT_FILTER, true));
        assertEquals("Source 'testResources/file.txt' exists but is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_boolAndfilter_sameSrcAndDest() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), FileUtilsUtils.dir(), FileUtilsUtils.TXT_FILTER, true));
        assertEquals("Source 'testResources/dir' and destination 'testResources/dir' are the same", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_boolAndfilter_srcNotReadable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dirNotReadable(), FileUtilsUtils.dir(), FileUtilsUtils.TXT_FILTER, true));
        assertEquals("Failed to list contents of testResources/dirNotReadable", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_boolAndfilter_destDirMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), FileUtilsUtils.fileMkdirFails(), FileUtilsUtils.TXT_FILTER, true));
        assertEquals("Destination 'testResources/dirMkdirFails' directory cannot be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyDirectory_boolAndfilter_destDirNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyDirectory(FileUtilsUtils.dir(), FileUtilsUtils.dirNotWritable(), FileUtilsUtils.TXT_FILTER, true));
        assertEquals("Destination 'testResources/dirNotWritable' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyURLToFile_destIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyURLToFile(FileUtilsUtils.URL(), FileUtilsUtils.dir()));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyURLToFile_destNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyURLToFile(FileUtilsUtils.URL(), FileUtilsUtils.fileNotWritable()));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyURLToFile_destParentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyURLToFile(FileUtilsUtils.URL(), FileUtilsUtils.fileParentMkdirFails()));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copyURLToFile_srcNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyURLToFile((URL) null, FileUtilsUtils.file()));
    }

    @Test
    public void testAssertThrows_copyURLToFile_destNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyURLToFile(FileUtilsUtils.URL(), (File) null));
    }

    @Test
    public void testAssertThrowsMessage_copyURLToFile_timeout_destIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyURLToFile(FileUtilsUtils.URL(), FileUtilsUtils.dir(), 500, 500));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyURLToFile_timeout_destNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyURLToFile(FileUtilsUtils.URL(), FileUtilsUtils.fileNotWritable(), 500, 500));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyURLToFile_timeout_destParentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyURLToFile(FileUtilsUtils.URL(), FileUtilsUtils.fileParentMkdirFails(), 500, 500));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copyURLToFile_timeout_srcNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyURLToFile((URL) null, FileUtilsUtils.file(), 500, 500));
    }

    @Test
    public void testAssertThrows_copyURLToFile_timeout_destNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyURLToFile(FileUtilsUtils.URL(), (File) null, 500, 500));
    }

    @Test
    public void testAssertThrows_copyInputStreamToFile_srcNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyInputStreamToFile((InputStream) null, FileUtilsUtils.file()));
    }

    @Test
    public void testAssertThrows_copyInputStreamToFile_destNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyInputStreamToFile(FileUtilsUtils.inputStream(), (File) null));
    }

    @Test
    public void testAssertThrowsMessage_copyInputStreamToFile_destIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyInputStreamToFile(FileUtilsUtils.inputStream(), FileUtilsUtils.dir()));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyInputStreamToFile_destNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyInputStreamToFile(FileUtilsUtils.inputStream(), FileUtilsUtils.fileNotWritable()));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyInputStreamToFile_destParentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyInputStreamToFile(FileUtilsUtils.inputStream(), FileUtilsUtils.fileParentMkdirFails()));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copyInputStreamToFile_copyIOException() {
        assertThrows(java.io.IOException.class, () -> FileUtils.copyInputStreamToFile(FileUtilsUtils.inputStreamIOException(), FileUtilsUtils.file()));
    }

    @Test
    public void testAssertThrowsMessage_copyToFile_destIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyToFile(FileUtilsUtils.inputStream(), FileUtilsUtils.dir()));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyToFile_destNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyToFile(FileUtilsUtils.inputStream(), FileUtilsUtils.fileNotWritable()));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyToFile_destParentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyToFile(FileUtilsUtils.inputStream(), FileUtilsUtils.fileParentMkdirFails()));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copyToFile_srcNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyToFile((InputStream) null, FileUtilsUtils.file()));
    }

    @Test
    public void testAssertThrows_copyToFile_destNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyToFile(FileUtilsUtils.inputStream(), (File) null));
    }

    @Test
    public void testAssertThrowsMessage_copyToFile_copyIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyToFile(FileUtilsUtils.inputStreamIOException(), FileUtilsUtils.file()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyToDirectory_iterable_srcsNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyToDirectory((Iterable<File>) null, FileUtilsUtils.dir()));
        assertEquals("Sources must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyToDirectory_iterable_destNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyToDirectory(Collections.singleton(FileUtilsUtils.file()), (File) null));
        assertEquals("Destination must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyToDirectory_iterable_destNotDir() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.copyToDirectory(Collections.singleton(FileUtilsUtils.file()), FileUtilsUtils.file()));
        assertEquals("Destination 'testResources/file.txt' is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyToDirectory_iterable_srcsContainsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyToDirectory(Collections.singleton(FileUtilsUtils.dir()), FileUtilsUtils.dir()));
        assertEquals("Source 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyToDirectory_iterable_srcsContainsFileNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyToDirectory(Collections.singleton(FileUtilsUtils.fileNonExistent()), FileUtilsUtils.dir()));
        assertEquals("Source 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyToDirectory_iterable_srcsContainsFileExistsInDest() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyToDirectory(Collections.singleton(FileUtilsUtils.fileNotWritable()), FileUtilsUtils.ROOT));
        assertEquals("Source 'testResources/file-not-writable.txt' and destination 'testResources/file-not-writable.txt' are the same", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copyToDirectory_iterable_copyIOException() {
        assertThrows(java.io.IOException.class, () -> FileUtils.copyToDirectory(Collections.singleton(FileUtilsUtils.fileNotReadable()), FileUtilsUtils.dir()));
    }

    @Test
    public void testAssertThrowsMessage_copyToDirectory_srcNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyToDirectory((File) null, FileUtilsUtils.dir()));
        assertEquals("Source must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyToDirectory_destNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.copyToDirectory(FileUtilsUtils.file(), (File) null));
        assertEquals("Destination must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyToDirectory_srcNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyToDirectory(FileUtilsUtils.fileNonExistent(), FileUtilsUtils.dir()));
        assertEquals("The source testResources/file-non-existent.txt does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyToDirectory_srcIsFileAndExistsInDest() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyToDirectory(FileUtilsUtils.fileNotWritable(), FileUtilsUtils.ROOT));
        assertEquals("Source 'testResources/file-not-writable.txt' and destination 'testResources/file-not-writable.txt' are the same", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyToDirectory_destNotDir() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.copyToDirectory(FileUtilsUtils.file(), FileUtilsUtils.file()));
        assertEquals("Destination 'testResources/file.txt' is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyToDirectory_srcIsDirAndNotReadable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyToDirectory(FileUtilsUtils.dirNotReadable(), FileUtilsUtils.dir()));
        assertEquals("Failed to list contents of testResources/dirNotReadable", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyToDirectory_destNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.copyToDirectory(FileUtilsUtils.file(), FileUtilsUtils.dirNotWritable()));
        assertEquals("testResources/dirNotWritable/file.txt (Permission denied)", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_deleteDirectory_dirNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.deleteDirectory((File) null));
    }

    @Test
    public void testAssertThrowsMessage_deleteDirectory_dirNotADir() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.deleteDirectory(FileUtilsUtils.file()));
        assertEquals("testResources/file.txt is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_deleteDirectory_copyIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.deleteDirectory(FileUtilsUtils.dirNotReadable()));
        assertEquals("Failed to list contents of testResources/dirNotReadable", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_directoryContains_dirNull() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.directoryContains((File) null, FileUtilsUtils.file()));
        assertEquals("Directory must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_directoryContains_dirNotADir() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.directoryContains(FileUtilsUtils.file(), FileUtilsUtils.file()));
        assertEquals("Not a directory: testResources/file.txt", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_directoryContains_checkingFilesIOError() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.directoryContains(FileUtilsUtils.dirIOException(), FileUtilsUtils.file()));
        assertEquals("getCanonicalPath", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_cleanDirectory_dirNotADir() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.cleanDirectory(FileUtilsUtils.file()));
        assertEquals("testResources/file.txt is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_cleanDirectory_dirNonExistent() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.cleanDirectory(FileUtilsUtils.dirNonExistent()));
        assertEquals("testResources/dirNonExistent does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_cleanDirectory_dirNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.cleanDirectory((File) null));
    }

    @Test
    public void testAssertThrowsMessage_cleanDirectory_dirNotReadable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.cleanDirectory(FileUtilsUtils.dirNotReadable()));
        assertEquals("Failed to list contents of testResources/dirNotReadable", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_cleanDirectory_dirNonDeletableFile() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.cleanDirectory(FileUtilsUtils.dirNonDeletableFile()));
        assertEquals("Unable to delete file: testResources/dirNonDeletableFile/file-non-deletable.txt", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_waitFor_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.waitFor((File) null, 1));
    }

    @Test
    public void testAssertThrowsMessage_readFileToString_charset_fileNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.readFileToString(FileUtilsUtils.fileNonExistent(), StandardCharsets.UTF_8));
        assertEquals("File 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readFileToString_charset_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.readFileToString(FileUtilsUtils.dir(), StandardCharsets.UTF_8));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readFileToString_charset_fileNotReadable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.readFileToString(FileUtilsUtils.fileNotReadable(), StandardCharsets.UTF_8));
        assertEquals("File 'testResources/file-not-readable.txt' cannot be read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readFileToString_charset_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.readFileToString((File) null, StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrowsMessage_readFileToString_string_fileNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.readFileToString(FileUtilsUtils.fileNonExistent(), FileUtilsUtils.CHARSET_VALID));
        assertEquals("File 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readFileToString_string_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.readFileToString(FileUtilsUtils.dir(), FileUtilsUtils.CHARSET_VALID));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readFileToString_string_fileNotReadable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.readFileToString(FileUtilsUtils.fileNotReadable(), FileUtilsUtils.CHARSET_VALID));
        assertEquals("File 'testResources/file-not-readable.txt' cannot be read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readFileToString_string_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.readFileToString((File) null, FileUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_readFileToString_string_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> FileUtils.readFileToString(FileUtilsUtils.file(), FileUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(FileUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readFileToString_string_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> FileUtils.readFileToString(FileUtilsUtils.file(), FileUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(FileUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readFileToByteArray_fileNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.readFileToByteArray(FileUtilsUtils.fileNonExistent()));
        assertEquals("File 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readFileToByteArray_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.readFileToByteArray(FileUtilsUtils.dir()));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readFileToByteArray_fileNotReadable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.readFileToByteArray(FileUtilsUtils.fileNotReadable()));
        assertEquals("File 'testResources/file-not-readable.txt' cannot be read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readFileToByteArray_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.readFileToByteArray((File) null));
    }

    @Test
    public void testAssertThrowsMessage_readLines_string_fileNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.readLines(FileUtilsUtils.fileNonExistent(), FileUtilsUtils.CHARSET_VALID));
        assertEquals("File 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readLines_string_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.readLines(FileUtilsUtils.dir(), FileUtilsUtils.CHARSET_VALID));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readLines_string_fileNotReadable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.readLines(FileUtilsUtils.fileNotReadable(), FileUtilsUtils.CHARSET_VALID));
        assertEquals("File 'testResources/file-not-readable.txt' cannot be read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readLines_string_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.readLines((File) null, FileUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_readLines_string_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> FileUtils.readLines(FileUtilsUtils.file(), FileUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(FileUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readLines_string_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> FileUtils.readLines(FileUtilsUtils.file(), FileUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(FileUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readLines_charset_fileNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.readLines(FileUtilsUtils.fileNonExistent(), StandardCharsets.UTF_8));
        assertEquals("File 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readLines_charset_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.readLines(FileUtilsUtils.dir(), StandardCharsets.UTF_8));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readLines_charset_fileNotReadable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.readLines(FileUtilsUtils.fileNotReadable(), StandardCharsets.UTF_8));
        assertEquals("File 'testResources/file-not-readable.txt' cannot be read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readLines_charset_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.readLines((File) null, StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrows_lineIterator_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.lineIterator((File) null));
    }

    @Test
    public void testAssertThrowsMessage_lineIterator_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.lineIterator(FileUtilsUtils.dir()));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_lineIterator_fileNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.lineIterator(FileUtilsUtils.fileNonExistent()));
        assertEquals("File 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_lineIterator_fileNotReadable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.lineIterator(FileUtilsUtils.fileNotReadable()));
        assertEquals("File 'testResources/file-not-readable.txt' cannot be read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_lineIterator_encoding_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.lineIterator((File) null, FileUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_lineIterator_encoding_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.lineIterator(FileUtilsUtils.dir(), FileUtilsUtils.CHARSET_VALID));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_lineIterator_encoding_fileNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.lineIterator(FileUtilsUtils.fileNonExistent(), FileUtilsUtils.CHARSET_VALID));
        assertEquals("File 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_lineIterator_encoding_fileNotReadable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.lineIterator(FileUtilsUtils.fileNotReadable(), FileUtilsUtils.CHARSET_VALID));
        assertEquals("File 'testResources/file-not-readable.txt' cannot be read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeStringToFile_charsetAndAppend_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeStringToFile(FileUtilsUtils.dir(), "test", StandardCharsets.UTF_8, true));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeStringToFile_charsetAndAppend_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeStringToFile(FileUtilsUtils.fileNotWritable(), "test", StandardCharsets.UTF_8, true));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeStringToFile_charsetAndAppend_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeStringToFile(FileUtilsUtils.fileParentMkdirFails(), "test", StandardCharsets.UTF_8, true));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeStringToFile_charsetAndAppend_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeStringToFile((File) null, "test", StandardCharsets.UTF_8, true));
    }

    @Test
    public void testAssertThrowsMessage_writeStringToFile_stringAndAppend_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeStringToFile(FileUtilsUtils.dir(), "test", FileUtilsUtils.CHARSET_VALID, true));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeStringToFile_stringAndAppend_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeStringToFile(FileUtilsUtils.fileNotWritable(), "test", FileUtilsUtils.CHARSET_VALID, true));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeStringToFile_stringAndAppend_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeStringToFile(FileUtilsUtils.fileParentMkdirFails(), "test", FileUtilsUtils.CHARSET_VALID, true));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeStringToFile_stringAndAppend_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeStringToFile((File) null, "test", FileUtilsUtils.CHARSET_VALID, true));
    }

    @Test
    public void testAssertThrowsMessage_writeStringToFile_stringAndAppend_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> FileUtils.writeStringToFile(FileUtilsUtils.file(), "test", FileUtilsUtils.CHARSET_UNSUPPORTED, true));
        assertEquals(FileUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeStringToFile_stringAndAppend_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> FileUtils.writeStringToFile(FileUtilsUtils.file(), "test", FileUtilsUtils.CHARSET_ILLEGAL, true));
        assertEquals(FileUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeStringToFile_string_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeStringToFile(FileUtilsUtils.dir(), "test", FileUtilsUtils.CHARSET_VALID));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeStringToFile_string_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeStringToFile(FileUtilsUtils.fileNotWritable(), "test", FileUtilsUtils.CHARSET_VALID));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeStringToFile_string_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeStringToFile(FileUtilsUtils.fileParentMkdirFails(), "test", FileUtilsUtils.CHARSET_VALID));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeStringToFile_string_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeStringToFile((File) null, "test", FileUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_writeStringToFile_string_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> FileUtils.writeStringToFile(FileUtilsUtils.file(), "test", FileUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(FileUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeStringToFile_string_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> FileUtils.writeStringToFile(FileUtilsUtils.file(), "test", FileUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(FileUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeStringToFile_charset_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeStringToFile(FileUtilsUtils.dir(), "test", StandardCharsets.UTF_8));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeStringToFile_charset_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeStringToFile(FileUtilsUtils.fileNotWritable(), "test", StandardCharsets.UTF_8));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeStringToFile_charset_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeStringToFile(FileUtilsUtils.fileParentMkdirFails(), "test", StandardCharsets.UTF_8));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeStringToFile_charset_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeStringToFile((File) null, "test", StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrowsMessage_writeByteArrayToFile_offsetAndAppend_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.dir(), new byte[10], 0, 5, true));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeByteArrayToFile_offsetAndAppend_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.fileNotWritable(), new byte[10], 0, 5, true));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeByteArrayToFile_offsetAndAppend_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.fileParentMkdirFails(), new byte[10], 0, 5, true));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeByteArrayToFile_offsetAndAppend_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeByteArrayToFile((File) null, new byte[10], 0, 5, true));
    }

    @Test
    public void testAssertThrows_writeByteArrayToFile_offsetAndAppend_dataNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.file(), (byte[]) null, 0, 5, true));
    }

    @Test
    public void testAssertThrows_writeByteArrayToFile_offsetAndAppend_offNegative() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.file(), (byte[]) null, -1, 5, true));
    }

    @Test
    public void testAssertThrows_writeByteArrayToFile_offsetAndAppend_lenNegative() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.file(), (byte[]) null, 0, -1, true));
    }

    @Test
    public void testAssertThrows_writeByteArrayToFile_offsetAndAppend_offAndLenInvalid() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.file(), (byte[]) null, 9, 2, true));
    }

    @Test
    public void testAssertThrowsMessage_writeByteArrayToFile_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.dir(), new byte[10]));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeByteArrayToFile_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.fileNotWritable(), new byte[10]));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeByteArrayToFile_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.fileParentMkdirFails(), new byte[10]));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeByteArrayToFile_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeByteArrayToFile((File) null, new byte[10]));
    }

    @Test
    public void testAssertThrows_writeByteArrayToFile_dataNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.file(), (byte[]) null));
    }

    @Test
    public void testAssertThrowsMessage_writeByteArrayToFile_append_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.dir(), new byte[10], true));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeByteArrayToFile_append_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.fileNotWritable(), new byte[10], true));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeByteArrayToFile_append_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.fileParentMkdirFails(), new byte[10], true));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeByteArrayToFile_append_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeByteArrayToFile((File) null, new byte[10], true));
    }

    @Test
    public void testAssertThrows_writeByteArrayToFile_append_dataNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.file(), (byte[]) null, true));
    }

    @Test
    public void testAssertThrowsMessage_writeByteArrayToFile_offset_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.dir(), new byte[10], 0, 5));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeByteArrayToFile_offset_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.fileNotWritable(), new byte[10], 0, 5));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeByteArrayToFile_offset_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.fileParentMkdirFails(), new byte[10], 0, 5));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeByteArrayToFile_offset_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeByteArrayToFile((File) null, new byte[10], 0, 5));
    }

    @Test
    public void testAssertThrows_writeByteArrayToFile_offset_dataNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.file(), (byte[]) null, 0, 5));
    }

    @Test
    public void testAssertThrows_writeByteArrayToFile_offset_offNegative() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.file(), (byte[]) null, -1, 5));
    }

    @Test
    public void testAssertThrows_writeByteArrayToFile_offset_lenNegative() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.file(), (byte[]) null, 0, -1));
    }

    @Test
    public void testAssertThrows_writeByteArrayToFile_offset_offAndLenInvalid() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeByteArrayToFile(FileUtilsUtils.file(), (byte[]) null, 9, 2));
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encodingLineEndingAndAppend_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.dir(), FileUtilsUtils.CHARSET_VALID, FileUtilsUtils.LINES, "*", true));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encodingLineEndingAndAppend_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.fileNotWritable(), FileUtilsUtils.CHARSET_VALID, FileUtilsUtils.LINES, "*", true));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encodingLineEndingAndAppend_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.fileParentMkdirFails(), FileUtilsUtils.CHARSET_VALID, FileUtilsUtils.LINES, "*", true));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeLines_encodingLineEndingAndAppend_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeLines((File) null, FileUtilsUtils.CHARSET_VALID, FileUtilsUtils.LINES, "*", true));
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encodingLineEndingAndAppend_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> FileUtils.writeLines(FileUtilsUtils.file(), FileUtilsUtils.CHARSET_UNSUPPORTED, FileUtilsUtils.LINES, "*", true));
        assertEquals(FileUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encodingLineEndingAndAppend_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> FileUtils.writeLines(FileUtilsUtils.file(), FileUtilsUtils.CHARSET_ILLEGAL, FileUtilsUtils.LINES, "*", true));
        assertEquals(FileUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_lineEnding_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.dir(), FileUtilsUtils.LINES, "*"));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_lineEnding_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.fileNotWritable(), FileUtilsUtils.LINES, "*"));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_lineEnding_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.fileParentMkdirFails(), FileUtilsUtils.LINES, "*"));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeLines_lineEnding_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeLines((File) null, FileUtilsUtils.LINES, "*"));
    }

    @Test
    public void testAssertThrowsMessage_writeLines_lineEndingAndAppend_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.dir(), FileUtilsUtils.LINES, "*", true));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_lineEndingAndAppend_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.fileNotWritable(), FileUtilsUtils.LINES, "*", true));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_lineEndingAndAppend_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.fileParentMkdirFails(), FileUtilsUtils.LINES, "*", true));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeLines_lineEndingAndAppend_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeLines((File) null, FileUtilsUtils.LINES, "*", true));
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encoding_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.dir(), FileUtilsUtils.CHARSET_VALID, FileUtilsUtils.LINES));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encoding_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.fileNotWritable(), FileUtilsUtils.CHARSET_VALID, FileUtilsUtils.LINES));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encoding_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.fileParentMkdirFails(), FileUtilsUtils.CHARSET_VALID, FileUtilsUtils.LINES));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeLines_encoding_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeLines((File) null, FileUtilsUtils.CHARSET_VALID, FileUtilsUtils.LINES));
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encoding_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> FileUtils.writeLines(FileUtilsUtils.file(), FileUtilsUtils.CHARSET_UNSUPPORTED, FileUtilsUtils.LINES));
        assertEquals(FileUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encoding_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> FileUtils.writeLines(FileUtilsUtils.file(), FileUtilsUtils.CHARSET_ILLEGAL, FileUtilsUtils.LINES));
        assertEquals(FileUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encodingAndAppend_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.dir(), FileUtilsUtils.CHARSET_VALID, FileUtilsUtils.LINES, true));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encodingAndAppend_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.fileNotWritable(), FileUtilsUtils.CHARSET_VALID, FileUtilsUtils.LINES, true));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encodingAndAppend_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.fileParentMkdirFails(), FileUtilsUtils.CHARSET_VALID, FileUtilsUtils.LINES, true));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeLines_encodingAndAppend_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeLines((File) null, FileUtilsUtils.CHARSET_VALID, FileUtilsUtils.LINES, true));
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encodingAndAppend_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> FileUtils.writeLines(FileUtilsUtils.file(), FileUtilsUtils.CHARSET_UNSUPPORTED, FileUtilsUtils.LINES, true));
        assertEquals(FileUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encodingAndAppend_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> FileUtils.writeLines(FileUtilsUtils.file(), FileUtilsUtils.CHARSET_ILLEGAL, FileUtilsUtils.LINES, true));
        assertEquals(FileUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.dir(), FileUtilsUtils.LINES));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.fileNotWritable(), FileUtilsUtils.LINES));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.fileParentMkdirFails(), FileUtilsUtils.LINES));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeLines_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeLines((File) null, FileUtilsUtils.LINES));
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encodingAndLineEnding_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.dir(), FileUtilsUtils.CHARSET_VALID, FileUtilsUtils.LINES, "*"));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encodingAndLineEnding_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.fileNotWritable(), FileUtilsUtils.CHARSET_VALID, FileUtilsUtils.LINES, "*"));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encodingAndLineEnding_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.fileParentMkdirFails(), FileUtilsUtils.CHARSET_VALID, FileUtilsUtils.LINES, "*"));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeLines_encodingAndLineEnding_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeLines((File) null, FileUtilsUtils.CHARSET_VALID, FileUtilsUtils.LINES, "*"));
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encodingAndLineEnding_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> FileUtils.writeLines(FileUtilsUtils.file(), FileUtilsUtils.CHARSET_UNSUPPORTED, FileUtilsUtils.LINES, "*"));
        assertEquals(FileUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_encodingAndLineEnding_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> FileUtils.writeLines(FileUtilsUtils.file(), FileUtilsUtils.CHARSET_ILLEGAL, FileUtilsUtils.LINES, "*"));
        assertEquals(FileUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_append_fileIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.dir(), FileUtilsUtils.LINES, true));
        assertEquals("File 'testResources/dir' exists but is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_append_fileNotWritable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.fileNotWritable(), FileUtilsUtils.LINES, true));
        assertEquals("File 'testResources/file-not-writable.txt' cannot be written to", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_append_parentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.writeLines(FileUtilsUtils.fileParentMkdirFails(), FileUtilsUtils.LINES, true));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeLines_append_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.writeLines((File) null, FileUtilsUtils.LINES, true));
    }

    @Test
    public void testAssertThrows_forceDelete_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.forceDelete((File) null));
    }

    @Test
    public void testAssertThrowsMessage_forceDelete_fileNonExistent() {
        final java.io.FileNotFoundException thrown = assertThrows(java.io.FileNotFoundException.class, () -> FileUtils.forceDelete(FileUtilsUtils.fileNonExistent()));
        assertEquals("File does not exist: testResources/file-non-existent.txt", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_forceDeleteOnExit_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.forceDeleteOnExit((File) null));
    }

    @Test
    public void testAssertThrows_forceMkdir_dirNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.forceMkdir((File) null));
    }

    @Test
    public void testAssertThrowsMessage_forceMkdir_dirExistsAndNotADir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.forceMkdir(FileUtilsUtils.file()));
        assertEquals("File testResources/file.txt exists and is not a directory. Unable to create directory.", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_forceMkdir_dirMkdirFail() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.forceMkdir(FileUtilsUtils.fileMkdirFails()));
        assertEquals("Unable to create directory testResources/dirMkdirFails", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_forceMkdirParent_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.forceMkdirParent((File) null));
    }

    @Test
    public void testAssertThrowsMessage_forceMkdirParent_fileParentMkdirFails() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.forceMkdirParent(FileUtilsUtils.fileParentMkdirFails()));
        assertEquals("Directory 'testResources/dirMkdirFails' could not be created", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_sizeOf_fileNonExistent() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.sizeOf(FileUtilsUtils.fileNonExistent()));
        assertEquals("testResources/file-non-existent.txt does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_sizeOf_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.sizeOf((File) null));
    }

    @Test
    public void testAssertThrowsMessage_sizeOfAsBigInteger_fileNonExistent() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.sizeOfAsBigInteger(FileUtilsUtils.fileNonExistent()));
        assertEquals("testResources/file-non-existent.txt does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_sizeOfAsBigInteger_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.sizeOfAsBigInteger((File) null));
    }

    @Test
    public void testAssertThrowsMessage_sizeOfDirectory_dirNonExistent() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.sizeOfDirectory(FileUtilsUtils.dirNonExistent()));
        assertEquals("testResources/dirNonExistent does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_sizeOfDirectory_dirNotADir() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.sizeOfDirectory(FileUtilsUtils.file()));
        assertEquals("testResources/file.txt is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_sizeOfDirectory_dirNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.sizeOfDirectory((File) null));
    }

    @Test
    public void testAssertThrowsMessage_sizeOfDirectoryAsBigInteger_dirNonExistent() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.sizeOfDirectoryAsBigInteger(FileUtilsUtils.dirNonExistent()));
        assertEquals("testResources/dirNonExistent does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_sizeOfDirectoryAsBigInteger_dirNotADir() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.sizeOfDirectoryAsBigInteger(FileUtilsUtils.file()));
        assertEquals("testResources/file.txt is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_sizeOfDirectoryAsBigInteger_dirNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.sizeOfDirectoryAsBigInteger((File) null));
    }

    @Test
    public void testAssertThrowsMessage_isFileNewer_file_referenceNull() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.isFileNewer(FileUtilsUtils.file(), (File) null));
        assertEquals("No specified reference file", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_isFileNewer_file_referenceNonExistent() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.isFileNewer(FileUtilsUtils.file(), FileUtilsUtils.fileNonExistent()));
        assertEquals("The reference file 'testResources/file-non-existent.txt' doesn't exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_isFileNewer_file_fileNull() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.isFileNewer((File) null, FileUtilsUtils.file()));
        assertEquals("No specified file", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_isFileNewer_long_fileNull() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.isFileNewer((File) null, System.currentTimeMillis()));
        assertEquals("No specified file", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_isFileNewer_date_dateNull() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.isFileNewer(FileUtilsUtils.file(), (Date) null));
        assertEquals("No specified date", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_isFileNewer_date_fileNull() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.isFileNewer((File) null, new Date()));
        assertEquals("No specified file", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_isFileOlder_file_referenceNull() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.isFileOlder(FileUtilsUtils.file(), (File) null));
        assertEquals("No specified reference file", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_isFileOlder_file_referenceNonExistent() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.isFileOlder(FileUtilsUtils.file(), FileUtilsUtils.fileNonExistent()));
        assertEquals("The reference file 'testResources/file-non-existent.txt' doesn't exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_isFileOlder_file_fileNull() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.isFileOlder((File) null, FileUtilsUtils.file()));
        assertEquals("No specified file", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_isFileOlder_date_dateNull() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.isFileOlder(FileUtilsUtils.file(), (Date) null));
        assertEquals("No specified date", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_isFileOlder_date_fileNull() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.isFileOlder((File) null, new Date()));
        assertEquals("No specified file", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_isFileOlder_long_fileNull() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.isFileOlder((File) null, System.currentTimeMillis()));
        assertEquals("No specified file", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_checksumCRC32_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileUtils.checksumCRC32((File) null));
    }

    @Test
    public void testAssertThrowsMessage_checksumCRC32_fileDir() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FileUtils.checksumCRC32(FileUtilsUtils.dir()));
        assertEquals("Checksums can't be computed on directories", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_checksumCRC32_fileNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.checksumCRC32(FileUtilsUtils.fileNonExistent()));
        assertEquals("testResources/file-non-existent.txt (No such file or directory)", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_checksumCRC32_fileNotReadable() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.checksumCRC32(FileUtilsUtils.fileNotReadable()));
        assertEquals("testResources/file-not-readable.txt (Permission denied)", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveDirectory_srcNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.moveDirectory((File) null, FileUtilsUtils.dir()));
        assertEquals("Source must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveDirectory_destNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.moveDirectory(FileUtilsUtils.dir(), (File) null));
        assertEquals("Destination must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveDirectory_destExists() {
        final org.apache.commons.io.FileExistsException thrown = assertThrows(org.apache.commons.io.FileExistsException.class, () -> FileUtils.moveDirectory(FileUtilsUtils.dir(), FileUtilsUtils.dir()));
        assertEquals("Destination 'testResources/dir' already exists", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveDirectory_srcNotADir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.moveDirectory(FileUtilsUtils.file(), FileUtilsUtils.dir()));
        assertEquals("Source 'testResources/file.txt' is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveDirectory_srcNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.moveDirectory(FileUtilsUtils.dirNonExistent(), FileUtilsUtils.dir()));
        assertEquals("Source 'testResources/dirNonExistent' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveDirectory_destIsSubDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.moveDirectory(FileUtilsUtils.dir(), FileUtilsUtils.subDirNonExistent()));
        assertEquals("Cannot move directory: testResources/dir to a subdirectory of itself: testResources/dir/subDirNonExistent", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveDirectoryToDirectory_srcNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.moveDirectoryToDirectory((File) null, FileUtilsUtils.dir(), false));
        assertEquals("Source must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveDirectoryToDirectory_destNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.moveDirectoryToDirectory(FileUtilsUtils.dir(), (File) null, false));
        assertEquals("Destination directory must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveDirectoryToDirectory_srcNotADir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.moveDirectoryToDirectory(FileUtilsUtils.file(), FileUtilsUtils.dir(), false));
        assertEquals("Source 'testResources/file.txt' is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveDirectoryToDirectory_srcNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.moveDirectoryToDirectory(FileUtilsUtils.dirNonExistent(), FileUtilsUtils.dir(), false));
        assertEquals("Source 'testResources/dirNonExistent' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveDirectoryToDirectory_destNotADir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.moveDirectoryToDirectory(FileUtilsUtils.dir(), FileUtilsUtils.file(), false));
        assertEquals("Destination 'testResources/file.txt' is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveDirectoryToDirectory_destNonExistentAndCreateDestFalse() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.moveDirectoryToDirectory(FileUtilsUtils.dir(), FileUtilsUtils.dirNonExistent(), false));
        assertEquals("Destination directory 'testResources/dirNonExistent' does not exist [createDestDir=false]", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveDirectoryToDirectory_destIsSubDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.moveDirectoryToDirectory(FileUtilsUtils.dir(), FileUtilsUtils.subDirNonExistent(), true));
        assertEquals("Cannot move directory: testResources/dir to a subdirectory of itself: testResources/dir/subDirNonExistent/dir", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveDirectoryToDirectory_srcExistsInDest() {
        final org.apache.commons.io.FileExistsException thrown = assertThrows(org.apache.commons.io.FileExistsException.class, () -> FileUtils.moveDirectoryToDirectory(FileUtilsUtils.dir(), FileUtilsUtils.ROOT, false));
        assertEquals("Destination 'testResources/dir' already exists", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveFile_srcNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.moveFile((File) null, FileUtilsUtils.file()));
        assertEquals("Source must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveFile_destNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.moveFile(FileUtilsUtils.file(), (File) null));
        assertEquals("Destination must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveFile_srcNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.moveFile(FileUtilsUtils.fileNonExistent(), FileUtilsUtils.file()));
        assertEquals("Source 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveFile_srcIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.moveFile(FileUtilsUtils.dir(), FileUtilsUtils.file()));
        assertEquals("Source 'testResources/dir' is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveFile_destExists() {
        final org.apache.commons.io.FileExistsException thrown = assertThrows(org.apache.commons.io.FileExistsException.class, () -> FileUtils.moveFile(FileUtilsUtils.file(), FileUtilsUtils.file()));
        assertEquals("Destination 'testResources/file.txt' already exists", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveFileToDirectory_srcNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.moveFileToDirectory((File) null, FileUtilsUtils.dir(), false));
        assertEquals("Source must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveFileToDirectory_destNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.moveFileToDirectory(FileUtilsUtils.file(), (File) null, false));
        assertEquals("Destination directory must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveFileToDirectory_srcNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.moveFileToDirectory(FileUtilsUtils.fileNonExistent(), FileUtilsUtils.dir(), false));
        assertEquals("Source 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveFileToDirectory_destNonExistentAndCreateDestFalse() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.moveFileToDirectory(FileUtilsUtils.file(), FileUtilsUtils.dirNonExistent(), false));
        assertEquals("Destination directory 'testResources/dirNonExistent' does not exist [createDestDir=false]", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveFileToDirectory_destNotADir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.moveFileToDirectory(FileUtilsUtils.file(), FileUtilsUtils.file(), false));
        assertEquals("Destination 'testResources/file.txt' is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveFileToDirectory_srcIsDir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.moveFileToDirectory(FileUtilsUtils.dir(), FileUtilsUtils.dir(), false));
        assertEquals("Source 'testResources/dir' is a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveFileToDirectory_srcExistsInDest() {
        final org.apache.commons.io.FileExistsException thrown = assertThrows(org.apache.commons.io.FileExistsException.class, () -> FileUtils.moveFileToDirectory(FileUtilsUtils.file(), new File(FileUtilsUtils.BASE), false));
        assertEquals("Destination 'testResources/file.txt' already exists", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveToDirectory_srcNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.moveToDirectory((File) null, FileUtilsUtils.dir(), false));
        assertEquals("Source must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveToDirectory_destNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.moveToDirectory(FileUtilsUtils.file(), (File) null, false));
        assertEquals("Destination must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveToDirectory_srcNonExistent() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.moveToDirectory(FileUtilsUtils.fileNonExistent(), FileUtilsUtils.dir(), false));
        assertEquals("Source 'testResources/file-non-existent.txt' does not exist", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveToDirectory_destNotADir() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.moveToDirectory(FileUtilsUtils.file(), FileUtilsUtils.file(), false));
        assertEquals("Destination 'testResources/file.txt' is not a directory", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveToDirectory_destNonExistentAndCreateDestFalse() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileUtils.moveToDirectory(FileUtilsUtils.file(), FileUtilsUtils.dirNonExistent(), false));
        assertEquals("Destination directory 'testResources/dirNonExistent' does not exist [createDestDir=false]", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_moveToDirectory_srcExistsInDest() {
        final org.apache.commons.io.FileExistsException thrown = assertThrows(org.apache.commons.io.FileExistsException.class, () -> FileUtils.moveToDirectory(FileUtilsUtils.file(), new File(FileUtilsUtils.BASE), false));
        assertEquals("Destination 'testResources/file.txt' already exists", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_isSymlink_fileNull() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FileUtils.isSymlink((File) null));
        assertEquals("File must not be null", thrown.getMessage());
    }
}
