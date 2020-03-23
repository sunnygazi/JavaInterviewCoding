package myJavaCoding;

public class SumOfTwoValuesOfAnArray {
	/*
	 * write a program that display the sum if two values of an array total is more
	 * than 10
	 */
	public static void main(String[] args) {

		int x[] = { 2, 2, 3, 5, 4, 9 };

		for (int i = 0; i < x.length; i++) {
			int s1 = x[i];
			for (int j = i + 1; j < x.length; j++) {
				int s2 = x[j];
				if (s1 + s2 >= 10) {
					System.out.println(s1 + " " + s2);
					System.out.println("this two numbers sum is more then 10");
				}
			}
		}
	}
}
