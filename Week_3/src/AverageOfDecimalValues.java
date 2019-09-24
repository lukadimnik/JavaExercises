import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageOfDecimalValues {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat ("0.00");
		
		System.out.print("Enter first number (zero ends): ");
		double numberInput = readDouble(input);
		
		int counter = 0;
		
		double total = 0;
		
		if (numberInput == 0) {
			
			System.out.print("Nothing to calculate");
			
		} else {
			
			while (numberInput != 0) {
				total += numberInput;
				
				System.out.print("Enter next number (zero ends): ");
				numberInput = readDouble(input);
				
				counter++;
			}
			
			double average = total / counter;
			
			System.out.print("The average is " + twoDecimals.format(average));
		}
		
		input.close();

	}
	
	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replaceAll(",", "."));
	}

}