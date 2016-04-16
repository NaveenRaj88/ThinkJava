package com.loops;

public class LabeledBreaks {

	public static void main(String[] args) {
		
		System.out.println("Starting the exec");
		int i=0;
		label_break:
		{
			i++;
			System.out.println("inside labelled breaks");
			if(i<3){
				break label_break;
			}
		}
		
	}
}
