package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class EndianUtilsTest {
	
	@Test
	public void testReadSwappedUnsignedShort1() throws Throwable {
		byte[] byteArray = new byte[14];
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray, (byte) 3, (byte) 3);
		int int0 = EndianUtils.readSwappedUnsignedShort((InputStream) byteArrayInputStream);
		assertEquals(0, int0);
	}
	
	@Test
	public void testEndianUtils1() {
		byte[] byteArray = new byte[]{ (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
		EndianUtils.writeSwappedInteger(byteArray, 1, (int) '4');
		EndianUtils.writeSwappedShort(byteArray, (int) (short) 0, (short) (byte) 1);
		EndianUtils.writeSwappedFloat(byteArray, (int) (short) 1, 4.6006E-41f);
		float float0 = EndianUtils.readSwappedFloat(byteArray, 0);
		float float1 = EndianUtils.readSwappedFloat(byteArray, (int) (short) 0);
		try {
			long long0 = EndianUtils.readSwappedLong(byteArray, (int) (short) 13322);
			fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 5");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[1, 63, -128, 0, 0]");
		assertTrue(float0 == 1.1777545E-38f, "'" + float0 + "' != '" + 1.1777545E-38f + "'");
		assertTrue(float1 == 1.1777545E-38f, "'" + float1 + "' != '" + 1.1777545E-38f + "'");
	}
	
	@Test
	public void testEndianUtils2() {
		byte[] byteArray = new byte[]{ (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
		EndianUtils.writeSwappedInteger(byteArray, 1, (int) '4');
		float float0 = EndianUtils.readSwappedFloat(byteArray, 0);
		short short0 = EndianUtils.readSwappedShort(byteArray, 0);
		EndianUtils.writeSwappedFloat(byteArray, 0, (float) 7205759403792793600L);
		long long0 = EndianUtils.readSwappedUnsignedInteger(byteArray, 0);
		int int0 = EndianUtils.readSwappedInteger(byteArray, 0);
		try {
			long long1 = EndianUtils.readSwappedLong(byteArray, 16803071);
			fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16803071 out of bounds for length 5");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[0, 0, -56, 94, 0]");
		assertTrue(float0 == 1.8668E-41f, "'" + float0 + "' != '" + 1.8668E-41f + "'");
		assertTrue(short0 == (short) 13322, "'" + short0 + "' != '" + (short) 13322 + "'");
		assertTrue(long0 == 1590165504L, "'" + long0 + "' != '" + 1590165504L + "'");
		assertTrue(int0 == 1590165504, "'" + int0 + "' != '" + 1590165504 + "'");
	}
	
	@Test
	public void testEndianUtils3() {
		byte[] byteArray = new byte[]{ (byte) 100, (byte) 100 };
		EndianUtils.writeSwappedShort(byteArray, (int) (short) 0, (short) (byte) 0);
		try {
			EndianUtils.writeSwappedFloat(byteArray, 1677721600, (float) 283467841536L);
			fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[0, 0]");
	}
	
	@Test
	public void testAssertThrowsMessage_readSwappedDouble_byteArray_offsetNegative() {
		final ArrayIndexOutOfBoundsException thrown = assertThrows(ArrayIndexOutOfBoundsException.class,
				() -> EndianUtils.readSwappedDouble(Scaffolding.bytes(), -1));
		assertEquals("Index -1 out of bounds for length 8", thrown.getMessage());
	}
	
	@Test
	public void testEndianUtils4() {
		byte[] byteArray = new byte[]{ (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
		EndianUtils.writeSwappedInteger(byteArray, 1, (int) '4');
		EndianUtils.writeSwappedFloat(byteArray, 0, (-3.03064E38f));
		long long0 = EndianUtils.readSwappedUnsignedInteger(byteArray, (int) (short) 1);
		EndianUtils.writeSwappedFloat(byteArray, 0, (float) (short) 256);
		try {
			EndianUtils.writeSwappedFloat(byteArray, 52, (float) (-61572651155456L));
			fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[0, 0, -128, 67, 0]");
		assertTrue(long0 == 16737280L, "'" + long0 + "' != '" + 16737280L + "'");
	}
	
	@Test
	public void testSwapShort() {
		short short0 = EndianUtils.swapShort((short) (-1));
		assertEquals((short) (-1), short0);
	}
	
	@Test
	public void testReadSwappedUnsignedShort2() throws IOException {
		final byte[] bytes = new byte[]{ 0x02, 0x01 };
		assertEquals(0x00000102, EndianUtils.readSwappedUnsignedShort(bytes, 0));
		
		final ByteArrayInputStream input = new ByteArrayInputStream(bytes);
		assertEquals(0x00000102, EndianUtils.readSwappedUnsignedShort(input));
	}
	
	@Test
	public void testReadSwappedFloat() {
		byte[] byteArray = new byte[5];
		float float0 = EndianUtils.readSwappedFloat(byteArray, (int) (byte) 0);
		assertEquals(0.0F, float0, 0.01F);
	}
}
