package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.Scaffolding.MockFile;
import org.apache.commons.io.Scaffolding.MockPath;
import org.junit.jupiter.api.Test;

public class FileDeleteStrategyTest {
	
	@Test
	public void testFileDeleteStrategyForce() {
		FileDeleteStrategy fileDeleteStrategy = FileDeleteStrategy.FORCE;
		String str0 = fileDeleteStrategy.toString();
		File file0 = null;
		boolean boolean0 = fileDeleteStrategy.deleteQuietly(file0);
		String str1 = fileDeleteStrategy.toString();
		String str2 = fileDeleteStrategy.toString();
		String str3 = fileDeleteStrategy.toString();
		String str4 = fileDeleteStrategy.toString();
		File file1 = null;
		boolean boolean1 = fileDeleteStrategy.deleteQuietly(file1);
		String str5 = fileDeleteStrategy.toString();
		File file2 = null;
		boolean boolean2 = fileDeleteStrategy.deleteQuietly(file2);
		File file3 = null;
		boolean boolean3 = fileDeleteStrategy.deleteQuietly(file3);
		String str6 = fileDeleteStrategy.toString();
		String str7 = fileDeleteStrategy.toString();
		String str8 = fileDeleteStrategy.toString();
		File file4 = null;
		boolean boolean4 = fileDeleteStrategy.deleteQuietly(file4);
		Class<?> wildcardClass = fileDeleteStrategy.getClass();
		assertNotNull(fileDeleteStrategy);
		assertEquals(str0, "FileDeleteStrategy[Force]", "'" + str0 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertTrue(boolean0 == true, "'" + boolean0 + "' != '" + true + "'");
		assertEquals(str1, "FileDeleteStrategy[Force]", "'" + str1 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertEquals(str2, "FileDeleteStrategy[Force]", "'" + str2 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertEquals(str3, "FileDeleteStrategy[Force]", "'" + str3 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertEquals(str4, "FileDeleteStrategy[Force]", "'" + str4 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertTrue(boolean1 == true, "'" + boolean1 + "' != '" + true + "'");
		assertEquals(str5, "FileDeleteStrategy[Force]", "'" + str5 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
		assertTrue(boolean3 == true, "'" + boolean3 + "' != '" + true + "'");
		assertEquals(str6, "FileDeleteStrategy[Force]", "'" + str6 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertEquals(str7, "FileDeleteStrategy[Force]", "'" + str7 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertEquals(str8, "FileDeleteStrategy[Force]", "'" + str8 + "' != '" + "FileDeleteStrategy[Force]" + "'");
		assertTrue(boolean4 == true, "'" + boolean4 + "' != '" + true + "'");
		assertNotNull(wildcardClass);
	}
	
	@Test
	public void testFileDeleteStrategyNormal() {
		FileDeleteStrategy fileDeleteStrategy = FileDeleteStrategy.NORMAL;
		String str0 = fileDeleteStrategy.toString();
		String str1 = fileDeleteStrategy.toString();
		String str2 = fileDeleteStrategy.toString();
		File file0 = null;
		boolean boolean0 = fileDeleteStrategy.deleteQuietly(file0);
		File file1 = null;
		boolean boolean1 = fileDeleteStrategy.deleteQuietly(file1);
		String str3 = fileDeleteStrategy.toString();
		String str4 = fileDeleteStrategy.toString();
		File file2 = null;
		boolean boolean2 = fileDeleteStrategy.deleteQuietly(file2);
		String str5 = fileDeleteStrategy.toString();
		String str6 = fileDeleteStrategy.toString();
		String str7 = fileDeleteStrategy.toString();
		String str8 = fileDeleteStrategy.toString();
		File file3 = null;
		boolean boolean3 = fileDeleteStrategy.deleteQuietly(file3);
		File file4 = null;
		boolean boolean4 = fileDeleteStrategy.deleteQuietly(file4);
		assertNotNull(fileDeleteStrategy);
		assertEquals(str0, "FileDeleteStrategy[Normal]", "'" + str0 + "' != '" + "FileDeleteStrategy[Normal]" + "'");
		assertEquals(str1, "FileDeleteStrategy[Normal]", "'" + str1 + "' != '" + "FileDeleteStrategy[Normal]" + "'");
		assertEquals(str2, "FileDeleteStrategy[Normal]", "'" + str2 + "' != '" + "FileDeleteStrategy[Normal]" + "'");
		assertTrue(boolean0 == true, "'" + boolean0 + "' != '" + true + "'");
		assertTrue(boolean1 == true, "'" + boolean1 + "' != '" + true + "'");
		assertEquals(str3, "FileDeleteStrategy[Normal]", "'" + str3 + "' != '" + "FileDeleteStrategy[Normal]" + "'");
		assertEquals(str4, "FileDeleteStrategy[Normal]", "'" + str4 + "' != '" + "FileDeleteStrategy[Normal]" + "'");
		assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
		assertEquals(str5, "FileDeleteStrategy[Normal]", "'" + str5 + "' != '" + "FileDeleteStrategy[Normal]" + "'");
		assertEquals(str6, "FileDeleteStrategy[Normal]", "'" + str6 + "' != '" + "FileDeleteStrategy[Normal]" + "'");
		assertEquals(str7, "FileDeleteStrategy[Normal]", "'" + str7 + "' != '" + "FileDeleteStrategy[Normal]" + "'");
		assertEquals(str8, "FileDeleteStrategy[Normal]", "'" + str8 + "' != '" + "FileDeleteStrategy[Normal]" + "'");
		assertTrue(boolean3 == true, "'" + boolean3 + "' != '" + true + "'");
		assertTrue(boolean4 == true, "'" + boolean4 + "' != '" + true + "'");
	}
	
	@Test
	public void testDelete1() throws Throwable {
		FileDeleteStrategy fileDeleteStrategy = new FileDeleteStrategy("");
		MockPath mockPath = new MockPath("org.apache.commons.io.FileDeleteStrategy$ForceFileDeleteStrategy");
		Scaffolding.appendStringToFile(mockPath, "\"$lmUyXYB");
		MockFile mockFile = new MockFile("");
		try {
			fileDeleteStrategy.delete(mockFile);
			fail("Expecting exception: IOException");
			
		}
		catch (IOException e) {
			Scaffolding.verifyException("org.apache.commons.io.FileDeleteStrategy", e);
		}
	}
	
	@Test
	public void testDelete2() throws Throwable {
		FileDeleteStrategy fileDeleteStrategy = new FileDeleteStrategy("");
		MockPath mockPath = new MockPath("org.apache.commons.io.FileDeleteStrategy$ForceFileDeleteStrategy");
		Scaffolding.appendStringToFile(mockPath, "\"$lmUyXYB");
		MockFile mockFile = new MockFile("org.apache.commons.io.FileDeleteStrategy$ForceFileDeleteStrategy");
		fileDeleteStrategy.delete(mockFile);
		assertFalse(mockFile.canRead());
		assertEquals(0L, mockFile.lastModified());
	}
}
