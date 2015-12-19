package com.containers;

import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FailFast {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		Iterator<String> it = c.iterator();
		c.add("a");
		while (it.hasNext()) {
			System.out.println(it.next());
			ReferenceQueue<String> rq = new ReferenceQueue<>();
		}
	}
}
