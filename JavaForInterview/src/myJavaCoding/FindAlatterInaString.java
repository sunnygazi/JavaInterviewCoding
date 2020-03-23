package myJavaCoding;

public class FindAlatterInaString {

	
	public static void main(String[] args) {
		
		// how to find a latter and index of that latter
		String country = new String("United State Of America");
		for (int i = 0; i < country.length(); i++) {
			if (country.charAt(i) == 'e') {
				System.out.println(country.charAt(i));
				System.out.println("index of e::" + i);

			}

		}

	}

}
