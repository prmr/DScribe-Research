package org.apache.commons.io;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ByteOrderMarkTest {
	
	@Test
	public void testByteOrderMark() {
		int[] intArray = new int[2];
		ByteOrderMark byteOrderMark = new ByteOrderMark("o*?gVp+g$p\u0007", intArray);
		String string = byteOrderMark.UTF_16LE.toString();
		assertEquals("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", string);
	}
}
