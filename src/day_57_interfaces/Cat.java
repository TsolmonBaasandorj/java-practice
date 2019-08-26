package day_57_interfaces;

public class Cat implements Pet, Callable{
	public void respond() {
		System.out.println("Cat is responding myaw-myaw");
	}
	public void keepAsPet() {
		System.out.println("Cat is kept in home");
	}

}
