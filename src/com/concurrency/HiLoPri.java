package com.concurrency;

public class HiLoPri {

	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		PanishasEx hi= new PanishasEx(Thread.NORM_PRIORITY+2);
		PanishasEx lo = new PanishasEx(Thread.NORM_PRIORITY-2);
		
		hi.start();
		lo.start();
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		hi.stop();
		lo.stop();
		
		
		try {
			lo.t.join();
			hi.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("high prioprity"+hi.click);
		System.out.println("low prioropti"+lo.click);
	}

}
