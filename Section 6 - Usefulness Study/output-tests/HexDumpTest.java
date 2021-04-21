package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class HexDumpTest {

    @Test
    public void testAssertThrowsMessage_dump_streamNull() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> HexDump.dump(HexDumpUtils.bytes(), 0xFF000000, (OutputStream) null, 0));
        assertEquals("cannot write to nullstream", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_dump_indexTooLarge() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> HexDump.dump(HexDumpUtils.bytes(), 0xFF000000, HexDumpUtils.outputStream(), HexDumpUtils.bytes().length));
        assertEquals("illegal index: " + HexDumpUtils.bytes().length  + " into array of length "
                    + HexDumpUtils.bytes().length, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_dump_indexNegative() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> HexDump.dump(HexDumpUtils.bytes(), 0xFF000000, HexDumpUtils.outputStream(), -1));
        assertEquals("illegal index: -1 into array of length "
                    + HexDumpUtils.bytes().length, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_dump_streamWriteIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> HexDump.dump(HexDumpUtils.bytes(), 0xFF000000, HexDumpUtils.outputStreamWriteIOException(), 1));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_dump_streamFlushIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> HexDump.dump(HexDumpUtils.bytes(), 0xFF000000, HexDumpUtils.outputStreamFlushIOException(), 1));
        assertEquals("flush", thrown.getMessage());
    }
}
