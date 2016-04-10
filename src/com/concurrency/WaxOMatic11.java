package com.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WaxOMatic11 {

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
				while (!Thread.interrupted()) {
					car.waitForBuffing();
					System.out.println("wax On!");
					TimeUnit.MILLISECONDS.sleep(20);
					car.waxed();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	class WaxOf implements Runnable {
		private Car car;

		public WaxOf(Car car) {
			this.car = car;
		}

		@Override
		public void run() {

			try {
				while (!Thread.interrupted()) {
					car.waitForWaxing();
					System.out.println("wax Off!");
					TimeUnit.MILLISECONDS.sleep(20);
					car.buffed();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {
		WaxOMatic11 waxmat = new WaxOMatic11();
		Car car = waxmat.new Car();
		WaxOn waxOn = waxmat.new WaxOn(car);
		WaxOf waxOff = waxmat.new WaxOf(car);
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(waxOn);
		executor.execute(waxOff);
		TimeUnit.SECONDS.sleep(1);
		executor.shutdownNow();
	}
}
