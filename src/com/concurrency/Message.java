package com.concurrency;



	public class Message {

		public static void main(String[] args) {
			Message msg = new Message();
			Notifier notifier = new Notifier(msg);
			Waiter waiter = new Waiter(msg);
			notifier.start();
			waiter.start();
			}

	}
	
	
	class Notifier extends Thread{

		Message msg = null;
		Notifier(Message msg){
			this.msg = msg;
		}
		@Override
			public void run() {
				synchronized (msg) {
				System.out.println("Before Notify");
				msg.notify();
				System.out.println("After Notify");
				}
		}
}




 class Waiter extends Thread{

	 Message msg = null;
	 Waiter(Message msg){
		 this.msg = msg;
	 }
	 @Override
	 public void run() {
		 synchronized (msg) {
			 try {
				 System.out.println("Before Wait");
				 msg.wait();
				 System.out.println("After Wait");
			 } catch (InterruptedException e) {
				 // TODO Auto-generated catch block
				 e.printStackTrace();
			 }
		 }
	 }

 }


