package com.java.arrayequalitymethod;

import java.util.Arrays;

public class ArraysDeepEqualMethod {
	public static void main(String[] args) {
		String [][] str1={{"Ashish","Roshan","Rakesh","Yandru"},{"Rashmi","Ashta","Shweta","Garima"}};
		String [][] str2={{"Ashish","Roshan","Rakesh","Yandru"},{"Rashmi","Ashta","Shweta","Garima"}};
		String [][] str3= {{"Nitesh","Mahul","Abhijeet","Vaibhav"},{"Mukesh","Kunal","Amit","Nikesh"}};
		System.out.println(Arrays.deepEquals(str1, str2));
		System.out.println(Arrays.deepEquals(str1, str3));
		
		System.out.println(Arrays.equals(str1, str2));
	}
}
