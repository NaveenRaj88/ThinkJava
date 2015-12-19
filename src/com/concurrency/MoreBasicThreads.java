package com.concurrency;

public class MoreBasicThreads {
	public static void main(String[] args) {
		LiftOff l = new LiftOff();
		for(int i = 0; i < 5000; i++)
		new Thread(l).start();
		System.out.println("Waiting for LiftOff");
		}
}
