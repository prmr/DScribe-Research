package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FilenameUtilsTest {
	
	@Test
	public void testEqualsNormalized() {
		boolean boolean0 = FilenameUtils.equalsNormalized("/", "/");
		assertTrue(boolean0);
	}
	
	@Test
	public void testGetPath() {
		String str = FilenameUtils.getPath("hi!/hi!/hi!/");
		assertEquals(str, "hi!/hi!/hi!/", "'" + str + "' != '" + "hi!/hi!/hi!/" + "'");
	}

	@Test
	public void testWildcardMatch() {
		IOCase iOCase = null;
		boolean boolean0 = FilenameUtils.wildcardMatch(
				"hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/",
				"hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/",
				iOCase);
		assertTrue(boolean0 == false, "'" + boolean0 + "' != '" + false + "'");
	}

	@Test
	public void testRemoveExtension() {
		String string = FilenameUtils.removeExtension((String) null);
		assertNull(string);
	}

	@Test
	public void testGetPrefixLength() {
		int int0 = FilenameUtils.getPrefixLength(
				"hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
		assertTrue(int0 == 0, "'" + int0 + "' != '" + 0 + "'");
	}

	@Test
	public void testEqualsNormalizedOnSystem() {
		boolean boolean0 = FilenameUtils.equalsNormalizedOnSystem(
				"hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!",
				"hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
		assertTrue(boolean0 == false, "'" + boolean0 + "' != '" + false + "'");
	}

	@Test
	public void testGetBaseName() {
		String str = FilenameUtils.getBaseName(
				"hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
		assertEquals(str, "hi!", "'" + str + "' != '" + "hi!" + "'");
	}

	@Test
	public void testGetExtension() throws Throwable {
		String string = FilenameUtils.getExtension((String) null);
		assertNull(string);
	}
	
	@Test
	public void testEquals() {
		boolean boolean0 = FilenameUtils.equals("hi!/hi!/hi!/hi!/hi!/hi!/hi!/", "hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!/hi!");
		assertTrue(boolean0 == false, "'" + boolean0 + "' != '" + false + "'");
	}

	@Test
	public void testIsExtension1() {
		boolean boolean0 = FilenameUtils.isExtension(".", (String[]) null);
		assertFalse(boolean0);
	}
	
	@Test
	public void testIsExtension2() {
		String[] stringArray = new String[0];
		boolean boolean0 = FilenameUtils.isExtension("~_&zJ^;zAb[Iu0qdB", stringArray);
		assertTrue(boolean0);
	}
	
	@Test
	public void testConcat() {
		String str = FilenameUtils.concat("hi!/hi!", "hi!\\hi!\\");
		assertEquals(str, "hi!\\hi!\\hi!\\hi!\\", "'" + str + "' != '" + "hi!\\hi!\\hi!\\hi!\\" + "'");
	}
}
