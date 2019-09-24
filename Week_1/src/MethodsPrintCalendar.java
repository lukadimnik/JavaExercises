import java.time.LocalDate;
import java.util.Scanner;

public class MethodsPrintCalendar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: ");
		int inputYear = Integer.parseInt(input.nextLine());

		System.out.print("Enter month: ");
		int inputMonth = Integer.parseInt(input.nextLine());

		printCalendar(inputYear, inputMonth);

		input.close();

	}

	private static void printCalendar(int inputYear, int inputMonth) {

		LocalDate myDate = LocalDate.of(inputYear, inputMonth, 1);

		int daysInMonth = myDate.lengthOfMonth();
		int dayOfWeek = myDate.getDayOfWeek().getValue();
		int day = 1;
		int dayNumbersLength = (7 - dayOfWeek) + 1;
		int emptySpacesLength = 7 - dayNumbersLength;

		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		String[] dayName = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };

		System.out.println("\n > " + monthName[inputMonth - 1] + " " + inputYear + " <");

		for (int i = 0; i < dayName.length; i++) {
			System.out.print(" " + dayName[i]);

		}

		System.out.println();

		for (int i = 0; i < emptySpacesLength; i++) {

			System.out.print("    ");

		}

		for (int i = 0; i < dayNumbersLength; i++) {
			System.out.printf("%4d", day++);

		}

		System.out.println();

		for (int i = 1; i < (daysInMonth - dayNumbersLength) + 1; i++) {
			System.out.printf("%4d", day++);
			if (i % 7 == 0) {
				System.out.println("");

			}

		}
		System.out.print("\n");

	}
}
