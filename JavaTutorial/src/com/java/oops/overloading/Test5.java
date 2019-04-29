package com.java.oops.overloading;

public class Test5 {
	public void methodOne(int i) {
		System.out.println("general method");
	}

	public void methodOne(int... i) {
		System.out.println("var-arg method");
	}

	public static void main(String[] args) {
		Test5 t = new Test5();
		t.methodOne();
		t.methodOne(10, 20);
		t.methodOne(10);
		t.methodOne(null);
	}
}
