package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.junit.jupiter.api.Test;

public class FilenameUtilsTest {
	
	@Test
	public void testWildcardMatch1() {
		boolean boolean0 = FilenameUtils.wildcardMatch(
				"hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/",
				"hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\");
		assertTrue(boolean0 == false, "'" + boolean0 + "' != '" + false + "'");
	}
	
	@Test
	public void testWildcardMatch2() {
		IOCase iOCase = null;
		boolean boolean0 = FilenameUtils.wildcardMatch(
				"hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\",
				"hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!",
				iOCase);
		assertTrue(boolean0 == false, "'" + boolean0 + "' != '" + false + "'");
	}
	
	@Test
	public void testDirectoryContains() throws Throwable {
		boolean boolean0 = FilenameUtils.directoryContains(
				"hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\",
				"hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!");
		assertTrue(boolean0 == false, "'" + boolean0 + "' != '" + false + "'");
	}
	
	@Test
	public void testNormalize1() {
		String string = FilenameUtils.normalize("Ng fLd0j6b.", false);
		assertEquals("Ng fLd0j6b.", string);
		assertNotNull(string);
	}
	
	@Test
	public void testIsExtension() {
		String[] strArray = new String[]{ "", ".", "" };
		ArrayList<String> strList = new ArrayList<String>();
		boolean boolean0 = Collections.addAll((Collection<String>) strList, strArray);
		boolean boolean1 = FilenameUtils.isExtension("", (Collection<String>) strList);
		boolean boolean2 = FilenameUtils.isExtension("hi!", (Collection<String>) strList);
		boolean boolean3 = FilenameUtils.isExtension("hi!/hi!", (Collection<String>) strList);
		boolean boolean4 = FilenameUtils.isExtension("", (Collection<String>) strList);
		boolean boolean5 = FilenameUtils.isExtension("hi!/", (Collection<String>) strList);
		boolean boolean6 = FilenameUtils.isExtension(
				"hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!",
				(Collection<String>) strList);
		boolean boolean7 = FilenameUtils.isExtension("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\",
				(Collection<String>) strList);
		boolean boolean8 = FilenameUtils.isExtension("", (Collection<String>) strList);
		boolean boolean9 = FilenameUtils.isExtension(
				"hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/",
				(Collection<String>) strList);
		assertNotNull(strArray);
		assertTrue(boolean0 == true, "'" + boolean0 + "' != '" + true + "'");
		assertTrue(boolean1 == true, "'" + boolean1 + "' != '" + true + "'");
		assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
		assertTrue(boolean3 == true, "'" + boolean3 + "' != '" + true + "'");
		assertTrue(boolean4 == true, "'" + boolean4 + "' != '" + true + "'");
		assertTrue(boolean5 == true, "'" + boolean5 + "' != '" + true + "'");
		assertTrue(boolean6 == true, "'" + boolean6 + "' != '" + true + "'");
		assertTrue(boolean7 == true, "'" + boolean7 + "' != '" + true + "'");
		assertTrue(boolean8 == true, "'" + boolean8 + "' != '" + true + "'");
		assertTrue(boolean9 == true, "'" + boolean9 + "' != '" + true + "'");
	}
	
	@Test
	public void testGetPath1() {
		String string = FilenameUtils.getPath("^:S[H");
		assertNull(string);
	}
	
	@Test
	public void testIndexOfExtension1() throws Throwable {
		int int0 = FilenameUtils.indexOfExtension(
				"hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!");
		assertTrue(int0 == (-1), "'" + int0 + "' != '" + (-1) + "'");
	}
	
	@Test
	public void testIndexOfExtension2() throws Throwable {
		int int0 = FilenameUtils.indexOfExtension("?p/~kpv");
		assertEquals((-1), int0);
	}
	
	@Test
	public void testGetPrefix() throws Throwable {
		String string = FilenameUtils.getPrefix("~dv<&cLd|1>.1B");
		assertEquals("~dv<&cLd|1>.1B/", string);
		assertNotNull(string);
	}
	
	@Test
	public void testGetPathNoEndSeparator1() {
		assertEquals(null, FilenameUtils.getPath(null));
		assertEquals("", FilenameUtils.getPath("noseperator.inthispath"));
		assertEquals("", FilenameUtils.getPathNoEndSeparator("/noseperator.inthispath"));
		assertEquals("", FilenameUtils.getPathNoEndSeparator("\\noseperator.inthispath"));
		assertEquals("a/b", FilenameUtils.getPathNoEndSeparator("a/b/c.txt"));
		assertEquals("a/b", FilenameUtils.getPathNoEndSeparator("a/b/c"));
		assertEquals("a/b/c", FilenameUtils.getPathNoEndSeparator("a/b/c/"));
		assertEquals("a\\b", FilenameUtils.getPathNoEndSeparator("a\\b\\c"));
		
		assertEquals(null, FilenameUtils.getPathNoEndSeparator(":"));
		assertEquals(null, FilenameUtils.getPathNoEndSeparator("1:/a/b/c.txt"));
		assertEquals(null, FilenameUtils.getPathNoEndSeparator("1:"));
		assertEquals(null, FilenameUtils.getPathNoEndSeparator("1:a"));
		assertEquals(null, FilenameUtils.getPathNoEndSeparator("///a/b/c.txt"));
		assertEquals(null, FilenameUtils.getPathNoEndSeparator("//a"));
		
		assertEquals("", FilenameUtils.getPathNoEndSeparator(""));
		assertEquals("", FilenameUtils.getPathNoEndSeparator("C:"));
		assertEquals("", FilenameUtils.getPathNoEndSeparator("C:/"));
		assertEquals("", FilenameUtils.getPathNoEndSeparator("//server/"));
		assertEquals("", FilenameUtils.getPathNoEndSeparator("~"));
		assertEquals("", FilenameUtils.getPathNoEndSeparator("~/"));
		assertEquals("", FilenameUtils.getPathNoEndSeparator("~user"));
		assertEquals("", FilenameUtils.getPathNoEndSeparator("~user/"));
		
		assertEquals("a/b", FilenameUtils.getPathNoEndSeparator("a/b/c.txt"));
		assertEquals("a/b", FilenameUtils.getPathNoEndSeparator("/a/b/c.txt"));
		assertEquals("", FilenameUtils.getPathNoEndSeparator("C:a"));
		assertEquals("a/b", FilenameUtils.getPathNoEndSeparator("C:a/b/c.txt"));
		assertEquals("a/b", FilenameUtils.getPathNoEndSeparator("C:/a/b/c.txt"));
		assertEquals("a/b", FilenameUtils.getPathNoEndSeparator("//server/a/b/c.txt"));
		assertEquals("a/b", FilenameUtils.getPathNoEndSeparator("~/a/b/c.txt"));
		assertEquals("a/b", FilenameUtils.getPathNoEndSeparator("~user/a/b/c.txt"));
	}
	
	@Test
	public void testGetPathNoEndSeparator2() {
		String string = FilenameUtils.getPathNoEndSeparator("");
		assertEquals("", string);
	}
	
	@Test
	public void testWildcardMatch3() {
		boolean boolean0 = FilenameUtils.wildcardMatch("hi!/hi!/hi!/hi!/hi!/hi!/hi!",
				"hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\");
		assertTrue(boolean0 == false, "'" + boolean0 + "' != '" + false + "'");
	}
	
	@Test
	public void testGetPath2() {
		String string = FilenameUtils.getPath("lz] y)0%|M,Z*CE");
		assertEquals("", string);
		assertNotNull(string);
	}
	
	@Test
	public void testNormalize2() {
		String str = FilenameUtils.normalize("hi!\\hi!\\hi!\\", false);
		assertEquals(str, "hi!\\hi!\\hi!\\", "'" + str + "' != '" + "hi!\\hi!\\hi!\\" + "'");
	}
	
	@Test
	public void testNormalize_with_nullbytes() throws Exception {
		try {
			assertEquals("a" + Scaffolding.SEP + "b" + Scaffolding.SEP + "c.txt",
					FilenameUtils.normalize("a\\b/c\u0000.txt"));
		}
		catch (final IllegalArgumentException ignore) {
		}
		
		try {
			assertEquals("a" + Scaffolding.SEP + "b" + Scaffolding.SEP + "c.txt",
					FilenameUtils.normalize("\u0000a\\b/c.txt"));
		}
		catch (final IllegalArgumentException ignore) {
		}
	}
}
