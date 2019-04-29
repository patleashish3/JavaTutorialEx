package com.java.oops.constructor;

public class StaticInstanceBlock
{
	public static void main(String[] args) 
	{
		Demo obj1 = new Demo();
		Demo obj2 = new Demo();
	}

}

class Demo
{
	static int x;
	int y;
	
	static
	{
		x = 10;
		System.out.println("This is static block.");
	}
	
	{
		y = 20;
		System.out.println("This is instance block.");
	}
	
	Demo()
	{
		x = 50;
		System.out.println("This is constructor.");
	}
}
