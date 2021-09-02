package conditionalStatements;

import java.util.Scanner;

public class SpecialCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Character From Keyboard: ");
		char ch = sc.next().charAt(0);
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println(ch + " is Alphabet.");
		else if (ch >= '0' && ch <= '9')
			System.out.println(ch + " is Number.");
		else
			System.out.println(ch + " is Special Character.");
	}

}
