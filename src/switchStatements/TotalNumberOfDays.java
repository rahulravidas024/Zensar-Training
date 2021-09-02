package switchStatements;

import java.util.Scanner;

public class TotalNumberOfDays {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month in Number For Example: ");
		System.out.println("Type 1 for January");
		System.out.println("Type 2 for February");
		System.out.println("Type 3 for March");
		System.out.println("Type 4 for April");
		System.out.println("Type 5 for May");
		System.out.println("Type 6 for June");
		System.out.println("Type 7 for July");
		System.out.println("Type 8 for August");
		System.out.println("Type 9 for September");
		System.out.println("Type 10 for October");
		System.out.println("Type 11 for November");
		System.out.println("Type 12 for December");
		System.out.println("___________________________");
		int num = sc.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("Total number of days in January: 31");
			break;
		case 2:
			System.out.println("Total number of days in February: 28 or 29");
			break;
		case 3:
			System.out.println("Total number of days in March: 31");
			break;
		case 4:
			System.out.println("Total number of days in April: 30");
			break;
		case 5:
			System.out.println("Total number of days in May: 31");
			break;
		case 6:
			System.out.println("Total number of days in June: 30");
			break;
		case 7:
			System.out.println("Total number of days in July: 31");
			break;
		case 8:
			System.out.println("Total number of days in August: 31");
			break;
		case 9:
			System.out.println("Total number of days in September: 30");
			break;
		case 10:
			System.out.println("Total number of days in October: 31");
			break;
		case 11:
			System.out.println("Total number of days in November: 30");
			break;
		case 12:
			System.out.println("Total number of days in December: 31");
			break;
		default: 
			System.out.println("Enter Valid Input");
		}
	}
}
