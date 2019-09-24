
public class ArrayMatrixSum {

	public static void main(String[] args) {
		int[][] first = { { 1, 2, 0 }, { 2, 3, 4 } };
		int[][] second = { { 3, 2, 5 }, { 6, 4, 3 } };
		int[][] third = { { 1, 1, 1, 1 }, { 4, 3, 2, 1 }, { 2, 2, 2, 2 } };
		int[][] fourth = { { 2, 2, 2, 3 }, { 2, 3, 2, 0 }, { 1, 2, 3, 4 } };

		printSum(first, second);
		System.out.println();

		printSum(third, fourth);
	}

	private static void printSum(int[][] first, int[][] second) {

		for (int i = 0; i < first.length; i++) {

			for (int y = 0; y < first[0].length; y++) {
				System.out.print(first[i][y] + second[i][y]);
				System.out.print(" ");

			}
			System.out.println();

		}

	}
}
