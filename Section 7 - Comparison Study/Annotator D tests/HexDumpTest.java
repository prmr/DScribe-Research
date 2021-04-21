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
		byte[] byteArray = new byte[]{ (byte) 100 };
		OutputStream outputStream = null;
		try {
			HexDump.dump(byteArray, (long) (byte) 1, outputStream, (-1));
			fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: illegal index: -1 into array of length 1");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[100]");
	}
	
	@Test
	public void testDump2() throws Throwable {
		byte[] byteArray = new byte[]{ (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
		OutputStream outputStream = null;
		try {
			HexDump.dump(byteArray, (long) (short) 1, outputStream, (int) (short) 0);
			fail("Expected exception of type java.lang.IllegalArgumentException; message: cannot write to nullstream");
		}
		catch (IllegalArgumentException e) {
		}
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[-1, 10, -1, 1, -1, -1]");
	}
	
	@Test
	public void testDump3() throws Throwable {
		byte[] byteArray = new byte[]{ (byte) 1, (byte) 10, (byte) 100, (byte) -1 };
		OutputStream outputStream = null;
		try {
			HexDump.dump(byteArray, 0L, outputStream, 0);
			fail("Expected exception of type java.lang.IllegalArgumentException; message: cannot write to nullstream");
		}
		catch (IllegalArgumentException e) {
		}
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[1, 10, 100, -1]");
	}
	
	@Test
	public void testDump4() throws Throwable {
		byte[] byteArray = new byte[]{ (byte) -1, (byte) 100, (byte) 1, (byte) -1 };
		OutputStream outputStream = null;
		try {
			HexDump.dump(byteArray, (long) 100, outputStream, 1);
			fail("Expected exception of type java.lang.IllegalArgumentException; message: cannot write to nullstream");
		}
		catch (IllegalArgumentException e) {
		}
		assertNotNull(byteArray);
		assertEquals(Arrays.toString(byteArray), "[-1, 100, 1, -1]");
	}
}
