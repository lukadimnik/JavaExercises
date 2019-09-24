import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsLanguageTranslationArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<WordPair> wordPairList = new ArrayList<WordPair>();

		boolean isOK = false;
		String englishWord = "";
		String finnishWord = "";

		System.out.print("=== Creating an English-Finnish dictionary (ok ends) ===\n");

		while (isOK == false) {

			System.out.print("Enter an English word: ");
			englishWord = input.nextLine();

			if (englishWord.equals("ok") == true) {

				isOK = true;

			} else {

				System.out.print("Enter a Finnish word: ");
				finnishWord = input.nextLine();

				wordPairList.add(new WordPair(englishWord, finnishWord));
				System.out.println();

			}

		}

		boolean isQuit = false;

		System.out.println("\n=== English-Finnish translation service (quit ends) ===");

		while (isQuit == false) {

			System.out.print("Enter an English word: ");
			englishWord = input.nextLine();

			if (englishWord.equals("quit") == true) {

				System.out.print("Bye!");
				isQuit = true;

			} else {

				boolean isMatch = false;

				for (WordPair wordpair : wordPairList) {

					if (wordpair.getEnglishWord().equals(englishWord)) {

						System.out.println(wordpair.getFinnishWord() + "\n");
						isMatch = true;
					}

				}
				if (isMatch == false) {
					System.out.println("Unknown word\n");
				}

			}

		}

		input.close();
	}

}