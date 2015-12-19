package com.containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ForEachWithNullCollection {

	public static int getIndex(int hash, int length){
		System.out.println("hash "+hash+ " length "+length);
		return hash & length;
	}
	
	
	public void findAnagram(String anagram){
		String s1= "tea";
		String s2 = "steal";
		
		char[] char1 = s1.toCharArray();
		char[] char2 = s2.toCharArray();
		int containx =-1;
		for (int i = 0; i < char2.length; i++) {
			if(char1[0] == char2[i]){
				containx = i;
				break;
			}
		}
		if(containx > -1){
			
		}
		
	}
	
	boolean checkfornextWord(char c, int index){
		boolean flag = false;
		//check for the next sequence to the right
		for (int i = index; i < array.length; i++) {
			
		}
		
		return flag;
	}
	public void printNumber(int number){
		String s = String.valueOf(number);
		char[] chari = s.toCharArray();
		int length = chari.length;
		for (int i = length-1; i >= 0; i--) {
			if(Integer.valueOf(i-1)<Integer.valueOf(i)){
					
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		
		
		
		
		Collection<Employee> employees = new ArrayList<Employee>();
		employees.add(null);
		employees.add(null);
		employees.removeAll(Collections.singleton(null));
		
		System.out.println("index "+getIndex(employees.hashCode(), 10));
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
	}
}

class Employee{
	
	private String name;
	private String id;
	
	public Employee(String name, String id) {
		this.name =name;
		this.id=id;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "name = "+getName()+" id = "+getId();
	}
}