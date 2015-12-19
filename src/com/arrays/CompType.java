package com.arrays;
import static net.mindview.util.Print.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import net.mindview.util.Print;
import tij.generics.Generator;

public class CompType implements Comparable<CompType> {
	int i;
	int j;
	private static int count = 1;

	public CompType(int n1, int n2) {
		i = n1;
		j = n2;
	}

	public String toString() {
		String result = "[i = " + i + ", j = " + j + "]";
		if (count++ % 3 == 0)
			result += "\n";
		return result;
	}

	public int compareTo(CompType rv) {
		return (i < rv.i ? -1 : (i == rv.i ? 0 : 1));
	}

	private static Random r = new Random(47);

	public static Generator<CompType> generator() {
		return new Generator<CompType>() {
			public CompType next() {
				return new CompType(r.nextInt(100), r.nextInt(100));
			}
		};
	}

	public static void main(String[] args) {
		CompType[] a = Generated.array(new CompType[12], generator());
		print("before sorting:");
		print(Arrays.toString(a));
		Arrays.sort(a);
		print("after sorting:");
		print(Arrays.toString(a));
		
		int[] i = new int[]{4,7,1,9};
		print(Arrays.toString(i));
		Arrays.sort(i);
		print(Arrays.toString(i));
		
		Collection<E>
	}
}
