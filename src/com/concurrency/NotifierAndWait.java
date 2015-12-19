package com.concurrency;

public class NotifierAndWait {
public static void main(String[] args) {
	NotifierAndWait n = new NotifierAndWait();
	Notifiert notifier = new Notifiert(n);
	Waitert waiter = new Waitert(n);
	Thread notifiert = new Thread();
	Thread waitert = new Thread();
	notifiert.start();
	waitert.start();
	
}
	
}


class Notifiert implements Runnable{
	
	NotifierAndWait n;
	public Notifiert(NotifierAndWait n) {
		this.n=n;
	}

	@Override
	public void run() {
		n.notify();
		
	}
}

class Waitert implements Runnable{
	NotifierAndWait n;
	public Waitert(NotifierAndWait n) {
		this.n=n;
	}

	@Override
	public void run() {
		try {
			n.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}