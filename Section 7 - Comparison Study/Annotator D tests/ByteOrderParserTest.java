package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.ByteOrder;

import org.junit.jupiter.api.Test;

public class ByteOrderParserTest {
	
	@Test
	public void testParseLittle() {
		assertEquals(ByteOrder.LITTLE_ENDIAN, Scaffolding.parseByteOrder("LITTLE_ENDIAN"));
	}
}
