import java.util.Scanner;

public class ValidateThird {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		boolean incorrect = true;

		while (incorrect == true) {
			
			System.out.print("Enter grade (0-5): ");
			String stringInput = input.nextLine();
			
			try {
				int gradeInput = Integer.parseInt(stringInput);

				if (gradeInput >= 0 && gradeInput <= 5) {
					System.out.print("OK");
					
					incorrect = false;
				} else {
					System.out.println(gradeInput + " is not a valid grade.\n");
									
					incorrect = true;
				}

			} catch (NumberFormatException nfe) {
				System.out.println(stringInput + " is not a valid grade.\n");
								
				incorrect = true;
			}
		}
		input.close();
	}
}
/*
int number;
do {
    System.out.println("Please enter a positive number!");
    while (!sc.hasNextInt()) {
        System.out.println("That's not a number!");
        sc.next(); // this is important!
    }
    number = sc.nextInt();
} while (number <= 0);
System.out.println("Thank you! Got " + number);*/