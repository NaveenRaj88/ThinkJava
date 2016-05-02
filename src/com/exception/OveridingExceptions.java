package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

abstract class absClass{
	public  final void meth1(){
		
	}
	
	public abstract void except() throws IOException;
}
public class OveridingExceptions extends absClass{
	
	public static void main(String[] args) throws FileNotFoundException,IOException  {
		OveridingExceptions o = new OveridingExceptions();
		o.meth1();
		int i=10;
		System.out.println(new Integer(10) == 10);
		new BigDecimal("2343").s
	}

	@Override
	public void except() throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
		
	}
}
