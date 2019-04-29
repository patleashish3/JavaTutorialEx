package com.java.oops.constructor;

public class Test1 
{
	public static void main(String[] a)
	{
		Test1 obj = new Demo1();
		Demo1 obj1 = (Demo1) obj;
		obj.M(10);
	}
	static int M(int a) {System.out.println("Parent");return a;}
	
	void M1() {System.out.println("Test1 class method");}
}

class Demo1 extends Test1
{
	static int M(int a) {System.out.println("Child");return 10;}
	
	void M2(){System.out.println("Child method");}
}
