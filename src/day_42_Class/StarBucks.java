package day_42_Class;
import java.util.*;
public class StarBucks {
public static void main(String[] args) {
	
	Coffee[] coffeeArray = new Coffee[2];
	coffeeArray[0] = new Coffee();
	coffeeArray[0].setName("Latte", "Venti", 3.75, 180);
	System.out.println(coffeeArray[0].getCoffeeInfo());
	
	Coffee latte = new Coffee();
	latte.setName("Cafe Latte", "Grande", 3.85, 190);
	coffeeArray[1]=latte;
	System.out.println(latte.getCoffeeInfo());
	
}
}
