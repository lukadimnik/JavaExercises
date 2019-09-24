public class MethodsFirst {

	public static void main(String[] args) {
		printNumbers();
	}

	private static void printNumbers() {
		for (int x = 2; x <= 50; x += 2) {
			System.out.print(x + " ");
		}
	}

}