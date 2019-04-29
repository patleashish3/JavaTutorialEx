package com.java.array.method;

import java.util.Arrays;

public class ToSortToStringMethod {
	public static void main(String[] args) {
		//Array of byte
		byte [] b= {10,30,15, 12};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		//array of short
		short [] s= {70,60,50,40};
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		
		//Arrays of int
		int [] i= {11,10,9,34};
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		
		//Arrays of long
		long [] l= {200,190, 170, 180};
		Arrays.sort(l);
		System.out.println(Arrays.toString(l));
		
		//Arrays of double
		double [] d= {12.17,10.11,11.15,};
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));
		
		//Arrays of char
		char [] c= {'a','s','d'};
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		
		/*//Arrays of Boolean
		boolean [] bln= {true, false ,true, false};
		Arrays.sort(bln);
		System.out.println(Arrays.toString(bln));*/
		
		//Arrays of String
		String [] str= {"Ashish","Yandra","Rakesh","Roshan"};
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
	}

}
