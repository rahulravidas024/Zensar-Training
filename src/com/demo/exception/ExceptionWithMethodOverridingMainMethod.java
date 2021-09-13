package com.demo.exception;

public class ExceptionWithMethodOverridingMainMethod {

	void message() throws ArithmeticException {
		System.out.println("Child Method");
	}

	public static void main(String args[]) {
		ExceptionWithMethodOverriding obj = new ExceptionWithMethodOverriding();
		obj.message();
	}
}
