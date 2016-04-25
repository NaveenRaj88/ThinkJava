package com.hortsmann;

public interface Java8Interfaces {

	public static int i = 10;
	
	public static int getCounter(){
		return i+2;
	}
	
	default void getClassName(){
		System.out.println("Java8Interfaces");
	}
	
	public static void main(String[] args) {
		
	}
}
