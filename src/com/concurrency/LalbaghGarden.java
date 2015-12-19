package com.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

class LalCount {
	private int count = 0;
	private Random rand = new Random(47);

	public synchronized int increment() {
		int temp = count;
		if (rand.nextBoolean()) // yield half of the time
			Thread.yield();
		return (count = ++temp);
	}

	public synchronized int value() {
		return count;
	}
}

class LalEntrance implements Runnable {
	private static LalCount count = new LalCount();
	private static List<LalEntrance> entrances = new ArrayList<>();
	private int number = 0;
	// Doesn't need synchronization to read.
	private final int id;
	private static volatile boolean canceled = false;

	// Atomic operation on a volatile field:
	public static void cancel() {
		canceled = true;
	}

	public LalEntrance(int id) {
		this.id = id;
		// Keep this task in a list. Also prevents
		// garbage collection of dead tasks:
		entrances.add(this);
	}

	@Override
	public void run() {
		while(!canceled){
			synchronized (this) {
				++number;
			}
			System.out.println(this +" Total: "+ count.increment());
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Sleep interrupted");
			}
		}
	}
	
	public synchronized int getValue(){
		return number;
	}
	
	public String toString(){
		return "Entrance "+id+": "+getValue();
	}
	
	
}

public class LalbaghGarden {

	public static void main(String[] args) {

	}

}
