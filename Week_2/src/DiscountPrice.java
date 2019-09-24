import java.text.DecimalFormat;
import java.util.Scanner;

public class DiscountPrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.print("Enter original price: ");
		double originalPrice = readDouble(input);

		System.out.print("Enter discount percentage: ");
		double discountPercentage = readDouble(input);

		double discountPrice = (originalPrice * (100 - discountPercentage)) / 100;

		System.out.print("The final price is " + twoDecimals.format(discountPrice));

		input.close();

	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replaceAll(",", "."));
	}

}