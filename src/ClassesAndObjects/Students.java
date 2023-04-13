package ClassesAndObjects;


public class Students {

	//Global variables
	int studentId;
	static String schoolName = "Oxford University";
	String fullName;
	String department;
	String faculty;
	int age;
	long mobileNo;
	String address;
	char session;
	
	public static void main(String[] args) {
		ConstructorsInJava cij = new ConstructorsInJava();
		
		cij.fullName = "Lolade Olawoyin";
		
		MethodsInJava mij = new MethodsInJava();
		
		mij.sumTwoDigits(4, 5);
	
	}


	public void registerStudent() {
		System.out.println(
				fullName + " with Student ID: " + studentId + " is now registered as a student in the department of "
						+ department + " under the faculty of " + faculty+".");
	}

}
