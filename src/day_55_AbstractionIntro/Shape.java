package day_55_AbstractionIntro;

public abstract class Shape {
String name;
double area;
public abstract double calculateArea();
public abstract void draw();
public Shape(String name) {
	this.name=name;
}

}
