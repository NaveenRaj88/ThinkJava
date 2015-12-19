package com.protectedsample;

public class ClassB extends ClassA{

	public ClassB(int i) {
		System.out.println("class B");
	}
	
	public static void main(String[] args) {
		ClassB classB = new ClassB(5);
	}
	
	public ClassB returnFloat(){
		return new ClassB(1);
	}
}
