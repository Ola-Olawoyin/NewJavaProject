package Polymorphism;

public class PolymorphismConcept {
	
	/*
	 * Polymorphism - Same name but multiple form(action/behaviour)
	 * Type of Poly:
	 * 1. Compile time - early binding, static binding, overloading.
	 *                   Same method name different method signature
	 *                   Method signature means combination of method name and method parameters
	 *                   The overloaded methods must all be in the same class
	 *                   Changing a return type or variable name cannot cause method overloading
	 *                   Method overloading is called compile time polymorphism because the method that
	 *                   is run is determined at compile time.
	 * 
	 * 2. Runtime - late binding, dynamic binding, overriding
	 *              Same method name same method signature
	 *              Methods are in different classes but with an inheritance relationship
	 *              It's the child that overrides the parent method.
	 *              The child method changes the implementation of the parent method
	 *              The method called during overriding is at runtime
	 *              The return type of the child method cannot be changed during overriding
	 *              When the return type of the parent method is a primitive datatype.
	 *              However, when the return type of the parent method is the class name, the return type
	 *              can be changed during overriding
	 *              Also when there is a covariant relationship between two methods, the method
	 *              in the parent class can be overriden by that in the child class.
	 *              A method can have it's return type as class name when the method returns
	 *              an object of the class
	 *              We can change the access modifier of an inherited method but we cannot reduce the visibility
	 *              We cannot not overide a static method
	 */

}
