package com.java.array;

import java.util.Arrays;

public class CopyingArray2 {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70,80,90};//initializing
		int[] b= Arrays.copyOf(a,a.length);         //copying
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		a[2]=56;
		System.out.println(b[2]);
		
		b[4]=100;
		System.out.println(a[4]);
	}
}
