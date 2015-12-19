package com.initialization;

public class PublicConstructorSingleton {

	private static PublicConstructorSingleton publicConstructorSingleton = getPublicConstructorSingleton();
	
	public int i;
	public PublicConstructorSingleton() throws InstantiationException{
		if(publicConstructorSingleton != null){
			throw new InstantiationException();
		}
		else {
			publicConstructorSingleton = new PublicConstructorSingleton(1);
			publicConstructorSingleton.i=1;
		}
	}
	
	private PublicConstructorSingleton(int i){
		
	}
	
	public static PublicConstructorSingleton getPublicConstructorSingleton() {
		if(publicConstructorSingleton == null){
			try {
				publicConstructorSingleton = new PublicConstructorSingleton();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return publicConstructorSingleton;
		
	}
	
	public static void main(String[] args) throws InstantiationException {
		PublicConstructorSingleton p = new PublicConstructorSingleton();
		PublicConstructorSingleton p1 = PublicConstructorSingleton.getPublicConstructorSingleton();
		System.out.println(p == p1);
	}
}
