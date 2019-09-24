import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		String inputString = input.nextLine();
		
		inputString = inputString.replace("-", "+");

		int inputInteger = Integer.parseInt(inputString);

		int product = 1;

		if (inputString.length() == 1) {

			product = inputInteger;

		} else {

			for (int i = 0; i < inputString.length(); i++) {

				int remainder = inputInteger % 10;
				inputInteger = inputInteger / 10;
				product = product * remainder;
			}

		}

		System.out.println(product);

		input.close();
	}
}
