import java.util.Scanner;
import java.text.DecimalFormat;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.print("Enter initial deposit: ");
		double initialDeposit = readDouble(input);

		System.out.print("Enter interest rate: ");
		double interestRate = readDouble(input);

		System.out.print("Enter capital income tax rate: ");
		double capitalTaxRate = readDouble(input);

		System.out.print("Enter number of years: ");
		int years = Integer.parseInt(input.nextLine());

		for (int i = 0; i < years; i++) {

			double interestRateValue = (interestRate * initialDeposit) / 100;
			double interestRateAfterCapitalTax = interestRateValue - (capitalTaxRate * interestRateValue) / 100;

			initialDeposit += interestRateAfterCapitalTax;

			System.out.println((i + 1) + ": " + twoDecimals.format(initialDeposit));

		}

		input.close();
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replaceAll(",", "."));
	}
}