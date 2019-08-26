package day_59_Polymorphism;

public class Triangle extends Shape{
@Override
public void draw() {
	System.out.println("    * \n" +
			           "   * * \n" +
			           "  * * * \n" +
			           " * * * * \n" +
			           "* * * * *");
}
}
