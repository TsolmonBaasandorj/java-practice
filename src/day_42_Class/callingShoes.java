package day_42_Class;
import java.util.*;

import cities.CityApp;
public class callingShoes {

	public static void main(String[] args) {
	
Shoes shoes1 = new Shoes();
shoes1.setShoesData("Gucci", 7.5);
System.out.println(shoes1.getShoesData());

Shoes shoes2 = new Shoes();
shoes2.setShoesData("Allen Edmons", 6.5);

Shoes shoes3 = new Shoes();
shoes3.setShoesData("Hugo Boss", 8.5);

Shoes[] arr = new Shoes[3];
arr[0]=shoes1;
arr[1]=shoes2;
arr[2]=shoes3;

System.out.println(arr[0].getShoesData());
System.out.println(arr[1].getShoesData());
System.out.println(arr[2].getShoesData());

System.out.println(arr[0].brand);
System.out.println(arr[1].brand);
System.out.println(arr[2].brand);

ArrayList<Shoes> list = new ArrayList<>();
list.add(shoes1);
list.add(shoes2);
list.add(shoes3);

System.out.println(list.get(0).getShoesData());
System.out.println(list.get(1).getShoesData());
System.out.println(list.get(2).getShoesData());

System.out.println(list.get(0).size);
System.out.println(list.get(1).size);
System.out.println(list.get(2).size);

Shoes redShoes = list.get(0);
System.out.println(redShoes.getShoesData());
System.out.println();
for(Shoes a: list) {
	if(a.size>7) {
		System.out.println(a.getShoesData());
	}
}

//for(int i=0; i<)
	}

}
