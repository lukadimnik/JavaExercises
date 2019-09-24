import java.util.Scanner;

public class StringRemoveSpace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = input.nextLine();

		System.out.println(removeExtraSpace(inputString));

		input.close();
	}

	private static String removeExtraSpace(String inputString) {

		String string = inputString.trim();

		string = string.replaceAll("   ", " ");
		string = string.replaceAll("  ", " ");
		string = string.replaceAll("   ", " ");
		string = string.replaceAll("  ", " ");

		String newString = "\"" + string + "\"";

		return newString;
	}

}