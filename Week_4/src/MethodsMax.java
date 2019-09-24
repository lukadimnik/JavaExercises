import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MethodsMax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NumberFormat numberFormat = DecimalFormat.getNumberInstance(Locale.US);

		System.out.print("Enter first double: ");
		double firstDouble = readDouble(input);

		System.out.print("Enter second double: ");
		double secondDouble = readDouble(input);

		double maxVariable = max(firstDouble, secondDouble);
		System.out.println("\n" + "The max value is " + numberFormat.format(maxVariable));

		input.close();
	}

	private static double max(double firstDouble, double secondDouble) {
		double max = 0;
		if (firstDouble > secondDouble) {
			max = firstDouble;
		} else {
			max = secondDouble;
		}
		return max;

	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replaceAll(",", "."));
	}

}