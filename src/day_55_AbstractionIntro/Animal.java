package day_55_AbstractionIntro;

public abstract class Animal {
	private String name;
	public Animal(String name) {
		this.name=name;
	}
public abstract void speak();
public abstract void eat(); 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public void produceMilk() {
	
}

public static void main(String[] args) {
	
		double discount = 0;
		System.out.println(args[0]);
	//int qty = Integer.parseInt(args[0]);
}
}
