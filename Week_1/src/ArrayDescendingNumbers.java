import java.util.Scanner;
import java.util.Arrays;

public class ArrayDescendingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] array = new double[4];

		for (int x = 0; x < 4; x++) {

			System.out.print("Enter " + (x + 1) + ". number: ");
			array[x] = readDouble(input);

		}

		Arrays.sort(array);

		System.out.print("\n");

		for (int x = array.length - 1; x >= 0; x--) {

			System.out.print(array[x] + " ");

		}

		input.close();
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replaceAll(",", "."));
	}
}
