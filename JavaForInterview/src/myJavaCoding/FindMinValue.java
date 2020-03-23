package myJavaCoding;

public class FindMinValue {

	public static void main(String[] args) {
		// declare integer array assigning list of values
		int[] values = { 3, 2, 9, 5, 2, 8 };

		int min = 100;

		for (int i = 0; i < values.length; i++) {

			if (values[i] < min)
				min = values[i];

		}

		System.out.println("my min number is " + min);

	}

}
