package com.loops;

import java.util.ArrayList;
import java.util.Collection;

public class ForEachLoops {

	
	public static void addProperties(Collection<Employee> proxy){
		for (Employee e : proxy) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Collection<Employee> s = new ArrayList<Employee>();
		s.add(null);
		addProperties(s);
	}
	
	
}

class Employee
{
	private String name;
	private int id;
	
}