package switchStatements;

public class SwitchString {

	public static void main(String[] args) {
		System.out.println("Laptop");
		String tech = "laptop";
		switch (tech) {
		case "laptop":
			System.out.println("Laptop Price is 50,000 Rs");
		case "mobile":
			System.out.println("Mobile Price is 10,000 Rs");
		case "tv":
			System.out.println("TV Price is 20,000 Rs");
		default:
			System.out.println("Item Not Found");
		}
	}

}
