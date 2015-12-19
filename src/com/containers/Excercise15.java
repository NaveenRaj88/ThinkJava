package com.containers;

import java.util.HashMap;

import net.mindview.util.Stack;

public class Excercise15 {
	
	static String sentence="+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—";
	public static void main(String[] args) {
		long i=System.currentTimeMillis();
		Stack<Character> stack = new Stack<>();
		char[] chars = sentence.toCharArray();
		int temp=0;
		for (temp = 0; temp < chars.length; temp++) {
			if(chars[temp] == '+'){
				stack.push(chars[++temp]);
			}
			else if (chars[temp] == '-' || chars[temp] == '—') {
				System.out.println(stack.pop());
			}
		}
		System.out.println(stack);
		System.out.println(System.currentTimeMillis()-i);
	}
	

}
