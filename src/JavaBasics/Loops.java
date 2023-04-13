package JavaBasics;

public class Loops {

	public static void main(String[] args) {
		/*
		 * Loops are used for repitive task
		 */

		/*
		 * FOR LOOP for Loop has 3 parts: 1. Initialisation 2. Condition 3. Increment or
		 * Decrement For Loop is used when an end condition is determined
		 */

		for (int i = 0; i <= 10; i++) {
			// System.out.println(i);// The counter is getting printed
		}

		/*
		 * WHILE/DO-WHILE LOOP while Loop has 2 compulsory parts: 1. Declaration 2.
		 * Condition The condition is checked and then the statement is executed The
		 * Increment/Decrement are not compulsory while Loop is used when an end
		 * condition is NOT determined
		 * 
		 * For DO_WHILE loop, the statement is executed first before the condition is
		 * checked
		 * 
		 */

		int j = 1;

		while (j < 10) {
			System.out.println(j);
			j++;
		}

		int k = 10;
		do {
			System.out.println(k);
		} while (k < 10);

		// Switch-Case used in place of multiple if-else statement
		int day = 1;
		switch (day) {
		case 1:
			System.out.println("Monday");
          break;
		case 2:
			System.out.println("Teusday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Not a valid day");

		}
		
		int month = 13;
		switch (month) {
		case 1:
			System.out.println("January");
          break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
          break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Not a valid Month");

		}
	}
}
