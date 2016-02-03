package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Factory {
	private String product;

	public synchronized String getProduct() throws InterruptedException {
		while(product == null){
			notify();
			wait();
		}
		String productTemp = product;
		product = null;
		return productTemp;
	}

	public synchronized void setProduct(String product) throws InterruptedException {
		while(this.product != null){
			notify();
			wait();
		}
		this.product = product;
	}

}

class Consumer implements Runnable {

	private Factory factory;

	public Consumer(Factory factory) {
		this.factory = factory;
	}

	public void run() {
		try {
			while (!Thread.interrupted()) {
				System.out.println("consumed " + factory.getProduct());
			}
		} catch (Exception e) {
			System.out.println("exiting via interrupt");
		}
	}
}

class Producer implements Runnable {

	private Factory factory;

	public Producer(Factory factory) {
		this.factory = factory;
	}

	public void run() {
		try {
			while(!Thread.interrupted()){
				System.out.println("producing");
				factory.setProduct(Double.toString(Math.random()));
			}
		} catch (Exception e) {
			System.out.println("exiting via interrupt");
		}
	}
}

public class ProducerAndConsumer {

	public static void main(String[] args) throws InterruptedException {
		Factory factory = new Factory();
		ExecutorService ex = Executors.newCachedThreadPool();
		ex.execute(new Producer(factory));
		ex.execute(new Consumer(factory));
		TimeUnit.SECONDS.sleep(2);
		ex.shutdownNow();
	}

}
