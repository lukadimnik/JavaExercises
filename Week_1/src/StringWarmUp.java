import java.util.Scanner;

public class StringWarmUp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = input.nextLine();

		System.out.println(inputString.length() + " characters");

		System.out.println(inputString.toUpperCase());

		System.out.println(inputString.toLowerCase());
		
		input.close();

	}

}
