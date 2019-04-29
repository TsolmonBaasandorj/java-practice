package day_35_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class codingBat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10000001;
		
	List<Integer> list1=new ArrayList<>();
	
	while(n>0) {
		list1.add(n%10);
		n=n/10;
	}
	

	
List<Integer> list2=new ArrayList<>();

for(int i=list1.size()-1; i>=0; i--) {
	list2.add(list1.get(i));
}


System.out.println(list1.equals(list2));
		
	}

}
