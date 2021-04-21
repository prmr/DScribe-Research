package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ByteOrderMarkTest {
	
	@Test
	public void charsetName() {
		assertEquals("test1", Scaffolding.TEST_BOM_1.getCharsetName(), "test1 name");
		assertEquals("test2", Scaffolding.TEST_BOM_2.getCharsetName(), "test2 name");
		assertEquals("test3", Scaffolding.TEST_BOM_3.getCharsetName(), "test3 name");
	}
	
	@Test
	public void testByteOrderMark() {
		ByteOrderMark byteOrderMark0 = ByteOrderMark.UTF_16BE;
		Object obj = null;
		boolean boolean0 = byteOrderMark0.equals(obj);
		int int0 = byteOrderMark0.length();
		boolean boolean1 = byteOrderMark0.equals((Object) 0L);
		int int1 = byteOrderMark0.length();
		int int2 = byteOrderMark0.length();
		int[] intArray0 = new int[]{ 10, 'a', '#' };
		ByteOrderMark byteOrderMark1 = new ByteOrderMark("hi!", intArray0);
		ByteOrderMark byteOrderMark2 = new ByteOrderMark("UTF-16LE", intArray0);
		ByteOrderMark byteOrderMark3 = new ByteOrderMark("hi!", intArray0);
		boolean boolean2 = byteOrderMark0.equals((Object) intArray0);
		byte[] byteArray0 = byteOrderMark0.getBytes();
		int int3 = byteOrderMark0.length();
		String str0 = byteOrderMark0.getCharsetName();
		ByteOrderMark byteOrderMark4 = ByteOrderMark.UTF_32BE;
		byte[] byteArray1 = byteOrderMark4.getBytes();
		int[] intArray1 = new int[]{ 10, 'a', '#' };
		ByteOrderMark byteOrderMark5 = new ByteOrderMark("hi!", intArray1);
		ByteOrderMark byteOrderMark6 = new ByteOrderMark("UTF-16LE", intArray1);
		ByteOrderMark byteOrderMark7 = new ByteOrderMark("hi!", intArray1);
		ByteOrderMark byteOrderMark8 = new ByteOrderMark("UTF-32BE", intArray1);
		ByteOrderMark byteOrderMark9 = new ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray1);
		ByteOrderMark byteOrderMark10 = new ByteOrderMark("hi!", intArray1);
		boolean boolean3 = byteOrderMark4.equals((Object) intArray1);
		boolean boolean4 = byteOrderMark0.equals((Object) intArray1);
		ByteOrderMark byteOrderMark11 = new ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray1);
		String str1 = byteOrderMark11.toString();
		String str2 = byteOrderMark11.toString();
		ByteOrderMark byteOrderMark12 = ByteOrderMark.UTF_32BE;
		ByteOrderMark byteOrderMark13 = ByteOrderMark.UTF_32LE;
		boolean boolean5 = byteOrderMark13.equals((Object) "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
		Class<?> wildcardClass = byteOrderMark13.getClass();
		boolean boolean6 = byteOrderMark12.equals((Object) byteOrderMark13);
		byte[] byteArray2 = byteOrderMark12.getBytes();
		String str3 = byteOrderMark12.toString();
		String str4 = byteOrderMark12.getCharsetName();
		boolean boolean7 = byteOrderMark11.equals((Object) byteOrderMark12);
		assertNotNull(byteOrderMark0);
		assertTrue(boolean0 == false, "'" + boolean0 + "' != '" + false + "'");
		assertTrue(int0 == 2, "'" + int0 + "' != '" + 2 + "'");
		assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
		assertTrue(int1 == 2, "'" + int1 + "' != '" + 2 + "'");
		assertTrue(int2 == 2, "'" + int2 + "' != '" + 2 + "'");
		assertNotNull(intArray0);
		assertEquals(Arrays.toString(intArray0), "[10, 97, 35]");
		assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
		assertNotNull(byteArray0);
		assertEquals(Arrays.toString(byteArray0), "[-2, -1]");
		assertTrue(int3 == 2, "'" + int3 + "' != '" + 2 + "'");
		assertEquals(str0, "UTF-16BE", "'" + str0 + "' != '" + "UTF-16BE" + "'");
		assertNotNull(byteOrderMark4);
		assertNotNull(byteArray1);
		assertEquals(Arrays.toString(byteArray1), "[0, 0, -2, -1]");
		assertNotNull(intArray1);
		assertEquals(Arrays.toString(intArray1), "[10, 97, 35]");
		assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
		assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
		assertEquals(str1,
				"ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]",
				"'" + str1 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]" + "'");
		assertEquals(str2,
				"ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]",
				"'" + str2 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]" + "'");
		assertNotNull(byteOrderMark12);
		assertNotNull(byteOrderMark13);
		assertTrue(boolean5 == false, "'" + boolean5 + "' != '" + false + "'");
		assertNotNull(wildcardClass);
		assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
		assertNotNull(byteArray2);
		assertEquals(Arrays.toString(byteArray2), "[0, 0, -2, -1]");
		assertEquals(str3,
				"ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]",
				"'" + str3 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'");
		assertEquals(str4, "UTF-32BE", "'" + str4 + "' != '" + "UTF-32BE" + "'");
		assertTrue(boolean7 == false, "'" + boolean7 + "' != '" + false + "'");
	}

	@Test
	public void testByteOrderMarkUTF16LE() {
		ByteOrderMark byteOrderMark = ByteOrderMark.UTF_16LE;
		byte[] byteArray = byteOrderMark.getBytes();
		int int0 = byteOrderMark.length();
		String str0 = byteOrderMark.getCharsetName();
		int int1 = byteOrderMark.length();
		int int2 = byteOrderMark.length();
		String str6 = byteOrderMark.getCharsetName();
		int int3 = byteOrderMark.length();
		assertNotNull(byteOrderMark);
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[-1, -2]");
		assertTrue(int0 == 2, "'" + int0 + "' != '" + 2 + "'");
		assertEquals(str0, "UTF-16LE", "'" + str0 + "' != '" + "UTF-16LE" + "'");
		assertTrue(int1 == 2, "'" + int1 + "' != '" + 2 + "'");
		assertTrue(int2 == 2, "'" + int2 + "' != '" + 2 + "'");
		assertEquals(str6, "UTF-16LE", "'" + str6 + "' != '" + "UTF-16LE" + "'");
		assertTrue(int3 == 2, "'" + int3 + "' != '" + 2 + "'");
	}
}
