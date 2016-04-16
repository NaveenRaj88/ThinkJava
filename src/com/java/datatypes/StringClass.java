package com.java.datatypes;

public class StringClass {

	public static void main(String[] args) {
		String greet = "Hello";
		
		char c = (char) greet.codePointAt(0);
		System.out.println(c);
	}
}
