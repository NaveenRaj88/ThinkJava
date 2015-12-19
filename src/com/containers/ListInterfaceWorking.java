package com.containers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceWorking {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("d");
		arrayList.add("e");
		
		List<String> linkedList =new LinkedList<>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		
		System.out.println(linkedList.get(3));
	}
	
}
