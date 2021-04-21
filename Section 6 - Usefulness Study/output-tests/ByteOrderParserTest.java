package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ByteOrderParserTest {

    @Test
    public void testAssertThrowsMessage_parseByteOrder_unknownByteOrder() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> ByteOrderParser.parseByteOrder("unknownByteOrder"));
        assertEquals("Unsupported byte order setting: unknownByteOrder, expeced one of " + java.nio.ByteOrder.LITTLE_ENDIAN + ", " + java.nio.ByteOrder.BIG_ENDIAN, thrown.getMessage());
    }
}
