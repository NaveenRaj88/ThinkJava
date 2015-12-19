package com.exception;


abstract class absClass{
	public  final void meth1() throws RuntimeException{
		
	}
}
public class OveridingExceptions extends absClass{
	
	public static void main(String[] args)  {
		OveridingExceptions o = new OveridingExceptions();
		o.meth1();
		int i=10;
		System.out.println(new Integer(10) == 10);
	}
}
