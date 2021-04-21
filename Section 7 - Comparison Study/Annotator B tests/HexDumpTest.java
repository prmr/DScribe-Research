package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.OutputStream;

import org.junit.jupiter.api.Test;

public class HexDumpTest {
	
	@Test
	public void testDump1() throws Throwable {
		byte[] byteArray = new byte[17];
		byteArray[9] = (byte) 127;
		OutputStream outputStream = OutputStream.nullOutputStream();
		HexDump.dump(byteArray, (byte) 127, outputStream, (byte) 4);
		assertEquals(17, byteArray.length);
	}

	@Test
	public void testDump2() throws Throwable {
		byte[] byteArray = null;
		OutputStream outputStream = null;
		try {
			HexDump.dump(byteArray, (long) (byte) 1, outputStream, (int) (byte) 1);
			fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"data\" is null");
		}
		catch (NullPointerException e) {
		}
	}
}
