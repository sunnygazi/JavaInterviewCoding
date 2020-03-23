package myJavaCoding;

public class ReverseString {

	
	
	
	public static void main(String[] args) {

		String name = "ibrahimgazi";
		String reverse = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			reverse = reverse + name.charAt(i);

		} // end of for

		System.out.println(reverse);

		
		
		
	}// end of main

}
