import java.util.Scanner;

public class MethodsFactorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numberOfPrints = 9;
		int factorialNumbers = 1;

		for (int x = 0; x < numberOfPrints; x++) {
			System.out.println((x + 1) + "! = " + factorial(factorialNumbers));
			factorialNumbers++;
		}

		input.close();
	}

	private static int factorial(int factorialNumbers) {
		int total = factorialNumbers;
		int factorial = 1;

		for (int i = 0; i < total; i++) {
			factorial = factorial * (i + 1);
		}

		return factorial;
	}

}