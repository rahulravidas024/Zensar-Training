package array;

public class Minimum {

	public static void main(String[] args) {
		int arr[] = new int[] { 2, 8, 4, 9, 4 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Smallest Element:  " + min);
	}

}
