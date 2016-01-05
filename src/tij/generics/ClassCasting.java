package tij.generics;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ClassCasting {
	@SuppressWarnings("unchecked")
	public void f(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));
		// Won’t Compile:
		// List<Widget> lw1 =
		// List<Widget>.class.cast(in.readObject());
		List<String> lw2 = List.class.cast(in.readObject());
	}
}
