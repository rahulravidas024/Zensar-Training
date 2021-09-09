package com.demo.switchStatements;
public class Print1to5 {

	public static void main(String[] args) {
		int i;
		for(i=1; i<=5; i++)
		switch(i)
		{
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("I value is less than 1 or greater than 5");
		}
	}

}
