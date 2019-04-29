package day_27_mArray;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner input = new Scanner(System.in);
//	    int decimal = input.nextInt();
//
//	    int[] holder = new int [8];
//	    
//	    holder[0]= decimal/128;
//	    decimal=decimal%128;
//	    holder[1]=decimal/64;
//	    decimal=decimal%64;
//	    holder[2]=decimal/32;
//	    decimal=decimal%32;
//	    holder[3]=decimal/16;
//	    decimal=decimal%16;
//	    holder[4]=decimal/8;
//	    decimal=decimal%8;
//	    holder[5]=decimal/4;
//	    decimal=decimal%4;
//	    holder[6]=decimal/2;
//	    decimal=decimal%2;
//	    holder[7]=decimal;
//	    
//	    
//	System.out.println(Arrays.toString(holder));
//	
//    	int[] outter= {1,2,3,4,5};
//		int[] inner= {5,10};
//			boolean found=false;
//		for(int i=0; i<inner.length; i++) {
//			found=false;
//			for(int j=0; j<outter.length; j++) {
//				if(inner[i]==outter[j]) {
//					found=true;
//					break;
//				}
//			}
//			if(found==false) {
//				break;
//			}
//		}
//		System.out.println(found);
		//num[0]=num[6];
		//num[1]=num[5]
//        num[2]=num[4]
		
	int[] num= {4, 3, 2, 44, 1, 100, 55};
		   
		for(int i=0; i<num.length/2; i++) {
			int temp=num[i];
			num[i]=num[num.length-(i+1)];
			num[num.length-(i+1)]= temp;
		}
	System.out.println(Arrays.toString(num));
	}

}
