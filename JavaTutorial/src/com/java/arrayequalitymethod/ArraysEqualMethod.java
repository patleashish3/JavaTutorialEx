package com.java.arrayequalitymethod;

import java.util.Arrays;

public class ArraysEqualMethod {
	public static void main(String[] args) {
		String [] str1= {"Ashish","Roshan","Rakesh","Yandru"};
		String [] str2= {"Rashmi","Ashta","Shweta","Garima"};
		String [] str3= {"Rakesh","Yandru","Ashish","Roshan"};
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		Arrays.sort(str3);
		
		System.out.println(Arrays.equals(str1, str2));
		System.out.println(Arrays.equals(str1, str3));
	}

}
