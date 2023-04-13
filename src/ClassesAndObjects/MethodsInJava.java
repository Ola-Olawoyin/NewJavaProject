package ClassesAndObjects;

import java.util.Scanner;

public class MethodsInJava {

	public static void main(String[] args) {

		/*
		 * Methods To perform any functionality or any specific task in Java, a method
		 * has to be written
		 * Function is written for any business logic
		 * Any code to perform a functionality my be inside a method
		 * Methods are used to divide large codes into manageable chunks of code
		 * Methods are also written reusable codes
		 * Return type Method_Name Values_in_the_method
		 * Method_name represents the functionality to be performed
		 * The parameter_list are the requirements for the functionality to be fulfilled
		 * 
		 * Method Declaration:
		 * 
		 * Access/Non-Access Modifier - optional
		 * returnType
		 * MethodName(Parameter_list - optiopnal) 
		 * {
		 * method body or block of statements
		 * }
		 * 
		 * Note: You can not declare a method inside another method
		 * The scanner class and the method available in the class is used to pass in values at the run time.
		 */
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please pass the first number:");
//		int num1= scan.nextInt();
//		System.out.println("Please pass the first number:");
//		int num2 = scan.nextInt();
		
		//scan.close();
		
		MethodsInJava mij = new MethodsInJava();
		
		System.out.println(mij.concatinatedString("Ola ", "Olawoyin"));
		
//		int result = mij.sumTwoDigits(num1, num2);
//		mij.printArithmeticResult(result);	
//		
//		System.out.println("The modulus operation of "+num1+" and "+num2+" is :"+num2%num1);
		 
//		mij.subTwoDigits(15, 5);
//		mij.multTwoDigits(15, 5);
//		mij.divTwoDigits(15, 5);
//		
	}
	
	public int sumTwoDigits(int num1, int num2) {

		int sum = num1 + num2;

		

		return sum;
	}

	public int subTwoDigits(int num1, int num2) {

		int sub = num1 - num2;

		System.out.println("The difference of " + num1 + " and " + num2 + " is :" + sub);

		return sub;
	}

	public int multTwoDigits(int num1, int num2) {

		int mult = num1 * num2;

		System.out.println("The product of " + num1 + " and " + num2 + " is :" + mult);

		return mult;
	}

	public int divTwoDigits(int num1, int num2) {

		int div = num1 / num2;

		System.out.println(num1 + " divided by " + num2 + " is :" + div);

		return div;
	}

	public void printArithmeticResult(int sum) {
		
		System.out.println("The sum of the two numbers is: "+sum);
		 

	}
	
	public String concatinatedString(String stringOne, String StringTwo) {
		
		String concString = stringOne + StringTwo;
		
		return concString;
	}

}
