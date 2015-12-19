package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static net.mindview.util.Print.*;

//: concurrency/waxomatic2/WaxOMatic2.java
//Using Lock and Condition objects.

class Car2 {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private boolean waxOn = false;

	public void waxed() {
		lock.lock();
		try {
			waxOn = true; // Ready to buff
			condition.signalAll();
		} finally {
			lock.unlock();
		}
	}

	public void buffed() {
		lock.lock();
		try {
			waxOn = false; // Ready for another coat of wax
			condition.signalAll();
		} finally {
			lock.unlock();
		}
	}

	public void waitForWaxing() throws InterruptedException {
		lock.lock();
		try {
			while (waxOn == false)
				condition.await();
		} finally {
			lock.unlock();
		}
	}

	public void waitForBuffing() throws InterruptedException {
		lock.lock();
		try {
			while (waxOn == true)
				condition.await();
		} finally {
			lock.unlock();
		}
	}
}

class WaxOn2 implements Runnable {
	private Car2 car2;

	public WaxOn2(Car2 c) {
		car2 = c;
	}

	public void run() {
		try {
			while (!Thread.interrupted()) {
				printnb("Wax On! ");
				TimeUnit.MILLISECONDS.sleep(200);
				car2.waxed();
				car2.waitForBuffing();
			}
		} catch (InterruptedException e) {
			print("Exiting via interrupt");
		}
		print("Ending Wax On task");
	}
}

class WaxOff2 implements Runnable {
	private Car2 car2;

	public WaxOff2(Car2 c) {
		car2 = c;
	}

	public void run() {
		try {
			while (!Thread.interrupted()) {
				car2.waitForWaxing();
				printnb("Wax Off! ");
				TimeUnit.MILLISECONDS.sleep(200);
				car2.buffed();
			}
		} catch (InterruptedException e) {
			print("Exiting via interrupt");
		}
		print("Ending Wax Off task");
	}
}

public class WaxOMatic2 {
	public static void main(String[] args) throws Exception {
		Car2 car = new Car2();
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new WaxOff2(car));
		exec.execute(new WaxOn2(car));
		TimeUnit.SECONDS.sleep(5);
		exec.shutdownNow();
	}
}