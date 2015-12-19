package com.containers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackEx {

	
	
	public static void main(String[] args) {
		
		int d = 0xD;
//		List<StackVO> stackVOs = new ArrayList<StackVO>();
//		StackVO svo = new StackVO();
//		svo.id=1;
//		stackVOs.add(svo);
//		svo = new StackVO();
//		svo.id=2;
//		stackVOs.add(svo);
//		System.out.println(stackVOs);
		
		System.out.printf("%d\n", d);
		
		int x = 4;
		int y = x++;
		System.out.println(y +"  "+ x);
	}
	
	
}

class StackVO{
	public String name;
	
	public int id;
}