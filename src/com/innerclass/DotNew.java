package com.innerclass;

public class DotNew {

	public class Inner{
		
	}
	
	public static void main(String[] args) {
		DotNew d = new DotNew();
		DotNew.Inner din = d.new Inner();
	}
}
