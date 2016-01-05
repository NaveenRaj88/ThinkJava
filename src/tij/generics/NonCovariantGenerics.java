package tij.generics;

import java.util.ArrayList;
import java.util.List;

public class NonCovariantGenerics {
	// compiler error
	//actually generics moves the runtime checking to compile time checking.
//	List<Fruit> fruits = new ArrayList<Apple>();
}
