package tij.generics;

public class GenericMethods<T> {
	
	public <S> void f(S x){
		System.out.println(x.getClass().getSimpleName());
	}
	
	public static <T> T sf(T t){
		return t;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
			GenericMethods<String> gm = new GenericMethods();
			gm.f(1);
			gm.f("");
			System.out.println(gm.sf("Hello"));
			
	}

}
