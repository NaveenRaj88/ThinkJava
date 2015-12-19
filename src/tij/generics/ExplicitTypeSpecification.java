package tij.generics;

import java.util.List;
import java.util.Map;

import com.typeinformation.Person;
import com.typeinformation.Pet;

public class ExplicitTypeSpecification {

	static void sf(Map<Person, List<? extends Pet>> petPeople) {

	}

	<T> T f(Map<Person, List<? extends Pet>> petPeople) {
		return null;
	}

	public static void main(String[] args) {
		new ExplicitTypeSpecification().f(New
				.<Person, List<? extends Pet>> map());
		sf(New.<Person, List<? extends Pet>> map());
	}
}
