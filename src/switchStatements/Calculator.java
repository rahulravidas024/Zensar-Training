package switchStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Operations");
		System.out.println("For Addition enter 1");
		System.out.println("For Substraction enter 2");
		System.out.println("For Multiplication enter 3");
		System.out.println("For Division enter 4");
		System.out.println("For EXIT enter 5");
		System.out.println("Enter Your Choice: ");
		int option = sc.nextInt();
		System.out.println("Enter First Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("Addition is " + (num1 + num2));
			break;
		case 2:
			System.out.println("Substraction is " + (num1 - num2));
			break;
		case 3:
			System.out.println("Multiplication is " + (num1 * num2));
			break;
		case 4:
			System.out.println("Division is " + (num1 / num2));
			break;
		case 5:
			break;
		default:
			System.out.println("Invalid Case");
		}
		sc.close();
	}

}
