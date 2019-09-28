package com.exception;

public class NestedTry {
	public static void main(String[] args) {
		try {
			System.out.println("Statement1");
			System.out.println(10/0);
			System.out.println("Statement3");
			try {
				System.out.println("Statement4");
				System.out.println("Statement5");
				System.out.println("Statement6");
			}
			catch(ArithmeticException e) {
				System.out.println("Statement7");
			}
			finally {
				System.out.println("Statement8");
			}
			System.out.println("Statement9");
		}
		catch(Exception e) {
			System.out.println("Statement10");
		}
		finally {
			System.out.println("Statement11");
		}
		System.out.println("Statement12");
	}

}
