package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class EndianUtilsTest {
	
	@Test
	public void testReadSwappedInteger() throws IOException {
		final byte[] bytes = new byte[]{ 0x04, 0x03, 0x02, 0x01 };
		assertEquals(0x01020304, EndianUtils.readSwappedInteger(bytes, 0));
		
		final ByteArrayInputStream input = new ByteArrayInputStream(bytes);
		assertEquals(0x01020304, EndianUtils.readSwappedInteger(input));
	}
	
	@Test
	public void testAssertThrows_readSwappedInteger_byteArray_dataNull() {
		assertThrows(NullPointerException.class, () -> EndianUtils.readSwappedInteger((byte[]) null, 0));
	}
	
	@Test
	public void testEndianUtils1() {
		byte[] byteArray = new byte[]{ (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
		EndianUtils.writeSwappedInteger(byteArray, 1, (int) '4');
		EndianUtils.writeSwappedFloat(byteArray, 0, (-3.03064E38f));
		long long13 = EndianUtils.readSwappedUnsignedInteger(byteArray, (int) (short) 1);
		EndianUtils.writeSwappedFloat(byteArray, 0, (float) (short) 256);
		try {
			EndianUtils.writeSwappedLong(byteArray, (-65536), (long) 32);
			fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -65536 out of bounds for length 5");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
		assertNotNull(byteArray);
		assertEquals(java.util.Arrays.toString(byteArray), "[0, 0, -128, 67, 0]");
		assertTrue(long13 == 16737280L, "'" + long13 + "' != '" + 16737280L + "'");
	}
	
	@Test
	public void testAssertThrowsMessage_readSwappedShort_byteArray_offsetTooLarge() {
		final ArrayIndexOutOfBoundsException thrown = assertThrows(ArrayIndexOutOfBoundsException.class,
				() -> EndianUtils.readSwappedShort(Scaffolding.bytes(), 7));
		assertEquals("Index 8 out of bounds for length 8", thrown.getMessage());
	}
	
	@Test
	public void testEndianUtils2() {
		byte[] byteArray = new byte[]{ (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
		EndianUtils.writeSwappedInteger(byteArray, 1, (int) '4');
		EndianUtils.writeSwappedShort(byteArray, (int) (short) 0, (short) (byte) 1);
		EndianUtils.writeSwappedFloat(byteArray, (int) (byte) 0, (float) '#');
		EndianUtils.writeSwappedShort(byteArray, 1, (short) 13322);
		Class<?> wildcardClass = byteArray.getClass();
		assertNotNull(byteArray);
		assertEquals(java.util.Arrays.toString(byteArray), "[0, 10, 52, 66, 0]");
		assertNotNull(wildcardClass);
	}
	
	@Test
	public void testAssertThrows_writeSwappedShort_byteArray_dataNull() {
		assertThrows(NullPointerException.class,
				() -> EndianUtils.writeSwappedShort((byte[]) null, 0, Scaffolding.SHORT));
	}
	
	@Test
	public void testWriteSwappedFloat() throws IOException {
		byte[] bytes = new byte[4];
		final float f1 = Float.intBitsToFloat(0x01020304);
		EndianUtils.writeSwappedFloat(bytes, 0, f1);
		assertEquals(0x04, bytes[0]);
		assertEquals(0x03, bytes[1]);
		assertEquals(0x02, bytes[2]);
		assertEquals(0x01, bytes[3]);
		
		final ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
		EndianUtils.writeSwappedFloat(baos, f1);
		bytes = baos.toByteArray();
		assertEquals(0x04, bytes[0]);
		assertEquals(0x03, bytes[1]);
		assertEquals(0x02, bytes[2]);
		assertEquals(0x01, bytes[3]);
	}
}
