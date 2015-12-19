package tij.generics;

import java.util.List;
import java.util.Map;

import com.typeinformation.Person;
import com.typeinformation.Pet;

public class LimitsOfInference {
	static void f(Map<Person, List<? extends Pet>> petPeople) {
	}

	public static void main(String[] args) {
		// f(New.map()); // Does not compile
	}
}
