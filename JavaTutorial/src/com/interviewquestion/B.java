package com.interviewquestion;

public class B extends A 
{
		B()
		{
			super(10);
			System.out.println("B class constructor");
		}
		
		public static void main(String[] args)
		{
			B b = new B();
		    //A a=new A();
			
		}
}

class A 
{
	 A()
	 {
		 
		 System.out.println("no arg constructor");
	 }
	 A(int i)
	 {
		
		 System.out.println("int arg constructor");
	 }

}