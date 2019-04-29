package com.java.array.interviewquestion;

public class EqualityOfTwoArray {
	public static void main(String[] args) {
		int[] a1 = { 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int[] a2 = { 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		boolean equalOrNot = true;
		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length - 1; i++) {
				if (a1[i] != a2[i]) {
					equalOrNot = false;
					break;
				}
				

			}
		   if(equalOrNot) {
			   System.out.println("both array is equal");
		   }
		   else {
			   System.out.println("Array is not equal");
		   }
		} 
	}

}
