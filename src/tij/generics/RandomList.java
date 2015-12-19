package tij.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList<T> {

	private List<T> storage = new ArrayList<>();
	
	private Random r = new Random(47);
	
	public void add(T item){
		storage.add(item);
	}
	
	public T select(){
		return storage.get(r.nextInt(storage.size()));
	}
	
	public static void main(String[] args) {
		RandomList<String> rs = new RandomList<>();
		for (String string : ("The quick brown fox jumped over " +
				"the lazy brown dog").split(" ")) {
			rs.add(string);
		}
		for (int i = 0; i < 11; i++) {
			System.out.println(rs.select());
		}
		
	}
}
