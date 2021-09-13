package com.demo.exception;

public class ThrowAndThrows {

	static void checkAge(int age) throws ArithmeticException {
		if (age < 18) {
			throw new ArithmeticException("You must be at least 18 years old.");
		} else {
			System.out.println("You are Eligible!");
		}
	}

	public static void main(String[] args) {
		checkAge(19);
	}
}
