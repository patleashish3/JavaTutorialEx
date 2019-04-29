package com.java.array.interviewquestion;

import java.util.ArrayList;

public class ArrayListToArray {
	public static void main(String[] args) {
		ArrayList<String> array =new ArrayList<String>();
		array.add("Ashish");
		array.add("Rashmi");
		array.add("Kunal");
		array.add("Ashta");
		array.add("Roshan");
		
		String [] a1=new String[array.size()];
		array.toArray(a1);
		for(String string: a1) {
		System.out.println(string);
		}
		
	}

}
