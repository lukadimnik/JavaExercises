import java.text.DecimalFormat;
import java.util.Scanner;

public class CarSharing{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat ("0.00");
		
		System.out.print("Enter driven kilometers: ");
		double drivenKm = readDouble(input);
		
		System.out.print("Enter fuel consumption per 100 km: ");
		double fuelConsumptionPerKm = readDouble(input)/100;
		
		System.out.print("Enter fuel price per liter: ");
		double fuelPrice = readDouble(input);
		
		System.out.print("Enter number of people: ");
		int numberOfPeople = Integer.parseInt(input.nextLine());
		
		double payPerPerson = fuelConsumptionPerKm * drivenKm * fuelPrice / numberOfPeople;
		
		System.out.print("Each of the " + numberOfPeople + " people should pay " + twoDecimals.format(payPerPerson) + " euros.");
		
		input.close();

	}
	
	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replaceAll(",", "."));
	}

}