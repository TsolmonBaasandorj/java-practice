package day21_ReCap;

import java.util.Scanner;

public class register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("How many items are you purchasing?");
int numberOfItems = scan.nextInt();
String item;
String itemName="";
double price;
double totalPrice=0;
for(int i=1; i<=numberOfItems; i++) {
	System.out.println("What is item "+i+"?");
	item=scan.next();
	itemName=itemName +", "+item;
	System.out.println("How much is "+ item+"?");
	price = scan.nextDouble();
	totalPrice=totalPrice+price;
	
}
itemName=itemName.substring(2);
System.out.println("Your items: " + itemName);
System.out.println("Yout total Price: " + totalPrice);
	}

}
