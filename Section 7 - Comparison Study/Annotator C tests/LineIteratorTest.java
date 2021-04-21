package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;

import org.junit.jupiter.api.Test;

public class LineIteratorTest {
	
	@Test
	public void testValidEncoding() throws Exception {
		final String encoding = "UTF-8";
		
		final File testFile = new File(Scaffolding.temporaryFolder, "LineIterator-validEncoding.txt");
		Scaffolding.createLinesFile(testFile, encoding, 3);
		
		final LineIterator iterator = FileUtils.lineIterator(testFile, encoding);
		try {
			int count = 0;
			while (iterator.hasNext()) {
				assertNotNull(iterator.next());
				count++;
			}
			assertEquals(3, count);
		}
		finally {
			LineIterator.closeQuietly(iterator);
		}
	}
	
	@Test
	public void testConstructor() throws Exception {
		try {
			new LineIterator(null);
			fail();
		}
		catch (final IllegalArgumentException ex) {
		}
	}
}
