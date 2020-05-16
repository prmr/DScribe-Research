package org.apache.commons.io;

public class ByteOrderMarkUtils {
	
	public static ByteOrderMark testBOM() 
	{
		return new ByteOrderMark("test", 1);
	}
}
