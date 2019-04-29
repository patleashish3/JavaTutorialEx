package com.java.oops.overloading;

public class Test3 {
	public void methodOne(String s) {
		System.out.println("String version");
	}

	public void methodOne(StringBuffer s) {
		System.out.println("StringBuffer version");
	}

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.methodOne("Ashish");
		t.methodOne(new StringBuffer("Kunal"));
		//t.methodOne(null);
	}
}
