package org.apache.commons.io;

import java.io.File;

import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileUtilsUtils {
	
	public static final String CHARSET_VALID = "UTF-8";
	public static final String CHARSET_ILLEGAL = "@*!?"; 
	public static final String CHARSET_UNSUPPORTED = "unsupported";
	public static final List<String> LINES = Arrays.asList(new String[]{"a", "b", "c"});
	public static final String BASE = "testResources/";
	public static final File ROOT = new File(BASE);
	
	public static final FileFilter TXT_FILTER = new FileFilter() 
	{
        @Override
        public boolean accept(File file) {
           if (file.getName().endsWith(".txt")) 
           {
              return true;
           }
           return false;
        }
    };
	
    public static File file() throws IOException 
	{
    	File file = createFile(BASE + "file.txt");
    	final String text = "This is a test text file.";
        FileUtils.writeStringToFile(file, text, "US-ASCII");
        return file;
	}
	
    public static File fileNonExistent() throws IOException 
	{
		return createFile(BASE + "file-non-existent.txt");
	}
    
	public static File fileNotReadable() throws IOException
	{
    	File file = createFile(BASE + "file-not-readable.txt");
		FileUtils.touch(file);
		file.setReadable(false);
		return file;
	}
	
	public static File fileNotWritable() throws IOException
	{
		File file = createFile(BASE + "file-not-writable.txt");
		FileUtils.touch(file);
		file.setWritable(false);
		return file;
	}
	
	public static File dir() throws IOException
	{
		File dir = createDir(BASE + "dir");
		dir.mkdir();
		return dir;
	}
	
	public static File subDir() throws IOException
	{
		dir();
		File subDir = createDir(BASE + "dir/subDir");
		subDir.mkdir();
		return subDir;
	}
	
	public static File dirNonExistent() throws IOException 
	{
		return createDir(BASE + "dirNonExistent");
	}
	
	public static File subDirNonExistent() throws IOException
	{
		dir();
		return createDir(BASE + "dir/subDirNonExistent");
	}
	
	public static File dirNotReadable() throws IOException
	{
		File dir = createDir(BASE + "dirNotReadable");
		dir.mkdir();
		dir.setReadable(false);
		return dir;
	}
	
	public static File dirNotWritable() throws IOException
	{
		File dir = createDir(BASE + "dirNotWritable");
		dir.mkdir();
		dir.setWritable(false);
		return dir;
	}
	
	public static File dirNonDeletableFile() throws IOException, InterruptedException 
	{
		File dir = createDir(BASE + "dirNonDeletableFile");
		dir.mkdir();
		File file = createFile(dir.getPath() + "/file-non-deletable.txt");
        FileUtils.touch(file);
        chmod(dir, 500, false);
        return dir;
	}
	
	public static FileShorter fileShorter() throws IOException
	{
		String name = BASE + "file-shorter.txt";
		Files.deleteIfExists(Paths.get(name));
		return new FileShorter(name);
	}
	
	public static DirIOException dirIOException() throws IOException
	{
		String name = BASE + "IOExceptionDir";
		Files.deleteIfExists(Paths.get(name));
		DirIOException dir = new DirIOException(name);
		dir.mkdir();
		return dir;
	}

	public static FileMkdirFails fileMkdirFails() throws IOException
	{
		String name = BASE + "dirMkdirFails";
		Files.deleteIfExists(Paths.get(name));
		return new FileMkdirFails(name);
	}
	
	public static FileParentMkdirFails fileParentMkdirFails() throws IOException
	{
		String name = BASE + "parentNoMkdirFile";
		Files.deleteIfExists(Paths.get(name));
		FileParentMkdirFails f = new FileParentMkdirFails(name);
		FileUtils.touch(f);
		return f;
	}
	
	public static FileSetLastModifiedFails fileSetLastModifiedFails() throws IOException
	{
		String name = BASE + "set-last-modified-fails.txt";
		Files.deleteIfExists(Paths.get(name));
		return new FileSetLastModifiedFails(name);
	}
		
	public static URL[] URLS() throws MalformedURLException 
	{
		return new URL[]{ new URL("http", "test.org", "file.txt") };
	}
	
	public static URL URL() throws MalformedURLException 
	{
		return new URL("https://www.google.com/");
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
	
	// Test helper class to pretend a file is shorter than it is.
	static class FileShorter extends File {

        public FileShorter(String name) {
            super(name);
        }

        @Override
        public long length() 
        {
            return super.length() - 1;
        }
	}
	
	// Test helper class to pretend a directory that throws IOException when calling getCanonicalPath().
	static class DirIOException extends File 
	{
        public DirIOException(String name) 
        {
            super(name);
        }

        @Override
        public String getCanonicalPath() throws IOException
        {
        	throw new IOException("getCanonicalPath");
        }
	}
	
	// Test helper class to pretend a File for which mkdir() and mkdirs() fail.
	static class FileMkdirFails extends File 
	{
        public FileMkdirFails(String name) 
        {
            super(name);
        }

        @Override
        public boolean mkdirs() 
        {
        	return false;
        }
        
        @Override
        public boolean mkdir() 
        {
        	return false;
        }
        
        @Override
        public boolean isDirectory()
        {
        	return false;
        }
	}
	
	// Test helper class to pretend a File whose parent's mkdir() and mkdirs() fail.
	static class FileParentMkdirFails extends File 
	{
        public FileParentMkdirFails(String name) 
        {
            super(name);
        }

        @Override
        public File getParentFile()
        {
        	File parent = null; 
        	try { parent = fileMkdirFails(); } 
        	catch (IOException e) { e.printStackTrace(); } 
        	return parent;
        }
	}
	
	// Test helper class to pretend a File for which setLastModified(long) fails.
	static class FileSetLastModifiedFails extends File 
	{
        public FileSetLastModifiedFails(String name) 
        {
            super(name);
        }

        @Override
        public boolean setLastModified(long time)
        {
        	return false;
        }
	}
	
	private static File createFile(String name) throws IOException
	{
		Files.deleteIfExists(Paths.get(name));
		return new File(name);
	}
	
	private static File createDir(String name) throws IOException
	{
		File file = new File(name);
		if (file.exists())
		{
			FileUtils.forceDelete(file);
		}
		return new File(name);
	}
	
	private static boolean chmod(final File file, final int mode, final boolean recurse) throws InterruptedException 
	{
		final List<String> args = new ArrayList<>();
        args.add("chmod");

        if (recurse) { args.add("-R"); }

        args.add(Integer.toString(mode));
        args.add(file.getAbsolutePath());

        Process proc;

        try 
        {
            proc = Runtime.getRuntime().exec(args.toArray(new String[args.size()]));
        } 
        catch (final IOException e) 
        {
            return false;
        }
        
        final int result = proc.waitFor();
        return result == 0;
    }
}
