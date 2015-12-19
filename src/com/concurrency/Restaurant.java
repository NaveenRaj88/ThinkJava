package com.concurrency;


class Meal{
	private final int orderNum;
	
	public Meal(int orderNum) {
		this.orderNum = orderNum;
	}
	
	@Override
	public String toString() {
		return "Meal "+orderNum;
	}
}

class WaitPerson implements Runnable{

	private Restaurant restaurant;
	
	public WaitPerson(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	@Override
	public void run() {
		while(!Thread.interrupted()){
			
		}
	}
	
}

public class Restaurant {

}
