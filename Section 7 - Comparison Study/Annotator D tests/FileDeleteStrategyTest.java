package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;

import org.junit.jupiter.api.Test;

public class FileDeleteStrategyTest {
	
	@Test
	public void testFileDeleteStrategyForce1() {
		FileDeleteStrategy fileDeleteStrategy = FileDeleteStrategy.FORCE;
		File file0 = null;
		boolean boolean0 = fileDeleteStrategy.deleteQuietly(file0);
		File file1 = null;
		boolean boolean1 = fileDeleteStrategy.deleteQuietly(file1);
		File file2 = null;
		boolean boolean2 = fileDeleteStrategy.deleteQuietly(file2);
		String str0 = fileDeleteStrategy.toString();
		String str1 = fileDeleteStrategy.toString();
		File file3 = null;
		boolean boolean3 = fileDeleteStrategy.deleteQuietly(file3);
		File file4 = null;
		boolean boolean4 = fileDeleteStrategy.deleteQuietly(file4);
		String str2 = fileDeleteStrategy.toString();
		String str3 = fileDeleteStrategy.toString();
		File file5 = null;
		boolean boolean5 = fileDeleteStrategy.deleteQuietly(file5);
		String str4 = fileDeleteStrategy.toString();
		Class<?> wildcardClass = fileDeleteStrategy.getClass();
		assertNotNull(fileDeleteStrategy);
		assertTrue(boolean0 == true, "'" + boolean0 + "' != '" + true + "'");
		assertTrue(boolean1 == true, "'" + boolean1 + "' != '" + true + "'");
		assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
		assertEquals(str0, "FileDeleteStrategy[Force]", "'" + str0 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertEquals(str1, "FileDeleteStrategy[Force]", "'" + str1 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertTrue(boolean3 == true, "'" + boolean3 + "' != '" + true + "'");
		assertTrue(boolean4 == true, "'" + boolean4 + "' != '" + true + "'");
		assertEquals(str2, "FileDeleteStrategy[Force]", "'" + str2 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertEquals(str3, "FileDeleteStrategy[Force]", "'" + str3 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertTrue(boolean5 == true, "'" + boolean5 + "' != '" + true + "'");
		assertEquals(str4, "FileDeleteStrategy[Force]", "'" + str4 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertNotNull(wildcardClass);
	}
	
	@Test
	public void testFileDeleteStrategyForce2() {
		FileDeleteStrategy fileDeleteStrategy = FileDeleteStrategy.FORCE;
		File file0 = null;
		boolean boolean0 = fileDeleteStrategy.deleteQuietly(file0);
		File file1 = null;
		boolean boolean1 = fileDeleteStrategy.deleteQuietly(file1);
		String str0 = fileDeleteStrategy.toString();
		String str1 = fileDeleteStrategy.toString();
		String str2 = fileDeleteStrategy.toString();
		File file2 = null;
		boolean boolean2 = fileDeleteStrategy.deleteQuietly(file2);
		File file3 = null;
		boolean boolean3 = fileDeleteStrategy.deleteQuietly(file3);
		File file4 = null;
		boolean boolean4 = fileDeleteStrategy.deleteQuietly(file4);
		File file5 = null;
		boolean boolean5 = fileDeleteStrategy.deleteQuietly(file5);
		File file6 = null;
		boolean boolean6 = fileDeleteStrategy.deleteQuietly(file6);
		File file7 = null;
		boolean boolean7 = fileDeleteStrategy.deleteQuietly(file7);
		String str3 = fileDeleteStrategy.toString();
		File file8 = null;
		boolean boolean8 = fileDeleteStrategy.deleteQuietly(file8);
		String str4 = fileDeleteStrategy.toString();
		File file9 = null;
		boolean boolean9 = fileDeleteStrategy.deleteQuietly(file9);
		String str5 = fileDeleteStrategy.toString();
		Class<?> wildcardClass = fileDeleteStrategy.getClass();
		assertNotNull(fileDeleteStrategy);
		assertTrue(boolean0 == true, "'" + boolean0 + "' != '" + true + "'");
		assertTrue(boolean1 == true, "'" + boolean1 + "' != '" + true + "'");
		assertEquals(str0, "FileDeleteStrategy[Force]", "'" + str0 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertEquals(str1, "FileDeleteStrategy[Force]", "'" + str1 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertEquals(str2, "FileDeleteStrategy[Force]", "'" + str2 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
		assertTrue(boolean3 == true, "'" + boolean3 + "' != '" + true + "'");
		assertTrue(boolean4 == true, "'" + boolean4 + "' != '" + true + "'");
		assertTrue(boolean5 == true, "'" + boolean5 + "' != '" + true + "'");
		assertTrue(boolean6 == true, "'" + boolean6 + "' != '" + true + "'");
		assertTrue(boolean7 == true, "'" + boolean7 + "' != '" + true + "'");
		assertEquals(str3, "FileDeleteStrategy[Force]", "'" + str3 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertTrue(boolean8 == true, "'" + boolean8 + "' != '" + true + "'");
		assertEquals(str4, "FileDeleteStrategy[Force]", "'" + str4 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertTrue(boolean9 == true, "'" + boolean9 + "' != '" + true + "'");
		assertEquals(str5, "FileDeleteStrategy[Force]", "'" + str5 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertNotNull(wildcardClass);
	}
	
	@Test
	public void testFileDeleteStrategyForce3() throws Throwable {
		FileDeleteStrategy fileDeleteStrategy = FileDeleteStrategy.FORCE;
		File file0 = null;
		boolean boolean0 = fileDeleteStrategy.deleteQuietly(file0);
		String str0 = fileDeleteStrategy.toString();
		String str1 = fileDeleteStrategy.toString();
		File file1 = null;
		boolean boolean1 = fileDeleteStrategy.deleteQuietly(file1);
		File file2 = null;
		boolean boolean2 = fileDeleteStrategy.deleteQuietly(file2);
		File file3 = null;
		boolean boolean3 = fileDeleteStrategy.deleteQuietly(file3);
		File file4 = null;
		boolean boolean4 = fileDeleteStrategy.deleteQuietly(file4);
		File file5 = null;
		boolean boolean5 = fileDeleteStrategy.deleteQuietly(file5);
		String str2 = fileDeleteStrategy.toString();
		File file6 = null;
		boolean boolean6 = fileDeleteStrategy.deleteQuietly(file6);
		String str3 = fileDeleteStrategy.toString();
		File file7 = null;
		try {
			fileDeleteStrategy.delete(file7);
			fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.exists()\" because \"fileToDelete\" is null");
		}
		catch (java.lang.NullPointerException e) {
		}
		assertNotNull(fileDeleteStrategy);
		assertTrue(boolean0 == true, "'" + boolean0 + "' != '" + true + "'");
		assertEquals(str0, "FileDeleteStrategy[Force]", "'" + str0 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertEquals(str1, "FileDeleteStrategy[Force]", "'" + str1 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertTrue(boolean1 == true, "'" + boolean1 + "' != '" + true + "'");
		assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
		assertTrue(boolean3 == true, "'" + boolean3 + "' != '" + true + "'");
		assertTrue(boolean4 == true, "'" + boolean4 + "' != '" + true + "'");
		assertTrue(boolean5 == true, "'" + boolean5 + "' != '" + true + "'");
		assertEquals(str2, "FileDeleteStrategy[Force]", "'" + str2 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertTrue(boolean6 == true, "'" + boolean6 + "' != '" + true + "'");
		assertEquals(str3, "FileDeleteStrategy[Force]", "'" + str3 + "' != '" + "FileDeleteStrategy[Force]" + "'");
	}
	
	@Test
	public void testDeleteNull() throws Exception {
		try {
			FileDeleteStrategy.NORMAL.delete(null);
			fail();
		}
		catch (final NullPointerException ex) {
		}
		assertTrue(FileDeleteStrategy.NORMAL.deleteQuietly(null));
	}
}
