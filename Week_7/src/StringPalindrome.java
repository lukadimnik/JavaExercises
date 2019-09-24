import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = input.nextLine();

		if (isPalindrome(inputString) == true) {
			System.out.print("The text is a palindrome.");

		} else {
			System.out.print("No palindrome");

		}

		input.close();
	}

	private static boolean isPalindrome(String inputString) {

		boolean isPalindrome = false;
		String originalString = inputString;

		originalString = originalString.replaceAll("[\\s.,:;?!\\-\"\']*", "");
		originalString = originalString.toLowerCase();

		char[] charFirstString = new char[originalString.length()];

		for (int i = 0; i < charFirstString.length; i++) {

			charFirstString[i] = originalString.charAt(i);
		}

		int decrementLoop = charFirstString.length - 1;
		int counter = 0;
		for (int i = 0; i < charFirstString.length; i++) {

			if (charFirstString[i] == originalString.charAt(decrementLoop)) {
				counter++;
			}

			decrementLoop--;
		}

		if (counter == charFirstString.length) {
			isPalindrome = true;
		}

		if (originalString.matches(".*[0-9]+.*") || originalString.equalsIgnoreCase("")) {
			isPalindrome = false;
		}

		return isPalindrome;

	}

}