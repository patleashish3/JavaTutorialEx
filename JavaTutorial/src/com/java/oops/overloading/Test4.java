package com.java.oops.overloading;

public class Test4 {
	public void methodOne(int i, float f) {
		System.out.println("int-float method");
	}

	public void methodOne(float f, int i) {
		System.out.println("float-int method");
	}

	public static void main(String[] args) {
		Test4 t = new Test4();
		t.methodOne(10, 10.5f);
		t.methodOne(10, 10l);
		t.methodOne(10.5f, 10);
		// t.methodOne(10,10);
		// t.methodOne(10.5f, 10.5f);
	}
}
