package com.containers;

import net.mindview.util.Stack;

public class EvalExpression {
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		Stack stObj = new Stack();
		String s = "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—";
		int len =s.length();
		System.out.println(len);
		
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)=='+')
			{				
				stObj.push(s.charAt(++i));					
			}
			else if(s.charAt(i)=='-' || s.charAt(i)=='—')
			{
				
				System.out.println(stObj.pop());
			}
			else
			{
				stObj.push(s.charAt(i++));
			}
			
		}
		System.out.println(stObj);
		System.out.println(System.currentTimeMillis()-start);

	}
	
}
