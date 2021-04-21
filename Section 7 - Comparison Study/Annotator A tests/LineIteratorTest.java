package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.Reader;

import org.junit.jupiter.api.Test;

public class LineIteratorTest {
	
	@Test
	public void testThreeLines() throws Exception {
		Scaffolding.doTestFileWithSpecifiedLines(3);
	}
	
	@Test
	public void testConstructor() throws Throwable {
		LineIterator lineIterator = null;
		try {
			lineIterator = new LineIterator((Reader) null);
			fail("Expecting exception: IllegalArgumentException");
		}
		catch (IllegalArgumentException e) {
			Scaffolding.verifyException("org.apache.commons.io.LineIterator", e);
		}
	}
}
