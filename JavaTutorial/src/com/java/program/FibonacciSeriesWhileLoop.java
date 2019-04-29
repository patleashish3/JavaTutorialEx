package com.java.program;

public class FibonacciSeriesWhileLoop {
	public static void main(String[] args) {
		int n=15;
		int a=0;
		int b=1;
		System.out.println("Fibonacci series of "+n+" number");
		
		int i=1;
		while(i<=n) {
			System.out.print(a+" ");
			int sumOfPrevTwoNo=a+b;
			a=b;
			b=sumOfPrevTwoNo;
			i++;
		}
	}

}
