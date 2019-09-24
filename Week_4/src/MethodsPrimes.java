import java.util.Scanner;

public class MethodsPrimes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("How many primes: ");
		int numberOfPrimes = Integer.parseInt(input.nextLine());

		int counter = 0;
		int number = 0;

		while (counter < numberOfPrimes) {

			if (isPrime(number) == true) {
				System.out.print(number + " ");
				counter++;
			}
			number++;
		}
		input.close();
	}

	private static boolean isPrime(int number) {
		int checkedNumber = number;
		boolean isPrime = true;
		double divisor = checkedNumber / 2;

		if (checkedNumber == 0 || checkedNumber == 1) {

			isPrime = false;

		} else {

			for (int x = 2; x <= divisor; x++) {
				if (checkedNumber % x == 0) {
					isPrime = false;
				}
			}
		}
		return isPrime;
	}

}