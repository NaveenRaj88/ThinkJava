package com.containers;

import java.util.ArrayList;

public class ArrayIsNotIterable {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		System.out.println(list);
	}
	
}
