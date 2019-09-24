class MethodsLibrary {

	public static int factorial(int factorialNumbers) {
		int total = factorialNumbers;
		int factorial = 1;

		if (total == 0) {
			factorial = 1;
		} else {
			for (int i = 0; i < total; i++) {
				factorial = factorial * (i + 1);
			}
		}

		return factorial;
	}

}