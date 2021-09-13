package com.demo.strings;

import java.util.Scanner;

public class CheckEmail {

	public void isEmailValid(String email) {
		String emailpat = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		if (email.matches(emailpat))
			System.out.println("Email is Vaild");
		else
			System.out.println("Email is Not Vaild");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email: ");
		String email = sc.nextLine();
		CheckEmail obj = new CheckEmail();
		obj.isEmailValid(email);
		sc.close();
	}
}
