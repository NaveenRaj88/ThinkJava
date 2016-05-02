package com.hortsmann.generics;

public class ArrayAlg {

	public static <T> T min(T[] a) // almost correct
	{
		if (a == null || a.length == 0)
			return null;
		T smallest = a[0];
		for (int i = 1; i < a.length; i++)
			if (smallest.compareTo(a[i]) > 0)
				smallest = a[i];
		return smallest;
	}
}
