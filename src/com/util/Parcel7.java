package com.util;

interface Contents{
	
}


public class Parcel7 {
	public Contents contents(){
		return new Contents(){
			private int i=11;
			public int value(){
				return i;
			}
			
		};
	}
	public static void main(String[] args) {
		Parcel7 p7 = new Parcel7();
		Contents c = p7.contents();
		c.
	}
}
