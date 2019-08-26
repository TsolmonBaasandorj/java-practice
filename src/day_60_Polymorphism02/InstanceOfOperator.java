package day_60_Polymorphism02;
import day_59_Polymorphism.*;
public class InstanceOfOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Shape shape = new Circle();
  System.out.println(shape.getClass().getName());
  System.out.println(shape.getClass().getSimpleName());
  if(shape.getClass().getSimpleName().contentEquals("Square")){
  	System.out.println("It is a square");
	}
  else if(shape.getClass().getSimpleName().equals("circle")) {
	  System.out.println("It is a circle");
  }

}
}