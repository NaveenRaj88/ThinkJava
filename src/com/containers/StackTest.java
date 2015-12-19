package com.containers;

import net.mindview.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		for (String string : "MY dog has fleas".split(" ")) {
			stack.push(string);
		}
		while(!stack.empty()){
			System.out.println(stack.pop()+" ");
		}
	}
}
