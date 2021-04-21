package org.apache.commons.io;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class FilenameUtilsTest {
	
	@Test
	public void testGetPrefix1() {
		String str = FilenameUtils.getPrefix(
				"hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
		assertEquals(str, "", "'" + str + "' != '" + "" + "'");
	}

	@Test
	public void testIndexOfExtension() throws Throwable {
		int int0 = FilenameUtils.indexOfExtension((String) null);
		assertEquals((-1), int0);
	}

	@Test
	public void testIsExtension() {
		String[] strArray = new String[]{ "hi!", "hi!", "hi!" };
		boolean boolean0 = FilenameUtils.isExtension("", strArray);
		boolean boolean1 = FilenameUtils.isExtension("", strArray);
		boolean boolean2 = FilenameUtils.isExtension("hi!\\hi!\\hi!\\hi!\\", strArray);
		boolean boolean3 = FilenameUtils.isExtension("hi!/hi!/hi!/hi!/hi!/hi!/hi!/", strArray);
		Class<?> wildcardClass = strArray.getClass();
		assertNotNull(strArray);
		assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
		assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
		assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
		assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
		assertNotNull(wildcardClass);
	}

	@Test
	public void testEqualsNormalized() {
		boolean boolean0 = FilenameUtils.equalsNormalized("/:dD3/wF3{N{", "/:dD3/wF3{N{");
		assertTrue(boolean0);
	}

	@Test
	public void testGetFullPathNoEndSeparator() {
		String str = FilenameUtils.getFullPathNoEndSeparator(
				"hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!");
		assertEquals(str,
				"hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!",
				"'" + str + "' != '"
						+ "hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!"
						+ "'");
	}

	@Test
	public void testSeparatorsToSystem() {
		String string = FilenameUtils.separatorsToSystem("/oU]Rg`");
		assertNotNull(string);
		assertEquals("\\oU]Rg`", string);
	}

	@Test
	public void testNormalize() {
		String str = FilenameUtils.normalize(
				"hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\");
		assertEquals(str,
				"hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\",
				"'" + str + "' != '"
						+ "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\"
						+ "'");
	}

	@Test
	public void testDirectoryContains() throws Throwable {
		boolean boolean0 = FilenameUtils.directoryContains("str2", "Sensitive");
		assertFalse(boolean0);
	}

	@Test
	public void testEquals() {
		boolean boolean0 = FilenameUtils.equals("3", "=tfaE/F", true, (IOCase) null);
		assertFalse(boolean0);
	}

	@Test
	public void testGetPrefix2() {
		assertEquals(null, FilenameUtils.getPrefix(null));
		assertEquals(null, FilenameUtils.getPrefix(":"));
		assertEquals(null, FilenameUtils.getPrefix("1:\\a\\b\\c.txt"));
		assertEquals(null, FilenameUtils.getPrefix("1:"));
		assertEquals(null, FilenameUtils.getPrefix("1:a"));
		assertEquals(null, FilenameUtils.getPrefix("\\\\\\a\\b\\c.txt"));
		assertEquals(null, FilenameUtils.getPrefix("\\\\a"));
		
		assertEquals("", FilenameUtils.getPrefix(""));
		assertEquals("\\", FilenameUtils.getPrefix("\\"));
		assertEquals("C:", FilenameUtils.getPrefix("C:"));
		assertEquals("C:\\", FilenameUtils.getPrefix("C:\\"));
		assertEquals("//server/", FilenameUtils.getPrefix("//server/"));
		assertEquals("~/", FilenameUtils.getPrefix("~"));
		assertEquals("~/", FilenameUtils.getPrefix("~/"));
		assertEquals("~user/", FilenameUtils.getPrefix("~user"));
		assertEquals("~user/", FilenameUtils.getPrefix("~user/"));
		
		assertEquals("", FilenameUtils.getPrefix("a\\b\\c.txt"));
		assertEquals("\\", FilenameUtils.getPrefix("\\a\\b\\c.txt"));
		assertEquals("C:\\", FilenameUtils.getPrefix("C:\\a\\b\\c.txt"));
		assertEquals("\\\\server\\", FilenameUtils.getPrefix("\\\\server\\a\\b\\c.txt"));
		
		assertEquals("", FilenameUtils.getPrefix("a/b/c.txt"));
		assertEquals("/", FilenameUtils.getPrefix("/a/b/c.txt"));
		assertEquals("C:/", FilenameUtils.getPrefix("C:/a/b/c.txt"));
		assertEquals("//server/", FilenameUtils.getPrefix("//server/a/b/c.txt"));
		assertEquals("~/", FilenameUtils.getPrefix("~/a/b/c.txt"));
		assertEquals("~user/", FilenameUtils.getPrefix("~user/a/b/c.txt"));
		
		assertEquals("", FilenameUtils.getPrefix("a\\b\\c.txt"));
		assertEquals("\\", FilenameUtils.getPrefix("\\a\\b\\c.txt"));
		assertEquals("~\\", FilenameUtils.getPrefix("~\\a\\b\\c.txt"));
		assertEquals("~user\\", FilenameUtils.getPrefix("~user\\a\\b\\c.txt"));
	}
	
	@Test
	public void testAssertThrowsMessage_getPath_filenameNullBytes() {
		final IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
				() -> FilenameUtils.getPath(Scaffolding.FILENAME_NULL_BYTES));
		assertEquals(
				"Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it",
				thrown.getMessage());
	}
}
