import java.util.Scanner;

public class ObjectsApplicantProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Applicant[] applicantArray = new Applicant[4];

		String name = "";
		int points = 0;

		for (int i = 0; i < applicantArray.length; i++) {
			System.out.print("Enter " + (i + 1) + ". name: ");
			name = input.nextLine();

			System.out.print("Enter points: ");
			points = Integer.parseInt(input.nextLine());

			applicantArray[i] = new Applicant(name, points);

		}
		System.out.println();

		int minPoints = 0;
		System.out.print("Enter the minimum of required points: ");
		minPoints = Integer.parseInt(input.nextLine());

		System.out.println();

		System.out.println("The following applicants achived the minimum of " + minPoints + " points: ");

		for (int i = 0; i < applicantArray.length; i++) {

			if (applicantArray[i].getPoints() >= minPoints) {
				System.out.println(applicantArray[i].getName() + " , " + applicantArray[i].getPoints() + " points");

			}
		}

		input.close();
	}

}
