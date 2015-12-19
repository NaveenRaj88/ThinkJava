package com.inheritence;

public class ClassB extends ClassA{
	
	int a=25;
	public ClassB() {
		System.out.println(a);
	}
	
	public ClassB(int i){
		
	}
	
	public void callPrivate(){
//		ClassA a = new ClassA(1);
	}
	
	public static void main(String[] args) {
		ClassB b = new ClassB();
//		ClassA a = new ClassB();
		//b.callPrivate();
	}
	
	public void method1(int i){
		a=20;
	}
	
	public int method1(){
		return 1;
	}
}
