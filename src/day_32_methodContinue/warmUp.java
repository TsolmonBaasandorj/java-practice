package day_32_methodContinue;

import java.util.Scanner;

public class warmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makePancakes();
        makePasta();
        cook("Omelette", "Eggs, Salt, Tomatoes, Green Peppers, Oions");
        System.out.println("~~ ENJOY YOUR DELICIOUS PANCAKES ~~");
	}
	public static void makePancakes() {
		System.out.println("~~PANCAKES RECIPE~~");
		add("Milk, Eggs, Flour, Sugar, Salt");
		mix(120);
		fry(3);
		System.out.println("~~ ENJOY YOUR DELICIOUS PANCAKES ~~");
	}
	public static void makePasta() {
		System.out.println("~~ Italian pasta recipe ~~");
		add("Water, Salt, Olive Oil");
		boil(2);
		add("Spagetti Pasta");
		boil(9);
		mix(60);
		add("Parmesan cheese, Marinara");
	}
	
	public static void cook(String dish, String ingredients) {
		System.out.println("~~ "+ dish.toUpperCase()+" RECIPE ~~");
		add(ingredients);
		System.out.println("Cook it until it is cooked");
		System.out.println("~~ "+ dish.toUpperCase()+" IS READY ~~");
	}
	
	
	
public static void add(String item) {
	System.out.println("Add: "+ item );
}
public static void mix(int second) {
	System.out.println("Mix for "+second+" second");
}

public static void fry(int minute) {
	System.out.println("Fry for "+minute+" minute");
}
public static void boil(int minute) {
	System.out.println("Boil for "+minute+" minute");
}

}
