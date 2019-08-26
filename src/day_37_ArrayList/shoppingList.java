package day_37_ArrayList;

import java.util.ArrayList;

public class shoppingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> shoppingList=new ArrayList<>();
shoppingList.add("apple");
shoppingList.add("orange");
shoppingList.add("watermelon");
shoppingList.add("banana");
shoppingList.add("pear");
shoppingList.add("pineapple");
System.out.println(shoppingList);
System.out.println("ShoppingList size: "+shoppingList.size());
System.out.println("The first item: "+shoppingList.get(0));
System.out.println("The last item: "+shoppingList.get(shoppingList.size()-1));
shoppingList.remove(0);
System.out.println(shoppingList);
shoppingList.remove("banana");
System.out.println(shoppingList);

for(String item: shoppingList) {
	System.out.println(item);
}
shoppingList.clear();
System.out.println(shoppingList);

	}
	

}
