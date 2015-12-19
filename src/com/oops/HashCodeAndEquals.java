package com.oops;

public class HashCodeAndEquals {

	public static void main(String[] args) {
		String s1="id";
		String s2 = new String("id");
		
		System.out.println(s1.hashCode() +"  "+s2.hashCode());
	}
}
