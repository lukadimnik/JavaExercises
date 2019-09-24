import java.util.Scanner;

public class MethodsSecond {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter width: ");
		int width = Integer.parseInt(input.nextLine());

		System.out.print("Enter height: ");
		int height = Integer.parseInt(input.nextLine());

		printRectangle(width, height);

		input.close();
	}

	private static void printRectangle(int width, int height) {

		System.out.println("");

		for (int y = 0; y < height; y++) {

			for (int x = 0; x < width; x++) {

				System.out.print("x");
			}

			System.out.println("");
		}
	}
}