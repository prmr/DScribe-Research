package org.apache.commons.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EndianUtilsUtils {
	
	public static final Double DOUBLE = Double.longBitsToDouble(0x0102030405060708L);
	public static final Float FLOAT = Float.intBitsToFloat(0x01020304);
	public static final Integer INTEGER = 0x01020304;
	public static final Long LONG = 0x0102030405060708L;
	public static final Short SHORT = (short) 0x0102; 
	
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
	
	public static byte[] bytes() 
	{
		return new byte[] { 0x08, 0x07, 0x06, 0x05, 0x04, 0x03, 0x02, 0x01 };
	}
	
	public static  final ByteArrayInputStream inputStreamEmpty() 
	{
		return new ByteArrayInputStream(new byte[] {});
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
}
