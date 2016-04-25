package com.hortsmann;

public class Java8InterfaceImpl implements Java8Interfaces{

	public void printCounter(){
		System.out.println("print counter");
	}
	
//	public void getClassName(){
//		System.out.println("Java8InterfaceImpl");
//	}
	public static void main(String[] args) {
		new Java8InterfaceImpl().getClassName();
		Java8Interfaces j = new Java8InterfaceImpl();
		Java8InterfaceImpl ji = new Java8InterfaceImpl();
		
	}
}
