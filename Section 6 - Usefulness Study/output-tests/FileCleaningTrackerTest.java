package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class FileCleaningTrackerTest {

    @Test
    public void testAssertThrowsMessage_track_NullFile() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> new FileCleaningTracker().track((File) null, new Object()));
        assertEquals("The file must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_track_AfterExit_File() {
        final java.lang.IllegalStateException thrown = assertThrows(java.lang.IllegalStateException.class, () -> FileCleaningTrackerUtils.closedTracker().track(new File(""), new Object()));
        assertEquals("No new trackers can be added once exitWhenFinished() is called", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_track_NullFile_ExplicitStrategy() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> new FileCleaningTracker().track((File) null, new Object(), FileDeleteStrategy.NORMAL));
        assertEquals("The file must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_track_AfterExit_File_ExplicitStrategy() {
        final java.lang.IllegalStateException thrown = assertThrows(java.lang.IllegalStateException.class, () -> FileCleaningTrackerUtils.closedTracker().track(new File(""), new Object(), FileDeleteStrategy.NORMAL));
        assertEquals("No new trackers can be added once exitWhenFinished() is called", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_track_NullPath() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> new FileCleaningTracker().track((String) null, new Object()));
        assertEquals("The path must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_track_AfterExit_String() {
        final java.lang.IllegalStateException thrown = assertThrows(java.lang.IllegalStateException.class, () -> FileCleaningTrackerUtils.closedTracker().track("", new Object()));
        assertEquals("No new trackers can be added once exitWhenFinished() is called", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_track_NullPath_ExplicitStrategy() {
        final java.lang.NullPointerException thrown = assertThrows(java.lang.NullPointerException.class, () -> new FileCleaningTracker().track((String) null, new Object(), FileDeleteStrategy.NORMAL));
        assertEquals("The path must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_track_AfterExit_String_ExplicitStrategy() {
        final java.lang.IllegalStateException thrown = assertThrows(java.lang.IllegalStateException.class, () -> FileCleaningTrackerUtils.closedTracker().track("", new Object(), FileDeleteStrategy.NORMAL));
        assertEquals("No new trackers can be added once exitWhenFinished() is called", thrown.getMessage());
    }
}
