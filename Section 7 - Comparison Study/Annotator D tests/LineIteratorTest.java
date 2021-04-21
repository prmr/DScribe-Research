package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

public class LineIteratorTest {
	
	@Test
	public void testCloseEarly() throws Exception {
		final String encoding = "UTF-8";
		
		final File testFile = new File(Scaffolding.temporaryFolder, "LineIterator-closeEarly.txt");
		Scaffolding.createLinesFile(testFile, encoding, 3);
		
		final LineIterator iterator = FileUtils.lineIterator(testFile, encoding);
		try {
			assertNotNull("Line expected", iterator.next());
			assertTrue(iterator.hasNext(), "More expected");
			
			iterator.close();
			assertFalse(iterator.hasNext(), "No more expected");
			try {
				iterator.next();
				fail();
			}
			catch (final NoSuchElementException ex) {
			}
			try {
				iterator.nextLine();
				fail();
			}
			catch (final NoSuchElementException ex) {
			}
			
			iterator.close();
			try {
				iterator.next();
				fail();
			}
			catch (final NoSuchElementException ex) {
			}
			try {
				iterator.nextLine();
				fail();
			}
			catch (final NoSuchElementException ex) {
			}
		}
		finally {
			LineIterator.closeQuietly(iterator);
		}
	}
}
