package myJavaCoding;

public class FindaMaxValue {

	public static void main(String[] abc) {

		// declare integer array assigning list of values
		int[] values = { 2, 1, 9, 5, 2, 8, 10 };

		int max = 0;

		for (int i = 0; i < values.length; i++) {

			if (values[i] > max)
				max = values[i];
		}

		System.out.println("Max Value is: " + max);

	}

}
