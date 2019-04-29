package com.java.arrayequalitymethod;

import java.util.Arrays;

public class ArraysDeepToStringmethod {
	public static void main(String[] args) {
		// one dimensional Array
		String[] array1d = new String[] { "one", "TWO", "THREE", "FOUR", "FIVE" };
		System.out.println(Arrays.deepToString(array1d));

		// Two dimensional array
		String[][] array2d = new String[][] { { "ONE", "TWO", "THREE", "FOUR" },
			                                   { "FIVE", "SIX", "SEVEN" } };
		System.out.println(Arrays.deepToString(array2d));

		// Three dimensional Array
		String[][][] array3d = new String[][][] { { { "ONE", "TWO", "THREE", "FOUR" }, 
			                                       { "FIVE", "SIX", "SEVEN" },
				                                   { "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE" } } };
				                                   System.out.println(Arrays.deepToString(array3d));
				                                   
	}

}
