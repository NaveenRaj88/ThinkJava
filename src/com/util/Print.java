package com.util;

public class Print {
	public static <T>  void print(T s)
	{
		System.out.println(s+"");
	}
	
	public static void main(String[] args) {
		
		Print p = new Print();
		System.out.println(p);
		System.out.println("hashcode "+ p.hashCode());
	}
}
