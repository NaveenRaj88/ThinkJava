package com.inheritence;


class Employee{
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object other) {
		return this.name.equals(((Employee)other).name);
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee("naveen");
		Employee emp2 = new Employee("jeevan");
		System.out.println(emp1.equals(emp2));
	}
	
	
	
}
