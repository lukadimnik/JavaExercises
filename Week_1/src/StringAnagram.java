import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String firstString = input.nextLine();

		System.out.print("Enter second string: ");
		String secondString = input.nextLine();

		if (isAnagram(firstString, secondString) == true) {
			System.out.print("Anagram!");

		} else {
			System.out.print("No anagram.");

		}

		input.close();
	}

	private static boolean isAnagram(String firstString, String secondString) {

		return false;

	}

}
