package com.java.program;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n=9;
		int a=0;
		int b=1;
		System.out.print("Fibonacci series of "+n+" number ");
		for(int i=1; i<=n; ++i) {
			System.out.print(a+" ");
			int sumOfPreviousTwoNo=a+b;
			a=b;
			b=sumOfPreviousTwoNo;
		}
	}

}
