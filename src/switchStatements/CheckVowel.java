package switchStatements;

import java.util.Scanner;

public class CheckVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Alphabet: ");
		char alpha = sc.next().charAt(0);
		switch (alpha) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println(alpha + " is Vowel");
			break;
		default:
			System.out.println(alpha + " is Consonent");
		}
		sc.close();
	}

}
