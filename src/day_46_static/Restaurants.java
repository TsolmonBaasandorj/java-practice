package day_46_static;

public class Restaurants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dinner Mom = new Dinner();
Dinner kid = new Dinner();
Dinner Dad = new Dinner();
System.out.println("Total slices: "+Dinner.pizzaSlices);
Dad.takeASlice();
kid.takeASlice();
Mom.takeASlice();
kid.takeASlice(3);
Dad.takeASlice();
Dad.takeASlice();
Dad.takeASlice();
Dad.takeASlice();

System.out.println(Dad.pizzaSlices);
System.out.println("Total slices: "+Dinner.pizzaSlices);
	}

}
