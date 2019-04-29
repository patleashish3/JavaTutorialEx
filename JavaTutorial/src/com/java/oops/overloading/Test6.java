package com.java.oops.overloading;

class Animal {
}

class Monkey extends Animal {
}

public class Test6 {
	public void methodOne(Animal a) {
		System.out.println("Animal version");
	}

	public void methodOne(Monkey m) {
		System.out.println("Monkey version");
	}

	public static void main(String[] args) {
		Test6 t = new Test6();
		Animal a=new Animal();
		t.methodOne(a);
		Monkey m=new Monkey();
		t.methodOne(m);
		Animal a1=new Monkey();
		t.methodOne(a1);
	}
}
