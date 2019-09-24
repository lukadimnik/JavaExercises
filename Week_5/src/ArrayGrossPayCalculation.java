import java.util.Scanner;
import java.text.DecimalFormat;

public class ArrayGrossPayCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.print("Enter your hourly wage: ");
		double hourlyWage = readDouble(input);

		System.out.print("Enter the number of days: ");
		int numberOfDays = Integer.parseInt(input.nextLine());

		int[] arrayWorkHours = new int[numberOfDays];

		for (int i = 0; i < numberOfDays; i++) {
			System.out.print("Hours worked on day " + (i + 1) + ": ");
			arrayWorkHours[i] = Integer.parseInt(input.nextLine());
		}

		int totalWorkHours = 0;
		double overtime = 0;

		for (int i = 0; i < arrayWorkHours.length; i++) {
			totalWorkHours += arrayWorkHours[i];

			if (arrayWorkHours[i] > 8) {
				overtime += (arrayWorkHours[i] - 8) * (hourlyWage * 0.5);
			}

		}

		System.out.println("\nTotal work hours is " + totalWorkHours);

		double grossPay = (hourlyWage * totalWorkHours) + overtime;
		System.out.println("Gross pay is " + twoDecimals.format(grossPay));

		System.out.print("You entered the following daily hours: ");

		for (int i = 0; i < arrayWorkHours.length; i++) {
			System.out.print(arrayWorkHours[i] + " ");

			if (arrayWorkHours[i] > 8) {
				overtime += (arrayWorkHours[i] - 8) * 0.5;
			}

		}

		input.close();
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replaceAll(",", "."));
	}
}