package com.concurrency;

import java.util.concurrent.TimeUnit;

public class SyncObject3{
	
	Object obj1 = new Object();
	Object obj2 = new Object();
	Object obj3 = new Object();
	
	
	public void method1(){
		synchronized (obj1) {
			for (int i = 0; i < 10; i++) {
				try {
					obj1.wait();
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("m1");
			}
		}
	}
	
	
	public void method2(){
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("m2");
			}
		}
	}
	
	public void method3(){
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("m3");
			}
		}
	}
	
	public static void main(String[] args) {
		final SyncObject3 s = new SyncObject3();
		
		new Thread(){
			public void run(){
			s.method1();
			}
		}.start();
		new Thread(){
			public void run(){
			s.method2();
			}
		}.start();
		new Thread(){
			public void run(){
			s.method3();
			}
		}.start();
	}
	
}
