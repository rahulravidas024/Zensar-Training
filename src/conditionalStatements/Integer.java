package conditionalStatements;

import java.util.Scanner;

public class Integer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		if (num > 0)
			System.out.println("Number is Positive.");
		else if (num < 0)
			System.out.println("Number is Negative.");
		else if (num == 0)
			System.out.println("Number is Zero.");
	}

}
