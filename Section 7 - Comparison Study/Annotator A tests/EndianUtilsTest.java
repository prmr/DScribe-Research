package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class EndianUtilsTest {
	
	@Test
	public void testEOFException() throws IOException {
		final ByteArrayInputStream input = new ByteArrayInputStream(new byte[]{});
		try {
			EndianUtils.readSwappedDouble(input);
			fail("Expected EOFException");
		}
		catch (final EOFException e) {
		}
	}
	
	@Test
	public void testWriteSwappedInteger() throws IOException {
		byte[] bytes = new byte[4];
		EndianUtils.writeSwappedInteger(bytes, 0, 0x01020304);
		assertEquals(0x04, bytes[0]);
		assertEquals(0x03, bytes[1]);
		assertEquals(0x02, bytes[2]);
		assertEquals(0x01, bytes[3]);
		
		final ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
		EndianUtils.writeSwappedInteger(baos, 0x01020304);
		bytes = baos.toByteArray();
		assertEquals(0x04, bytes[0]);
		assertEquals(0x03, bytes[1]);
		assertEquals(0x02, bytes[2]);
		assertEquals(0x01, bytes[3]);
	}
	
	@Test
	public void testEndianUtils1() {
		byte[] byteArray = new byte[]{ (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
		long long0 = EndianUtils.readSwappedUnsignedInteger(byteArray, 0);
		EndianUtils.writeSwappedFloat(byteArray, (int) (short) 0, (float) ' ');
		EndianUtils.writeSwappedShort(byteArray, (int) (byte) 1, (short) 25600);
		try {
			short short0 = EndianUtils.readSwappedShort(byteArray, (int) (byte) 10);
			fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[0, 0, 100, 66]");
		assertTrue(long0 == 4284743681L, "'" + long0 + "' != '" + 4284743681L + "'");
	}
	
	@Test
	public void testEndianUtils2() {
		byte[] byteArray = new byte[]{ (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
		EndianUtils.writeSwappedInteger(byteArray, 1, (int) '4');
		EndianUtils.writeSwappedShort(byteArray, (int) (short) 0, (short) (byte) 1);
		EndianUtils.writeSwappedFloat(byteArray, (int) (byte) 0, (float) '#');
		EndianUtils.writeSwappedFloat(byteArray, 1, (float) 100);
		short short0 = EndianUtils.readSwappedShort(byteArray, (int) (byte) 1);
		try {
			short short1 = EndianUtils.readSwappedShort(byteArray, 16129);
			fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16129 out of bounds for length 5");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[0, 0, 0, -56, 66]");
		assertTrue(short0 == (short) 0, "'" + short0 + "' != '" + (short) 0 + "'");
	}
	
	@Test
	public void testReadSwappedInteger() {
		byte[] byteArray = new byte[]{ (byte) 1, (byte) 0 };
		try {
			int int0 = EndianUtils.readSwappedInteger(byteArray, (int) (byte) 0);
			fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[1, 0]");
	}
	
	@Test
	public void testAssertThrows_writeSwappedDouble_byteArray_dataNull() {
		assertThrows(NullPointerException.class,
				() -> EndianUtils.writeSwappedDouble((byte[]) null, 0, Scaffolding.DOUBLE));
	}
	
	@Test
	public void testAssertThrowsMessage_writeSwappedShort_byteArray_offsetNegative() {
		final ArrayIndexOutOfBoundsException thrown = assertThrows(ArrayIndexOutOfBoundsException.class,
				() -> EndianUtils.writeSwappedShort(Scaffolding.bytes(), -1, Scaffolding.SHORT));
		assertEquals("Index -1 out of bounds for length 8", thrown.getMessage());
	}
}
