package JavaBasics;

public class JavaIntro {

	public static void main(String[] args) {
		// The starting point a java code execution is the main()

		System.out.println("Hello" + " " + "World");

		int i = 24;

		double d = 44.5;

		int i2 = (int) d;

		double d1 = (double) i;

		System.out.println(i2);
		System.out.println(d1);

		/*
		 * To convert from Integer to String, a wrapper class is required There are 8
		 * wrapper classes for the 8 primitive data types
		 */
		/*
		 * To convert an Integer to String: Use toString Method To convert a String to
		 * an Integer: Use parseInt
		 */

		int b = 24;
		String s = Integer.toString(b);

		System.out.println(s + 10);

		String s1 = "Ola";
		/*
		 * This gives a number format exception because an alhpatetic string can not be
		 * converted to a number: int b1 = Integer.parseInt(s1); System.out.println(b1);
		 */

	}

}
