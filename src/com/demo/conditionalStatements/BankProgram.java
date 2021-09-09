package com.demo.conditionalStatements;

import java.util.Scanner;

public class BankProgram {

	public static void main(String[] args) {
		int amount, rs2000 = 0, rs500 = 0, rs200 = 0, rs100 = 0, rs50 = 0, rs20 = 0, rs10 = 0, rs5 = 0, rs1 = 0,
				count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Amount in Rupees : ");
		amount = sc.nextInt();

		while (amount >= 2000) {
			rs2000 = amount / 2000;
			amount = amount % 2000;
			System.out.println("Total Number Of 2000 Rupees Notes :" + rs2000);
			break;
		}
		while (amount >= 500) {
			rs500 = amount / 500;
			amount = amount % 500;
			System.out.println("Total Number Of 500 Rupees Notes : " + rs500);
			break;
		}
		while (amount >= 200) {
			rs200 = amount / 200;
			amount = amount % 200;
			System.out.println("Total Number Of 200 Rupees Notes : " + rs200);
			break;
		}
		while (amount >= 100) {
			rs100 = amount / 100;
			amount = amount % 100;
			System.out.println("Total Number Of 100 Rupees Notes : " + rs100);
			break;
		}
		while (amount >= 50) {
			rs50 = amount / 50;
			amount = amount % 50;
			System.out.println("Total Number Of 50 Rupees Notes : " + rs50);
			break;
		}
		while (amount >= 20) {
			rs20 = amount / 20;
			amount = amount % 20;
			System.out.println("Total Number Of 20 Rupees Notes : " + rs20);
			break;
		}
		while (amount >= 10) {
			rs10 = amount / 10;
			amount = amount % 10;
			System.out.println("Total Number Of 10 Rupees Notes Or Coin : " + rs10);
			break;
		}
		while (amount >= 5) {
			rs5 = amount / 5;
			amount = amount % 5;
			System.out.println("Total Number Of 5 Rupees Notes Or Coin : " + rs5);
			break;
		}
		while (amount >= 1) {
			rs1 = amount / 1;
			amount = amount % 1;
			System.out.println("Total Number Of 1 Rupees Note Or Coin : " + rs1);
			break;
		}
		count = rs2000 + rs500 + rs200 + rs100 + rs50 + rs20 + rs10 + rs5 + rs1;
		System.out.println("\nTotal Number Of Notes Require : " + count);
		sc.close();
	}
}
