package com.inheritence;

interface  abs{
	int i=10;
}

interface  abs1{
	int i=20;
}

public abstract class AmbiguousExample implements abs,abs1{
	public static void main(String[] args) {
		System.out.println(i);
	}
}