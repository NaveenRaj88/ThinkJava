package com.concurrency;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadlockingDiningPhilosophers {

	public static void main(String[] args) throws IOException {
		int ponder = 5;
		ExecutorService exec = Executors.newCachedThreadPool();
		Chopstick[] stick = new Chopstick[ponder];
		for (int i = 0; i < ponder; i++) {
			stick[i] = new Chopstick();
		}
		for (int i = 0; i < ponder; i++) {
			exec.execute(new Philosopher(stick[i], stick[(i+1)%ponder], i, ponder));
		}
		System.out.println("press enter to quit");
		System.in.read();
		exec.shutdownNow();
	}
}
