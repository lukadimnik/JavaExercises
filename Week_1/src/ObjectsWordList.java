import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ObjectsWordList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<String> arrayList = new ArrayList<String>();

		boolean isQuit = false;

		while (isQuit == false) {

			System.out.print("Enter a word (quit ends): ");
			String inputWord = input.nextLine();

			if (inputWord.equals("quit")) {
				isQuit = true;
			} else {
				arrayList.add(inputWord);

			}

		}

		System.out.println();

		Collections.sort(arrayList);

		for (String obj : arrayList) {
			System.out.println(obj);
		}

		input.close();
	}

}