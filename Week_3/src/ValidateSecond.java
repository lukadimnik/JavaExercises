import java.util.Scanner;

public class ValidateSecond {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int gradeInput;

		try {
			System.out.print("Enter grade (0-5): ");
			gradeInput = Integer.parseInt(input.nextLine());

			if (gradeInput >= 0 && gradeInput <= 5) {
				System.out.print("OK");
			} else {
				System.out.println("Please enter an integer between 0 and 5.");
			}

		} catch (NumberFormatException nfe) {
			System.out.println("Please enter an integer between 0 and 5.");
		}

		input.close();

	}
}