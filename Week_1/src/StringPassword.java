import java.util.Scanner;

public class StringPassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter username: ");
		String inputUsername = input.nextLine();

		System.out.print("Enter password: ");
		String inputPassword = input.nextLine();

		if (validatePassword(inputUsername, inputPassword) == true) {
			System.out.print("OK");

		} else {
			System.out.print("NOT OK");

		}
		input.close();

	}

	private static boolean validatePassword(String inputUsername, String inputPassword) {

		boolean isPasswordOk = false;

		if (inputPassword.toLowerCase().contains(inputUsername.toLowerCase()) || inputPassword.length() < 8) {
			isPasswordOk = false;
		} else {
			isPasswordOk = true;

		}

		return isPasswordOk;
	}

}
