package conditionalStatements;

import java.util.Scanner;

public class VowelProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char alpha;
		System.out.print("Enter any Alphabet: ");
		alpha = sc.next().charAt(0);
		if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' || alpha == 'A' || alpha == 'E'
				|| alpha == 'I' || alpha == 'O' || alpha == 'U')
			System.out.println("Alphabet is Vowel");
		else
			System.out.println("Alphabet is Consonent");
		sc.close();
	}

}
