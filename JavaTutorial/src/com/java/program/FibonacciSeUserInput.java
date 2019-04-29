package com.java.program;

import java.util.Scanner;

public class FibonacciSeUserInput {
	public static void main(String[] args) {
		int n;
		int a=0;
		int b=1;
		System.out.println("How many number you want to print");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.close();
		System.out.println("Fibonacci series of "+n+" number");
		
		int i=1;
		while(i<=n) {
			System.out.print(a+" ");
			
			int sumOfTwoPrevNo=a+b;
			a=b;
			b=sumOfTwoPrevNo;
		    i++;
			
		}
	}

}
