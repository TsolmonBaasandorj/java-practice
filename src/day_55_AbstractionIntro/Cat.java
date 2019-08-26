package day_55_AbstractionIntro;

public class Cat extends Animal {
	public Cat(){
		super("hh");
	}
	@Override
	public  void speak() {
		System.out.println("meow");
	}
	public void eat() {
		System.out.println(getName()+" eats.");
	}
	@Override
	public void produceMilk() {
		System.out.println("Cat is mammal.");
	}
	
}
