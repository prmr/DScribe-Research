package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ByteOrderMarkTest {
	
	@Test
	public void testEquals() {
		ByteOrderMark byteOrderMark0 = ByteOrderMark.UTF_32LE;
		ByteOrderMark byteOrderMark1 = ByteOrderMark.UTF_16BE;
		boolean boolean0 = byteOrderMark0.equals(byteOrderMark1);
		assertFalse(boolean0);
	}

	@Test
	public void testByteOrderMark1() {
		int[] intArray = new int[]{ 10, 'a', '#' };
		ByteOrderMark byteOrderMark0 = new ByteOrderMark("hi!", intArray);
		ByteOrderMark byteOrderMark1 = new ByteOrderMark("UTF-16LE", intArray);
		ByteOrderMark byteOrderMark2 = new ByteOrderMark("hi!", intArray);
		ByteOrderMark byteOrderMark3 = new ByteOrderMark("UTF-32BE", intArray);
		ByteOrderMark byteOrderMark4 = new ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray);
		ByteOrderMark byteOrderMark5 = new ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray);
		ByteOrderMark byteOrderMark6 = new ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray);
		ByteOrderMark byteOrderMark7 = new ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray);
		ByteOrderMark byteOrderMark8 = new ByteOrderMark(
				"ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]",
				intArray);
		int int0 = byteOrderMark8.get((int) (byte) 1);
		assertNotNull(intArray);
		assertEquals(Arrays.toString(intArray), "[10, 97, 35]");
		assertTrue(int0 == 97, "'" + int0 + "' != '" + 97 + "'");
	}
	
	@Test
	public void testByteOrderMark2() {
		int[] intArray0 = new int[]{ 10, 'a', '#' };
		ByteOrderMark byteOrderMark0 = new ByteOrderMark("hi!", intArray0);
		ByteOrderMark byteOrderMark1 = new ByteOrderMark("UTF-16LE", intArray0);
		ByteOrderMark byteOrderMark2 = new ByteOrderMark("hi!", intArray0);
		ByteOrderMark byteOrderMark3 = new ByteOrderMark("UTF-32BE", intArray0);
		ByteOrderMark byteOrderMark4 = new ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray0);
		ByteOrderMark byteOrderMark5 = new ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray0);
		ByteOrderMark byteOrderMark6 = new ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray0);
		ByteOrderMark byteOrderMark7 = new ByteOrderMark(
				"ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]",
				intArray0);
		ByteOrderMark byteOrderMark8 = new ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray0);
		ByteOrderMark byteOrderMark9 = new ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray0);
		int[] intArray1 = new int[]{ 10, 'a', '#' };
		ByteOrderMark byteOrderMark10 = new ByteOrderMark("hi!", intArray1);
		ByteOrderMark byteOrderMark11 = new ByteOrderMark("UTF-16LE", intArray1);
		ByteOrderMark byteOrderMark12 = new ByteOrderMark("hi!", intArray1);
		ByteOrderMark byteOrderMark13 = new ByteOrderMark("UTF-32BE", intArray1);
		String str = byteOrderMark13.getCharsetName();
		Object obj = null;
		boolean boolean0 = byteOrderMark13.equals(obj);
		byte[] byteArray = byteOrderMark13.getBytes();
		boolean boolean1 = byteOrderMark9.equals((java.lang.Object) byteArray);
		assertNotNull(intArray0);
		assertEquals(Arrays.toString(intArray0), "[10, 97, 35]");
		assertNotNull(intArray1);
		assertEquals(Arrays.toString(intArray1), "[10, 97, 35]");
		assertEquals(str, "UTF-32BE", "'" + str + "' != '" + "UTF-32BE" + "'");
		assertTrue(boolean0 == false, "'" + boolean0 + "' != '" + false + "'");
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[10, 97, 35]");
		assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
	}
}
