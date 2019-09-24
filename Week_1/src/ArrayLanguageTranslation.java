import java.util.Scanner;

public class ArrayLanguageTranslation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] arrayEnglish = { "bird", "bus", "car", "cat", "dog", "school", "thanks", "train", "teacher" };
		String[] arrayFinnish = { "lintu", "bussi", "auto", "kissa", "koira", "koulu", "kiitos", "juna", "opettaja" };

		System.out.print("Enter an English word: ");
		String stringInput = input.nextLine();

		boolean isFound = false;

		for (int x = 0; x < arrayEnglish.length; x++) {

			if (arrayEnglish[x].equals(stringInput)) {

				System.out.println(arrayFinnish[x]);
				isFound = true;
			}

		}

		if (isFound == false) {
			System.out.println("Unknown word");
		}

		input.close();
	}
}
