package com.java.program;

public class FibonacciSeries1 {
	public static void main(String[] args) {
		int n=13;
		int a=0;
		int b=1;
		System.out.println("Fibonacci series of "+n+" number");
		for(int i=0; i<=n; i++) {
			System.out.print(a+" ");
			
			int sumOfPrevTwoNo=a+b;
			a=b;
			b=sumOfPrevTwoNo;
		}
	}

}
