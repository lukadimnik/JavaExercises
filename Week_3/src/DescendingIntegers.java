import java.util.Scanner;

public class DescendingIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int descend = Integer.parseInt(input.nextLine());
		
		for (int x = 1; descend >= x; descend--) {
			System.out.print(descend + " ");
		}
		
		input.close();

	}

}