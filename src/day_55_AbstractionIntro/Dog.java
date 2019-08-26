package day_55_AbstractionIntro;

public class Dog extends Animal{
	public Dog() {
		super("jj");
	}
	public void speak() {
		System.out.println("woof woof");
	}
	public void eat() {
		System.out.println(getName()+" eats.");
	}
}
