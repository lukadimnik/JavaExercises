import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String stringInput = input.nextLine();

		String totalStringLength = "";

		while (stringInput.equals("quit") != true) {

			totalStringLength += stringInput;

			System.out.print("Enter a string: ");
			stringInput = input.nextLine();

		}

		System.out.print("The total length is " + totalStringLength.length());

		input.close();

	}
}