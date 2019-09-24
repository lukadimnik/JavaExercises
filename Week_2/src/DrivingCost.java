import java.text.DecimalFormat;
import java.util.Scanner;

public class DrivingCost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat ("0.00");
		
		System.out.print("Enter driven kilometers: ");
		int drivenKm = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter amount of fuel consumed: ");
		double fuelAmount = readDouble(input);
		
		System.out.print("Enter fuel price per liter: ");
		double fuelPrice = readDouble(input);
		
		double costPerKm = fuelPrice * fuelAmount / drivenKm;
		
		System.out.print("The cost per kilometer is " + twoDecimals.format(costPerKm) + " euros.");
		
		input.close();

	}
	
	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replaceAll(",", "."));
	}

}