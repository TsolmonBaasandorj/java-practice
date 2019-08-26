package day_44_encapsulationCon;

public class Shoes {
private String type;
private String color;
private int price;

public Shoes() {
	System.out.println("No args...");
}
public Shoes(String type) {
	System.out.println("One args...");
	setType(type);
}
public Shoes(String type, String color, int price) {
	System.out.println("Three args...");
	setType(type);
	setColor(color);
	setPrice(price);
//	this.type=type;
//	this.color=color;
//	this.price=price;
}



@Override
public String toString() {
	return "\n"+"Shoes [type=" + type + ", color=" + color + ", price=" + price + "]";
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
}