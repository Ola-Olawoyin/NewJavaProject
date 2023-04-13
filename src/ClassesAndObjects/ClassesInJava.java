package ClassesAndObjects;

public class ClassesInJava {

	public static void main(String[] args) {
		/*
		 * OBJECTS
		 * In Java everything is defined in terms of Classes and Objects Every Object
		 * has some properties(attributes by which we can identify/define the object) and
		 * Behaviours(features or actions which the object can perform)
		 *
		 * In Java, the properties define as variables while the behaviour defines as method
		 * To create an Object:
		 * class_name ref_var_name = new_keyword constructor_call()
		 * 
		 * There are two types of variables:
		 * 1. Global - This is a variable outside any method
		 *             It is not mandatory to initialise a global variable
		 *             Life is throughout the class
		 * 2. Local - This is a variable declared inside a method
		 *            It is compulsory to initialise a local variable
		 *            Life is only within a method
		 * 
		 * There are also other classes of variables:
		 * Instance - Variables wth values dependednt on the Object. By default, all variables are instance variables
		 * Static - Variables with values dependent on the object. To have a static varaible, the 'static' keyword is added to the variable
		 * 
		 * There are also 2 classes of Method:
		 * Instance - Both instance and static variables can be accessed directly
		 * Static - Only static variable can be accessed directly. To access an instance variable, an object(instance) of the class to which the variable belong would have to be created 
		 * 
		 * CLASS
		 * A class is a blueprint of an Object
		 * A class collects similar objects
		 * Therefore a class would contain variables and methods of an Object
		 * The variables and methods of an object is stored in a class
		 * 
		 */
		System.out.println(Students.schoolName);
		Students s1 = new Students();
		s1.studentId = 1234;
		s1.fullName = "Kitan Olawoyin";
		s1.department = "Electrical Engineering";
		s1.faculty = "Engineering";
		
		s1.registerStudent();

	}

}
