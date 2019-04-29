package com.java.array.interviewquestion;

import java.util.Arrays;

public class EqualityOfTwoArrays {
	public static void main(String[] args) {
		int[] a1 = { 21, 22, 23, 24, 25 };
		int[] a2 = { 21, 22, 23, 24, 25 };
		boolean equalOrNot = true;
		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length - 1; i++) {
				if (a1[i] == a2[i]) {
					equalOrNot = false;
				}

			}
		} else {
			equalOrNot = false;
		}

		System.out.println("Input array:");
		System.out.println("first array; " + Arrays.toString(a1));
		System.out.println("second array; " + Arrays.toString(a2));

		if (equalOrNot) {
			System.out.println("Two Arrays Are Equal");
		} else {
			System.out.println("Two Arrays Are Not equal");
		}
	}

}
