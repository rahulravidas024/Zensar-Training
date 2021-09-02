package conditionalStatements;
import java.util.Scanner;
public class BankProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rupees: ");
		int rs = sc.nextInt();
		if(rs%2000==0)
			System.out.println("2000 Rs * " );
	}

}
