package tij.generics;


// lets try what happens with Object arguments then you need to cast it
class Subtype1 extends BasicHolder<Object> {

}

public class CRGWithBasicHolderWithoutGeneric {
	public static void main(String[] args) {
		Subtype1 st1 = new Subtype1(), st2 = new Subtype1();
		st1.set(st2);
		Subtype1 st3 = (Subtype1) st1.get(); // look out for cast but the code is allowed
		st1.f();
	}
}
