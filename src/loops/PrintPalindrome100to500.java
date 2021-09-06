package loops;

public class PrintPalindrome100to500 {

	public static void main(String[] args) {
		int rev = 0;
		int temp;
		for (int i = 100; i <= 500; i++) {
			temp = i;
			while (temp > 0) {
				int r = temp % 10;
				rev = (rev * 10) + r;
				temp = temp / 10;
			}
			if (rev == i) {
				System.out.println(i);
			}
			rev = 0;
		}
	}
}
