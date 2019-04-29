package com.java.oops.constructor;

class Student1 {
	int sid;
	String sname;
	String email;
	long phone;

	void Student1() {
		System.out.println("Method Student()");
	}

	Student1() {
		System.out.println("Zero parameter constructor");
	}

	Student1(int id, String sn, String em) {
		System.out.println("3 Parameter constructor");
		sid = id;
		sname = sn;
		email = em;
	}

	Student1(int id, String sn, String em, long ph) {
		System.out.println("4 Parameter constructor");
		sid = id;
		sname = sn;
		email = em;
		phone = ph;

	}

	String show() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(email);
		System.out.println(phone);
		return "";
	}
}
