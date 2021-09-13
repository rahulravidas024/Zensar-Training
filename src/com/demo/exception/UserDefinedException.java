package com.demo.exception;

import java.util.Scanner;

public class UserDefinedException {
	public void acceptEmail() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email: ");
		String email = sc.nextLine();
		checkEmail(email);
	}

	public void checkEmail(String email) {
		String emailpat = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		try {
			if (email.matches(emailpat)) {
				System.out.println("Email is Valid");
			} else {
				throw new InvalidEmailException("Email is not valid");
			}
		} catch (InvalidEmailException e) {
			InvalidEmailException in = new InvalidEmailException();
			System.out.println(in.errMsg);
			in.showError();
		}
	}

	public static void main(String[] args) {
		UserDefinedException obj = new UserDefinedException();
		obj.acceptEmail();

	}
}
