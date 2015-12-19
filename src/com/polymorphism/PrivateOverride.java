package com.polymorphism;

import static net.mindview.util.Print.*;

public class PrivateOverride {
	
	public int i=1;
	private void f() {
		print("private f()");
	}

	public static void main(String[] args) {
		PrivateOverride po = new Derived();
		po.f();
		System.out.println(po.i);
	}
}

class Derived extends PrivateOverride {
	public int i=2;
	public void f() {
		print("public f()");
	}
	
	public void f1() {
		print("public f()");
	}
	
//	public static void main(String[] args) {
//		PrivateOverride po = new Derived();
//		System.out.println(po.i);
//		Derived d = new Derived();
//		System.out.println(d.i);
//		
//	}
}
