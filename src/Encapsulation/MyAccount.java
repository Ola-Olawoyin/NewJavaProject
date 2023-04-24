package Encapsulation;

public class MyAccount {
 
	
		/*
		 * Encapsulation is a concept of data binding to ensure security.
		 * A way of hiding data within a class from other classes to ensure
		 * they are not directly accessible.
		 * The data and methods are wrapped in a single unit
		 * 
		 * Abstraction - Force calling the hidden data using methods
		 * Instance variable is made private
		 * Methods are made public
		 */
	
	public String userName = "OlaOla17";
	private String password = "Bosman17@";
	
	
 public void loginIn(String myUserName, String myPassword) {
	 
	 if(myUserName == userName && myPassword == password) {
		 System.out.println("User successfully logs into Account");
	 }
	 else
	 {
		 System.out.println("Invalid credentials");
	 }
	 
 }
 
public void updatePassword(String myUserName, String myOldPassword, String myNewPassword) {
	 
	 if(myUserName == userName && myOldPassword == password) {
		 
		password = myNewPassword;
		 System.out.println("Password successfully changed");
	 }
	 else
	 {
		 System.out.println("Invalid credentials");
	 }
	 
 }



public void setPassword(String password) {
	this.password = password;
}

public String getUserName() {
	return userName;
}

	

}
