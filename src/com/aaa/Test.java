package com.aaa;

public class Test {
	static void StairCase(int n) {
        for(int j=1; j<=n; j++){
        int spaces = n-j;
        int hashes = j;
        for(int i=0; i<spaces; i++){
            System.out.print(" ");
        }
        while(hashes>0){
        System.out.print("#");
            hashes--;
        }
        System.out.println();
        }
        
    }
	
	
	public static void main(String[] args) {
//		StairCase(6);
		String temp[] = {"j","i"};
	}
}
