package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class FilenameUtilsTest {

    @Test
    public void testAssertThrowsMessage_getName_filenameNullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.getName(FilenameUtilsUtils.FILENAME_NULL_BYTES));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_equals_filename1Invalid() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FilenameUtils.equals(FilenameUtilsUtils.FILENAME_INVALID, FilenameUtilsUtils.FILENAME, true, null));
        assertEquals("Error normalizing one or both of the file names", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_equals_filename2Invalid() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FilenameUtils.equals(FilenameUtilsUtils.FILENAME, FilenameUtilsUtils.FILENAME_INVALID, true, null));
        assertEquals("Error normalizing one or both of the file names", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_equals_filename1NullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.equals(FilenameUtilsUtils.FILENAME_NULL_BYTES, FilenameUtilsUtils.FILENAME, true, null));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_equals_filename2NullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.equals(FilenameUtilsUtils.FILENAME, FilenameUtilsUtils.FILENAME_NULL_BYTES, true, null));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_concat_fullFilenameToAdd_nullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.concat("base", FilenameUtilsUtils.FILENAME_NULL_BYTES));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_normalize_unixSeparator_filenameNullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.normalize(FilenameUtilsUtils.FILENAME_NULL_BYTES, true));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_normalize_filenameNullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.normalize(FilenameUtilsUtils.FILENAME_NULL_BYTES));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_getPath_filenameNullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.getPath(FilenameUtilsUtils.FILENAME_NULL_BYTES));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_normalizeNoEndSeparator_unixSeparator_filenameNullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.normalizeNoEndSeparator(FilenameUtilsUtils.FILENAME_NULL_BYTES, true));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_normalizeNoEndSeparator_filenameNullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.normalizeNoEndSeparator(FilenameUtilsUtils.FILENAME_NULL_BYTES));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_directoryContains_canonicalParentNull() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.directoryContains((String) null, "a.txt"));
        assertEquals("Directory must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_getPrefix_filenameNullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.getPrefix(FilenameUtilsUtils.FILENAME_NULL_BYTES));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_getPathNoEndSeparator_filenameNullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.getPathNoEndSeparator(FilenameUtilsUtils.FILENAME_NULL_BYTES));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_getBaseName_filenameNullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.getBaseName(FilenameUtilsUtils.FILENAME_NULL_BYTES));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_removeExtension_filenameNullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.removeExtension(FilenameUtilsUtils.FILENAME_NULL_BYTES));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_equalsNormalized_filename1Invalid() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FilenameUtils.equalsNormalized(FilenameUtilsUtils.FILENAME_INVALID, FilenameUtilsUtils.FILENAME));
        assertEquals("Error normalizing one or both of the file names", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_equalsNormalized_filename2Invalid() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FilenameUtils.equalsNormalized(FilenameUtilsUtils.FILENAME, FilenameUtilsUtils.FILENAME_INVALID));
        assertEquals("Error normalizing one or both of the file names", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_equalsNormalized_filename1NullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.equalsNormalized(FilenameUtilsUtils.FILENAME_NULL_BYTES, FilenameUtilsUtils.FILENAME));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_equalsNormalized_filename2NullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.equalsNormalized(FilenameUtilsUtils.FILENAME, FilenameUtilsUtils.FILENAME_NULL_BYTES));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_equalsNormalizedOnSystem_filename1Invalid() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FilenameUtils.equalsNormalizedOnSystem(FilenameUtilsUtils.FILENAME_INVALID, FilenameUtilsUtils.FILENAME));
        assertEquals("Error normalizing one or both of the file names", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_equalsNormalizedOnSystem_filename2Invalid() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> FilenameUtils.equalsNormalizedOnSystem(FilenameUtilsUtils.FILENAME, FilenameUtilsUtils.FILENAME_INVALID));
        assertEquals("Error normalizing one or both of the file names", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_equalsNormalizedOnSystem_filename1NullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.equalsNormalizedOnSystem(FilenameUtilsUtils.FILENAME_NULL_BYTES, FilenameUtilsUtils.FILENAME));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_equalsNormalizedOnSystem_filename2NullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.equalsNormalizedOnSystem(FilenameUtilsUtils.FILENAME, FilenameUtilsUtils.FILENAME_NULL_BYTES));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_isExtension_string_filenameNullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.isExtension(FilenameUtilsUtils.FILENAME_NULL_BYTES, "txt"));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_isExtension_collection_filenameNullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.isExtension(FilenameUtilsUtils.FILENAME_NULL_BYTES, (Collection<String>) null));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_isExtension_array_filenameNullBytes() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> FilenameUtils.isExtension(FilenameUtilsUtils.FILENAME_NULL_BYTES, new String[]{"txt"}));
        assertEquals("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it", thrown.getMessage());
    }
}
