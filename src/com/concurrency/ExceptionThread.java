package com.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExceptionThread implements Runnable{

	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(1);
			throw new RuntimeException();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Executor exec = Executors.newCachedThreadPool();
		exec.execute(new ExceptionThread());
		
//			Thread t = new Thread(new ExceptionThread());
//			MyExceptionHandler m = new MyExceptionHandler();
//			t.setUncaughtExceptionHandler(m);
//			t.start();
		
		
	}
}

class MyExceptionHandler implements Thread.UncaughtExceptionHandler{
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("caught " + e);
		e.printStackTrace();
	}
	
}
