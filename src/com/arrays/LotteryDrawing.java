package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many numbers you want to draw");
		int k = in.nextInt();
		
		System.out.print("What is the highest number you can draw? ");
		int n = in.nextInt();
		
		in.close();
		
		int[] numbers = new int[n];
		System.out.println(Arrays.toString(numbers));
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
		}
		System.out.println(Arrays.toString(numbers));
		
		int[] results = new int[k];
		
		for (int i = 0; i < results.length; i++) {
			int ind = (int) (Math.random()*n);
			results[i] = numbers[ind];
			numbers[ind] = numbers[n-1];
			n--;
		}
		Arrays.sort(results);
		System.out.println(Arrays.toString(results));
	}
}
