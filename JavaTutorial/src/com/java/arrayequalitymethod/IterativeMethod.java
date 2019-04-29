package com.java.arrayequalitymethod;

public class IterativeMethod {
	public static void main(String[] args) {
		int[] array1 = { 1, 3, 5, 7, 9, 4 };
		int[] array2 = { 1, 3, 5, 7, 4, 4 };
		boolean equalornot = true;

		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i]){
					equalornot = false;
				}
			}
		}
		else
		{
			equalornot = false;
		}

		if (equalornot)
		{
			System.out.println("Two Arrays Are Equal");
		} 
		else
		{
			System.out.println("Two Arrays Are Not equal");
		}
	}

}
