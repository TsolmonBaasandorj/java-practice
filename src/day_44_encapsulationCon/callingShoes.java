package day_44_encapsulationCon;
import java.util.*;
public class callingShoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5666777;
		int k=1222333;
Shoes n1 = new Shoes();
System.out.println(n1);
Shoes n2 = new Shoes("high heels");
System.out.println(n2);
Shoes n3 = new Shoes("Boots", "Black", 100);
System.out.println(n3);
ArrayList<Shoes> list = new ArrayList<>();
list.add(new Shoes("High Heels", "Red", 99));
list.add(new Shoes("Boots", "Brown", 169));
list.add(new Shoes("Flat", "Green", 120));
//list.add(new Shoes("Snickers"));
System.out.println(list);

int min=100;
int idx=-1;
for(int i=0; i<list.size(); i++) {
	if(list.get(i).getPrice()<min) {
		min=list.get(i).getPrice();
		idx=i;
	}
}
System.out.println(min);
System.out.println(list.get(idx));

for(int i=0; i<list.size(); i++) {
	if(list.get(i).getColor().equalsIgnoreCase("green")) {
		idx=i;
	}
}

System.out.println(list.get(idx));

for(int i=0; i<list.size(); i++) {
	if(list.get(i).getType().equalsIgnoreCase("high heels")) {
		idx=i;
		break;
	}else {
		System.out.println("There is no high heels!");
		
	}
}
System.out.println(list.get(idx));
	}

}
