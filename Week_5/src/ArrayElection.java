import java.util.Scanner;

public class ArrayElection {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of candidates: ");
		int numberOfCandidates = Integer.parseInt(input.nextLine());

		String[] arrayName = new String[numberOfCandidates];
		int[] arrayVotes = new int[numberOfCandidates];

		for (int i = 0; i < numberOfCandidates; i++) {

			System.out.print("Enter " + (i + 1) + " . name: ");
			arrayName[i] = input.nextLine();

			System.out.print("Enter votes: ");
			arrayVotes[i] = Integer.parseInt(input.nextLine());

		}

		int maxVotes = 0;
		String winnerName = "";

		for (int i = 0; i < numberOfCandidates; i++) {

			if (maxVotes < arrayVotes[i]) {
				maxVotes = arrayVotes[i];
				winnerName = arrayName[i];
			}

		}

		int numberOfEquals = 0;

		for (int i = 0; i < numberOfCandidates; i++) {

			if (maxVotes == arrayVotes[i]) {
				numberOfEquals++;
			}

		}
		if (numberOfEquals > 1) {

			System.out.println("The election is a tie between the following candidates: ");

			for (int i = 0; i < numberOfCandidates; i++) {

				if (maxVotes == arrayVotes[i]) {
					System.out.println(arrayName[i] + "(" + arrayVotes[i] + " votes)");
				}

			}
		}

		if (numberOfEquals == 1) {
			System.out.println("The winner is " + winnerName + " with " + maxVotes + " votes!");
		}

		input.close();
	}
}