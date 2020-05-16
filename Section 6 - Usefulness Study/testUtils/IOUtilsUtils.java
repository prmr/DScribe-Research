package org.apache.commons.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.Arrays;
import java.util.List;

public class IOUtilsUtils {

	public static final String LIST_ENDING = "*";
	public static final List<String> LIST = Arrays.asList("Hello", "World!", "How", "Are", "You");
	public static final CharSequence CHAR_SEQ = new StringBuilder("test");
	public static final String CHARSET_VALID = "UTF-8";
	public static final String CHARSET_ILLEGAL = "@*!?"; 
	public static final String CHARSET_UNSUPPORTED = "unsupported";
	
	public static InputStream inputStream() 
	{
		return new InputStream() 
		{
			@Override
			public int read() throws IOException 
			{
				return 0;
			}
		};
	}

	public static InputStream inputStreamIOException() 
	{
		return new InputStream() 
		{
			@Override
			public int read() throws IOException 
			{
				throw new IOException("read");
			}
		};
	}
	
	public static InputStream inputStreamEOF() 
	{
		return new InputStream() 
		{
			@Override
			public int read() throws IOException 
			{
				return -1;
			}
		};
	}

	public static OutputStream outputStream() 
	{
		return new OutputStream() 
		{
			@Override
			public void write(final int b) throws IOException {}
		};
	}
	
	public static OutputStream outputStreamIOException() 
	{
		return new OutputStream() 
		{
			@Override
			public void write(final int b) throws IOException 
			{
				throw new IOException("write");
			}
			
			@Override
			public void write(byte[] b) throws IOException 
			{
				throw new IOException("write");
			}
			
			@Override
			public void write(byte[] b, int off, int len) throws IOException 
			{
				throw new IOException("write");
			}
		};
	}

	public static Reader reader() 
	{
		return new Reader() 
		{
			@Override
			public int read(final char[] cbuf, final int off, final int len) throws IOException 
			{
				return 0;
			}
			
			@Override
			public void close() throws IOException {}
		};
	}
	
	public static Reader readerEOF() 
	{
		return new Reader() 
		{
            @Override
            public int read(final char[] cbuf, final int off, final int len) throws IOException 
            {
                return -1;
            }
            
            @Override
            public void close() throws IOException { }
        };
	}

	public static Reader readerIOException() 
	{
		return new Reader() 
		{
			@Override
			public int read(final char[] cbuf, final int off, final int len) throws IOException 
			{
				throw new IOException("read");
			}
			
			@Override
			public void close() throws IOException {}
		};
	}

	public static Writer writer() 
	{
		return new Writer() 
		{
			@Override
			public void write(final int b) throws IOException {}

			@Override
			public void write(final char[] cbuf, final int off, final int len) throws IOException {}

			@Override
			public void flush() throws IOException {}

			@Override
			public void close() throws IOException {}
		};
	}
	
	public static Writer writerIOException() 
	{
		return new Writer() 
		{
			@Override
			public void write(final int b) throws IOException {}

			@Override
			public void write(final char[] cbuf, final int off, final int len) throws IOException 
			{
				throw new IOException("write");
			}

			@Override
			public void flush() throws IOException {}

			@Override
			public void close() throws IOException {}
			
			@Override
			public void write(String str) throws IOException 
			{
				throw new IOException("write");
			}
			
			@Override
			public void write(char[] cbuf) throws IOException 
			{
				throw new IOException("write");
			}
		};
	}
	
	public static CharArrayReader charArrayReader() 
	{
		char[] carr = new char[200];
	    Arrays.fill( carr, (char)-1);
	    for( int i=0; i< 80; i++){
	        carr[i] = (char) i;
	    }
		return new CharArrayReader(carr);
	}
	
	public static CharArrayWriter charArrayWriter() 
	{
		return new CharArrayWriter();
	}

	public static ByteArrayInputStream byteArrayInputStream() 
	{
		 byte[] iarr = new byte[200];
		 Arrays.fill( iarr, (byte)-1);
		 for( int i=0; i< 80; i++)
		 {
			 iarr[i] = (byte) i;
	     }
		 return new ByteArrayInputStream(iarr);
	}
	
	public static ByteArrayOutputStream byteArrayOutputStream() 
	{
		return new ByteArrayOutputStream();
	}
	
	public static ReadableByteChannel readableByteChannel() 
	{
		return new ReadableByteChannel() {

			@Override
			public boolean isOpen() {
				return false;
			}

			@Override
			public void close() throws IOException {}

			@Override
			public int read(ByteBuffer dst) throws IOException {
				return -1;
			}
		};
	}
	
	public static ReadableByteChannel readableByteChannelIOException() 
	{
		return new ReadableByteChannel() 
		{

			@Override
			public boolean isOpen() 
			{
				return false;
			}

			@Override
			public void close() throws IOException {}

			@Override
			public int read(ByteBuffer dst) throws IOException 
			{
				throw new IOException("read");
			}
		};
	}
	
	public static URI uriUknownProtocol() throws URISyntaxException
	{
		return new URI("htts://www.google.com");
	}
	
	public static URI uriNotAbsolute() throws URISyntaxException
	{
		return new URI("google.com");
	}
}