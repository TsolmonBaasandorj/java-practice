package day25_ArrayContinue;

public class shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] products = { "Timberland shoes", "H&M Shirts", "Swatch Watch Watch", "Gucci Bag", "Adidas socks" };
		double[] prices = { 120.0, 5.99, 150.5, 3000.5, 6.99 };
		int[] itemsId = { 12345, 12346, 12347, 12348, 12349 };
		
		System.out.println("Products count: " + products.length);
		
		if (products.length == prices.length && products.length == itemsId.length) {
			System.out.println("Shopping list looks good!");
		} else {
			System.out.println("Something is wrong!");
		}


		System.out.println();
		
		for(String item: products) {
			System.out.println(item);}
		
		System.out.println();
		
		for (int i = 0; i < prices.length; i++) {
			System.out.println("Price " + i + ": " + prices[i]);}
		
		System.out.println();
		
		for(int i=itemsId.length-1; i>=0; i--) {
			System.out.println(itemsId[i]);}
		
		
		System.out.println("######### YOUR SHOPPING RECEIPT ##########");
		double totalPrice=0.0;
		for(int i=0; i<products.length; i++) {
			System.out.println("Item " + (i+1)+ ": "+ itemsId[i]+ " - "+ products[i] + " - $"+ prices[i]);
		    totalPrice=totalPrice+prices[i];}
		System.out.println("Total price: $"+totalPrice);
		double max=0;
		double min=prices[0];
		int minIndex=0;
		int maxIndex=0;
		for(int i=0; i<prices.length; i++) {
			if(prices[i]>max) {
				max= prices[i];
				maxIndex=i;
			}if(prices[i]<min) {
				prices[i]=min;
				minIndex=i;
			}
		}
		System.out.println(itemsId[maxIndex]+" - "+products[maxIndex]+ " - $"+max);
		System.out.println(itemsId[minIndex]+" - "+products[minIndex]+ " - $"+min);
		
		
	}

}
