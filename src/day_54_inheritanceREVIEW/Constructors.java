package day_54_inheritanceREVIEW;
class example1{
	public example1() {
		System.out.println("Default constructor");
	}
	public example1(int n) {
		System.out.println("Constructor int");
	}
	public example1(double a) {
		this(9);
		System.out.println("Constructor double");
	}
	public example1(float a) {
		this(9.7);
		System.out.println("Constructor float");
	}
	public example1(char a) {
		this();
		//this((float)20f);
		System.out.println("Constructor char");
	}
}
public class Constructors {
/*
 * constructor : belongs to the object.
 * 1.Every class must have constructor.
 * (if there is not any declared , compiler will give no-arg constructor).
 * 2.cannot have specifier and return type.
 * specifiers:final, static, abstract.
 * return type:void, primitives, wrapper class, all objects.
 * 3.constructor name MUST be same with class
 * 4.constructor execution depends on the creation of object.
 * (same with instance block, after instance block).
 * 5.contractor can not be called by constractor name.
 * 6.constractor can only be called in other constructors
 * 7.constractor can not call itself
 */
	//================================================================================================
	/*
	 * Constructor: special method. belongs to the object.
			 
				 1. Every class MUST have constructor. 
				 		(if there isn't any, compiler will give no-arg constructor by default)
				 
				 2. Constructor method cannot have return-type or specifiers
				 			return-types: primitives, wrapper class, objects,...
				 			specifiers: final, static, abstract
				 			
				 3. Constructor' name MUST be same with the ClassName
				 
				 4. constructor' execution depends on the creation of the object
				 
				 5. constructor can only be called in other constructor. 
				 				( methods or blocks cannot call constructor)
				 
				 6. constructor cannot be called by constructor-name, MUST be called with this or super keyword
				 				this(): calls the class' constructor
				 				super(): calls the super class' constructor
				 				
				 7. constructor cannot call or contain itself
				 
				 8. A constructor cannot call more than one constructor
				 
				 9. constructor' body constructor call needs to be at first step
				 
				 10. class' object MUST be created with existing and visible constructor(s) hooson constractort argument hij duudaj bolku
				 
				 11. super class' no-arg constructor is called in sub class' constructorS by default
				 
				 12. super class' constructor ( if there isn't default constructor) MUST be called in sub class
				  		(if there is more than one constructor in super class, only one of them needs to be called)
				  

	 */
	
	
	
	
	
	
	public static void main(String[] args) {
		new example1('a');
		//if new keyword then its object creation
		//you can call constructor in the constructor
	}
}
