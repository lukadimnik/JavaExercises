import java.util.Scanner;

public class StringCreateUsername {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first name: ");
		String inputFirstName = input.nextLine();

		System.out.print("Enter surname: ");
		String inputLastName = input.nextLine();

		System.out.println(createUsername(inputFirstName, inputLastName));

		input.close();

	}

	private static String createUsername(String firstName, String lastName) {

		String newUsername = "Not enough letters to create a username!";

		if (firstName.length() >= 2 && lastName.length() >= 3) {

			newUsername = lastName.substring(0, 3).toLowerCase() + firstName.substring(0, 2).toLowerCase();

		}
		return newUsername;

	}
}