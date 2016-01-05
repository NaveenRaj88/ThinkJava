package com.containers;

import java.util.ArrayList;
import java.util.Random;

import com.typeinformation.Pet;

public class Pets {

	static Pet[] petArray = new Pet[11];

	static {
		petArray[0] = new Pet("muse", 0);
		petArray[1] = new Pet("monkey", 1);
		petArray[2] = new Pet("ant", 2);
		petArray[3] = new Pet("donkey", 3);
		petArray[4] = new Pet("cat", 4);
		petArray[5] = new Pet("dog", 5);
		petArray[6] = new Pet("croc", 6);
		petArray[7] = new Pet("pigeon", 7);
		petArray[8] = new Pet("fish", 8);
		petArray[9] = new Pet("parrot", 9);
		petArray[10] = new Pet("rabbit", 10);

	}

	static Random random = new Random();

	public static ArrayList<Pet> arrayList(int i) {
		ArrayList<Pet> pets = new ArrayList<>();
		for (int j = 0; j <= i; j++) {
			pets.add(randomPet());
		}
		return pets;
	}

	public static Pet randomPet() {
		return petArray[random.nextInt(petArray.length - 1)];
	}
}
