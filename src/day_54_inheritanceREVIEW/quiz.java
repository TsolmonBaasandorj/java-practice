package day_54_inheritanceREVIEW;

import java.util.*;

public class quiz {

	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<>();
		n.add(2);
		n.add(7);
		n.add(6);
		int l=1;
		Integer m=1;
		
		//n.remove(l);
		System.out.println(n.remove(m));
		
		
		
		// TODO Auto-generated method stub
System.out.println(appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old."));
	}
	public static boolean appearsTwice(String target, String sentence) {
        
        sentence=sentence.replace(",", "");
        System.out.println(sentence);
		String[] arr = sentence.split(" ");
		
		System.out.println(Arrays.deepToString(arr));
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equalsIgnoreCase(target)) {
				count++;
		}
		}
		
		if(count==2) {
			return true;
		}
	
		
	
        return false;

}
}
