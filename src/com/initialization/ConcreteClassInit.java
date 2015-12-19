package com.initialization;

public class ConcreteClassInit extends AbstractClassInit{

	
	ConcreteClassInit(int marker) {
		super(marker);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		AbstractClassInit ab = new ConcreteClassInit();
	}
}
