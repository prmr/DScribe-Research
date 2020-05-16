package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class FileDeleteStrategyTest {

    @Test
    public void testAssertThrows_delete_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileDeleteStrategyUtils.normal().delete((File) null));
    }

    @Test
    public void testAssertThrowsMessage_delete_deletionFailed() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileDeleteStrategyUtils.normal().delete(FileDeleteStrategyUtils.nonEmptyDir()));
        assertEquals("testResources/dir", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_doDelete_fileNull() {
        assertThrows(java.lang.NullPointerException.class, () -> FileDeleteStrategyUtils.normal().doDelete((File) null));
    }

    @Test
    public void testAssertThrowsMessage_doDelete_deletionFailed() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> FileDeleteStrategyUtils.normal().doDelete(FileDeleteStrategyUtils.nonEmptyDir()));
        assertEquals("testResources/dir", thrown.getMessage());
    }
}
