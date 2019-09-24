import java.util.Scanner;
import java.util.Arrays;

public class ArrayDistinctValues {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of values: ");
		int numberOfValues = Integer.parseInt(input.nextLine());

		int[] arrayOfIntegers = new int[numberOfValues];

		for (int i = 0; i < numberOfValues; i++) {

			System.out.print("Enter an integer: ");
			arrayOfIntegers[i] = Integer.parseInt(input.nextLine());

		}

		Arrays.sort(arrayOfIntegers);

		for (int i = 0; i < arrayOfIntegers.length - 1; i++) {

			if (arrayOfIntegers[i] != arrayOfIntegers[i + 1]) {

				System.out.print(arrayOfIntegers[i] + " ");

			}

		}
		System.out.print(arrayOfIntegers[arrayOfIntegers.length - 1] + " ");

		input.close();
	}

}