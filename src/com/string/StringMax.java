package com.string;

public class StringMax {

	public static void main(String[] args) {
		String s = "";
		
		for (int i = 0; i <100; i++) {
			for (int j = 0; j < 100000; j++) {
				s=s.concat("NaveenKumarANaveenKumarANaveenKumarANaveenKumarANaveenKumarANaveenKumarANaveenKumarANaveenKumarANaveenKumarANaveenKumarA");
			}
			
			System.out.println(i);
		}
		System.out.println(s);
	}
}
