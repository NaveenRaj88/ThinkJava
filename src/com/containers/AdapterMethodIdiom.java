package com.containers;

import java.lang.ref.Reference;
import java.util.Arrays;

public class AdapterMethodIdiom {
	
	public static void main(String[] args) {
		ReversibleArrayList<String> ral = new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
		for (String string : ral) {
			System.out.println(string);
		}
		for (String string : ral.reversed()) {
			System.out.println(string);
		}
	}
}
