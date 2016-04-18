package com.inheritence;

class Employees{
	
}

class Manager extends Employees{
	
}


public class ArrayInheritence {

	public static void main(String[] args) {
		Manager[] m = new Manager[3];
		Employees[] e = m;
		e[0]= new Employees();
	}
}
