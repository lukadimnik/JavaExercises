import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String stringInput = input.nextLine();

		int counter = 0;

		if (stringInput.isEmpty()) {

			System.out.print("Nothing to calculate");

		} else {

			while (stringInput.isEmpty() == false) {

				System.out.print("Enter next string: ");
				stringInput = input.nextLine();

				counter++;
			}

			System.out.print("Number of entered strings is " + counter);
		}

		input.close();

	}
}