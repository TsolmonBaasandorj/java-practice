package day_55_AbstractionIntro;

public class Circle extends Shape{
	double radius;
public Circle() {
	super("Circle");
}
public Circle(double radius) {
	super("Circle");
	this.radius=radius;
}
public double calculateArea() {
	return 3.14*radius*radius;
}
public void draw() {
	System.out.println("*****");
}
public static void main(String[] args) {
	Circle n = new Circle();
	n.draw();
}
}
