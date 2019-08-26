package day_57_interfaces;

public class Dog implements Pet, Callable{
	public void respond() {
		System.out.println("Dog is responding woof-woof");
	}
	
	public void keepAsPet() {
		System.out.println("Dog is keeping in the house or outside");
	}
}
