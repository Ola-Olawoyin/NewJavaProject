package ClassesAndObjects;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClassesInJava {
	
	int a = 10;
	static int b = 10;
	

	public static void main(String[] args) {
		
		
		int a = 10;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bosun\\OneDrive\\Desktop\\Executable\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.testingementor.com");
	System.out.println(driver.getTitle());
	driver.quit();
		/*
		 * 
		 * OBJECTS
		 * In Java everything is defined in terms of Classes and Objects Every Object
		 * has some properties(attributes by which we can identify/define the object) and
		 * Behaviours(features or actions which the object can perform)
		 *
		 * In Java, the properties define as variables while the behaviour defines as method
		 * To create an Object:
		 * class_name ref_var_name = new_keyword constructor_call()
		 * 
		 * There are two types of variables based on scope:
		 * 1. Global - This is a variable outside any method
		 *             It is not mandatory to initialise a global variable
		 *             Life is throughout the class
		 * 2. Local - This is a variable declared inside a method
		 *            It is compulsory to initialise a local variable
		 *            Life is only within a method
		 *            Local variable does not have an assigned default value. So it's best practice fully declare a local variable.
		 * 
		 * There are also other classes of variables on the basis of scope:
		 * Instance - Variables wth values dependednt on the Object. By default, all variables are instance variables
		 *            Memory allocation for an instance variable is as soon as the object of the class is created.
		 *            Instance variable are private property of individual objects
		 * Static - Static variables are class specific and not object specific To have a static varaible, the 'static' keyword is added to the variable
		 *          If an object is making changes to a static variable value, same changes are reflected in all the instances of the class.
		 *          Static properties areshared properties
		 * There are also 2 classes of Method:
		 * Non-Static - Both Non-static and static variables can be accessed directly
		 * Static - Only static variable can be accessed directly. To access an instance variable, an object(instance) of the class to which the variable belong would have to be created 
		 *  Note: When calling a static property always use a class name
		 *        When calling a non-static property use an object
		 * CLASS
		 * A class is a blueprint of an Object
		 * A class collects similar objects
		 * Therefore a class would contain variables and methods of an Object
		 * The variables and methods of an object is stored in a class
		 * 
		 */
//		System.out.println(Students.schoolName);
//		Students s1 = new Students();
//		s1.studentId = 1234;
//		s1.fullName = "Kitan Olawoyin";
//		s1.department = "Electrical Engineering";
//		s1.faculty = "Engineering";
//		
//		s1.registerStudent();
		
		ClassesInJava cij = new ClassesInJava();
		ClassesInJava ci = new ClassesInJava();
        System.out.println(cij.a);
        ci.a = 20;
        System.out.println(a);
        System.out.println(cij.a);
        System.out.println(ci.a);
        System.out.println(b);

	}
	
	

}
