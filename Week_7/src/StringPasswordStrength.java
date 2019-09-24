import java.util.Scanner;

public class StringPasswordStrength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter password: ");
		String inputPassword = input.nextLine();

		if (checkStrength(inputPassword) == true) {
			System.out.println("OK");

		} else if (checkStrength(inputPassword) == false) {
			System.out.println("Not strong enough!");

		}

		input.close();
	}

	private static boolean checkStrength(String inputPassword) {

		String password = inputPassword;
		int counter = 0;
		boolean isStrong = false;

		if (password.matches(".*[A-ZÅÄÖ].*")) {
			counter++;
		}

		if (password.matches(".*[a-zåäö].*")) {
			counter++;
		}

		if (password.matches(".*[0-9].*")) {
			counter++;
		}

		if (password.matches("[a-zA-Z0-9]*") == false) {
			counter++;
		}

		if (password.matches(".{8,}") == false) {
			counter = 0;
		}

		if (counter >= 3) {
			isStrong = true;
		}

		return isStrong;
	}

}