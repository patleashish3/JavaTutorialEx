package com.java.oops.constructor;

public class Lab5 {
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.show();
		
		Student1 s2=new Student1(101,"Ashish",s1.show());
		s2.show();
		
		Student1 s3=new Student1(102,"Roshan",s2.show(),9545239555l);
		s3.show();
		s1.Student1();
	}
}
