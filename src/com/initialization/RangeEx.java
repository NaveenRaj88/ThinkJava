package com.initialization;

import java.util.Arrays;

public class RangeEx {

	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(filleRange(3, 26, 3)));
	}
	
	public static int[] filleRange(int start, int end, int step){
		int size = (end-start)/step+1;
		int[] rangeArray = new int[size];
		for (int i = 0; i < size; i++) {
			rangeArray[i]=start+(i*step);
		}
		return rangeArray;
	}
}