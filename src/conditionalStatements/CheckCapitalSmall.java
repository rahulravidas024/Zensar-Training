package conditionalStatements;

import java.util.Scanner;

public class CheckCapitalSmall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Alphabet: ");
		char alpha = sc.next().charAt(0);
		if (alpha >= 'a' && alpha <= 'z')
			System.out.println("Alphabet is Small");
		else if (alpha >= 'A' && alpha <= 'Z')
			System.out.println("Alphabet is Capital");
		sc.close();
	}

}
