package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ByteOrderMarkTest {
	
	@Test
	public void testAssertThrowsMessage_ByteOrderMark_bytesEmpty() {
		final IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
				() -> new ByteOrderMark("test"));
		assertEquals("No bytes specified", thrown.getMessage());
	}
	
	@Test
	public void testByteOrderMark() {
		ByteOrderMark byteOrderMark0 = ByteOrderMark.UTF_16LE;
		boolean boolean0 = byteOrderMark0.equals((Object) 1L);
		String str0 = byteOrderMark0.getCharsetName();
		int int0 = byteOrderMark0.length();
		boolean boolean1 = byteOrderMark0.equals((Object) (byte) -1);
		byte[] byteArray0 = byteOrderMark0.getBytes();
		String str1 = byteOrderMark0.getCharsetName();
		String str2 = byteOrderMark0.getCharsetName();
		String str3 = byteOrderMark0.toString();
		int int1 = byteOrderMark0.length();
		int[] intArray0 = new int[]{ 10, 'a', '#' };
		ByteOrderMark byteOrderMark1 = new ByteOrderMark("hi!", intArray0);
		String str4 = byteOrderMark1.getCharsetName();
		Object obj = null;
		boolean boolean2 = byteOrderMark1.equals(obj);
		byte[] byteArray1 = byteOrderMark1.getBytes();
		boolean boolean3 = byteOrderMark0.equals((java.lang.Object) byteArray1);
		String str5 = byteOrderMark0.toString();
		int int2 = byteOrderMark0.get(0);
		assertNotNull(byteOrderMark0);
		assertTrue(boolean0 == false, "'" + boolean0 + "' != '" + false + "'");
		assertEquals(str0, "UTF-16LE", "'" + str0 + "' != '" + "UTF-16LE" + "'");
		assertTrue(int0 == 2, "'" + int0 + "' != '" + 2 + "'");
		assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
		assertNotNull(byteArray0);
		assertEquals(Arrays.toString(byteArray0), "[-1, -2]");
		assertEquals(str1, "UTF-16LE", "'" + str1 + "' != '" + "UTF-16LE" + "'");
		assertEquals(str2, "UTF-16LE", "'" + str2 + "' != '" + "UTF-16LE" + "'");
		assertEquals(str3,
				"ByteOrderMark[UTF-16LE: 0xFF,0xFE]",
				"'" + str3 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'");
		assertTrue(int1 == 2, "'" + int1 + "' != '" + 2 + "'");
		assertNotNull(intArray0);
		assertEquals(Arrays.toString(intArray0), "[10, 97, 35]");
		assertEquals(str4, "hi!", "'" + str4 + "' != '" + "hi!" + "'");
		assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
		assertNotNull(byteArray1);
		assertEquals(Arrays.toString(byteArray1), "[10, 97, 35]");
		assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
		assertEquals(str5,
				"ByteOrderMark[UTF-16LE: 0xFF,0xFE]",
				"'" + str5 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'");
		assertTrue(int2 == 255, "'" + int2 + "' != '" + 255 + "'");
	}
}
