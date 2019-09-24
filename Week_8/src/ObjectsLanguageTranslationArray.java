import java.util.Scanner;

public class ObjectsLanguageTranslationArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		WordPair[] wordPairArray = { new WordPair("bird", "lintu"), new WordPair("bus", "bussi"),
				new WordPair("car", "auto"), new WordPair("cat", "kissa"), new WordPair("dog", "koira") };

		System.out.print("Enter an English word: ");
		String englishWord = input.nextLine();

		boolean isMatch = false;
		for (int i = 0; i < wordPairArray.length; i++) {
			if (wordPairArray[i].getEnglishWord().equals(englishWord)) {
				System.out.print(wordPairArray[i].getFinnishWord());
				isMatch = true;
			}
		}

		if (isMatch == false) {
			System.out.print("Unknown word");

		}

		input.close();
	}

}