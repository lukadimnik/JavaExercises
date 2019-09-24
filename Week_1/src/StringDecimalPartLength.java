import java.util.Scanner;

public class StringDecimalPartLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String substractedString = "";
		String subStringPreComa = "";

		System.out.print("Enter a decimal number: ");
		String stringInput = input.nextLine();

		try {
			double decimalInput = Double.parseDouble(stringInput.replaceAll(",", "."));
			stringInput = stringInput.replaceAll(",", ".");

			boolean isTrueDecimal = false;

			if (stringInput.matches(".*[.].*")) {
				isTrueDecimal = true;

			}

			int indexOfComa = 0;

			if (isTrueDecimal == true) {

				indexOfComa = stringInput.indexOf(".");

				substractedString = stringInput.substring(indexOfComa, (stringInput.length() - 1));
				subStringPreComa = stringInput.substring(0, indexOfComa);

				if (substractedString.length() > 0 && subStringPreComa.length() > 0) {
					System.out.println(substractedString.length() + " decimal place(s)");

				} else {
					System.out.println("Please enter a proper decimal number");

				}

			} else {
				System.out.println("Please enter a proper decimal number");
			}

		} catch (NumberFormatException nfe) {
			System.out.println("Please enter a proper decimal number");

		}

		input.close();
	}
}