package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class LineIteratorTest {

    @Test
    public void testAssertThrowsMessage_remove_always() {
        final java.lang.UnsupportedOperationException thrown = assertThrows(java.lang.UnsupportedOperationException.class, () -> LineIteratorUtils.lineIteratorNoLines().remove());
        assertEquals("Remove unsupported on LineIterator", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_hasNext_IOException() {
        final java.lang.IllegalStateException thrown = assertThrows(java.lang.IllegalStateException.class, () -> org.apache.commons.io.LineIteratorUtils.lineIteratorReadIOException().hasNext());
        assertEquals("java.io.IOException: hasNext", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_next_noMoreLines() {
        final java.util.NoSuchElementException thrown = assertThrows(java.util.NoSuchElementException.class, () -> org.apache.commons.io.LineIteratorUtils.lineIteratorNoLines().next());
        assertEquals("No more lines", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_next_IOExceptionHasNext() {
        final java.lang.IllegalStateException thrown = assertThrows(java.lang.IllegalStateException.class, () -> org.apache.commons.io.LineIteratorUtils.lineIteratorReadIOException().next());
        assertEquals("java.io.IOException: hasNext", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_close_IOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> LineIteratorUtils.lineIteratorCloseIOException().close());
        assertEquals("close", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_nextLine_noMoreLines() {
        final java.util.NoSuchElementException thrown = assertThrows(java.util.NoSuchElementException.class, () -> org.apache.commons.io.LineIteratorUtils.lineIteratorNoLines().nextLine());
        assertEquals("No more lines", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_nextLine_IOExceptionHasNext() {
        final java.lang.IllegalStateException thrown = assertThrows(java.lang.IllegalStateException.class, () -> org.apache.commons.io.LineIteratorUtils.lineIteratorReadIOException().nextLine());
        assertEquals("java.io.IOException: hasNext", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_LineIterator_readerNull() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> new LineIterator((Reader) null));
        assertEquals("Reader must not be null", thrown.getMessage());
    }
}
