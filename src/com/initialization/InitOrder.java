package com.initialization;

class initSub{
	public initSub() {
		System.out.println("init sub");
	}
}

public class InitOrder extends initSub{
	private initSub initSub=new initSub();
	
	public InitOrder() {
		System.out.println("initorder");
	}
	
	public void printInitSubObj(){
		initSub.getClass();
	}
	
	public static void main(String[] args) {
		
		new InitOrder().printInitSubObj();;
		
	}
}
