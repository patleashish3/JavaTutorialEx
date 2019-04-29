package com.java.oops.constructor;

public class NamingRules 
{

	public static void main(String[] args) 
	{
		Rules obj1 = new Rules(10, "Ashish");
		System.out.println(obj1.i);
		System.out.println(obj1.name);
		
		Rules obj2 = new Rules(2f);
		System.out.println(obj2.i);
	}
}


class Rules extends AnotherClass
{
	int i;
	String name;
	
	void M()
	{
		System.out.println("Current class method");
	}
	
	Rules() 
	{
		System.out.println("This is current class default constructor");
		this.i = 40;
	}
	
	Rules(float f)
	{
		this();
	}
	
	Rules(int i, String name)
	{
		super();
		this.name = name;
		this.i=super.i;
		this.M();
		
	}
}

class AnotherClass
{
	int i=90;
	AnotherClass()
	{
		System.out.println("This is another class");
	}
}

