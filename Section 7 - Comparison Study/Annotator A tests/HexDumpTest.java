package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.OutputStream;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class HexDumpTest {
	
	@Test
	public void testDump1() throws Throwable {
		byte[] byteArray = new byte[]{ (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 0 };
		OutputStream outputStream = null;
		try {
			HexDump.dump(byteArray, 0L, outputStream, (int) (byte) -1);
			fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: illegal index: -1 into array of length 6");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[1, 10, -1, 100, 0, 0]");
	}

	@Test
	public void testDump2() throws Throwable {
		byte[] byteArray = new byte[]{ (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) -1 };
		OutputStream outputStream = null;
		try {
			HexDump.dump(byteArray, (long) (short) 10, outputStream, (int) (short) 10);
			fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: illegal index: 10 into array of length 5");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[10, 10, 10, 100, -1]");
	}
	
	@Test
	public void testDump3() throws Throwable {
		byte[] byteArray = new byte[]{ (byte) 100, (byte) -1, (byte) 100, (byte) 1, (byte) 0 };
		OutputStream outputStream = null;
		try {
			HexDump.dump(byteArray, (long) (byte) 10, outputStream, (int) (short) 0);
			fail("Expected exception of type java.lang.IllegalArgumentException; message: cannot write to nullstream");
		}
		catch (IllegalArgumentException e) {
		}
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[100, -1, 100, 1, 0]");
	}
	
	@Test
	public void testDump4() throws Throwable {
		byte[] byteArray = new byte[]{ (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 100, (byte) -1 };
		OutputStream outputStream = null;
		try {
			HexDump.dump(byteArray, (long) '4', outputStream, (int) '4');
			fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: illegal index: 52 into array of length 6");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[100, 1, 10, 100, 100, -1]");
	}
}
