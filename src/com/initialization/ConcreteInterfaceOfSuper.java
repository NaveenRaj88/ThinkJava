package com.initialization;

public class ConcreteInterfaceOfSuper implements InterfaceSuper {

	@Override
	public void interMethod() {
		System.out.println("interface super method");
	}
	
	public static synchronized void syncMethod(){
		
	}
	public static void main(String[] args) {
		InterfaceSuper interfaceSuper = new ConcreteInterfaceOfSuper();
		interfaceSuper.hashCode();
		interfaceSuper.interMethod();
	}
}
