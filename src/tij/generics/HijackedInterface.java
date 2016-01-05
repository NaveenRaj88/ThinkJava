package tij.generics;

import com.typeinformation.Cat;

public class HijackedInterface extends ComparablePet implements Comparable<Cat> {
	// Error: Comparable cannot be inherited with
	// different arguments: <Cat> and <Pet>
	public int compareTo(Cat arg) {
		return 0;
	}
}
