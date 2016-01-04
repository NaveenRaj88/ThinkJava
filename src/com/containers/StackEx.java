package com.containers;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackEx {
	
	public static void main(String[] args) {
		List<String> stack = new Stack<>();
		stack.addAll(Arrays.asList("hello how are you?".split("")));
		for (String string : stack) {
			System.out.println(string);
		}
	}
}