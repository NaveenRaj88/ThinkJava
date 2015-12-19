package com.protectedsample;

 class ClassA {

	
	public ClassA() {
		System.out.println("class A");
	}
	
	public ClassA(String s){
		System.out.println("class a string parameter");
	}
	
	public ClassB returnFloat(){
		return  new ClassB(2);
	}
}
