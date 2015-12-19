package com.initialization;

public abstract class InheritPublicConstructorSingleton extends PublicConstructorSingleton {

	public InheritPublicConstructorSingleton() throws InstantiationException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws InstantiationException {
//		InheritPublicConstructorSingleton in = new InheritPublicConstructorSingleton();
		PublicConstructorSingleton p = new PublicConstructorSingleton();
		PublicConstructorSingleton in1= getPublicConstructorSingleton();
		System.out.println(p == in1);
	}
}
