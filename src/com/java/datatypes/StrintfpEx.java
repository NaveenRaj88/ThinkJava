package com.java.datatypes;

public class StrintfpEx {

	public static void main(String[] args) {
		System.out.println(2.0-1.1);
		
		
		System.out.println((byte)230);
		
		int a =0;
		int b=1;
		int c = a!=0?(a+3):(b=4);
		System.out.println(c);
		int fourthBitFromRight = (b & 0b1000) / 0b1000;
		System.out.println(fourthBitFromRight);
	}
}
