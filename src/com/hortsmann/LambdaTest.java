package com.hortsmann;

import java.util.Arrays;

public class LambdaTest {

	public static void main(String[] args) {
		String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
		System.out.println(Arrays.toString(planets));
		System.out.println("sort by dictionary order");
		Arrays.sort(planets);
		System.out.println(Arrays.toString(planets));
		System.out.println("sort using the length comparator");
		Arrays.sort(planets, (s1,s2) -> {return s1.length() - s2.length();});
		System.out.println(Arrays.toString(planets));
	}
}
