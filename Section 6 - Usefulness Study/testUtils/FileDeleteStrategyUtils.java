package org.apache.commons.io;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDeleteStrategyUtils {
	
	private static final String BASE = "testResources";
	
	public static FileDeleteStrategy normal() 
	{
		return new FileDeleteStrategy("Normal");
	}

	public static File nonEmptyDir() throws Exception
	{
		String dirName = BASE + "/dir"; 
		Files.deleteIfExists(Paths.get(dirName));
		File dir = new File(dirName);
		dir.mkdir();
		File file = new File(dirName, "file.txt");
		FileUtils.touch(file);
		return dir;
	}
}
