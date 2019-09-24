import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ObjectsSortingWordPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<WordPair> wordPairList = new ArrayList<WordPair>();

		boolean isQuit = false;
		String englishWord = "";
		String finnishWord = "";

		while (isQuit == false) {

			System.out.print("Enter an English word (quit ends): ");
			englishWord = input.nextLine();

			if (englishWord.equals("quit") == true) {

				isQuit = true;

				Collections.sort(wordPairList); // sort english words

				String toPrintEnglish = "";
				for (int i = 0; i < wordPairList.size(); i++) {

					toPrintEnglish += wordPairList.get(i).getEnglishWord() + " = "
							+ wordPairList.get(i).getFinnishWord() + "\n";
				}

				System.out.println();

				Collections.sort(wordPairList, new WordPair_FinnishWordComparator()); // sort finnish words
				String toPrintFinnish = "";

				for (int i = 0; i < wordPairList.size(); i++) {

					toPrintFinnish += wordPairList.get(i).getFinnishWord() + " = "
							+ wordPairList.get(i).getEnglishWord() + "\n";
				}

				System.out.print(toPrintEnglish + "\n" + toPrintFinnish);
				isQuit = true;

			} else {

				System.out.print("Enter a Finnish word: ");
				finnishWord = input.nextLine();

				wordPairList.add(new WordPair(englishWord, finnishWord));
				System.out.println();

			}
		}
		input.close();
	}
}
