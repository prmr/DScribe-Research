package org.apache.commons.io;

import java.io.IOException;
import java.io.OutputStream;

public class HexDumpUtils {
	
	public static OutputStream outputStreamWriteIOException() 
	{
		return new OutputStream() 
		{
            @Override
            public void write(final int b) throws IOException 
            { 
            	throw new IOException("write");
            }
        };
	}
	
	public static OutputStream outputStreamFlushIOException() 
	{
		return new OutputStream() 
		{
            @Override
            public void flush() throws IOException 
            { 
            	throw new IOException("flush");
            }

			@Override
			public void write(int b) throws IOException {}
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
	
	public static byte[] bytes() 
	{
		return "test".getBytes();
	}
}
