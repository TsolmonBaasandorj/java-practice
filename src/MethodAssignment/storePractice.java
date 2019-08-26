package MethodAssignment;

import day_34_methodContinue.main;

public class storePractice {
	public static void main(String[] args) {
		findItemPrice("Cactus");
	}
	

		
	
	public static double findItemPrice(String item){
		String[] ITEMS = {"Cactus", "T Shirt", "air", "Terracotta Necklace", "Coffee Mug", "Wood Crate Wall Storage",
				"Blanket", "Knife", "Copper Coffee and Tea Kettle", "Wall Art", 
				"Marble Clock", "Natural Bench", "Llama Valley Framed Print",
				"Gold Metal Frame Mirror", "Fork", "Star Wars game", "Barracuda", "Anchor", "Sunlight", "planet Saturn"};	
		
		double[] PRICES = {49.99, 13.99, 5.99, 14.99, 29.99, 11.50, 79.99, 23.80, 27.99, 39.44, 78.40, 299.30, 55.00, 176.89, 4.99, 67.00, 8.19, 50.00, 1500, 400};
	   String[] SPECIAL_ITEMS = {"Cactus", "Fork" , "T Shirt"};
	   double SHIPPING_CHARGE = 11.50;
		//TODO
	   double priceIndex=0.0;
		for(int i=0; i<ITEMS.length; i++) {
			if(ITEMS[i].equalsIgnoreCase(item)) {
			priceIndex= PRICES[i];}
			
		}
		return priceIndex;
		
	}

	}
