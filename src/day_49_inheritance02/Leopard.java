package day_49_inheritance02;

public class Leopard extends Animal{

	public Leopard() {
		super();
	
		System.out.println("Leopard constructor");
		setType("Leopard");
	}
	public Leopard(String type) {
		super(type);
	}
}
