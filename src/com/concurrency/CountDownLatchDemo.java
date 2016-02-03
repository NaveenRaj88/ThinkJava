package com.concurrency;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class TaskPortion implements Runnable {
	private static int counter = 0;
	private final int id = counter++;

	private static Random rand = new Random(47);
	private final CountDownLatch countDownLatch;

	public TaskPortion(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}

	public void run() {
		try {
			doWork();
			countDownLatch.countDown();
		} catch (InterruptedException e) {
			System.out.println("Exiting via interrupted exception");
		}

	}

	private void doWork() throws InterruptedException {
		TimeUnit.MILLISECONDS.sleep(200);
	}

	public String toString() {
		return "TaskRunner " + id;
	}
}

class WaitingTask implements Runnable {
	private static int counter = 0;
	private final int id = counter++;
	private final CountDownLatch countDownLatch;

	public WaitingTask(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}

	public void run() {
		try {
			countDownLatch.await();
			System.out.println("latch barries passed for " + this);
		} catch (InterruptedException e) {
			System.out.println("exiting via interrupt");
		}
	}

	public String toString() {
		return "WaitingTask " + id;
	}
}

public class CountDownLatchDemo {
	static int size =100;
	static CountDownLatch latch = new CountDownLatch(size);

	public static void main(String[] args) throws InterruptedException {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			exec.execute(new WaitingTask(latch));
		}
		TimeUnit.SECONDS.sleep(3);
		for (int i = 0; i < size; i++) {
			exec.execute(new TaskPortion(latch));
		}
		System.out.println("Launched all tasks");
		exec.shutdown();
	}
}
