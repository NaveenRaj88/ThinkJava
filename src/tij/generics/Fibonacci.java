package tij.generics;

public class Fibonacci {

	public void fibIt(int i){
		for (int j = 0; j < i; j++) {
			System.out.println(fib(j));
		}
	}
	public int fib(int n){
		if(n<2)
		{
			return 1;
		}else {
			return fib(n-2)+fib(n-1);
		}
	}
	
	public static void main(String[] args) {
		new Fibonacci().fibIt(3);
	}
}
