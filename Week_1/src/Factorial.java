import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a non-negative integer: ");
		String stringInput = input.nextLine();

		try {
			int factorialInput = Integer.parseInt(stringInput);

			if (factorialInput >= 0) {
				int factorial = 1;

				for (int i = 0; i < factorialInput; i++) {
					factorial = factorial * (i + 1);
				}

				System.out.print(factorialInput + "! = " + factorial);

			} else {
				System.out.println("Please enter a non-negative integer.");

			}

		} catch (NumberFormatException nfe) {
			System.out.println("Please enter a non-negative integer.");

		}

		input.close();
	}
}