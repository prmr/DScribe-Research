package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ByteOrderMarkTest {

    @Test
    public void testAssertThrowsMessage_get_posTooLarge() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> ByteOrderMarkUtils.testBOM().get(2));
        assertEquals("2", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_get_posNegative() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> ByteOrderMarkUtils.testBOM().get(-1));
        assertEquals("-1", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_ByteOrderMark_charsetNameNull() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> new ByteOrderMark(null, 1));
        assertEquals("No charsetName specified", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_ByteOrderMark_charsetNameEmpty() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> new ByteOrderMark("", 1));
        assertEquals("No charsetName specified", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_ByteOrderMark_bytesNull() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> new ByteOrderMark("test", (int[]) null));
        assertEquals("No bytes specified", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_ByteOrderMark_bytesEmpty() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> new ByteOrderMark("test"));
        assertEquals("No bytes specified", thrown.getMessage());
    }
}
