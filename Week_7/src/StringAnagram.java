import java.util.Arrays;
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

	private static boolean isAnagram(String inputFirstString, String inputSecondString) {

		boolean isItAnagram = false;

		String firstString = inputFirstString.replaceAll("[\\s.,]*", "");
		String secondString = inputSecondString.replaceAll("[\\s.,]*", "");

		firstString = firstString.toLowerCase();
		secondString = secondString.toLowerCase();

		char[] charFirstString = new char[firstString.length()];
		char[] charSecondString = new char[secondString.length()];

		for (int i = 0; i < charFirstString.length; i++) {

			charFirstString[i] = firstString.charAt(i);
			charSecondString[i] = secondString.charAt(i);

		}

		Arrays.sort(charFirstString);
		Arrays.sort(charSecondString);

		String firstSortedString = new String(charFirstString);
		String secondSortedString = new String(charSecondString);

		if (firstSortedString.compareTo(secondSortedString) == 0) {
			isItAnagram = true;

		}

		if (firstSortedString.matches("[^a-zедц\\s.,]*") || secondSortedString.matches("[^a-zедц\\s.,]*")) {
			isItAnagram = false;
		}

		return isItAnagram;

	}

}