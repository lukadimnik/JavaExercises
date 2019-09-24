import java.util.Scanner;

public class RegExValidateUsernameFormat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter username: ");
		String inputUsername = input.nextLine();

		if (inputUsername.matches("(a)[0-9]{7}(@myy)[.](haaga-helia)[.](fi)")) {
			System.out.println("OK");

		} else {
			System.out.println("Invalid username format");

		}

		input.close();

	}

}