import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {

		int[] numbers = { 1, 3, 7, 9, 5, 2, 6, 10, 15, 12 };

		boolean swapped = false;
		int temp;

		System.out.println(Arrays.toString(numbers));

		do {
			swapped = false;
			for (int i = 0; i < numbers.length -1; i++) {
				if (numbers[i] > numbers[i + 1]) {
					temp = numbers[i]; // Sparar tillfälligt värdet på vänstra sidan
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					swapped = true;
				}
			}

		} while (swapped);

		System.out.println(Arrays.toString(numbers));
	}
}
