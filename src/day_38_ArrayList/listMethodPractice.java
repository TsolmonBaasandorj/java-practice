package day_38_ArrayList;

import java.util.*;

public class listMethodPractice {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Amir");
		list.add("Elisa");
		list.add("Haku");
		list.add("Kuba");
		list.add("Tsoomoo");
		list.add("Tsoomoo");
		list.add("Tsoomoo");
         list.add("Tsoomoo");
		

		System.out.println(list);
		
		while(list.contains("Tsoomoo")) {
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.size());
			if (list.get(i).contains("Tsoomoo")) {
				
				list.remove(i);

			}
		}
		
		}//while loop end
		System.out.println(list);
		
		
		
	//for(int i=0; i<10; i++) {
//		for(int k=0; k<10-i; k++) {
//			System.out.print(" ");
//		}
//		
//		for(int j=0; j<i+1; j++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
		
		
		
		

		
			}

}
