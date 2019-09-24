import java.util.Scanner;

public class MethodsUseLibraryClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int factorialNumbers = Integer.parseInt(input.nextLine());

		System.out.println(factorialNumbers + "! = " + MethodsLibrary.factorial(factorialNumbers));
		factorialNumbers++;

		input.close();

	}

}