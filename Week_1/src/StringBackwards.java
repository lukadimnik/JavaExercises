import java.util.Scanner;

public class StringBackwards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = input.nextLine();

		System.out.println(reverse(inputString));

		input.close();

	}

	private static String reverse(String inputString) {

		String reverse = "";

		for (int i = 0; i < inputString.length(); i++) {

			reverse += inputString.charAt(inputString.length() - 1 - i);

		}
		return reverse;

	}
}