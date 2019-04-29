package com.java.array.interviewquestion;

public class DuplicateArray {
	public static void main(String[] args) {
		String [] a= {"Ashish","Rashmi","Ashta","Ashish","sejal","Ashta","Rashmi"};
		
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if((a[i].equals(a[j]))&&(i != j)) {
					System.out.println("Duplicate Name is "+a[j]);
				}
			}
		}
		
	}

}
