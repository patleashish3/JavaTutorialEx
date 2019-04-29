package com.interviewquestion;

public class ReverseString {
	public static void main(String[] args) {
		String str="Ashish";
		char [] s1=str.toCharArray();
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(s1[i]);
		}
	}

}
