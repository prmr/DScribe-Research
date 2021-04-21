package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class EndianUtilsTest {

    @Test
    public void testAssertThrows_writeSwappedShort_byteArray_dataNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.writeSwappedShort((byte[]) null, 0, EndianUtilsUtils.SHORT));
    }

    @Test
    public void testAssertThrowsMessage_writeSwappedShort_byteArray_offsetTooLarge() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.writeSwappedShort(EndianUtilsUtils.bytes(), 7, EndianUtilsUtils.SHORT));
        assertEquals("8", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeSwappedShort_byteArray_offsetNegative() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.writeSwappedShort(EndianUtilsUtils.bytes(), -1, EndianUtilsUtils.SHORT));
        assertEquals("-1", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeSwappedShort_outputStream_outputNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.writeSwappedShort((OutputStream) null, EndianUtilsUtils.SHORT));
    }

    @Test
    public void testAssertThrowsMessage_writeSwappedShort_outputStream_writeIOError() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> EndianUtils.writeSwappedShort(EndianUtilsUtils.outputStreamIOException(), EndianUtilsUtils.SHORT));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readSwappedShort_inputStream_inputNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.readSwappedShort((InputStream) null));
    }

    @Test
    public void testAssertThrowsMessage_readSwappedShort_inputStream_readIOError() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> EndianUtils.readSwappedShort(EndianUtilsUtils.inputStreamIOException()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readSwappedShort_inputStream_unexpectedEOF() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> EndianUtils.readSwappedShort(EndianUtilsUtils.inputStreamEmpty()));
        assertEquals("Unexpected EOF reached", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readSwappedShort_byteArray_dataNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.readSwappedShort((byte[]) null, 0));
    }

    @Test
    public void testAssertThrowsMessage_readSwappedShort_byteArray_offsetTooLarge() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.readSwappedShort(EndianUtilsUtils.bytes(), 7));
        assertEquals("8", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readSwappedShort_byteArray_offsetNegative() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.readSwappedShort(EndianUtilsUtils.bytes(), -1));
        assertEquals("-1", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readSwappedUnsignedShort_inputStream_inputNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.readSwappedUnsignedShort((InputStream) null));
    }

    @Test
    public void testAssertThrowsMessage_readSwappedUnsignedShort_inputStream_readIOError() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> EndianUtils.readSwappedUnsignedShort(EndianUtilsUtils.inputStreamIOException()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readSwappedUnsignedShort_inputStream_unexpectedEOF() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> EndianUtils.readSwappedUnsignedShort(EndianUtilsUtils.inputStreamEmpty()));
        assertEquals("Unexpected EOF reached", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readSwappedUnsignedShort_byteArray_dataNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.readSwappedUnsignedShort((byte[]) null, 0));
    }

    @Test
    public void testAssertThrowsMessage_readSwappedUnsignedShort_byteArray_offsetTooLarge() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.readSwappedUnsignedShort(EndianUtilsUtils.bytes(), 7));
        assertEquals("8", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readSwappedUnsignedShort_byteArray_offsetNegative() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.readSwappedUnsignedShort(EndianUtilsUtils.bytes(), -1));
        assertEquals("-1", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeSwappedInteger_outputStream_outputNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.writeSwappedInteger((OutputStream) null, EndianUtilsUtils.INTEGER));
    }

    @Test
    public void testAssertThrowsMessage_writeSwappedInteger_outputStream_writeIOError() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> EndianUtils.writeSwappedInteger(EndianUtilsUtils.outputStreamIOException(), EndianUtilsUtils.INTEGER));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeSwappedInteger_byteArray_dataNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.writeSwappedInteger((byte[]) null, 0, EndianUtilsUtils.INTEGER));
    }

    @Test
    public void testAssertThrowsMessage_writeSwappedInteger_byteArray_offsetTooLarge() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.writeSwappedInteger(EndianUtilsUtils.bytes(), 5, EndianUtilsUtils.INTEGER));
        assertEquals("8", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeSwappedInteger_byteArray_offsetNegative() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.writeSwappedInteger(EndianUtilsUtils.bytes(), -1, EndianUtilsUtils.INTEGER));
        assertEquals("-1", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readSwappedInteger_byteArray_dataNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.readSwappedInteger((byte[]) null, 0));
    }

    @Test
    public void testAssertThrowsMessage_readSwappedInteger_byteArray_offsetTooLarge() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.readSwappedInteger(EndianUtilsUtils.bytes(), 5));
        assertEquals("8", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readSwappedInteger_byteArray_offsetNegative() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.readSwappedInteger(EndianUtilsUtils.bytes(), -1));
        assertEquals("-1", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readSwappedInteger_inputStream_inputNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.readSwappedInteger((InputStream) null));
    }

    @Test
    public void testAssertThrowsMessage_readSwappedInteger_inputStream_readIOError() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> EndianUtils.readSwappedInteger(EndianUtilsUtils.inputStreamIOException()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readSwappedInteger_inputStream_unexpectedEOF() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> EndianUtils.readSwappedInteger(EndianUtilsUtils.inputStreamEmpty()));
        assertEquals("Unexpected EOF reached", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readSwappedUnsignedInteger_byteArray_dataNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.readSwappedUnsignedInteger((byte[]) null, 0));
    }

    @Test
    public void testAssertThrowsMessage_readSwappedUnsignedInteger_byteArray_offsetTooLarge() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.readSwappedUnsignedInteger(EndianUtilsUtils.bytes(), 5));
        assertEquals("8", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readSwappedUnsignedInteger_byteArray_offsetNegative() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.readSwappedUnsignedInteger(EndianUtilsUtils.bytes(), -1));
        assertEquals("-1", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readSwappedUnsignedInteger_inputStream_inputNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.readSwappedUnsignedInteger((InputStream) null));
    }

    @Test
    public void testAssertThrowsMessage_readSwappedUnsignedInteger_inputStream_readIOError() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> EndianUtils.readSwappedUnsignedInteger(EndianUtilsUtils.inputStreamIOException()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readSwappedUnsignedInteger_inputStream_unexpectedEOF() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> EndianUtils.readSwappedUnsignedInteger(EndianUtilsUtils.inputStreamEmpty()));
        assertEquals("Unexpected EOF reached", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeSwappedLong_byteArray_dataNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.writeSwappedLong((byte[]) null, 0, EndianUtilsUtils.LONG));
    }

    @Test
    public void testAssertThrowsMessage_writeSwappedLong_byteArray_offsetTooLarge() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.writeSwappedLong(EndianUtilsUtils.bytes(), 1, EndianUtilsUtils.LONG));
        assertEquals("8", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeSwappedLong_byteArray_offsetNegative() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.writeSwappedLong(EndianUtilsUtils.bytes(), -1, EndianUtilsUtils.LONG));
        assertEquals("-1", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeSwappedLong_outputStream_outputNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.writeSwappedLong((OutputStream) null, EndianUtilsUtils.LONG));
    }

    @Test
    public void testAssertThrowsMessage_writeSwappedLong_outputStream_writeIOError() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> EndianUtils.writeSwappedLong(EndianUtilsUtils.outputStreamIOException(), EndianUtilsUtils.LONG));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readSwappedLong_inputStream_inputNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.readSwappedLong((InputStream) null));
    }

    @Test
    public void testAssertThrowsMessage_readSwappedLong_inputStream_readIOError() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> EndianUtils.readSwappedLong(EndianUtilsUtils.inputStreamIOException()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readSwappedLong_inputStream_unexpectedEOF() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> EndianUtils.readSwappedLong(EndianUtilsUtils.inputStreamEmpty()));
        assertEquals("Unexpected EOF reached", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readSwappedLong_byteArray_dataNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.readSwappedLong((byte[]) null, 0));
    }

    @Test
    public void testAssertThrowsMessage_readSwappedLong_byteArray_offsetTooLarge() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.readSwappedLong(EndianUtilsUtils.bytes(), 1));
        assertEquals("8", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readSwappedLong_byteArray_offsetNegative() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.readSwappedLong(EndianUtilsUtils.bytes(), -1));
        assertEquals("-1", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeSwappedFloat_byteArray_dataNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.writeSwappedFloat((byte[]) null, 0, EndianUtilsUtils.FLOAT));
    }

    @Test
    public void testAssertThrowsMessage_writeSwappedFloat_byteArray_offsetTooLarge() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.writeSwappedFloat(EndianUtilsUtils.bytes(), 5, EndianUtilsUtils.FLOAT));
        assertEquals("8", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeSwappedFloat_byteArray_offsetNegative() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.writeSwappedFloat(EndianUtilsUtils.bytes(), -1, EndianUtilsUtils.FLOAT));
        assertEquals("-1", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeSwappedFloat_outputStream_outputNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.writeSwappedFloat((OutputStream) null, EndianUtilsUtils.FLOAT));
    }

    @Test
    public void testAssertThrowsMessage_writeSwappedFloat_outputStream_writeIOError() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> EndianUtils.writeSwappedFloat(EndianUtilsUtils.outputStreamIOException(), EndianUtilsUtils.FLOAT));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readSwappedFloat_inputStream_inputNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.readSwappedFloat((InputStream) null));
    }

    @Test
    public void testAssertThrowsMessage_readSwappedFloat_inputStream_readIOError() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> EndianUtils.readSwappedFloat(EndianUtilsUtils.inputStreamIOException()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readSwappedFloat_inputStream_unexpectedEOF() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> EndianUtils.readSwappedFloat(EndianUtilsUtils.inputStreamEmpty()));
        assertEquals("Unexpected EOF reached", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readSwappedFloat_byteArray_dataNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.readSwappedFloat((byte[]) null, 0));
    }

    @Test
    public void testAssertThrowsMessage_readSwappedFloat_byteArray_offsetTooLarge() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.readSwappedFloat(EndianUtilsUtils.bytes(), 5));
        assertEquals("8", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readSwappedFloat_byteArray_offsetNegative() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.readSwappedFloat(EndianUtilsUtils.bytes(), -1));
        assertEquals("-1", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeSwappedDouble_byteArray_dataNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.writeSwappedDouble((byte[]) null, 0, EndianUtilsUtils.DOUBLE));
    }

    @Test
    public void testAssertThrowsMessage_writeSwappedDouble_byteArray_offsetTooLarge() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.writeSwappedDouble(EndianUtilsUtils.bytes(), 1, EndianUtilsUtils.DOUBLE));
        assertEquals("8", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeSwappedDouble_byteArray_offsetNegative() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.writeSwappedDouble(EndianUtilsUtils.bytes(), -1, EndianUtilsUtils.DOUBLE));
        assertEquals("-1", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeSwappedDouble_outputStream_outputNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.writeSwappedDouble((OutputStream) null, EndianUtilsUtils.DOUBLE));
    }

    @Test
    public void testAssertThrowsMessage_writeSwappedDouble_outputStream_writeIOError() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> EndianUtils.writeSwappedDouble(EndianUtilsUtils.outputStreamIOException(), EndianUtilsUtils.DOUBLE));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readSwappedDouble_inputStream_inputNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.readSwappedDouble((InputStream) null));
    }

    @Test
    public void testAssertThrowsMessage_readSwappedDouble_inputStream_readIOError() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> EndianUtils.readSwappedDouble(EndianUtilsUtils.inputStreamIOException()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readSwappedDouble_inputStream_unexpectedEOF() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> EndianUtils.readSwappedDouble(EndianUtilsUtils.inputStreamEmpty()));
        assertEquals("Unexpected EOF reached", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readSwappedDouble_byteArray_dataNull() {
        assertThrows(java.lang.NullPointerException.class, () -> EndianUtils.readSwappedDouble((byte[]) null, 0));
    }

    @Test
    public void testAssertThrowsMessage_readSwappedDouble_byteArray_offsetTooLarge() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.readSwappedDouble(EndianUtilsUtils.bytes(), 1));
        assertEquals("8", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readSwappedDouble_byteArray_offsetNegative() {
        final java.lang.ArrayIndexOutOfBoundsException thrown = assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> EndianUtils.readSwappedDouble(EndianUtilsUtils.bytes(), -1));
        assertEquals("-1", thrown.getMessage());
    }
}
