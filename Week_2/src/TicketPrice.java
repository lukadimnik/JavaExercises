import java.text.DecimalFormat;
import java.util.Scanner;

public class TicketPrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat ("0.00");
		
		System.out.print("Enter price for a single ticket: ");
		double singleTicket = readDouble(input);
		
		System.out.print("Enter price for a season ticket: ");
		double seasonTicket = readDouble(input);
		
		System.out.print("Enter the number of bus trips per month: ");
		double tripsPerMonth = readDouble(input);
		
		double singleTicketPerMonth = singleTicket * tripsPerMonth;
		
		double difference;
		
		if (singleTicketPerMonth < seasonTicket) {
			difference = seasonTicket - singleTicketPerMonth;
			System.out.print("Buying single tickets is " + twoDecimals.format(difference) + " euros cheaper.");
		} else if (seasonTicket < singleTicketPerMonth) {
			difference = singleTicketPerMonth - seasonTicket;
			System.out.print("Buying a season ticket is " + twoDecimals.format(difference) + " euros cheaper.");
		} else {
			System.out.print("There is no difference in the price.");
		}
		
		input.close();

	}
	
	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replaceAll(",", "."));
	}

}