package com.containers;

import java.awt.DisplayMode;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class CollectionSequence extends AbstractCollection<String> {
	
	private String[] strings = new String[8];
	Random r =new Random(20);
	{
		for (int i = 0; i < strings.length; i++) {
			strings[i] = String.valueOf(r.nextInt());
		}
	}
	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new Iterator(){
			private int index=0;
			@Override
			public boolean hasNext() {
				return index < strings.length;
			}

			@Override
			public Object next() {
				// TODO Auto-generated method stub
				return strings[index++];
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
			
		};
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return strings.length;
	}
	
	public void display(Collection<String> collection){
		for (String string : collection) {
			System.out.println(string);
		}
	}
	
	public void display(Iterator<String> iterator){
		System.out.println("printing iterator");
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
	
	public static void main(String[] args) {
		CollectionSequence c = new CollectionSequence();
		c.display(c);
		c.display(c.iterator());
		
	}
	
}
