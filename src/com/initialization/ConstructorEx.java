package com.initialization;

public class ConstructorEx extends SuperConstructor{

	
	ConstructorEx(String s){
		System.out.println("String");
	}
	
	ConstructorEx(int i, String s){
		this(s);
		System.out.println("int , string");
	}
	
	public static void main(String[] args) {
		ConstructorEx constructorEx = new ConstructorEx(0, "hello");
		System.runFinalization();
		Runtime.getRuntime().runFinalization();
		System.console().printf("%s", args);
	}
	
	public static void CallConstructor(){
	}
	
	public void callConstructor(){
		new ConstructorEx("Hello");
	}
}
