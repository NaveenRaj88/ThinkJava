package com.inheritence;

public class ClassB extends ClassA {

	// public static int cons=1;

	public ClassB() {
		System.out.println(a);
	}

	public ClassB(int i) {

	}

	public static void callCons() {
		System.out.println("calling ClassB");
	}

	public void callPrivate() {
		// ClassA a = new ClassA(1);
	}

	public static void main(String[] args) {
		ClassB b = new ClassB();
		ClassA a = new ClassB();

		// b.callPrivate();

//		a.callCons();
//		b.callCons();
		// System.out.println(cons);
		// callCons(); 
		
		
	}

	public void method1(int i) {
		a = 20;
		System.out.println(cons);
	}

	public int method1() {
		return 1;
	}

}
