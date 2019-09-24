import java.util.Scanner;
import java.text.DecimalFormat;

public class ArrayStatistics {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0");

		System.out.print("Enter the number of values: ");
		int numberOfValues = Integer.parseInt(input.nextLine());

		if (numberOfValues >= 3) {

			int[] arrayOfIntegers = new int[numberOfValues];
			double[] arrayOfValues = new double[numberOfValues];

			for (int i = 0; i < numberOfValues; i++) {

				System.out.print("Enter an integer: ");
				arrayOfIntegers[i] = Integer.parseInt(input.nextLine());
				arrayOfValues[i] = arrayOfIntegers[i];

			}

			System.out.println("\nn = " + numberOfValues);
			System.out.println("Min: " + ArrayStatLibrary.min(arrayOfIntegers));
			System.out.println("Max: " + ArrayStatLibrary.max(arrayOfIntegers));
			System.out.println("Median: " + oneDecimal.format(ArrayStatLibrary.median(arrayOfValues)));
			System.out.println("Mean: " + oneDecimal.format(ArrayStatLibrary.mean(arrayOfValues)));
			System.out.println("Sample standard deviation: "
					+ oneDecimal.format(ArrayStatLibrary.standardDeviation(arrayOfValues)));
			System.out.print("Sample data: ");

			for (int i = 0; i < arrayOfIntegers.length; i++) {

				System.out.print(arrayOfIntegers[i] + " ");

			}
		} else {
			System.out.print("Sorry, at least 3 values required\n");

		}
		input.close();
	}

}