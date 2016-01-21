package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

public class FileLocking {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileOutputStream fout = new FileOutputStream("data.txt");
		FileLock fl = fout.getChannel().tryLock();
		if(fl != null){
			System.out.println("Locked File");
			TimeUnit.MILLISECONDS.sleep(1000);
			fl.release();
			System.out.println("lock released");
		}
		fout.close();
	}
}
