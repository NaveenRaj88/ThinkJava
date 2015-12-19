package com.loops;

import java.util.HashSet;
import java.util.Set;

public class ForEachNullList {

	
	public static void main(String[] args) {
		ForEachNullList f = new ForEachNullList();
		
		for (String string : f.getNames()) {
			System.out.print(string);
		}
	}
	
	private Set<String> getNames(){
		Set<String> displacement = new HashSet<String>();
		displacement.add("150");
		return null;
	}
}
