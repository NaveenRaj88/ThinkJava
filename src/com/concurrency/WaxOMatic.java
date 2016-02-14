package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Car {
	private boolean waxOn = false;

	public synchronized void waxed() {
		waxOn = true;
		notifyAll();
	}

	public synchronized void buffed() {
		waxOn = false;
		notifyAll();
	}

	public synchronized void waitForWaxing() throws InterruptedException {
		while (!waxOn) {
			wait();
		}
	}

	public synchronized void waitForBuffing() throws InterruptedException {
		while (waxOn) {
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
			while (true) {
				System.out.println("waxing the car");
				TimeUnit.MILLISECONDS.sleep(20);
				car.waxed();
				car.waitForBuffing();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Exiting via interrupt");
		}
		System.out.println("Ending waxing task");
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
			while (true) {
				car.waitForWaxing();
				System.out.println(" buffing the car");
				TimeUnit.MILLISECONDS.sleep(20);
				car.buffed();
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Exiting via interrupt");
		}
		System.out.println("Ending buffing task");
	}
}

public class WaxOMatic {
	public static void main(String[] args) throws InterruptedException {
		Car car = new Car();
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute(new WaxOn(car));
		executor.execute(new WaxOff(car));
		TimeUnit.SECONDS.sleep(5);
		executor.shutdownNow();
	}
}