package com.protectedsample;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class UtilClass {

	static int i =48;
	
	public static void main(String[] args) {
		System.out.println( BigInteger.probablePrime(39, new Random()));
		UtilClass u = new UtilClass();
		start:
			u.returnStatMeth();
		System.out.println(UtilClass.i +" "+u.i);
		u.i=50;
		System.out.println(UtilClass.i +" "+u.i);
		
	}
	
	public void returnStatMeth(){
		if(true){
			return;
		}
		return;
	}
}
