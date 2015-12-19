package com.finalsample;

import com.protectedsample.ProtectedClass;

public class MainFinalSample {

private void hellofinal(){
		
		System.out.println("it is MainFinal smaple");
	}

	public static void main(String[] args) {
		finalClassSample f1 = new finalClassSample();
		
		final finalClassSample f2= new finalClassSample();
		
		
		MainFinalSample mainFinalSample = new MainFinalSample();
		
		
		ProtectedClass protectedClass = new ProtectedClass();
		
		protectedClass.protectedAcccess();
		
		f1.protectedMethod();
		
	}
}
