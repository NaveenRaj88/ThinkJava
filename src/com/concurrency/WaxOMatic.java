package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Car {
	private boolean waxOn;

	public synchronized void waxed() {
		waxOn = true;
//		notifyAll();
		notify();
	}

	public synchronized void buffed() {
		waxOn = false;
//		notifyAll();
		notify();
	}

	public synchronized void waitForWaxing() throws InterruptedException {
		if (waxOn == false) {
			wait();
		}
	}

	public synchronized void waitForBuffing() throws InterruptedException {
		if (waxOn == true) {
			wait();
		}
	}
}

class WaxOn implements Runnable {
	private Car car;

	public WaxOn(Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				System.out.println("Wax On!");
				TimeUnit.MILLISECONDS.sleep(200);
				car.waxed();
				car.waitForBuffing();
			}
		} catch (InterruptedException ex) {
			System.out.println("exiting via interrupt");
		}

	}
}

class WaxOff implements Runnable {
	private Car car;

	public WaxOff(Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				car.waitForWaxing();
				System.out.println("Wax Off!");
				TimeUnit.MILLISECONDS.sleep(200);
				car.buffed();
			}
		} catch (InterruptedException e) {
			System.out.println("exiting via interrupted exception");
		}
	}

}

public class WaxOMatic {
	public static void main(String[] args) throws InterruptedException {
		Car car = new Car();
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute(new WaxOn(car));
		executor.execute(new WaxOff(car));
		TimeUnit.MILLISECONDS.sleep(2000);
		executor.shutdownNow();
	}
}