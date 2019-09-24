import java.util.Arrays;

class ArrayStatLibrary {

	public static int max(int[] arrayOfIntegers) {
		int max = arrayOfIntegers[0];

		for (int i = 1; i < arrayOfIntegers.length; i++) {
			if (max < arrayOfIntegers[i]) {

				max = arrayOfIntegers[i];

			}

		}

		return max;
	}

	public static int min(int[] arrayOfIntegers) {
		int min = arrayOfIntegers[0];

		for (int i = 1; i < arrayOfIntegers.length; i++) {
			if (min > arrayOfIntegers[i]) {

				min = arrayOfIntegers[i];

			}

		}

		return min;
	}

	public static double median(double[] arrayOfValues) {
		double[] array = arrayOfValues;
		Arrays.sort(array);
		double median;

		if (array.length % 2 == 0) {

			median = (array[array.length / 2] + array[array.length / 2 - 1]) / 2;

		} else {
			median = (double) array[array.length / 2];

		}

		return median;
	}

	public static double mean(double[] arrayOfValues) {
		double mean = 0;
		double sum = 0;

		for (int i = 0; i < arrayOfValues.length; i++) {
			sum += arrayOfValues[i];
		}
		mean = sum / arrayOfValues.length;
		return mean;
	}

	public static double standardDeviation(double[] arrayOfValues) {

		double[] values = arrayOfValues;
		double sampleMean = mean(arrayOfValues);
		double sum = 0;

		for (int i = 0; i < arrayOfValues.length; i++) {
			sum += (values[i] - sampleMean) * (values[i] - sampleMean);
		}

		double divideTheMean = sum / (arrayOfValues.length - 1);
		double squareRootOfDivideTheMean = Math.sqrt(divideTheMean);

		return squareRootOfDivideTheMean;
	}

}