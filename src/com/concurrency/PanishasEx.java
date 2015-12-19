package com.concurrency;

public class PanishasEx implements Runnable {
	
	Thread t;
	int click=0;
	boolean running=true;
	
	public PanishasEx(int p){
		t= new Thread(this);
		t.setPriority(p);
	}

	@Override
	public void run() {
		
		while(running){
		click ++;
		}
	}
	
	public void start(){
		
		t.start();
	}
	
	public void stop(){
		running =false;
	}

}
