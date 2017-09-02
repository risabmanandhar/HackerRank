package HackerRank;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
	File file = new File("D:\\Pictures");
	List<File> directories = new ArrayList<>();
	List<MyFileReaderRunnable> r = new ArrayList<>();
	for (File f : file.listFiles()) {
	    if (f.isDirectory()) {
		directories.add(f);
		r.add(new MyFileReaderRunnable(f));
	    }
	}
	Thread[] threads = new Thread[directories.size()];
	MyFileReaderRunnable r1;
	for (int i = 0; i < threads.length; i++) {
	    r1 = new MyFileReaderRunnable(new File(file.getName() + "\\" + directories.get(i)));
	    threads[i] = new Thread(r1);
	    threads[i].start();
	    Thread.sleep(1000);
	    System.out.println(r1.fileName() + "\t" + r1.getFileList().size());
	}
    }
}