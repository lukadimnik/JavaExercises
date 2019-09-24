import java.text.DecimalFormat;
import java.util.Scanner;

public class AgentCommission {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat ("0.00");
		
		System.out.print("Enter selling price: ");
		double sellingPrice = readDouble(input);
		
		double commission = sellingPrice * 0.0344;
		
		if (commission < 2400) {
			System.out.print("The commission is 2400,00 euros.");
		} else {
			System.out.print("The commission is " + twoDecimals.format(commission) + " euros.");
		}
		
		input.close();

	}
	
	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replaceAll(",", "."));
	}

}