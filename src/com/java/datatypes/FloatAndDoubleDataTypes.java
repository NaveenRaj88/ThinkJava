package com.java.datatypes;

public class FloatAndDoubleDataTypes {

	public static void main(String[] args) {
		float f = 123.098f;
		System.out.println(f);
		
		
		double d = 123.098;
		System.out.println(d);
		
		System.out.println(d/0 == Double.POSITIVE_INFINITY);
		System.out.println(-d/0 == Double.NEGATIVE_INFINITY);
		System.out.println(Math.sqrt(-d) == Double.NaN);
		System.out.println(Double.isNaN(Math.sqrt(-d)));
		
		
		
	}
}
