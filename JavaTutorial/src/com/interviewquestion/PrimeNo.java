package com.interviewquestion;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {

		int n;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}
	}
}
