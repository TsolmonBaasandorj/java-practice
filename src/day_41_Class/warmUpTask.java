package day_41_Class;
import java.util.*;
public class warmUpTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> list = new ArrayList<>();
list.add(3);
list.add(5);
list.add(7);
System.out.println(DoubleTheList(list));
	}
public static ArrayList<Integer> DoubleTheList(ArrayList<Integer> num) {
	
	
for(int i=0; i<num.size(); i++) {
	num.set(i,num.get(i)*2);
}
	
	return num;
	
	
	
}
}
