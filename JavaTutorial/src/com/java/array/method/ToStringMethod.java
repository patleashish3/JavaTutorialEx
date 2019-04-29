package com.java.array.method;

import java.util.Arrays;

public class ToStringMethod {
	public static void main(String[] args) {
		//Array of byte
		byte [] b= {10,20,30};
		System.out.println(Arrays.toString(b)); 
		//array of short
		short [] s= {40,50,60,70};
		System.out.println(Arrays.toString(s));
		
		//Arrays of int
		int [] i= {11,12,13,14};
		System.out.println(Arrays.toString(i));
		
		//Arrays of long
		long [] l= {17, 18, 19};
		System.out.println(Arrays.toString(l));
		
		//Arrays of double
		double [] d= {10.11,11.15,12.17};
		System.out.println(Arrays.toString(d));
		
		//Arrays of char
		char [] c= {'a','s','d'};
		System.out.println(Arrays.toString(c));
		
		//Arrays of Boolean
		boolean [] bln= {true, false ,true, false};
		System.out.println(Arrays.toString(bln));
		
		//Arrays of String
		String [] str= {"Ashish","Yandra","Rakesh","Roshan"};
		System.out.println(Arrays.toString(str));
	}

}
