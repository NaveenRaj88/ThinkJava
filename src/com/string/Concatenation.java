package com.string;

import java.util.Scanner;

public class Concatenation {
	public static void main(String[] args) {
		String mango = "mango";
		String s = "abc" + mango + "def" + 47;
		System.out.println(s);
		System.out.println(mango.substring(0,1));
	
		
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int aLen = A.length();
        int bLen = B.length();
        int smallestLen = aLen>bLen?bLen:aLen;
        String lexicoSort="Yes";
        if(A.compareTo(B)<=0){
        	lexicoSort="No";
        }
//        for(int i = 0; i<smallestLen;i++){            
//            if(A.charAt(i)>B.charAt(i)){
//                break;
//            }else if(A.charAt(i)<B.charAt(i)){
//            	lexicoSort="No";
//                break;
//            }
//        }
        System.out.println(aLen+bLen);
        System.out.println(lexicoSort);
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
    }
	}
