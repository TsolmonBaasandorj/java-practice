package mentor1;

import java.util.Arrays;
import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scan = new Scanner (System.in);
//		
//		String [] word = new String[5];
//		
//		for(int i=0; i<5; i++) {
//			word[i]=scan.next();
//		}
//		
//
//		
//		for(String a: word) {
//			if(a.equals("apple")){
//				System.out.println("There is apple!");
//			}
//		}
		
		int[] num= {1,2,3,4,5};
		
		int temp=num[0];
		num[0]=num[4];
		num[4]=temp;
		
		System.out.println(Arrays.toString(num));
		
	}

}
