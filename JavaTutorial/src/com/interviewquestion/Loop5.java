package com.interviewquestion;

public class Loop5 {
	public static void main(String[] args) {
		char i;
		char j;
		for(i='E'; i>='A'; i--) {
			for(j='A'; j<=i; j++) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}

}
