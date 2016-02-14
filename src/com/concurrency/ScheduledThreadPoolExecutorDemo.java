package com.concurrency;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ScheduledTask implements Runnable {
	private static int counter;
	private int id = counter++;

	@Override
	public void run() {
		try {
			System.out.println("Running Scheduled Task " + id);
			TimeUnit.MILLISECONDS.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Scheduled Task " + id + " interrupted");
		}
	}

	@Override
	public String toString() {
		return "ScheduledTast " + id;
	}
}

public class ScheduledThreadPoolExecutorDemo {
	public static void main(String[] args) throws InterruptedException {
		ScheduledThreadPoolExecutor scheduler  = new ScheduledThreadPoolExecutor(10);
		for (int i = 0; i < scheduler.getCorePoolSize(); i++) {
			scheduler.schedule(new ScheduledTask(), 10, TimeUnit.MILLISECONDS);
		}
		scheduler.shutdown();
//		scheduler.awaitTermination(1, TimeUnit.MILLISECONDS);
//		TimeUnit.SECONDS.sleep(1);
	}
	
}
