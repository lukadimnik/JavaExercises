import java.util.Scanner;

public class StringLettersAndDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = input.nextLine();

		int countDigit = 0;
		int countString = 0;

		for (int i = 0; i < inputString.length(); i++) {
			if (Character.isDigit(inputString.charAt(i))) {
				countDigit++;

			} else if (Character.isLetter(inputString.charAt(i)) == true) {
				countString++;

			}
		}
		System.out.println(countString + " letter(s)\n" + countDigit + " digit(s)");

		input.close();

	}
}