package com.containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

public class AddingGroups {

	
		public static void main1(String[] args) {
		Collection<Integer> collection =
				new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Integer[] moreInts = { 6, 7, 8, 9, 10 };
		collection.addAll(Arrays.asList(moreInts));
		// Runs significantly faster, but you can't
		// construct a Collection this way:
		Collections.addAll(collection, 11, 12, 13, 14, 15);
		Collections.addAll(collection, moreInts);
		// Produces a list "backed by" an array:
		List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
		list.set(1, 99); // OK -- modify an element
//		 list.add(21); // Runtime error because the
		// underlying array cannot be resized.
		}
	/*public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11,12,45,23,56,7,8);
		list.add(52);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			int i = it.next();
			System.out.println(i);
		}
		
		for (Integer integer : list) {
			System.out.println();
		}
	}*/
				public static void main(String[] args) {
					Hashtable<String, String> ht = new Hashtable<>();
					ht.put(null, "h");
				}
				
				
				
}
