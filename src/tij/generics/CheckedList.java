package tij.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.typeinformation.Cat;
import com.typeinformation.Dog;
import com.typeinformation.Pet;

public class CheckedList {
	@SuppressWarnings("unchecked")
	static void oldStyleMethod(List<? super Dog> probablyDogs) {
		probablyDogs.add(new Cat());
		probablyDogs.add(new Dog());
	}

	public static void main(String[] args) {
		List<Dog> dogs1 = new ArrayList<Dog>();
		oldStyleMethod(dogs1); // Quietly accepts a Cat
		List<Dog> dogs2 = Collections.checkedList(new ArrayList<Dog>(), Dog.class);
		try {
			oldStyleMethod(dogs2); // Throws an exception
		} catch (Exception e) {
			System.out.println(e);
		}
		// Derived types work fine:
		List<Pet> pets = Collections.checkedList(new ArrayList<Pet>(), Pet.class);
		pets.add(new Dog());
		pets.add(new Cat());
	}
}
