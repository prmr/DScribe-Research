import org.apache.commons.io.FileCleaningTracker;

//package org.apache.commons.io;

public class FileCleaningTrackerUtils {
	
	public static FileCleaningTracker closedTracker()
	{
		FileCleaningTracker tracker = new FileCleaningTracker();
		tracker.exitWhenFinished();
		return tracker;
	}
}