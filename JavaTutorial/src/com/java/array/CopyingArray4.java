package com.java.array;

public class CopyingArray4 {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70,80,90};//initializing
		int[] b=new int[a.length];         //copying
		System.arraycopy(a, 0, b, 0, a.length);
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		a[2]=56;
		System.out.println(b[2]);
		
		b[4]=100;
		System.out.println(a[4]);
	}
}
