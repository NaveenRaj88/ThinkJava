package com.concurrency;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Philosopher implements Runnable{
	
	private Chopstick right;
	
	private Chopstick left;
	
	private final int id;
	
	private final int ponderFactor;
	
	private Random random = new Random(47);
	
	private void pause() throws InterruptedException{
		if (ponderFactor ==0){
			return;
		}
		TimeUnit.MILLISECONDS.sleep(random.nextInt(ponderFactor*250));
	}
	public Philosopher(Chopstick right, Chopstick left, int id, int ponder) {
		this.right = right;
		this.left = left;
		this.id = id;
		this.ponderFactor = ponder;
	}
	
	@Override
	public void run() {
		try {
			while(!Thread.interrupted()){
				System.out.println(this + " thinking");
				pause();
				// philosopher become hungry
				System.out.println(this +" grabbing right");
				right.take();
				System.out.println(this+" grabbing left");
				left.take();
				System.out.println(this+ "eating");
				pause();
				right.drop();
				left.drop();
			}
		} catch (InterruptedException e) {
			System.out.println("Exiting via interrupted exception");
		}
	}
	
	public String toString(){
		return "Philosopher "+ id;
	}
	
}
