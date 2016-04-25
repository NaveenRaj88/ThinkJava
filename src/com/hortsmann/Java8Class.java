package com.hortsmann;

public class Java8Class implements Java8Interfaces, Java8Interfaces1 {

	public void getClassName(){
		Java8Interfaces.super.getClassName();
	}
	
	public static void main(String[] args) {
		Java8Class j = new Java8Class();
		j.getClassName();
	}
}
