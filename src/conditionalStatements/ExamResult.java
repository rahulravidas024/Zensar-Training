package conditionalStatements;

import java.util.Scanner;

public class ExamResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Final Semester Marks out of 80");
		System.out.print("Enter Maths Marks: ");
		float maths = sc.nextInt();
		System.out.print("Enter Science Marks: ");
		float science = sc.nextInt();
		System.out.print("Enter English Marks: ");
		float english = sc.nextInt();
		double per = ((maths + science + english) / 2.4);
		System.out.println("Percentage is: " + per + "%");
		if (per >= 40)
			System.out.println("PASS");
		else
			System.out.println("FAIL");

		if (per >= 60)
			System.out.println("By First Class");
		else if (per >= 50 && per < 60)
			System.out.println("By Second Class");
		else if (per >= 40 && per < 50)
			System.out.println("By Third Class");
		else
			System.out.println("FAIL");
		sc.close();
	}

}
