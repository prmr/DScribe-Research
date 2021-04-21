package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FilenameUtilsTest {
	
	@Test
	public void testGetPrefix_with_nullbyte() {
		try {
			assertEquals("~user\\", FilenameUtils.getPrefix("~u\u0000ser\\a\\b\\c.txt"));
		}
		catch (final IllegalArgumentException ignore) {
			
		}
	}
	
	@Test
	public void testIsExtension() {
		boolean boolean0 = FilenameUtils.isExtension("", "=T3a<yFnJ)wrz");
		assertFalse(boolean0);
	}
	
	@Test
	public void testGetFullPathNoEndSeparator() {
		String string0 = FilenameUtils.getFullPathNoEndSeparator("");
		assertEquals("", string0);
		assertNotNull(string0);
	}
	
	@Test
	public void testWildcardMatchOnSystem() {
		boolean boolean0 = FilenameUtils.wildcardMatchOnSystem("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\",
				"hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!");
		assertTrue(boolean0 == false, "'" + boolean0 + "' != '" + false + "'");
	}
	
	@Test
	public void testAssertThrowsMessage_equals_filename2NullBytes() {
		final IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
				() -> FilenameUtils.equals(Scaffolding.FILENAME, Scaffolding.FILENAME_NULL_BYTES, true, null));
		assertEquals(
				"Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it",
				thrown.getMessage());
	}
	
	@Test
	public void testDirectoryContains() throws Throwable {
		boolean boolean0 = FilenameUtils.directoryContains("aKjHm=D}U7G", "aKjHm=D}U7G");
		assertFalse(boolean0);
	}
	
	@Test
	public void testGetBaseName() {
		String string = FilenameUtils.getBaseName("");
		assertNotNull(string);
		assertEquals("", string);
	}
	
	@Test
	public void testIndexOfLastSeparator() {
		int int0 = FilenameUtils.indexOfLastSeparator(
				"hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\");
		assertTrue(int0 == 231, "'" + int0 + "' != '" + 231 + "'");
	}
	
	@Test
	public void testConcat() {
		String string = FilenameUtils.concat("", ":");
		assertNull(string);
	}
	
	@Test
	public void testGetPath() {
		String str = FilenameUtils.getPath("hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!");
		assertEquals(str,
				"hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/",
				"'" + str + "' != '" + "hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/" + "'");
	}
}
