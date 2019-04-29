package com.java.array.interviewquestion;

import java.util.Arrays;

public class SecondLargestNumber {
	static void secondlargest(int[] input) {
		
		int firstlargest, secondlargest;
		
		if(input[0]>input[1]) {
			firstlargest=input[0];
			secondlargest=input[1];
		}
		else {
			firstlargest=input[1];
			secondlargest=input[0];
		}
		for(int i=2; i<input.length-1; i++) {
			if(input[i]>firstlargest) {
				secondlargest=firstlargest;
				firstlargest=input[i];
			}
			else if(input[i]<firstlargest && secondlargest<input[i]) {
				secondlargest=input[i];
			}
		}
			System.out.println("input array:" +Arrays.toString(input));
			//System.out.println(Arrays.toString(input));
			System.out.println("Second largest element: "+secondlargest);
			//System.out.println(secondlargest);
	}

	public static void main(String[] args) {
		secondlargest(new int [] {3245,6485,9786,4323,4798});
	
		}
	}
