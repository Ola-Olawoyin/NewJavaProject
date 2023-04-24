package Encapsulation;

public class Login {

	public static void main(String[] args) {
		
		MyAccount account = new MyAccount();
		account.updatePassword("OlaOla17", "Bosman17@", "Bosman7@");
		
		account.loginIn("OlaOla17", "Bosman7@");

	}

}
