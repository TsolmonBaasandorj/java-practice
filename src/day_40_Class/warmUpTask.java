package day_40_Class;
import java.util.*;
public class warmUpTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();
		list.add("apple");list.add("orange");list.add("banana");list.add("Apple");list.add("apple");list.add("apple");
		String str="apple";
		System.out.println(countOccurances(list,str));
		
		
	}
	public static int countOccurances(ArrayList<String> list, String word) {
		int count=0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equalsIgnoreCase(word)) {
				count++;
			}
		}
		return count;
	}

}
