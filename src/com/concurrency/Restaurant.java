package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Meal {
	private final int orderNum;

	public Meal(int orderNum) {
		this.orderNum = orderNum;
	}

	@Override
	public String toString() {
		return "Meal " + orderNum;
	}
}

class WaitPerson implements Runnable {

	private Restaurant restaurant;

	public WaitPerson(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				synchronized (this) {
					if (restaurant.meal == null) {
						wait();
					}
				}
				System.out.println("wait person got " + restaurant.meal);
				synchronized (restaurant.chef) {
					restaurant.meal = null;
					restaurant.chef.notifyAll();
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Waitperson interrupted");
		}
	}
}

class Chef implements Runnable {

	Restaurant restaurant;
	private int count=0;
	public Chef(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				synchronized (this) {
					if(restaurant.meal != null){
						wait();
					}
				}
				if(++count ==10){
					System.out.println("Out of food closing");
					restaurant.executorService.shutdownNow();
				}
				System.out.println("Order up!");
				synchronized (restaurant.waitPerson) {
					restaurant.meal = new Meal(count);
					restaurant.waitPerson.notifyAll();
				}
				TimeUnit.MILLISECONDS.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("chef interrupted");
		}

	}

}

public class Restaurant {
	Meal meal;
	Chef chef = new Chef(this);
	WaitPerson waitPerson = new WaitPerson(this);
	ExecutorService executorService = Executors.newCachedThreadPool();

	public Restaurant() {
		executorService.execute(waitPerson);
		executorService.execute(chef);
	}

	public static void main(String[] args) {
		new Restaurant();
	}

}
