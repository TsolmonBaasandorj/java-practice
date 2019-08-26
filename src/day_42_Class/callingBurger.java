package day_42_Class;

import java.util.Arrays;

public class callingBurger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Burger burger1 = new Burger();
burger1.name="COWBOY";
String[] ings = {"onion crisps", "american cheese", "pickles", "lettuce", "b7 sauce"};
burger1.ingredients=ings;
System.out.println(burger1.name);
System.out.println(Arrays.toString(burger1.ingredients));
System.out.println(burger1.ingredients[0]);

for(int i=0; i<burger1.ingredients.length; i++) {
	System.out.println(burger1.ingredients[i]);}



	}

}
