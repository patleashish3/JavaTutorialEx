package com.interviewquestion;

public class ReverseString1 {
	public static void main(String[] args) {
		String str="RASHMI";
		char [] a=str.toCharArray();
		for(int i=str.length()-1; i>=0; i--){
			System.out.println(a[i]);
		}
				
	}

}
