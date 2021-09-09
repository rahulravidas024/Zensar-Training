package com.demo.conditionalStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		char operation;
		System.out.print("Enter First Number: ");
		num1 = sc.nextInt();
		System.out.print("Enter Second Number: ");
		num2 = sc.nextInt();
		System.out.println("For Addition Enter + ");
		System.out.println("For Substraction Enter - ");
		System.out.println("For Multiplicatin Enter * ");
		System.out.println("For Division Enter / ");
		operation = sc.next().charAt(0);
		if (operation == '+')
			System.out.print("Addition is: " + (num1 + num2));
		else if (operation == '-')
			System.out.print("Substraction is: " + (num1 - num2));
		else if (operation == '*')
			System.out.print("Multiplication is: " + (num1 * num2));
		else if (operation == '/')
			System.out.print("Division is: " + (num1 / num2));
		else
			System.out.println("Invalid Input");
		sc.close();
	}

}
