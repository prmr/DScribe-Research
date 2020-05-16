package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CharsetsTest {

    @Test
    public void testAssertThrowsMessage_toCharset_charsetNameIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> Charsets.toCharset("@*!?"));
        assertEquals("@*!?", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toCharset_charsetUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> Charsets.toCharset("unsupported"));
        assertEquals("unsupported", thrown.getMessage());
    }
}
