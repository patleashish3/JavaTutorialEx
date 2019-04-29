package com.java.arrayequalitymethod;

public class FindThePairsInArray {
	static void FindThePair(int inputArray[], int inputNumber) {
		System.out.println("Pairs of element whose sum is" + inputNumber+ "are :");
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < inputArray.length; j++) {
				if (inputArray[i] + inputArray[j] == inputNumber) {
					System.out.println(inputArray[i] + " + " + inputArray[j] + "=" + inputNumber);

				}
			}
		}

	}
	public static void main(String[] args) {
		FindThePair(new int[] {4,6,-10,7,20,3,-8,18},10);
	}
}