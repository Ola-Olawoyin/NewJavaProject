package Abstraction;

public class Tests extends AbstractClassGrandChild {

	public static void main(String[] args) {
		/*
		 * To access the non-abstract method in an inheritance hierarchy
		 * the first concrete class in the hierarchy has to be instantiated.
		 */
		AbstractClassGrandChild gc = new AbstractClassGrandChild();
		gc.afternoon();
		gc.evening();
		
		

	}

}
