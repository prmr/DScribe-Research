package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.Scaffolding.MockFile;
import org.junit.jupiter.api.Test;

public class FileCleaningTrackerTest {
	
	@Test
	public void testFileCleanerDirectory_ForceStrategy() throws Exception {
		if (!Scaffolding.testFile.getParentFile().exists()) {
			throw new IOException(
					"Cannot create file " + Scaffolding.testFile + " as the parent directory does not exist");
		}
		try (final BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(Scaffolding.testFile))) {
			Scaffolding.generateTestData(output, 100);
		}
		assertTrue(Scaffolding.testFile.exists());
		assertTrue(Scaffolding.temporaryFolder.exists());
		
		Object obj = new Object();
		assertEquals(0, Scaffolding.theInstance.getTrackCount());
		Scaffolding.theInstance.track(Scaffolding.temporaryFolder, obj, FileDeleteStrategy.FORCE);
		assertEquals(1, Scaffolding.theInstance.getTrackCount());
		
		obj = null;
		
		Scaffolding.waitUntilTrackCount();
		Scaffolding.pauseForDeleteToComplete(Scaffolding.testFile.getParentFile());
		
		assertEquals(0, Scaffolding.theInstance.getTrackCount());
		assertEquals(false, new File(Scaffolding.testFile.getPath()).exists(), Scaffolding.showFailures());
		assertEquals(false, Scaffolding.testFile.getParentFile().exists(), Scaffolding.showFailures());
	}
	
	@Test
	public void testFileCleaningTracker1() {
		FileCleaningTracker fileCleaningTracker0 = new FileCleaningTracker();
		Object obj = null;
		FileDeleteStrategy fileDeleteStrategy0 = null;
		fileCleaningTracker0.track("", obj, fileDeleteStrategy0);
		fileCleaningTracker0.track("", (Object) 0);
		List<String> strList0 = fileCleaningTracker0.getDeleteFailures();
		fileCleaningTracker0.exitWhenFinished();
		int int0 = fileCleaningTracker0.getTrackCount();
		FileCleaningTracker fileCleaningTracker1 = new FileCleaningTracker();
		List<String> strList1 = fileCleaningTracker1.getDeleteFailures();
		FileCleaningTracker fileCleaningTracker2 = new FileCleaningTracker();
		List<String> strList2 = fileCleaningTracker2.getDeleteFailures();
		int int1 = fileCleaningTracker2.getTrackCount();
		FileDeleteStrategy fileDeleteStrategy1 = null;
		fileCleaningTracker1.track("", (Object) fileCleaningTracker2, fileDeleteStrategy1);
		FileCleaningTracker fileCleaningTracker3 = new FileCleaningTracker();
		FileDeleteStrategy fileDeleteStrategy2 = null;
		fileCleaningTracker3.track("hi!", (Object) (short) 10, fileDeleteStrategy2);
		fileCleaningTracker3.exitWhenFinished();
		int int2 = fileCleaningTracker3.getTrackCount();
		fileCleaningTracker3.exitWhenFinished();
		FileDeleteStrategy fileDeleteStrategy3 = null;
		fileCleaningTracker2.track("hi!", (Object) fileCleaningTracker3, fileDeleteStrategy3);
		FileCleaningTracker fileCleaningTracker4 = new FileCleaningTracker();
		List<String> strList3 = fileCleaningTracker4.getDeleteFailures();
		FileCleaningTracker fileCleaningTracker5 = new FileCleaningTracker();
		List<String> strList4 = fileCleaningTracker5.getDeleteFailures();
		int int3 = fileCleaningTracker5.getTrackCount();
		FileDeleteStrategy fileDeleteStrategy4 = null;
		fileCleaningTracker4.track("", (Object) fileCleaningTracker5, fileDeleteStrategy4);
		FileDeleteStrategy fileDeleteStrategy5 = null;
		fileCleaningTracker5.track("hi!", (Object) (-1), fileDeleteStrategy5);
		List<String> strList5 = fileCleaningTracker5.getDeleteFailures();
		fileCleaningTracker2.track("", (Object) fileCleaningTracker5);
		List<String> strList6 = fileCleaningTracker5.getDeleteFailures();
		Class<?> wildcardClass = strList6.getClass();
		try {
			fileCleaningTracker0.track("", (Object) strList6);
			fail("Expected exception of type java.lang.IllegalStateException; message: No new trackers can be added once exitWhenFinished() is called");
		}
		catch (IllegalStateException e) {
		}
		assertNotNull(strList0);
		assertTrue(int0 == 2, "'" + int0 + "' != '" + 2 + "'");
		assertNotNull(strList1);
		assertNotNull(strList2);
		assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
		assertTrue(int2 == 1, "'" + int2 + "' != '" + 1 + "'");
		assertNotNull(strList3);
		assertNotNull(strList4);
		assertTrue(int3 == 0, "'" + int3 + "' != '" + 0 + "'");
		assertNotNull(strList5);
		assertNotNull(strList6);
		assertNotNull(wildcardClass);
	}
	
	@Test
	public void testFileCleaningTracker2() {
		FileCleaningTracker fileCleaningTracker0 = new FileCleaningTracker();
		List<String> strList0 = fileCleaningTracker0.getDeleteFailures();
		FileCleaningTracker fileCleaningTracker1 = new FileCleaningTracker();
		List<String> strList1 = fileCleaningTracker1.getDeleteFailures();
		int int0 = fileCleaningTracker1.getTrackCount();
		FileDeleteStrategy fileDeleteStrategy0 = null;
		fileCleaningTracker0.track("", (Object) fileCleaningTracker1, fileDeleteStrategy0);
		FileDeleteStrategy fileDeleteStrategy1 = null;
		fileCleaningTracker1.track("hi!", (Object) (-1), fileDeleteStrategy1);
		List<String> strList2 = fileCleaningTracker1.getDeleteFailures();
		FileCleaningTracker fileCleaningTracker2 = new FileCleaningTracker();
		Object obj = null;
		FileDeleteStrategy fileDeleteStrategy2 = null;
		fileCleaningTracker2.track("", obj, fileDeleteStrategy2);
		List<String> strList3 = fileCleaningTracker2.getDeleteFailures();
		fileCleaningTracker1.track("hi!", (Object) fileCleaningTracker2);
		FileCleaningTracker fileCleaningTracker3 = new FileCleaningTracker();
		List<String> strList4 = fileCleaningTracker3.getDeleteFailures();
		List<String> strList5 = fileCleaningTracker3.getDeleteFailures();
		FileCleaningTracker fileCleaningTracker4 = new FileCleaningTracker();
		List<String> strList6 = fileCleaningTracker4.getDeleteFailures();
		FileCleaningTracker fileCleaningTracker5 = new FileCleaningTracker();
		List<String> strList7 = fileCleaningTracker5.getDeleteFailures();
		int int1 = fileCleaningTracker5.getTrackCount();
		FileDeleteStrategy fileDeleteStrategy3 = null;
		fileCleaningTracker4.track("", (Object) fileCleaningTracker5, fileDeleteStrategy3);
		FileDeleteStrategy fileDeleteStrategy4 = null;
		fileCleaningTracker5.track("hi!", (Object) (-1), fileDeleteStrategy4);
		List<String> strList8 = fileCleaningTracker5.getDeleteFailures();
		FileCleaningTracker fileCleaningTracker6 = new FileCleaningTracker();
		List<String> strList9 = fileCleaningTracker6.getDeleteFailures();
		Class<?> wildcardClass0 = strList9.getClass();
		FileDeleteStrategy fileDeleteStrategy5 = null;
		fileCleaningTracker5.track("", (Object) wildcardClass0, fileDeleteStrategy5);
		fileCleaningTracker5.track("hi!", (Object) 'a');
		Class<?> wildcardClass1 = fileCleaningTracker5.getClass();
		fileCleaningTracker3.track("", (Object) fileCleaningTracker5);
		FileDeleteStrategy fileDeleteStrategy6 = null;
		fileCleaningTracker1.track("hi!", (Object) fileCleaningTracker3, fileDeleteStrategy6);
		List<String> strList10 = fileCleaningTracker3.getDeleteFailures();
		Class<?> wildcardClass2 = fileCleaningTracker3.getClass();
		assertNotNull(strList0);
		assertNotNull(strList1);
		assertTrue(int0 == 0, "'" + int0 + "' != '" + 0 + "'");
		assertNotNull(strList2);
		assertNotNull(strList3);
		assertNotNull(strList4);
		assertNotNull(strList5);
		assertNotNull(strList6);
		assertNotNull(strList7);
		assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
		assertNotNull(strList8);
		assertNotNull(strList9);
		assertNotNull(wildcardClass0);
		assertNotNull(wildcardClass1);
		assertNotNull(strList10);
		assertNotNull(wildcardClass2);
	}
	
	@Test
	public void testTrack() {
		FileCleaningTracker fileCleaningTracker = new FileCleaningTracker();
		MockFile mockFile = new MockFile("", "23q/8(Sl=_DLg");
		fileCleaningTracker.track((File) mockFile, (Object) "");
		assertFalse(mockFile.isHidden());
	}
	
	@Test
	public void testFileCleaningTracker3() {
		FileCleaningTracker fileCleaningTracker0 = new FileCleaningTracker();
		List<String> strList0 = fileCleaningTracker0.getDeleteFailures();
		FileCleaningTracker fileCleaningTracker1 = new FileCleaningTracker();
		List<String> strList1 = fileCleaningTracker1.getDeleteFailures();
		int int0 = fileCleaningTracker1.getTrackCount();
		FileDeleteStrategy fileDeleteStrategy0 = null;
		fileCleaningTracker0.track("", (Object) fileCleaningTracker1, fileDeleteStrategy0);
		FileCleaningTracker fileCleaningTracker2 = new FileCleaningTracker();
		FileDeleteStrategy fileDeleteStrategy1 = null;
		fileCleaningTracker2.track("hi!", (Object) (short) 10, fileDeleteStrategy1);
		fileCleaningTracker2.exitWhenFinished();
		int int1 = fileCleaningTracker2.getTrackCount();
		fileCleaningTracker2.exitWhenFinished();
		FileDeleteStrategy fileDeleteStrategy2 = null;
		fileCleaningTracker1.track("hi!", (Object) fileCleaningTracker2, fileDeleteStrategy2);
		FileCleaningTracker fileCleaningTracker3 = new FileCleaningTracker();
		List<String> strList2 = fileCleaningTracker3.getDeleteFailures();
		FileCleaningTracker fileCleaningTracker4 = new FileCleaningTracker();
		List<String> strList3 = fileCleaningTracker4.getDeleteFailures();
		int int2 = fileCleaningTracker4.getTrackCount();
		FileDeleteStrategy fileDeleteStrategy3 = null;
		fileCleaningTracker3.track("", (Object) fileCleaningTracker4, fileDeleteStrategy3);
		FileDeleteStrategy fileDeleteStrategy4 = null;
		fileCleaningTracker4.track("hi!", (Object) (-1), fileDeleteStrategy4);
		List<String> strList4 = fileCleaningTracker4.getDeleteFailures();
		fileCleaningTracker1.track("", (Object) fileCleaningTracker4);
		int int3 = fileCleaningTracker1.getTrackCount();
		int int4 = fileCleaningTracker1.getTrackCount();
		FileCleaningTracker fileCleaningTracker5 = new FileCleaningTracker();
		List<String> strList5 = fileCleaningTracker5.getDeleteFailures();
		FileCleaningTracker fileCleaningTracker6 = new FileCleaningTracker();
		List<String> strList6 = fileCleaningTracker6.getDeleteFailures();
		int int5 = fileCleaningTracker6.getTrackCount();
		FileDeleteStrategy fileDeleteStrategy5 = null;
		fileCleaningTracker5.track("", (Object) fileCleaningTracker6, fileDeleteStrategy5);
		FileDeleteStrategy fileDeleteStrategy6 = null;
		fileCleaningTracker6.track("hi!", (Object) (-1), fileDeleteStrategy6);
		List<String> strList7 = fileCleaningTracker6.getDeleteFailures();
		int int6 = fileCleaningTracker6.getTrackCount();
		FileCleaningTracker fileCleaningTracker7 = new FileCleaningTracker();
		List<String> strList8 = fileCleaningTracker7.getDeleteFailures();
		FileCleaningTracker fileCleaningTracker8 = new FileCleaningTracker();
		List<String> strList9 = fileCleaningTracker8.getDeleteFailures();
		int int7 = fileCleaningTracker8.getTrackCount();
		FileDeleteStrategy fileDeleteStrategy7 = null;
		fileCleaningTracker7.track("", (Object) fileCleaningTracker8, fileDeleteStrategy7);
		FileCleaningTracker fileCleaningTracker9 = new FileCleaningTracker();
		FileDeleteStrategy fileDeleteStrategy8 = null;
		fileCleaningTracker9.track("hi!", (Object) (short) 10, fileDeleteStrategy8);
		fileCleaningTracker9.exitWhenFinished();
		int int8 = fileCleaningTracker9.getTrackCount();
		fileCleaningTracker7.track("hi!", (Object) fileCleaningTracker9);
		FileDeleteStrategy fileDeleteStrategy9 = null;
		fileCleaningTracker6.track("hi!", (Object) "hi!", fileDeleteStrategy9);
		fileCleaningTracker6.exitWhenFinished();
		List<String> strList10 = fileCleaningTracker6.getDeleteFailures();
		FileDeleteStrategy fileDeleteStrategy10 = null;
		fileCleaningTracker1.track("", (Object) strList10, fileDeleteStrategy10);
		int int9 = fileCleaningTracker1.getTrackCount();
		List<String> strList11 = fileCleaningTracker1.getDeleteFailures();
		FileCleaningTracker fileCleaningTracker10 = new FileCleaningTracker();
		FileDeleteStrategy fileDeleteStrategy11 = null;
		fileCleaningTracker10.track("hi!", (Object) (short) 10, fileDeleteStrategy11);
		fileCleaningTracker10.exitWhenFinished();
		fileCleaningTracker10.exitWhenFinished();
		List<String> strList12 = fileCleaningTracker10.getDeleteFailures();
		List<String> strList13 = fileCleaningTracker10.getDeleteFailures();
		List<String> strList14 = fileCleaningTracker10.getDeleteFailures();
		List<String> strList15 = fileCleaningTracker10.getDeleteFailures();
		fileCleaningTracker1.track("", (Object) strList15);
		fileCleaningTracker1.exitWhenFinished();
		List<String> strList16 = fileCleaningTracker1.getDeleteFailures();
		assertNotNull(strList0);
		assertNotNull(strList1);
		assertTrue(int0 == 0, "'" + int0 + "' != '" + 0 + "'");
		assertTrue(int1 == 1, "'" + int1 + "' != '" + 1 + "'");
		assertNotNull(strList2);
		assertNotNull(strList3);
		assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
		assertNotNull(strList4);
		assertTrue(int3 == 2, "'" + int3 + "' != '" + 2 + "'");
		assertTrue(int4 == 2, "'" + int4 + "' != '" + 2 + "'");
		assertNotNull(strList5);
		assertNotNull(strList6);
		assertTrue(int5 == 0, "'" + int5 + "' != '" + 0 + "'");
		assertNotNull(strList7);
		assertTrue(int6 == 1, "'" + int6 + "' != '" + 1 + "'");
		assertNotNull(strList8);
		assertNotNull(strList9);
		assertTrue(int7 == 0, "'" + int7 + "' != '" + 0 + "'");
		assertTrue(int8 == 1, "'" + int8 + "' != '" + 1 + "'");
		assertNotNull(strList10);
		assertTrue(int9 == 3, "'" + int9 + "' != '" + 3 + "'");
		assertNotNull(strList11);
		assertNotNull(strList12);
		assertNotNull(strList13);
		assertNotNull(strList14);
		assertNotNull(strList15);
		assertNotNull(strList16);
	}
	
	@Test
	public void testFileCleaningTracker4() {
		FileCleaningTracker fileCleaningTracker0 = new FileCleaningTracker();
		FileDeleteStrategy fileDeleteStrategy0 = null;
		fileCleaningTracker0.track("hi!", (Object) (short) 10, fileDeleteStrategy0);
		fileCleaningTracker0.exitWhenFinished();
		int int0 = fileCleaningTracker0.getTrackCount();
		File file = null;
		FileCleaningTracker fileCleaningTracker1 = new FileCleaningTracker();
		FileDeleteStrategy fileDeleteStrategy1 = null;
		fileCleaningTracker1.track("hi!", (Object) (short) 10, fileDeleteStrategy1);
		fileCleaningTracker1.exitWhenFinished();
		int int1 = fileCleaningTracker1.getTrackCount();
		try {
			fileCleaningTracker0.track(file, (Object) fileCleaningTracker1);
			fail("Expected exception of type java.lang.NullPointerException; message: file");
		}
		catch (NullPointerException e) {
		}
		assertTrue(int0 == 1, "'" + int0 + "' != '" + 1 + "'");
		assertTrue(int1 == 1, "'" + int1 + "' != '" + 1 + "'");
	}
}
