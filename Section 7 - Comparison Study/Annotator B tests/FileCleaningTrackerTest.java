package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FileCleaningTrackerTest {
	
	@Test
	public void testFileCleaningTracker() {
		FileCleaningTracker fileCleaningTracker0 = new FileCleaningTracker();
		List<String> strList0 = fileCleaningTracker0.getDeleteFailures();
		FileCleaningTracker fileCleaningTracker1 = new FileCleaningTracker();
		List<String> strList1 = fileCleaningTracker1.getDeleteFailures();
		int int0 = fileCleaningTracker1.getTrackCount();
		FileDeleteStrategy fileDeleteStrategy0 = null;
		fileCleaningTracker0.track("", (Object) fileCleaningTracker1, fileDeleteStrategy0);
		FileCleaningTracker fileCleaningTracker2 = new FileCleaningTracker();
		List<String> strList2 = fileCleaningTracker2.getDeleteFailures();
		FileCleaningTracker fileCleaningTracker3 = new org.apache.commons.io.FileCleaningTracker();
		List<String> strList3 = fileCleaningTracker3.getDeleteFailures();
		int int1 = fileCleaningTracker3.getTrackCount();
		FileDeleteStrategy fileDeleteStrategy1 = null;
		fileCleaningTracker2.track("", (Object) fileCleaningTracker3, fileDeleteStrategy1);
		FileCleaningTracker fileCleaningTracker4 = new FileCleaningTracker();
		FileDeleteStrategy fileDeleteStrategy2 = null;
		fileCleaningTracker4.track("hi!", (Object) (short) 10, fileDeleteStrategy2);
		fileCleaningTracker4.exitWhenFinished();
		int int2 = fileCleaningTracker4.getTrackCount();
		fileCleaningTracker2.track("hi!", (Object) fileCleaningTracker4);
		fileCleaningTracker0.track("", (Object) fileCleaningTracker2);
		int int3 = fileCleaningTracker0.getTrackCount();
		FileCleaningTracker fileCleaningTracker5 = new FileCleaningTracker();
		List<String> strList4 = fileCleaningTracker5.getDeleteFailures();
		FileCleaningTracker fileCleaningTracker6 = new FileCleaningTracker();
		List<String> strList5 = fileCleaningTracker6.getDeleteFailures();
		int int4 = fileCleaningTracker6.getTrackCount();
		FileDeleteStrategy fileDeleteStrategy3 = null;
		fileCleaningTracker5.track("", (Object) fileCleaningTracker6, fileDeleteStrategy3);
		FileCleaningTracker fileCleaningTracker7 = new FileCleaningTracker();
		FileDeleteStrategy fileDeleteStrategy4 = null;
		fileCleaningTracker7.track("hi!", (Object) (short) 10, fileDeleteStrategy4);
		fileCleaningTracker7.exitWhenFinished();
		int int5 = fileCleaningTracker7.getTrackCount();
		fileCleaningTracker7.exitWhenFinished();
		FileDeleteStrategy fileDeleteStrategy5 = null;
		fileCleaningTracker6.track("hi!", (Object) fileCleaningTracker7, fileDeleteStrategy5);
		Class<?> wildcardClass = fileCleaningTracker7.getClass();
		fileCleaningTracker0.track("", (Object) fileCleaningTracker7);
		List<String> strList6 = fileCleaningTracker0.getDeleteFailures();
		FileCleaningTracker fileCleaningTracker8 = new FileCleaningTracker();
		List<String> strList7 = fileCleaningTracker8.getDeleteFailures();
		List<String> strList8 = fileCleaningTracker8.getDeleteFailures();
		FileDeleteStrategy fileDeleteStrategy6 = null;
		fileCleaningTracker8.track("hi!", (Object) (byte) 10, fileDeleteStrategy6);
		fileCleaningTracker8.track("", (Object) (-1));
		fileCleaningTracker0.track("", (Object) (-1));
		int int6 = fileCleaningTracker0.getTrackCount();
		fileCleaningTracker0.exitWhenFinished();
		File file = null;
		FileCleaningTracker fileCleaningTracker9 = new FileCleaningTracker();
		List<String> strList9 = fileCleaningTracker9.getDeleteFailures();
		FileCleaningTracker fileCleaningTracker10 = new FileCleaningTracker();
		List<String> strList10 = fileCleaningTracker10.getDeleteFailures();
		int int7 = fileCleaningTracker10.getTrackCount();
		FileDeleteStrategy fileDeleteStrategy7 = null;
		fileCleaningTracker9.track("", (Object) fileCleaningTracker10, fileDeleteStrategy7);
		FileDeleteStrategy fileDeleteStrategy8 = null;
		fileCleaningTracker10.track("hi!", (Object) (-1), fileDeleteStrategy8);
		List<String> strList11 = fileCleaningTracker10.getDeleteFailures();
		try {
			fileCleaningTracker0.track(file, (java.lang.Object) strList11);
			fail("Expected exception of type java.lang.NullPointerException; message: file");
		}
		catch (NullPointerException e) {
		}
		assertNotNull(strList0);
		assertNotNull(strList1);
		assertTrue(int0 == 0, "'" + int0 + "' != '" + 0 + "'");
		assertNotNull(strList2);
		assertNotNull(strList3);
		assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
		assertTrue(int2 == 1, "'" + int2 + "' != '" + 1 + "'");
		assertTrue(int3 == 2, "'" + int3 + "' != '" + 2 + "'");
		assertNotNull(strList4);
		assertNotNull(strList5);
		assertTrue(int4 == 0, "'" + int4 + "' != '" + 0 + "'");
		assertTrue(int5 == 1, "'" + int5 + "' != '" + 1 + "'");
		assertNotNull(wildcardClass);
		assertNotNull(strList6);
		assertNotNull(strList7);
		assertNotNull(strList8);
		assertTrue(int6 == 4, "'" + int6 + "' != '" + 4 + "'");
		assertNotNull(strList9);
		assertNotNull(strList10);
		assertTrue(int7 == 0, "'" + int7 + "' != '" + 0 + "'");
		assertNotNull(strList11);
	}
}
