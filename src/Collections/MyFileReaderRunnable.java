package HackerRank;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyFileReaderRunnable implements Runnable {
    private File mfile;
    private List<File> fileList = new ArrayList<>();

    public MyFileReaderRunnable(File file) {
	mfile = file;
    }

    public void run() {
	getFiles(mfile);
    }

    private void getFiles(File file) {
	// System.out.println("EXecuting...: " +
	// Thread.currentThread().getName() + file.getAbsolutePath());
	File[] listFiles = file.listFiles();
	if (listFiles != null && listFiles.length > 0) {
	    for (File file2 : listFiles) {
		if (!fileList.contains(file2.getAbsoluteFile())) {
		    if (file2.isFile()) {
			// if (file2.getName().endsWith(".CR2"))
			fileList.add(file2.getAbsoluteFile());
		    }
		}
		getFiles(file2);
	    }
	}
    }

    public List<File> getFileList() {
	return fileList;
    }

    public String fileName() {
	return mfile.getName();
    }
}
