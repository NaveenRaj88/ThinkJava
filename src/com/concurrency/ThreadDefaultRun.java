package com.concurrency;

public class ThreadDefaultRun extends Thread{

	public static void main(String[] args) throws InterruptedException  {
		Thread t = new Thread(new ThreadDefaultRun());
		t.start();
		
		t.sleep(MAX_PRIORITY);
		System.out.println(t.getPriority());
//		System.out.println((t.getStackTrace())[1].getFileName());
		for (StackTraceElement th : t.getStackTrace()) {
			System.out.println(th.getFileName()+"      "+th.getMethodName());
		}
		Thread main = Thread.currentThread();
//		main.sleep(30000);
		System.out.println(main.getPriority());
		
	}
}
