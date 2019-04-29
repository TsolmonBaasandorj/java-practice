package day_28_multid_Array;

import java.util.Arrays;
import java.util.Scanner;

public class aaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		





//int max=0;
//for(int j=0; j<num.length; j++) {
//	for(int i=0; i<num[j].length; i++) {
//		
//			if(num[j][i]>max) {
//				max=num[j][i];
//			}
//		
//	}
//	System.out.println(max);
//}
		
//		int[][] num= {{2,2,1,3,4,5},
//				     {5,2,3,3,4,5},
//				     {3,2,3,1,4,5}};
//		int matches=0;
//		
//		for(int i=0; i<num.length; i++) {
//			for(int j=0; j<num[i].length-1; j++) {
//				if(num[i][j]==num[i][j+1]) {
//					matches++;
//				}
//			}
//		}
//		System.out.println(matches);
//
//		
		
//		int[][] arr= {{1,2,3,4,10},{5,6,7,8}};
//		 int max= 0;
//		
//		 for(int j=0; j<arr.length; j++) {
//		 	for(int i=0; i<arr[j].length; i++) {
//		 		
//		 			if(arr[j][i]>max) {
//		 				max=arr[j][i];
//		 			}
//		 		
//		 	}
//		 	System.out.println(max);
		// }
		
		String str= "olive, hot pursuit, red, warning, pot, a, python, b, angle, coffee, beech, boost, trainer";
	
		String[] a = str.split(", ");
		System.out.println(Arrays.deepToString(a));
	
		int shortest=a[0].length();
	    for(int i=0; i<a.length; i++) {
			if(a[i].length()<shortest) {
				shortest=a[i].length();
			}
		}
	    int count=0;
		for(int i=0; i<a.length; i++) {
			if(a[i].length()==shortest) {
				count++;
			}
		}
		System.out.println(count);
		
		int index=-1;
		String[] container = new String[count];
		
		for(int j=0; j<container.length;j++) {
		for(int i=index+1; i<a.length; i++) {
			if(a[i].length()==shortest) {
				container[j]=a[i];
				index=i;
				break;
			}
		}
		}
		
		
		
		
		System.out.println(Arrays.toString(container));
		
	
	}

}
