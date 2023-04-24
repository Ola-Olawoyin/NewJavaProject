package Abstraction;

public abstract class AbstractClassParent {
	
	/*
	 * An abstract class can contain abstract methods and concrete methods
	 */
	
	public abstract void morning();
	
	public abstract void noon();
	
	public void afternoon() {
		System.out.println("It's after 12noon, its now afternoon");
	}

}
