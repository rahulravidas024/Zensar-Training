package com.demo.loops;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int rev = 0;
		int temp = num;
		while (num > 0) {
			int r = num % 10;
			rev = (rev * 10) + r;
			num = num / 10;
		}
		if (temp == rev)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");
		sc.close();
	}

}
