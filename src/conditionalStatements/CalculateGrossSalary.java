package conditionalStatements;

import java.util.Scanner;

public class CalculateGrossSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Basic Salary: ");
		double basicSalary = sc.nextDouble();
		if (basicSalary <= 10000) {
			double HRA = (basicSalary * 20) / 100;
			double DA = (basicSalary * 80) / 100;
			double grossSalary = basicSalary + HRA + DA;
			System.out.println("Gross Salary is: " + grossSalary);
		} else if (basicSalary > 10000 && basicSalary <= 20000) {
			double HRA = (basicSalary * 25) / 100;
			double DA = (basicSalary * 90) / 100;
			double grossSalary = basicSalary + HRA + DA;
			System.out.println("Gross Salary is: " + grossSalary);
		} else if (basicSalary > 20000) {
			double HRA = (basicSalary * 30) / 100;
			double DA = (basicSalary * 95) / 100;
			double grossSalary = basicSalary + HRA + DA;
			System.out.println("Gross Salary is: " + grossSalary);
		}
		sc.close();
	}

}
