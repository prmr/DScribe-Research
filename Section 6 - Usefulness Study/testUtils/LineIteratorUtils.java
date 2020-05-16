package org.apache.commons.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class LineIteratorUtils {
		
	public static LineIterator lineIteratorReadIOException() 
	{
		final Reader reader =  new BufferedReader(new StringReader("")) 
		{
	        @Override
	        public String readLine() throws IOException 
	        {
	            throw new IOException("hasNext");
	        }
		};
		return new LineIterator(reader); 
	}
	
	public static LineIterator lineIteratorNoLines() throws IOException 
	{
		final Reader reader = new BufferedReader(new StringReader("")) 
		{
	        @Override
	        public String readLine() throws IOException 
	        {
	            return null;
	        }
		};
		return new LineIterator(reader); 
	}
	
	public static LineIterator lineIteratorCloseIOException() throws IOException 
	{
		final Reader reader =  new BufferedReader(new StringReader("")) 
		{
	        @Override
	        public void close() throws IOException 
	        {
	            throw new IOException("close");
	        }
		};
		return new LineIterator(reader); 
	}
}
	