package com.java.oops.overloading;

public class Test {
	public void methodOne() {
		System.out.println("no-arg methode");
	}

	public void methodOne(int i) {
		System.out.println("int-arg methode");
	}

	public void methodOne(double d) {
		System.out.println("double-arg methode");
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.methodOne();
		t.methodOne(10);
		t.methodOne(10.5);
	}
}
