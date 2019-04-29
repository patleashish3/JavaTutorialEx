package com.java.array.interviewquestion;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
	public static void main(String[] args) {
		String [] a1= {"Ashish","Roshan","Rashmi","Ashta","Sejal","Kunal"};
		
		ArrayList<String> s=new ArrayList<String>(Arrays.asList(a1));
		System.out.println(s);
	}

}
