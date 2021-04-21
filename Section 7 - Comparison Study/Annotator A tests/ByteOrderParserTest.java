package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.ByteOrder;

import org.junit.jupiter.api.Test;

public class ByteOrderParserTest {
	
	@Test
	public void testParseByteOrder() {
		ByteOrder byteOrder = ByteOrderParser.parseByteOrder("LITTLE_ENDIAN");
		assertEquals("LITTLE_ENDIAN", byteOrder.toString());
	}
}
