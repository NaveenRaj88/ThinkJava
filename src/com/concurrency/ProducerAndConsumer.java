package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Factory {
	private String product;

	public synchronized String getProduct() {
		String productTemp = product;
		product = null;
		return productTemp;
	}

	public synchronized void setProduct(String product) {
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
				System.out.println("starting to consume");
				System.out.println("consumed " + factory.getProduct());
				factory.wait();
				notifyAll();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
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
				System.out.println("starting to produce");
				factory.setProduct(Double.toString(Math.random()));
				System.out.println("produced ");
				factory.wait();
				notifyAll();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class ProducerAndConsumer {

	public static void main(String[] args) throws InterruptedException {
		Factory factory = new Factory();
		ExecutorService ex = Executors.newCachedThreadPool();
		ex.execute(new Producer(factory));
		ex.execute(new Consumer(factory));
		TimeUnit.SECONDS.sleep(6);
		ex.shutdown();
	}

}
