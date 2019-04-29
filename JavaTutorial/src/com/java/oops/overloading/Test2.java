package com.java.oops.overloading;

public class Test2 {
	public void methodOne(String s) {
		System.out.println("String version");
	}

	public void methodOne(Object o) {
		System.out.println("Object version");
	}

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.methodOne("Ashish");
		t.methodOne(new Object());
		t.methodOne(null);
		t.methodOne('a');
		t.methodOne(true);
	}
}
