package com.operators;

import static com.util.Print.print;

import java.util.Random;

import com.util.Print;

class Letter{
	char c;
}

public class PassObject {
	
	static void f(Letter y){
		y.c= 'z';
	}
	public static void main(String[] args) {
		Letter x = new Letter();
		x.c= 'a';
		print(x.c);
		f(x);
		print(x.c);
		
		Random r = new Random();
		print(r.nextInt());
		print(r.nextInt());
		print(r.nextInt());
		print(r.nextInt());
		print(r.nextInt());
		print(r.nextInt());
		print(r.nextInt());
		print(r.nextInt());
		print(r.nextInt());
		print(r.nextInt());
		print(r.nextInt());
		print(r.nextInt());
		
		
		for (int i = 0; i < 100; i++) {
			int j=i+j
		}
	}
}
