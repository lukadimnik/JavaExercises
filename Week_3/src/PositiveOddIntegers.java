import java.util.Scanner;

public class PositiveOddIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean isQuit = false;

		while (isQuit == false) {

			System.out.print("Enter a positive odd integer: ");
			String inputString = input.nextLine();

			try {
				int integerInput = Integer.parseInt(inputString);
				int remainder = integerInput % 2;

				if (inputString.startsWith("-") == false && remainder != 0) {
					System.out.println("  OK\n");

					isQuit = false;
				} else {
					System.out.println("  " + integerInput + " is not a positive odd integer\n");

					isQuit = false;
				}

			} catch (NumberFormatException nfe) {

				if (inputString.matches("quit") == true) {
					System.out.println("  Bye!");

					isQuit = true;
				} else {
					System.out.println("  " + "'" + inputString + "'" + " is not a positive odd integer\n");

					isQuit = false;

				}
			}
		}

		input.close();
	}

}