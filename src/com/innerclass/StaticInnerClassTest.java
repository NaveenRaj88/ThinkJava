package com.innerclass;

class ArrayAlg{
	public static class Pair{
		private double first;
		private double second;
		
		public Pair(double first, double second){
			this.first = first;
			this.second = second;
		}
		
		public double getFirst(){
			return this.first;
		}
		
		public double getSecond(){
			return this.second;
		}
		
	}
	
	public static Pair minMax(double[] values){
		double min = Double.POSITIVE_INFINITY;
		double max = Double.NEGATIVE_INFINITY;
		
		for (double d : values) {
			if(d< min ) min =d;
			if(d> max) max=d;
		}
		return new Pair(min, max);
	}
}


public class StaticInnerClassTest {

	public static void main(String[] args) {
		double[] d = new double[20];
		for (int i = 0; i < d.length; i++) {
			d[i] = 100 * Math.random();
		}
		ArrayAlg.Pair p= ArrayAlg.minMax(d);
		System.out.println("min ="+p.getFirst());
		System.out.println("max ="+p.getSecond());
	}
}
