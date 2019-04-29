package com.java.oops.overloading;

public class Test1 {
	public void methodOne(int i) {
		System.out.println("int-arg method");
	}

	public void methodOne(float f) {
		System.out.println("float-arg method");
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.methodOne('a');
		t.methodOne(10l);
		//t.methodOne(10.5);
		t.methodOne(1.1f);
	}
}
