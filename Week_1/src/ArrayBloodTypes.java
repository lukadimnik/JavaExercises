import java.util.Scanner;
import java.text.DecimalFormat;

public class ArrayBloodTypes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0");

		String[] array = { "A+", "O-", "AB+", "O+", "AB+", "AB+", "O-", "AB+", "O+", "AB+" };

		System.out.print("Enter blood type: ");
		String stringInput = input.nextLine();

		int counter = 0;

		for (int x = 0; x < array.length; x++) {

			if (array[x].equals(stringInput)) {
				counter++;
			}
		}

		double percentageOfBloodType = (counter * 100) / array.length;
		System.out.println(oneDecimal.format(percentageOfBloodType) + " %");

		input.close();
	}
}
