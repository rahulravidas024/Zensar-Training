package switchStatements;

import java.util.Scanner;

public class FindArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float pie = 3.14f;
		System.out.println("Enter 1_____Area Of Circle");
		System.out.println("Enter 2_____Area Of Square");
		System.out.println("Enter 3_____Area Of Rectangle");
		System.out.println("Enter 4_____Area Of Right Angle Traingle");
		System.out.println("Enter 5_____Circumference Of Circle");
		System.out.println("Enter 6_____Perimeter of a Square");
		System.out.println("______________________________________");
		System.out.println("Enter Your Choice: ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.print("Enter Radius: ");
			float radius = sc.nextFloat();
			float areaOfCircle = pie * radius * radius;
			System.out.println("Area Of Circle is: " + areaOfCircle);
			break;
		case 2:
			System.out.print("Enter Side: ");
			float side = sc.nextFloat();
			float areaOfSquare = side * side;
			System.out.println("Area Of Square is: " + areaOfSquare);
			break;
		case 3:
			System.out.print("Enter Length: ");
			float length = sc.nextFloat();
			System.out.print("Enter Breath: ");
			float breath = sc.nextFloat();
			float areaOfRectangle = length * breath;
			System.out.println("Area Of Rectangle is: " + areaOfRectangle);
			break;
		case 4:
			System.out.println("Enter Height: ");
			float height = sc.nextFloat();
			System.out.println("Enter Base: ");
			float base = sc.nextFloat();
			float areaOfRightAngleTriangle = (base * height) / 2;
			System.out.println("Area Of Right Angle Traingle is: " + areaOfRightAngleTriangle);
			break;
		case 5:
			System.out.print("Enter Radius: ");
			radius = sc.nextFloat();
			float circumferenceOfCircle = 2 * pie * radius;
			System.out.println("Circumference Of Circle: " + circumferenceOfCircle);
			break;
		case 6:
			System.out.print("Enter Side: ");
			side = sc.nextFloat();
			float perimeterOfSquare = 4 * side;
			System.out.println("Perimeter Of Square is: " + perimeterOfSquare);
			break;
		default:
			System.out.println("Enter Valid Input");
		}
		sc.close();
	}

}
