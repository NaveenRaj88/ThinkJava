package com.cloning;

import java.util.Arrays;

public class ArrayCloning {

	
	public static void main(String[] args) {
		int[] iarr = {1,2,3,4,5,6,7};
		int[] jarr = {1,2,3,4,5,6,7};
		
		System.out.println(iarr == iarr.clone());
		System.out.println("iarr"+Arrays.toString(iarr));
		System.out.println("jarr"+Arrays.toString(jarr));
		System.out.println("changing the first element");
		iarr[0] =22;
		System.out.println("iarr"+Arrays.toString(iarr));
		System.out.println("jarr"+Arrays.toString(jarr));
	}
}
