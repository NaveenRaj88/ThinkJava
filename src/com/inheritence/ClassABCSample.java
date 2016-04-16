package com.inheritence;

public class ClassABCSample {

	public static void main(String[] args) {
		ClassB b = new ClassB();
		ClassC c = (ClassC) b;
	}
}
