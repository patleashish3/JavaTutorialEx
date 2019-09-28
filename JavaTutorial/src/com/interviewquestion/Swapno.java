package com.interviewquestion;

public class Swapno {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("Before Swapping");
		System.out.println("value of x:" + x);
		System.out.println("value of y:" + y);

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swapping");
		System.out.println("value of x:" + x);
		System.out.println("value of y:" + y);

	}

}
