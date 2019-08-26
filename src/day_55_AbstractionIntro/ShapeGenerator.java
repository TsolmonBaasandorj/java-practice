package day_55_AbstractionIntro;

public class ShapeGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle circle1 = new Circle(10);
System.out.println("Calculated area of circle: "+circle1.calculateArea());
circle1.calculateArea();
circle1.draw();

Triangle tr = new Triangle(10, 15, 25);
tr.draw();
System.out.println("Area: "+tr.calculateArea());
	}

}
