package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class IOUtilsTest {

    @Test
    public void testAssertThrows_toString_inputStreamWithString_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toString((InputStream) null, IOUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_toString_inputStreamWithString_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.toString(IOUtilsUtils.inputStreamIOException(), IOUtilsUtils.CHARSET_VALID));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toString_inputStreamWithString_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> IOUtils.toString(IOUtilsUtils.inputStream(), IOUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(IOUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toString_inputStreamWithString_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> IOUtils.toString(IOUtilsUtils.inputStream(), IOUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(IOUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toString_inputStreamWithCharset_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toString((InputStream) null, StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrowsMessage_toString_inputStreamWithCharset_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.toString(IOUtilsUtils.inputStreamIOException(), StandardCharsets.UTF_8));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toString_bytes_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toString((byte[]) null, IOUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_toString_bytes_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> IOUtils.toString(new byte[10], IOUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(IOUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toString_bytes_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> IOUtils.toString(new byte[10], IOUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(IOUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toString_URLWithCharset_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toString((URL) null, StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrows_toString_URIWithString_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toString((URI) null, IOUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_toString_URIWithString_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> IOUtils.toString(new URI("https://www.google.com"), IOUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(IOUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toString_URIWithString_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> IOUtils.toString(new URI("https://www.google.com"), IOUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(IOUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toString_URIWithString_uriNotAbsolute() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.toString(IOUtilsUtils.uriNotAbsolute(), IOUtilsUtils.CHARSET_VALID));
        assertEquals("URI is not absolute", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toString_URIWithString_uriProtocolUnknown() {
        final java.net.MalformedURLException thrown = assertThrows(java.net.MalformedURLException.class, () -> IOUtils.toString(IOUtilsUtils.uriUknownProtocol(), IOUtilsUtils.CHARSET_VALID));
        assertEquals("unknown protocol: htts", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toString_URIWithCharset_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toString((URI) null, StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrowsMessage_toString_URIWithCharset_uriNotAbsolute() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.toString(IOUtilsUtils.uriNotAbsolute(), StandardCharsets.UTF_8));
        assertEquals("URI is not absolute", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toString_URIWithCharset_uriProtocolUnknown() {
        final java.net.MalformedURLException thrown = assertThrows(java.net.MalformedURLException.class, () -> IOUtils.toString(IOUtilsUtils.uriUknownProtocol(), StandardCharsets.UTF_8));
        assertEquals("unknown protocol: htts", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toString_URLWithString_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toString((URL) null, IOUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_toString_URLWithString_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> IOUtils.toString(new URL("https://www.google.com"), IOUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(IOUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toString_URLWithString_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> IOUtils.toString(new URL("https://www.google.com"), IOUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(IOUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toString_reader_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toString((Reader) null));
    }

    @Test
    public void testAssertThrowsMessage_toString_reader_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.toString(IOUtilsUtils.readerIOException()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_contentEquals_readers_input1Null() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.contentEquals((Reader) null, IOUtilsUtils.charArrayReader()));
    }

    @Test
    public void testAssertThrows_contentEquals_readers_input2Null() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.contentEquals(IOUtilsUtils.charArrayReader(), (Reader) null));
    }

    @Test
    public void testAssertThrowsMessage_contentEquals_readers_input1ReadIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.contentEquals(IOUtilsUtils.readerIOException(), IOUtilsUtils.charArrayReader()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_contentEquals_readers_input2ReadIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.contentEquals(IOUtilsUtils.charArrayReader(), IOUtilsUtils.readerIOException()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_contentEquals_inputStreams_input1Null() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.contentEquals((InputStream) null, IOUtilsUtils.byteArrayInputStream()));
        assertEquals("Stream closed", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_contentEquals_inputStreams_input2Null() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.contentEquals(IOUtilsUtils.byteArrayInputStream(), (InputStream) null));
        assertEquals("Stream closed", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_contentEquals_inputStreams_input1ReadIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.contentEquals(IOUtilsUtils.inputStreamIOException(), IOUtilsUtils.byteArrayInputStream()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_contentEquals_inputStreams_input2ReadIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.contentEquals(IOUtilsUtils.byteArrayInputStream(), IOUtilsUtils.inputStreamIOException()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toCharArray_reader_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toCharArray((Reader) null));
    }

    @Test
    public void testAssertThrowsMessage_toCharArray_reader_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.toCharArray(IOUtilsUtils.readerIOException()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toCharArray_inputStreamWithString_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toCharArray((InputStream) null, IOUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_toCharArray_inputStreamWithString_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.toCharArray(IOUtilsUtils.inputStreamIOException(), IOUtilsUtils.CHARSET_VALID));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toCharArray_inputStreamWithString_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> IOUtils.toCharArray(IOUtilsUtils.inputStream(), IOUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(IOUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toCharArray_inputStreamWithString_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> IOUtils.toCharArray(IOUtilsUtils.inputStream(), IOUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(IOUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toCharArray_inputStreamWithCharset_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toCharArray((InputStream) null, StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrowsMessage_toCharArray_inputStreamWithCharset_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.toCharArray(IOUtilsUtils.inputStreamIOException(), StandardCharsets.UTF_8));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_buffer_writerWithSize_writerNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.buffer((Writer) null, 1));
    }

    @Test
    public void testAssertThrowsMessage_buffer_writerWithSize_sizeNegative() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.buffer(IOUtilsUtils.writer(), -1));
        assertEquals("Buffer size <= 0", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_buffer_writer_writerNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.buffer((Writer) null));
    }

    @Test
    public void testAssertThrows_buffer_reader_readerNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.buffer((Reader) null));
    }

    @Test
    public void testAssertThrows_buffer_readerWithSize_readerNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.buffer((Reader) null, 1));
    }

    @Test
    public void testAssertThrowsMessage_buffer_readerWithSize_sizeNegative() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.buffer(IOUtilsUtils.reader(), -1));
        assertEquals("Buffer size <= 0", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_buffer_outputStreamWithSize_outputStreamNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.buffer((OutputStream) null, 1));
    }

    @Test
    public void testAssertThrowsMessage_buffer_outputStreamWithSize_sizeNegative() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.buffer(IOUtilsUtils.outputStream(), -1));
        assertEquals("Buffer size <= 0", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_buffer_inputStream_inputStreamNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.buffer((InputStream) null));
    }

    @Test
    public void testAssertThrows_buffer_outputStream_outputStreamNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.buffer((OutputStream) null));
    }

    @Test
    public void testAssertThrows_buffer_inputStreamWithSize_inputStreamNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.buffer((InputStream) null, 1));
    }

    @Test
    public void testAssertThrowsMessage_buffer_inputStreamWithSize_sizeNegative() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.buffer(IOUtilsUtils.inputStream(), -1));
        assertEquals("Buffer size <= 0", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_write_charArrayToWriter_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.write(new char[10], (Writer) null));
    }

    @Test
    public void testAssertThrowsMessage_write_charArrayToWriter_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.write(new char[10], IOUtilsUtils.writerIOException()));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_write_stringToOutputStreamWithCharset_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.write("test", (OutputStream) null, StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrowsMessage_write_stringToOutputStreamWithCharset_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.write("test", IOUtilsUtils.outputStreamIOException(), StandardCharsets.UTF_8));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_write_charSeqToWriter_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.write(IOUtilsUtils.CHAR_SEQ, (Writer) null));
    }

    @Test
    public void testAssertThrowsMessage_write_charSeqToWriter_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.write(IOUtilsUtils.CHAR_SEQ, IOUtilsUtils.writerIOException()));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_write_charArrayToOutputStreamWithString_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.write(new char[10], (OutputStream) null, IOUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_write_charArrayToOutputStreamWithString_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.write(new char[10], IOUtilsUtils.outputStreamIOException(), IOUtilsUtils.CHARSET_VALID));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_write_charArrayToOutputStreamWithString_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> IOUtils.write(new char[10], IOUtilsUtils.outputStream(), IOUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(IOUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_write_charArrayToOutputStreamWithString_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> IOUtils.write(new char[10], IOUtilsUtils.outputStream(), IOUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(IOUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrows_write_charArrayToOutputStreamWithCharset_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.write(new char[10], (OutputStream) null, StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrowsMessage_write_charArrayToOutputStreamWithCharset_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.write(new char[10], IOUtilsUtils.outputStreamIOException(), StandardCharsets.UTF_8));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_write_charSeqToOutputStreamWithString_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.write(IOUtilsUtils.CHAR_SEQ, (OutputStream) null, IOUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_write_charSeqToOutputStreamWithString_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.write(IOUtilsUtils.CHAR_SEQ, IOUtilsUtils.outputStreamIOException(), IOUtilsUtils.CHARSET_VALID));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_write_charSeqToOutputStreamWithString_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> IOUtils.write(IOUtilsUtils.CHAR_SEQ, IOUtilsUtils.outputStream(), IOUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(IOUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_write_charSeqToOutputStreamWithString_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> IOUtils.write(IOUtilsUtils.CHAR_SEQ, IOUtilsUtils.outputStream(), IOUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(IOUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrows_write_stringToOutputStreamWithString_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.write("test", (OutputStream) null, IOUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_write_stringToOutputStreamWithString_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.write("test", IOUtilsUtils.outputStreamIOException(), IOUtilsUtils.CHARSET_VALID));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_write_stringToOutputStreamWithString_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> IOUtils.write("test", IOUtilsUtils.outputStream(), IOUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(IOUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_write_stringToOutputStreamWithString_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> IOUtils.write("test", IOUtilsUtils.outputStream(), IOUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(IOUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrows_write_byteArrayToOutputStream_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.write(new byte[10], (OutputStream) null));
    }

    @Test
    public void testAssertThrowsMessage_write_byteArrayToOutputStream_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.write(new byte[10], IOUtilsUtils.outputStreamIOException()));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_write_byteArrayToWriterWithString_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.write(new byte[10], (Writer) null, IOUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_write_byteArrayToWriterWithString_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.write(new byte[10], IOUtilsUtils.writerIOException(), IOUtilsUtils.CHARSET_VALID));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_write_byteArrayToWriterWithString_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> IOUtils.write(new byte[10], IOUtilsUtils.writer(), IOUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(IOUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_write_byteArrayToWriterWithString_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> IOUtils.write(new byte[10], IOUtilsUtils.writer(), IOUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(IOUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrows_write_byteArrayToWriterWithCharset_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.write(new byte[10], (Writer) null, StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrowsMessage_write_byteArrayToWriterWithCharset_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.write(new byte[10], IOUtilsUtils.writerIOException(), StandardCharsets.UTF_8));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_write_stringToWriter_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.write("test", (Writer) null));
    }

    @Test
    public void testAssertThrowsMessage_write_stringToWriter_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.write("test", IOUtilsUtils.writerIOException()));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_write_charSeqToOutputStreamWithCharset_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.write(IOUtilsUtils.CHAR_SEQ, (OutputStream) null, StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrowsMessage_write_charSeqToOutputStreamWithCharset_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.write(IOUtilsUtils.CHAR_SEQ, IOUtilsUtils.outputStreamIOException(), StandardCharsets.UTF_8));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_read_inputStreamWithBufferAndOffset_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.read(IOUtilsUtils.inputStreamIOException(), new byte[100], 0, 10));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_read_inputStreamWithBufferAndOffset_lengthNegative() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.read(IOUtilsUtils.inputStream(), new byte[100], 0, -1));
        assertEquals("Length must not be negative: -1", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_read_inputStreamWithBufferAndOffset_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.read((InputStream) null, new byte[100], 0, 10));
    }

    @Test
    public void testAssertThrows_read_inputStreamWithBufferAndOffset_bufferNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.read(IOUtilsUtils.inputStream(), (byte[]) null, 0, 10));
    }

    @Test
    public void testAssertThrowsMessage_read_readerWithBuffer_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.read(IOUtilsUtils.readerIOException(), new char[100]));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_read_readerWithBuffer_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.read((Reader) null, new char[100]));
    }

    @Test
    public void testAssertThrows_read_readerWithBuffer_bufferNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.read(IOUtilsUtils.reader(), (char[]) null));
    }

    @Test
    public void testAssertThrowsMessage_read_readerWithBufferAndOffset_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.read(IOUtilsUtils.readerIOException(), new char[100], 0, 10));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_read_readerWithBufferAndOffset_lengthNegative() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.read(IOUtilsUtils.reader(), new char[100], 0, -1));
        assertEquals("Length must not be negative: -1", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_read_readerWithBufferAndOffset_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.read((Reader) null, new char[100], 0, 10));
    }

    @Test
    public void testAssertThrowsMessage_read_inputStreamWithBuffer_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.read(IOUtilsUtils.inputStreamIOException(), new byte[100]));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_read_inputStreamWithBuffer_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.read((InputStream) null, new byte[100]));
    }

    @Test
    public void testAssertThrows_read_inputStreamWithBuffer_bufferNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.read(IOUtilsUtils.inputStream(), (byte[]) null));
    }

    @Test
    public void testAssertThrowsMessage_read_readableByteChannel_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.read(IOUtilsUtils.readableByteChannelIOException(), ByteBuffer.allocate(1024 * 4 + 1)));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_read_readableByteChannel_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.read((ReadableByteChannel) null, ByteBuffer.allocate(1024 * 4 + 1)));
    }

    @Test
    public void testAssertThrows_read_readableByteChannel_bufferNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.read(IOUtilsUtils.readableByteChannel(), (ByteBuffer) null));
    }

    @Test
    public void testAssertThrows_toByteArray_readerWithCharset_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toByteArray((Reader) null, StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrowsMessage_toByteArray_readerWithCharset_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.toByteArray(IOUtilsUtils.readerIOException(), StandardCharsets.UTF_8));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toByteArray_readerWithString_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toByteArray((Reader) null, IOUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_toByteArray_readerWithString_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.toByteArray(IOUtilsUtils.readerIOException(), IOUtilsUtils.CHARSET_VALID));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toByteArray_readerWithString_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> IOUtils.toByteArray(IOUtilsUtils.reader(), IOUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(IOUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toByteArray_readerWithString_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> IOUtils.toByteArray(IOUtilsUtils.reader(), IOUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(IOUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toByteArray_inputStreamIntSize_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toByteArray((InputStream) null, 1));
    }

    @Test
    public void testAssertThrowsMessage_toByteArray_inputStreamIntSize_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.toByteArray(IOUtilsUtils.inputStreamIOException(), 1));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toByteArray_inputStreamIntSize_sizeNegative() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.toByteArray(IOUtilsUtils.inputStreamIOException(), -1));
        assertEquals("Size must be equal or greater than zero: -1", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toByteArray_inputStreamIntSize_sizeIllegal() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.toByteArray(IOUtilsUtils.byteArrayInputStream(), 300));
        assertEquals("Unexpected read size. current: 200, expected: 300", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toByteArray_inputStreamLongSize_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toByteArray((InputStream) null, (long) 1));
    }

    @Test
    public void testAssertThrowsMessage_toByteArray_inputStreamLongSize_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.toByteArray(IOUtilsUtils.inputStreamIOException(), (long) 1));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toByteArray_inputStreamLongSize_sizeNegative() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.toByteArray(IOUtilsUtils.inputStreamIOException(), (long) -1));
        assertEquals("Size must be equal or greater than zero: -1", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toByteArray_inputStreamLongSize_sizeIllegal() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.toByteArray(IOUtilsUtils.byteArrayInputStream(), (long) 300));
        assertEquals("Unexpected read size. current: 200, expected: 300", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toByteArray_inputStreamLongSize_sizeTooLarge() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.toByteArray(IOUtilsUtils.inputStreamIOException(), (long) Integer.MAX_VALUE + 1));
        assertEquals("Size cannot be greater than Integer max value: 2147483648", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toByteArray_inputStream_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toByteArray((InputStream) null));
    }

    @Test
    public void testAssertThrowsMessage_toByteArray_inputStream_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.toByteArray(IOUtilsUtils.inputStreamIOException()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toByteArray_URI_uriNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toByteArray((URI) null));
    }

    @Test
    public void testAssertThrowsMessage_toByteArray_URI_uriNotAbsolute() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.toByteArray(IOUtilsUtils.uriNotAbsolute()));
        assertEquals("URI is not absolute", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toByteArray_URI_uriProtocolUnknown() {
        final java.net.MalformedURLException thrown = assertThrows(java.net.MalformedURLException.class, () -> IOUtils.toByteArray(IOUtilsUtils.uriUknownProtocol()));
        assertEquals("unknown protocol: htts", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toByteArray_URL_urlNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toByteArray((URL) null));
    }

    @Test
    public void testAssertThrows_toByteArray_URLCon_urlConNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toByteArray((URLConnection) null));
    }

    @Test
    public void testAssertThrows_copy_readerToOutputStreamWithString_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copy((Reader) null, IOUtilsUtils.outputStream(), IOUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrows_copy_readerToOutputStreamWithString_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copy(IOUtilsUtils.reader(), (OutputStream) null, IOUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_copy_readerToOutputStreamWithString_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copy(IOUtilsUtils.readerIOException(), IOUtilsUtils.outputStream(), IOUtilsUtils.CHARSET_VALID));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copy_readerToOutputStreamWithString_outputEncodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> IOUtils.copy(IOUtilsUtils.reader(), IOUtilsUtils.outputStream(), IOUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(IOUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copy_readerToOutputStreamWithString_outputEncodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> IOUtils.copy(IOUtilsUtils.reader(), IOUtilsUtils.outputStream(), IOUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(IOUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copy_readerToOutputStreamWithCharset_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copy((Reader) null, IOUtilsUtils.outputStream(), StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrows_copy_readerToOutputStreamWithCharset_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copy(IOUtilsUtils.reader(), (OutputStream) null, StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrowsMessage_copy_readerToOutputStreamWithCharset_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copy(IOUtilsUtils.readerIOException(), IOUtilsUtils.outputStream(), StandardCharsets.UTF_8));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copy_inputStreamToOutputStreamWithBufferSize_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copy((InputStream) null, IOUtilsUtils.outputStream(), 10));
    }

    @Test
    public void testAssertThrows_copy_inputStreamToOutputStreamWithBufferSize_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copy(IOUtilsUtils.inputStream(), (OutputStream) null, 10));
    }

    @Test
    public void testAssertThrowsMessage_copy_inputStreamToOutputStreamWithBufferSize_readIOError() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copy(IOUtilsUtils.inputStreamIOException(), IOUtilsUtils.outputStream(), 10));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copy_inputStreamToOutputStreamWithBufferSize_writeIOError() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copy(IOUtilsUtils.inputStream(), IOUtilsUtils.outputStreamIOException(), 10));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copy_inputStreamToOutputStreamWithBufferSize_bufferSizeNegative() {
        assertThrows(java.lang.NegativeArraySizeException.class, () -> IOUtils.copy(IOUtilsUtils.inputStream(), IOUtilsUtils.outputStream(), -1));
    }

    @Test
    public void testAssertThrows_copy_inputStreamToWriterWithString_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copy((InputStream) null, IOUtilsUtils.writer(), IOUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrows_copy_inputStreamToWriterWithString_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copy(IOUtilsUtils.inputStream(), (Writer) null, IOUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_copy_inputStreamToWriterWithString_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copy(IOUtilsUtils.inputStreamIOException(), IOUtilsUtils.writer(), IOUtilsUtils.CHARSET_VALID));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copy_inputStreamToWriterWithString_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copy(IOUtilsUtils.inputStream(), IOUtilsUtils.writerIOException(), IOUtilsUtils.CHARSET_VALID));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copy_inputStreamToWriterWithString_inputEncodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> IOUtils.copy(IOUtilsUtils.inputStream(), IOUtilsUtils.writer(), IOUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(IOUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copy_inputStreamToWriterWithString_inputEncodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> IOUtils.copy(IOUtilsUtils.inputStream(), IOUtilsUtils.writer(), IOUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(IOUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copy_inputStreamToWriterWithCharset_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copy((InputStream) null, IOUtilsUtils.writer(), StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrows_copy_inputStreamToWriterWithCharset_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copy(IOUtilsUtils.inputStream(), (Writer) null, StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrowsMessage_copy_inputStreamToWriterWithCharset_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copy(IOUtilsUtils.inputStreamIOException(), IOUtilsUtils.writer(), StandardCharsets.UTF_8));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copy_inputStreamToWriterWithCharset_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copy(IOUtilsUtils.inputStream(), IOUtilsUtils.writerIOException(), StandardCharsets.UTF_8));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copy_inputStreamToOutputStream_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copy((InputStream) null, IOUtilsUtils.outputStream()));
    }

    @Test
    public void testAssertThrows_copy_inputStreamToOutputStream_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copy(IOUtilsUtils.inputStream(), (OutputStream) null));
    }

    @Test
    public void testAssertThrowsMessage_copy_inputStreamToOutputStream_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copy(IOUtilsUtils.inputStreamIOException(), IOUtilsUtils.outputStream()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copy_inputStreamToOutputStream_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copy(IOUtilsUtils.inputStream(), IOUtilsUtils.outputStreamIOException()));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copy_readerToWriter_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copy((Reader) null, IOUtilsUtils.writer()));
    }

    @Test
    public void testAssertThrows_copy_readerToWriter_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copy(IOUtilsUtils.reader(), (Writer) null));
    }

    @Test
    public void testAssertThrowsMessage_copy_readerToWriter_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copy(IOUtilsUtils.readerIOException(), IOUtilsUtils.writer()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copy_readerToWriter_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copy(IOUtilsUtils.reader(), IOUtilsUtils.writerIOException()));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_skip_reader_toSkipNegative() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.skip(IOUtilsUtils.reader(), -1));
        assertEquals("Skip count must be non-negative, actual: -1", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_skip_reader_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.skip(IOUtilsUtils.readerIOException(), 1));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_skip_reader_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.skip((Reader) null, 1));
    }

    @Test
    public void testAssertThrowsMessage_skip_inputStream_toSkipNegative() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.skip(IOUtilsUtils.inputStream(), -1));
        assertEquals("Skip count must be non-negative, actual: -1", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_skip_inputStream_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.skip(IOUtilsUtils.inputStreamIOException(), 1));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_skip_inputStream_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.skip((InputStream) null, 1));
    }

    @Test
    public void testAssertThrowsMessage_skip_readableByteChannel_toSkipNegative() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.skip(IOUtilsUtils.readableByteChannel(), -1));
        assertEquals("Skip count must be non-negative, actual: -1", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_skip_readableByteChannel_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.skip(IOUtilsUtils.readableByteChannelIOException(), 1));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_skip_readableByteChannel_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.skip((ReadableByteChannel) null, 1));
    }

    @Test
    public void testAssertThrowsMessage_readFully_inputStreamWithLength_EOFException() {
        final java.io.EOFException thrown = assertThrows(java.io.EOFException.class, () -> IOUtils.readFully(IOUtilsUtils.byteArrayInputStream(), 300));
        assertEquals("Length to read: 300 actual: 200", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readFully_inputStreamWithLength_lengthNegative() {
        assertThrows(java.lang.NegativeArraySizeException.class, () -> IOUtils.readFully(IOUtilsUtils.inputStream(), -1));
    }

    @Test
    public void testAssertThrowsMessage_readFully_inputStreamWithLength_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.readFully(IOUtilsUtils.inputStreamIOException(), 10));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readFully_inputStreamWithLength_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.readFully((InputStream) null, 10));
    }

    @Test
    public void testAssertThrowsMessage_readFully_inputStreamWithBuffer_EOFException() {
        final java.io.EOFException thrown = assertThrows(java.io.EOFException.class, () -> IOUtils.readFully(IOUtilsUtils.byteArrayInputStream(), new byte[300]));
        assertEquals("Length to read: 300 actual: 200", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readFully_inputStreamWithBuffer_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.readFully(IOUtilsUtils.inputStreamIOException(), new byte[10]));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readFully_inputStreamWithBuffer_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.readFully((InputStream) null, new byte[10]));
    }

    @Test
    public void testAssertThrows_readFully_inputStreamWithBuffer_bufferNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.readFully(IOUtilsUtils.inputStream(), (byte[]) null));
    }

    @Test
    public void testAssertThrowsMessage_readFully_readableByteChannel_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.readFully(IOUtilsUtils.readableByteChannelIOException(), ByteBuffer.allocate(1024 * 4 + 1)));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readFully_readableByteChannel_EOFException() {
        final java.io.EOFException thrown = assertThrows(java.io.EOFException.class, () -> IOUtils.readFully(IOUtilsUtils.readableByteChannel(), ByteBuffer.allocate(100)));
        assertEquals("Length to read: 100 actual: 0", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readFully_readableByteChannel_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.readFully((ReadableByteChannel) null, ByteBuffer.allocate(100)));
    }

    @Test
    public void testAssertThrows_readFully_readableByteChannel_bufferNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.readFully(IOUtilsUtils.readableByteChannel(), (ByteBuffer) null));
    }

    @Test
    public void testAssertThrowsMessage_readFully_inputStreamWithBufferAndOffset_EOFException() {
        final java.io.EOFException thrown = assertThrows(java.io.EOFException.class, () -> IOUtils.readFully(IOUtilsUtils.byteArrayInputStream(), new byte[300], 0, 300));
        assertEquals("Length to read: 300 actual: 200", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readFully_inputStreamWithBufferAndOffset_lengthNegative() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.readFully(IOUtilsUtils.inputStream(), new byte[10], 0, -1));
        assertEquals("Length must not be negative: -1", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readFully_inputStreamWithBufferAndOffset_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.readFully(IOUtilsUtils.inputStreamIOException(), new byte[10], 0, 1));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readFully_inputStreamWithBufferAndOffset_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.readFully((InputStream) null, new byte[10], 0, 1));
    }

    @Test
    public void testAssertThrows_readFully_inputStreamWithBufferAndOffset_bufferNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.readFully(IOUtilsUtils.inputStream(), (byte[]) null, 0, 1));
    }

    @Test
    public void testAssertThrowsMessage_readFully_readerWithBuffer_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.readFully(IOUtilsUtils.readerIOException(), new char[10]));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readFully_readerWithBuffer_EOFException() {
        final java.io.EOFException thrown = assertThrows(java.io.EOFException.class, () -> IOUtils.readFully(IOUtilsUtils.readerEOF(), new char[100]));
        assertEquals("Length to read: 100 actual: 0", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readFully_readerWithBuffer_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.readFully((Reader) null, new char[10]));
    }

    @Test
    public void testAssertThrows_readFully_readerWithBuffer_bufferNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.readFully(IOUtilsUtils.reader(), (char[]) null));
    }

    @Test
    public void testAssertThrowsMessage_readFully_readerWithBufferAndBuffer_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.readFully(IOUtilsUtils.readerIOException(), new char[10], 0, 10));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readFully_readerWithBufferAndBuffer_EOFException() {
        final java.io.EOFException thrown = assertThrows(java.io.EOFException.class, () -> IOUtils.readFully(IOUtilsUtils.readerEOF(), new char[100], 0, 100));
        assertEquals("Length to read: 100 actual: 0", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readFully_readerWithBufferAndBuffer_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.readFully((Reader) null, new char[10], 0, 10));
    }

    @Test
    public void testAssertThrowsMessage_readFully_readerWithBufferAndBuffer_lengthNegative() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.readFully(IOUtilsUtils.reader(), new char[100], 0, -1));
        assertEquals("Length must not be negative: -1", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toInputStream_charSeqWithString_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toInputStream((CharSequence) null, IOUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_toInputStream_charSeqWithString_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> IOUtils.toInputStream(IOUtilsUtils.CHAR_SEQ, IOUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(IOUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toInputStream_charSeqWithString_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> IOUtils.toInputStream(IOUtilsUtils.CHAR_SEQ, IOUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(IOUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toInputStream_charSeqWithCharset_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toInputStream((CharSequence) null, StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrows_toInputStream_stringWithCharset_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toInputStream((String) null, StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrows_toInputStream_stringWithString_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toInputStream((String) null, IOUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_toInputStream_stringWithString_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> IOUtils.toInputStream("test", IOUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(IOUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toInputStream_stringWithString_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> IOUtils.toInputStream("test", IOUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(IOUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_toBufferedInputStream_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.toBufferedInputStream(IOUtilsUtils.inputStreamIOException()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toBufferedInputStream_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toBufferedInputStream((InputStream) null));
    }

    @Test
    public void testAssertThrowsMessage_toBufferedInputStream_withSize_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.toBufferedInputStream(IOUtilsUtils.inputStreamIOException(), 10));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toBufferedInputStream_withSize_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toBufferedInputStream((InputStream) null, 10));
    }

    @Test
    public void testAssertThrowsMessage_toBufferedInputStream_withSize_sizeNegative() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.toBufferedInputStream(IOUtilsUtils.inputStream(), -1));
        assertEquals("Negative initial size: -1", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_toBufferedReader_readerNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toBufferedReader((Reader) null));
    }

    @Test
    public void testAssertThrows_toBufferedReader_withSize_readerNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.toBufferedReader((Reader) null, 10));
    }

    @Test
    public void testAssertThrowsMessage_toBufferedReader_withSize_sizeNegative() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.toBufferedReader(IOUtilsUtils.reader(), -1));
        assertEquals("Buffer size <= 0", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_resourceToString_nonExistingResource() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.resourceToString("non-existing-file.bin", StandardCharsets.UTF_8));
        assertEquals("Resource not found: non-existing-file.bin", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_resourceToString_nameNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.resourceToString(null, StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrowsMessage_resourceToString_withClassLoader_nonExistingResource() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.resourceToString("non-existing-file.bin", StandardCharsets.UTF_8, ClassLoader.getSystemClassLoader()));
        assertEquals("Resource not found: non-existing-file.bin", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_resourceToString_withClassLoader_nameNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.resourceToString(null, StandardCharsets.UTF_8, ClassLoader.getSystemClassLoader()));
    }

    @Test
    public void testAssertThrowsMessage_resourceToByteArray_nonExistingResource() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.resourceToByteArray("non-existing-file.bin"));
        assertEquals("Resource not found: non-existing-file.bin", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_resourceToByteArray_nameNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.resourceToByteArray(null));
    }

    @Test
    public void testAssertThrowsMessage_resourceToByteArray_withClassLoader_nonExistingResource() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.resourceToByteArray("non-existing-file.bin", ClassLoader.getSystemClassLoader()));
        assertEquals("Resource not found: non-existing-file.bin", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_resourceToByteArray_withClassLoader_nameNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.resourceToByteArray(null, ClassLoader.getSystemClassLoader()));
    }

    @Test
    public void testAssertThrowsMessage_resourceToURL_nonExistingResource() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.resourceToURL("non-existing-file.bin"));
        assertEquals("Resource not found: non-existing-file.bin", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_resourceToURL_nameNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.resourceToURL(null));
    }

    @Test
    public void testAssertThrowsMessage_resourceToURL_withClassLoader_nonExistingResource() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.resourceToURL("non-existing-file.bin", ClassLoader.getSystemClassLoader()));
        assertEquals("Resource not found: non-existing-file.bin", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_resourceToURL_withClassLoader_nameNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.resourceToURL(null, ClassLoader.getSystemClassLoader()));
    }

    @Test
    public void testAssertThrowsMessage_readLines_inputStreamWithCharset_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.readLines(IOUtilsUtils.inputStreamIOException(), StandardCharsets.UTF_8));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readLines_inputStreamWithCharset_inputNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.readLines((InputStream) null, StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrowsMessage_readLines_inputStreamWithString_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.readLines(IOUtilsUtils.inputStreamIOException(), IOUtilsUtils.CHARSET_VALID));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readLines_inputStreamWithString_inputNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.readLines((InputStream) null, IOUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_readLines_inputStreamWithString_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> IOUtils.readLines((InputStream) null, IOUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(IOUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readLines_inputStreamWithString_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> IOUtils.readLines((InputStream) null, IOUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(IOUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_readLines_reader_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.readLines(IOUtilsUtils.readerIOException()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_readLines_reader_inputNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.readLines((Reader) null));
    }

    @Test
    public void testAssertThrowsMessage_lineIterator_reader_inNull() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.lineIterator((Reader) null));
        assertEquals("Reader must not be null", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_lineIterator_inputStreamWithCharset_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.lineIterator((InputStream) null, StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrows_lineIterator_inputStreamWithString_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.lineIterator((InputStream) null, IOUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_lineIterator_inputStreamWithString_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> IOUtils.lineIterator((InputStream) null, IOUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(IOUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_lineIterator_inputStreamWithString_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> IOUtils.lineIterator((InputStream) null, IOUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(IOUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeChunked_byteArrayToOutputStream_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.writeChunked(new byte[10], (OutputStream) null));
    }

    @Test
    public void testAssertThrowsMessage_writeChunked_byteArrayToOutputStream_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.writeChunked(new byte[10], IOUtilsUtils.outputStreamIOException()));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeChunked_charArrayToWriter_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.writeChunked(new char[10], (Writer) null));
    }

    @Test
    public void testAssertThrowsMessage_writeChunked_charArrayToWriter_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.writeChunked(new char[10], IOUtilsUtils.writerIOException()));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeLines_outputStreamWithString_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.writeLines(IOUtilsUtils.LIST, IOUtilsUtils.LIST_ENDING, (OutputStream) null, IOUtilsUtils.CHARSET_VALID));
    }

    @Test
    public void testAssertThrowsMessage_writeLines_outputStreamWithString_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.writeLines(IOUtilsUtils.LIST, IOUtilsUtils.LIST_ENDING, IOUtilsUtils.outputStreamIOException(), IOUtilsUtils.CHARSET_VALID));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_outputStreamWithString_encodingUnsupported() {
        final java.nio.charset.UnsupportedCharsetException thrown = assertThrows(java.nio.charset.UnsupportedCharsetException.class, () -> IOUtils.writeLines(IOUtilsUtils.LIST, IOUtilsUtils.LIST_ENDING, IOUtilsUtils.outputStream(), IOUtilsUtils.CHARSET_UNSUPPORTED));
        assertEquals(IOUtilsUtils.CHARSET_UNSUPPORTED, thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_writeLines_outputStreamWithString_encodingIllegal() {
        final java.nio.charset.IllegalCharsetNameException thrown = assertThrows(java.nio.charset.IllegalCharsetNameException.class, () -> IOUtils.writeLines(IOUtilsUtils.LIST, IOUtilsUtils.LIST_ENDING, IOUtilsUtils.outputStream(), IOUtilsUtils.CHARSET_ILLEGAL));
        assertEquals(IOUtilsUtils.CHARSET_ILLEGAL, thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeLines_writer_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.writeLines(IOUtilsUtils.LIST, IOUtilsUtils.LIST_ENDING, (Writer) null));
    }

    @Test
    public void testAssertThrowsMessage_writeLines_writer_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.writeLines(IOUtilsUtils.LIST, IOUtilsUtils.LIST_ENDING, IOUtilsUtils.writerIOException()));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_writeLines_outputStreamWithCharset_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.writeLines(IOUtilsUtils.LIST, IOUtilsUtils.LIST_ENDING, (OutputStream) null, StandardCharsets.UTF_8));
    }

    @Test
    public void testAssertThrowsMessage_writeLines_outputStreamWithCharset_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.writeLines(IOUtilsUtils.LIST, IOUtilsUtils.LIST_ENDING, IOUtilsUtils.outputStreamIOException(), StandardCharsets.UTF_8));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copyLarge_inputStreamToOutputStreamWithBuffer_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge((InputStream) null, IOUtilsUtils.outputStream(), new byte[500]));
    }

    @Test
    public void testAssertThrows_copyLarge_inputStreamToOutputStreamWithBuffer_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge(IOUtilsUtils.inputStream(), (OutputStream) null, new byte[500]));
    }

    @Test
    public void testAssertThrows_copyLarge_inputStreamToOutputStreamWithBuffer_bufferNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge(IOUtilsUtils.inputStream(), IOUtilsUtils.outputStream(), (byte[]) null));
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_inputStreamToOutputStreamWithBuffer_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copyLarge(IOUtilsUtils.inputStreamIOException(), IOUtilsUtils.outputStream(), new byte[50]));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_inputStreamToOutputStreamWithBuffer_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copyLarge(IOUtilsUtils.inputStream(), IOUtilsUtils.outputStreamIOException(), new byte[50]));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copyLarge_readerToWriterWithOffsetAndBuffer_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge((Reader) null, IOUtilsUtils.writer(), 10, 10, new char[10]));
    }

    @Test
    public void testAssertThrows_copyLarge_readerToWriterWithOffsetAndBuffer_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge(IOUtilsUtils.reader(), (Writer) null, 0, 100, new char[10]));
    }

    @Test
    public void testAssertThrows_copyLarge_readerToWriterWithOffsetAndBuffer_bufferNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge(IOUtilsUtils.reader(), IOUtilsUtils.writer(), 0, 100, (char[]) null));
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_readerToWriterWithOffsetAndBuffer_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copyLarge(IOUtilsUtils.readerIOException(), IOUtilsUtils.writer(), 10, 10, new char[10]));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_readerToWriterWithOffsetAndBuffer_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copyLarge(IOUtilsUtils.reader(), IOUtilsUtils.writerIOException(), 0, 9, new char[10]));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_readerToWriterWithOffsetAndBuffer_offsetInvalid() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copyLarge(IOUtilsUtils.charArrayReader(), IOUtilsUtils.charArrayWriter(), 1000, 100, new char[10]));
        assertEquals("Chars to skip: 1000 actual: 200", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copyLarge_inputStreamToOutputStream_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge((InputStream) null, IOUtilsUtils.outputStream()));
    }

    @Test
    public void testAssertThrows_copyLarge_inputStreamToOutputStream_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge(IOUtilsUtils.inputStream(), (OutputStream) null));
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_inputStreamToOutputStream_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copyLarge(IOUtilsUtils.inputStreamIOException(), IOUtilsUtils.outputStream()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_inputStreamToOutputStream_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copyLarge(IOUtilsUtils.inputStream(), IOUtilsUtils.outputStreamIOException()));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copyLarge_readerToWriterWithOffset_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge((Reader) null, IOUtilsUtils.writer(), 10, 10));
    }

    @Test
    public void testAssertThrows_copyLarge_readerToWriterWithOffset_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge(IOUtilsUtils.reader(), (Writer) null, 0, 200));
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_readerToWriterWithOffset_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copyLarge(IOUtilsUtils.readerIOException(), IOUtilsUtils.writer(), 10, 10));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_readerToWriterWithOffset_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copyLarge(IOUtilsUtils.reader(), IOUtilsUtils.writerIOException(), 0, 9));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_readerToWriterWithOffset_offsetInvalid() {
        final java.io.EOFException thrown = assertThrows(java.io.EOFException.class, () -> IOUtils.copyLarge(IOUtilsUtils.charArrayReader(), IOUtilsUtils.charArrayWriter(), 1000, 100));
        assertEquals("Chars to skip: 1000 actual: 200", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copyLarge_inputStreamToOutputStreamWithOffset_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge((InputStream) null, IOUtilsUtils.outputStream(), 10, 10));
    }

    @Test
    public void testAssertThrows_copyLarge_inputStreamToOutputStreamWithOffset_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge(IOUtilsUtils.inputStream(), (OutputStream) null, 10, 10));
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_inputStreamToOutputStreamWithOffset_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copyLarge(IOUtilsUtils.inputStreamIOException(), IOUtilsUtils.outputStream(), 10, 10));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_inputStreamToOutputStreamWithOffset_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copyLarge(IOUtilsUtils.inputStream(), IOUtilsUtils.outputStreamIOException(), 10, 10));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_inputStreamToOutputStreamWithOffset_offsetInvalid() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copyLarge(IOUtilsUtils.byteArrayInputStream(), IOUtilsUtils.byteArrayOutputStream(), 1000, 100));
        assertEquals("Bytes to skip: 1000 actual: 200", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copyLarge_readerToWriterWithBuffer_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge((Reader) null, IOUtilsUtils.writer(), new char[10]));
    }

    @Test
    public void testAssertThrows_copyLarge_readerToWriterWithBuffer_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge(IOUtilsUtils.reader(), (Writer) null, new char[10]));
    }

    @Test
    public void testAssertThrows_copyLarge_readerToWriterWithBuffer_bufferNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge(IOUtilsUtils.reader(), IOUtilsUtils.writer(), (char[]) null));
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_readerToWriterWithBuffer_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copyLarge(IOUtilsUtils.readerIOException(), IOUtilsUtils.writer(), new char[10]));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_readerToWriterWithBuffer_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copyLarge(IOUtilsUtils.reader(), IOUtilsUtils.writerIOException(), new char[10]));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copyLarge_readerToWriter_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge((Reader) null, IOUtilsUtils.writer()));
    }

    @Test
    public void testAssertThrows_copyLarge_readerToWriter_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge(IOUtilsUtils.reader(), (Writer) null));
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_readerToWriter_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copyLarge(IOUtilsUtils.readerIOException(), IOUtilsUtils.writer()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_readerToWriter_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copyLarge(IOUtilsUtils.reader(), IOUtilsUtils.writerIOException()));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_copyLarge_inputStreamToOutputStreamWithOffsetAndBuffer_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge((InputStream) null, IOUtilsUtils.outputStream(), 10, 10, new byte[500]));
    }

    @Test
    public void testAssertThrows_copyLarge_inputStreamToOutputStreamWithOffsetAndBuffer_outNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge(IOUtilsUtils.inputStream(), (OutputStream) null, 10, 10, new byte[500]));
    }

    @Test
    public void testAssertThrows_copyLarge_inputStreamToOutputStreamWithOffsetAndBuffer_bufferNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.copyLarge(IOUtilsUtils.inputStream(), IOUtilsUtils.outputStream(), 10, 10, (byte[]) null));
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_inputStreamToOutputStreamWithOffsetAndBuffer_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copyLarge(IOUtilsUtils.inputStreamIOException(), IOUtilsUtils.outputStream(), 10, 10, new byte[500]));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_inputStreamToOutputStreamWithOffsetAndBuffer_writeIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copyLarge(IOUtilsUtils.inputStream(), IOUtilsUtils.outputStreamIOException(), 10, 10, new byte[500]));
        assertEquals("write", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_copyLarge_inputStreamToOutputStreamWithOffsetAndBuffer_offsetInvalid() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.copyLarge(IOUtilsUtils.byteArrayInputStream(), IOUtilsUtils.byteArrayOutputStream(), 1000, 100, new byte[10]));
        assertEquals("Bytes to skip: 1000 actual: 200", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_contentEqualsIgnoreEOL_input1Null() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.contentEqualsIgnoreEOL((Reader) null, IOUtilsUtils.charArrayReader()));
    }

    @Test
    public void testAssertThrows_contentEqualsIgnoreEOL_input2Null() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.contentEqualsIgnoreEOL((Reader) null, IOUtilsUtils.charArrayReader()));
    }

    @Test
    public void testAssertThrowsMessage_contentEqualsIgnoreEOL_input1ReadIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.contentEqualsIgnoreEOL(IOUtilsUtils.readerIOException(), IOUtilsUtils.charArrayReader()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_contentEqualsIgnoreEOL_input2ReadIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.contentEqualsIgnoreEOL(IOUtilsUtils.charArrayReader(), IOUtilsUtils.readerIOException()));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_skipFully_readableByteChannel_toSkipNegative() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.skipFully(IOUtilsUtils.readableByteChannel(), -1));
        assertEquals("Bytes to skip must not be negative: -1", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_skipFully_readableByteChannel_toSkipInvalid() {
        final java.io.EOFException thrown = assertThrows(java.io.EOFException.class, () -> IOUtils.skipFully(IOUtilsUtils.readableByteChannel(), 10));
        assertEquals("Bytes to skip: 10 actual: 0", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_skipFully_readableByteChannel_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.skipFully(IOUtilsUtils.readableByteChannelIOException(), 10));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_skipFully_readableByteChannel_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.skipFully((ReadableByteChannel) null, 10));
    }

    @Test
    public void testAssertThrowsMessage_skipFully_reader_toSkipNegative() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.skipFully(IOUtilsUtils.reader(), -1));
        assertEquals("Skip count must be non-negative, actual: -1", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_skipFully_reader_toSkipInvalid() {
        final java.io.EOFException thrown = assertThrows(java.io.EOFException.class, () -> IOUtils.skipFully(IOUtilsUtils.readerEOF(), 10));
        assertEquals("Chars to skip: 10 actual: 0", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_skipFully_reader_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.skipFully(IOUtilsUtils.readerIOException(), 10));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_skipFully_reader_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.skipFully((Reader) null, 10));
    }

    @Test
    public void testAssertThrowsMessage_skipFully_inputStream_toSkipNegative() {
        final java.lang.IllegalArgumentException thrown = assertThrows(java.lang.IllegalArgumentException.class, () -> IOUtils.skipFully(IOUtilsUtils.inputStream(), -1));
        assertEquals("Bytes to skip must not be negative: -1", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_skipFully_inputStream_toSkipInvalid() {
        final java.io.EOFException thrown = assertThrows(java.io.EOFException.class, () -> IOUtils.skipFully(IOUtilsUtils.inputStreamEOF(), 10));
        assertEquals("Bytes to skip: 10 actual: 0", thrown.getMessage());
    }

    @Test
    public void testAssertThrowsMessage_skipFully_inputStream_readIOException() {
        final java.io.IOException thrown = assertThrows(java.io.IOException.class, () -> IOUtils.skipFully(IOUtilsUtils.inputStreamIOException(), 10));
        assertEquals("read", thrown.getMessage());
    }

    @Test
    public void testAssertThrows_skipFully_inputStream_inNull() {
        assertThrows(java.lang.NullPointerException.class, () -> IOUtils.skipFully((InputStream) null, 10));
    }
}
