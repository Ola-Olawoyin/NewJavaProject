package Polymorphism;

public class ZIB extends CBN {

	public static void main(String[] args) {

		ZIB zib = new ZIB();
		
		System.out.println(zib.CarLoanInterest());

	}

	public double CarLoanInterest() {

		return 7.25;
	}
	
	//Changing return type possible when the return type is a class name.
	
	public ZIB staffLoan() {
		ZIB zib = new ZIB();
		
		return zib;
	}
	
	public ZenithInsurance medicalLoan() {
		ZenithInsurance zenins = new ZenithInsurance();

		return zenins;
	}
	
	/*
	 * /The object of a child class can be stored into the reference of a parent class
	 * This is referred to as polymorphic referencing.
	 * When using polymorphic referencing, one is only able to call methods common to both parent and child classes
	 */
	public ZIB studyLoan() {
		ZIB zib = new ZenithInsurance();
		return zib;
	}


}
