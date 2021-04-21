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
		FileCleaningTracker fileCleaningTracker3 = new FileCleaningTracker();
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
		Class<?> wildcardClass = strList4.getClass();
		FileDeleteStrategy fileDeleteStrategy3 = null;
		fileCleaningTracker0.track("hi!", (Object) wildcardClass, fileDeleteStrategy3);
		fileCleaningTracker0.exitWhenFinished();
		fileCleaningTracker0.exitWhenFinished();
		fileCleaningTracker0.exitWhenFinished();
		int int4 = fileCleaningTracker0.getTrackCount();
		int int5 = fileCleaningTracker0.getTrackCount();
		File file = null;
		FileCleaningTracker fileCleaningTracker6 = new FileCleaningTracker();
		Object obj = null;
		FileDeleteStrategy fileDeleteStrategy4 = null;
		fileCleaningTracker6.track("", obj, fileDeleteStrategy4);
		List<String> strList5 = fileCleaningTracker6.getDeleteFailures();
		int int6 = fileCleaningTracker6.getTrackCount();
		List<String> strList6 = fileCleaningTracker6.getDeleteFailures();
		FileCleaningTracker fileCleaningTracker7 = new FileCleaningTracker();
		FileDeleteStrategy fileDeleteStrategy5 = null;
		fileCleaningTracker7.track("hi!", (Object) (short) 10, fileDeleteStrategy5);
		fileCleaningTracker7.exitWhenFinished();
		int int7 = fileCleaningTracker7.getTrackCount();
		fileCleaningTracker7.exitWhenFinished();
		FileDeleteStrategy fileDeleteStrategy6 = null;
		fileCleaningTracker6.track("hi!", (Object) fileCleaningTracker7, fileDeleteStrategy6);
		FileCleaningTracker fileCleaningTracker8 = new FileCleaningTracker();
		List<String> strList7 = fileCleaningTracker8.getDeleteFailures();
		FileCleaningTracker fileCleaningTracker9 = new org.apache.commons.io.FileCleaningTracker();
		List<String> strList8 = fileCleaningTracker9.getDeleteFailures();
		int int8 = fileCleaningTracker9.getTrackCount();
		FileDeleteStrategy fileDeleteStrategy7 = null;
		fileCleaningTracker8.track("", (Object) fileCleaningTracker9, fileDeleteStrategy7);
		FileDeleteStrategy fileDeleteStrategy8 = null;
		fileCleaningTracker9.track("hi!", (Object) (-1), fileDeleteStrategy8);
		fileCleaningTracker9.track("", (Object) 0);
		int int9 = fileCleaningTracker9.getTrackCount();
		List<String> strList9 = fileCleaningTracker9.getDeleteFailures();
		List<String> strList10 = fileCleaningTracker9.getDeleteFailures();
		FileDeleteStrategy fileDeleteStrategy9 = null;
		fileCleaningTracker6.track("hi!", (Object) strList10, fileDeleteStrategy9);
		fileCleaningTracker6.exitWhenFinished();
		try {
			fileCleaningTracker0.track(file, (Object) fileCleaningTracker6);
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
		assertNotNull(wildcardClass);
		assertTrue(int4 == 3, "'" + int4 + "' != '" + 3 + "'");
		assertTrue(int5 == 3, "'" + int5 + "' != '" + 3 + "'");
		assertNotNull(strList5);
		assertTrue(int6 == 1, "'" + int6 + "' != '" + 1 + "'");
		assertNotNull(strList6);
		assertTrue(int7 == 1, "'" + int7 + "' != '" + 1 + "'");
		assertNotNull(strList7);
		assertNotNull(strList8);
		assertTrue(int8 == 0, "'" + int8 + "' != '" + 0 + "'");
		assertTrue(int9 == 2, "'" + int9 + "' != '" + 2 + "'");
		assertNotNull(strList9);
		assertNotNull(strList10);
	}
}
