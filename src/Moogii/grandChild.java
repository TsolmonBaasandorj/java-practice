package Moogii;

public class grandChild extends Parent {
int age;
String name;
	public grandChild(String name, int age) {
		super(name);
		this.name=name;
		this.age=age;
		System.out.println("And he is "+age+" years old.");
	}

public static void main(String[] args) {
	grandChild n =new grandChild("Galsanjamts",98);
	vowelsOfNames("hello","cyllun");
}
}
