package conditionalStatements;

import java.util.Scanner;

public class DenominatorDivisible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		System.out.print("Enter Denominator: ");
		int denominator = sc.nextInt();
		if (num % denominator == 0)
			System.out.println(num + " is completely divisible by "
					+ denominator);
		else
			System.out.println(num + " is not completely divisible by "
					+ denominator);

	}

}
