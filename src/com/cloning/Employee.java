package com.cloning;

public class Employee implements Cloneable{
	
	String s = new String("Hello");
	
	public static void main(String[] args) throws Exception {
		Employee emp = new Employee();
		Employee emp2 = (Employee) emp.clone();
		System.out.println(emp.s == emp2.s );
	}
	
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		Employee e =  (Employee) super.clone();
		e.s = new String(s);
		return e;
	}
}
