package day_44_encapsulationCon;

public class This {
private String bookName;
private String color;
private int bookPrice;

public This() {
	System.out.println("There is no arg!");
}
public This(String bookName) {
	this();
	System.out.println("There is only one arg!");
}
public This(String bookName, int bookPrice) {
	this("Java Intro");
	System.out.println("There are two args");
}
public This(String bookName, String color,int bookPrice) {
	this("OCA", 120);
	System.out.println("There are three args ");
	
}

}
