package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class EndianUtilsTest {
	
	@Test
	public void testUnsignedOverrun() throws Exception {
		final byte[] target = new byte[]{ 0, 0, 0, (byte) 0x80 };
		final long expected = 0x80000000L;
		
		long actual = EndianUtils.readSwappedUnsignedInteger(target, 0);
		assertEquals(expected, actual, "readSwappedUnsignedInteger(byte[], int) was incorrect");
		
		final ByteArrayInputStream in = new ByteArrayInputStream(target);
		actual = EndianUtils.readSwappedUnsignedInteger(in);
		assertEquals(expected, actual, "readSwappedUnsignedInteger(InputStream) was incorrect");
	}
	
	@Test
	public void testReadSwappedUnsignedInteger() {
		byte[] byteArray = new byte[9];
		long long0 = EndianUtils.readSwappedUnsignedInteger(byteArray, 2);
		assertEquals(0L, long0);
	}
	
	@Test
	public void testEndianUtils1() {
		byte[] byteArray = new byte[]{ (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
		EndianUtils.writeSwappedInteger(byteArray, 1, (int) '4');
		EndianUtils.writeSwappedFloat(byteArray, 0, (-3.03064E38f));
		long long0 = EndianUtils.readSwappedUnsignedInteger(byteArray, (int) (short) 1);
		int int0 = EndianUtils.readSwappedInteger(byteArray, 0);
		long long1 = EndianUtils.readSwappedUnsignedInteger(byteArray, (int) (short) 1);
		try {
			long long2 = EndianUtils.readSwappedLong(byteArray, 6553600);
			fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[1, 0, 100, -1, 0]");
		assertTrue(long0 == 16737280L, "'" + long0 + "' != '" + 16737280L + "'");
		assertTrue(int0 == (-10223615), "'" + int0 + "' != '" + (-10223615) + "'");
		assertTrue(long1 == 16737280L, "'" + long1 + "' != '" + 16737280L + "'");
	}
	
	@Test
	public void testEndianUtils2() {
		byte[] byteArray = new byte[]{ (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
		long long0 = EndianUtils.readSwappedUnsignedInteger(byteArray, 0);
		EndianUtils.writeSwappedFloat(byteArray, (int) (short) 0, (float) ' ');
		EndianUtils.writeSwappedInteger(byteArray, 0, (int) (short) 13322);
		EndianUtils.writeSwappedInteger(byteArray, (int) (byte) 0, (int) (byte) 1);
		int int0 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray, (int) (byte) 0);
		try {
			long long1 = EndianUtils.readSwappedUnsignedInteger(byteArray, (int) (short) 1);
			fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[1, 0, 0, 0]");
		assertTrue(long0 == 4284743681L, "'" + long0 + "' != '" + 4284743681L + "'");
		assertTrue(int0 == 1, "'" + int0 + "' != '" + 1 + "'");
	}
	
	@Test
	public void testSwapLong() {
		assertEquals(0, EndianUtils.swapLong(0));
		assertEquals(0x0807060504030201L, EndianUtils.swapLong(0x0102030405060708L));
		assertEquals(0xffffffffffffffffL, EndianUtils.swapLong(0xffffffffffffffffL));
		assertEquals(0xab, EndianUtils.swapLong(0xab00000000000000L));
	}
	
	@Test
	public void testReadSwappedUnsignedShort() {
		byte[] byteArray = new byte[4];
		int int0 = EndianUtils.readSwappedUnsignedShort(byteArray, (int) (byte) 0);
		assertEquals(0, int0);
	}
	
	@Test
	public void testEndianUtils3() {
		byte[] byteArray = new byte[]{ (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
		long long0 = EndianUtils.readSwappedUnsignedInteger(byteArray, 0);
		EndianUtils.writeSwappedShort(byteArray, (int) (byte) 1, (short) (byte) -1);
		int int0 = EndianUtils.readSwappedUnsignedShort(byteArray, (int) (short) 1);
		EndianUtils.writeSwappedShort(byteArray, (int) (byte) 0, (short) 1);
		try {
			short short0 = EndianUtils.readSwappedShort(byteArray, 20546);
			fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 20546 out of bounds for length 4");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[1, 0, -1, -1]");
		assertTrue(long0 == 4284743681L, "'" + long0 + "' != '" + 4284743681L + "'");
		assertTrue(int0 == 65535, "'" + int0 + "' != '" + 65535 + "'");
	}
}
