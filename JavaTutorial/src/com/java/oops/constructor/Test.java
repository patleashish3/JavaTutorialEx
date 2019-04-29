package com.java.oops.constructor;

public class Test {
	static int count;
	static
	{
		count++;
	}
	Test(){
		
	}
	Test(int i){
		
	}
	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test(10);
		Test t3=new Test();
		Test t4=new Test();
		Test t5=new Test();
		System.out.println(count);
	}

}
