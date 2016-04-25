package com.inheritence;

public class ClassA {

	public int a = 10;

	public static String cons = "cons";
	public int aint = 20;
	public String aString = "astring";

	public ClassA() {
		System.out.println("private classa constructor");
	}
	// public ClassA(int i){
	// System.out.println("public classa constructor");
	// }

	public final void callsA() {

	}

	public static void callCons() {
		System.out.println("calling ClassA");
	}

	int i;
}
