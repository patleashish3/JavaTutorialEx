package com.java.oops.constructor;

public class Student {
	String name;
	int rollno;
	
	Student(String name, int rollno){
		this.name=name;
		this.rollno=rollno;
		
	}
	public static void main(String[] args) {
		Student s1=new Student("Ashish",101);
		Student s2=new Student("Ashta",102);
		System.out.println(s1);
		System.out.println(s2);
	}

}
