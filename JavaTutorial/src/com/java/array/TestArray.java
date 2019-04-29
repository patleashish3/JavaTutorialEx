package com.java.array;

import java.util.Arrays;

public class TestArray {
	
	public static void main(String[] args) {
		int[] a= {1, 4, 3, 2};
		int[][] b;
		int[] [] [] d;
//		for(int i=1; i<=4; i++) {
//		System.out.println(i);
//		}
		System.out.println(Arrays.toString(a));
		for(int i=0; i<4; i++) {
			if(a[i]==3) {
				System.out.println(i);
			}
		}
	//	Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 3));
			
		
	}

}
