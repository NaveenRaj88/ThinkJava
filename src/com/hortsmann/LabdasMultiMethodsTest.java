package com.hortsmann;

public class LabdasMultiMethodsTest {
	
	public static void getDetails(LabdasMultiMethods lab){
		System.out.println(lab.getName("a", "b"));
//		System.out.println(lab.isMajor(18));
	}
	
	public static void main(String[] args) {
		
		getDetails((s1,s2)->{return s1+s2;});
		
	}
}
