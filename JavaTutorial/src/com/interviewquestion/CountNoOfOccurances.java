package com.interviewquestion;

public class CountNoOfOccurances {
	public static void main(String[] args) {
		String s="Ashish Ashish Ashish";
		char c='A';
		int count=s.length()-s.replace("A", "").length();
		System.out.println("Number of occurance of a is:"+count);
	}

}
