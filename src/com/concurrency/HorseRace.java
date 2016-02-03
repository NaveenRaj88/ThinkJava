package com.concurrency;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

class Horse implements Runnable{

	private static int counter = 0;
	private final int id = counter++;
	private int strides = 0;
	private static Random rand = new Random(47);
	private static CyclicBarrier cyclicBarrier;
	
	public Horse(CyclicBarrier barrier) {
		this.cyclicBarrier = barrier;
	}
	
	public int getStrides(){
		return strides;
	}
	
	public void run(){
		try{
			while(!Thread.interrupted()){
				synchronized (this) {
					strides += rand.nextInt(3);
				}
				cyclicBarrier.a
			}
		}catch(InterruptedException ex){
			System.out.println("exiting via interrupt");
		}
	}
}
