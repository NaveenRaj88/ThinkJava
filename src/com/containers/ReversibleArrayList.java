package com.containers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import net.mindview.util.Print;

public class ReversibleArrayList<T> extends ArrayList<T> {

	public ReversibleArrayList(Collection<T> c) {
		super(c);

	}
	
	public ReversibleArrayList() {
		// TODO Auto-generated constructor stub
	}

	public Iterable<T> reversed() {
		return new Iterable<T>() {
			int current = size() - 1;

			@Override
			public Iterator<T> iterator() {
				return new Iterator<T>() {

					@Override
					public boolean hasNext() {
						return current > -1;
					}

					@Override
					public T next() {
						return get(current--);
					}

					@Override
					public void remove() {
						throw new UnsupportedOperationException();
					}

				};
			}
		};
	}
	
	public Comparator<String> getForwarwardComparator(){
		return new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length())
				return 1;
				else if (o1.length()< o2.length()) 
					return -1;
				else 
					return 0;
				
				
			}
		};
	}
	
	public Comparator<String> getbackwardComparator(){
		return new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length())
				return -1;
				else if (o1.length()< o2.length()) 
					return 1;
				else 
					return 0;
			}
		};
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("ab");
		list.add("abc");
		list.add("bc");
		list.add("acfd");
		list.add("aer");
		
		ReversibleArrayList<String> r = new ReversibleArrayList<>();
		Collections.sort(list, r.getForwarwardComparator());
		System.out.println(list);
		Collections.sort(list, r.getbackwardComparator());
		System.out.println(list);
	}
}
