package day_34_methodContinue;

import java.util.*;

public class VarArgs {
	public static void main(String[] args) {
		printWords("apple","orange","pear","sum","a","red","door");
		System.out.println("Sum: "+sum(1,2,3,5,1100));
		
		int budget=200;
		
		if(sum(10,15,45,150)<=budget) {
			System.out.println("you are good!");
		}else
			System.out.println("broke");
		int sum2=sum(1,2,3,4,5);
		
		if(sum2==15) {
			System.out.println("Yes it is");
		}
		
		cook("Bantan","guril","mah","songino","luuvan");
		shoppingList(100,"guril","budaa");
	
	}

	public static void printWords(String... words) {
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<words.length; i++) {
			if(words[i].length()%2==1) {
				list.add(words[i]);
		}
		}
System.out.println(list);
	}
	public static int sum(int... num) {
		int sum=0;
		for(int i=0; i<num.length; i++) {
			sum=sum+num[i];
		}
		return sum;
	}

	
	public static void cook(String name, String...ings) {
		System.out.print("Food: "+name);
		System.out.println(Arrays.toString(ings));
	}
public static void shoppingList(int totalPrice, String...items) {
	System.out.print("Total cost: "+totalPrice);
	System.out.println(Arrays.toString(items));
}

}
