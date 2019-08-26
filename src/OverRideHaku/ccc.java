package OverRideHaku;

import java.util.*;
import java.util.List;

public class ccc {
	public static void main(String[] args) {	
		//Scanner scan = new Scanner(System.in);

		//int num = scan.nextInt();
		
		
//		for(int i=1; i<=5;i++) {
//			for(int k=1; k<=i;k++) 
//				System.out.print(k);
//				for(int j=5-i; j>=1; j--) 
//					System.out.print("#");
//				System.out.println();
//			
//		}

	
//		int i, j;
//		for (i = 1; i <= num; i++) {
//			for (j = 1; j <= num; ++j) {
//
//				if (j <= i) {
//
//					System.out.print(j);
//
//				} else {
//					System.out.print("#");
//				}
//
//			}
//
//			System.out.println();
//
//		}
		
		
		
		
		
		
		
//		bbb n = new bbb(new aaa("ginger ale",3,2),
//				        new aaa("coke",2,2),
//				        new aaa("Apple juice",1.5,3),
//				        new aaa("lemon juice",3,1)
//				);
//		System.out.println(n.obj("Apple juice"));
//		System.out.println(n.obj(2));
//		n.remove("coke");
//		System.out.println(n.list);
		
		
//		for(int i=-100; i<=100; i++) {
//		System.out.println(date(i));
//		}
		System.out.println(date(-1));
		
	}
	public static String date(int n) {
		String s="";
		if(n<0) {
			s="Minus ";
			n=n*-1;
		}
		
		String[] lessThanTen= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String [] tenToTwenty= {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};		
		String[] twentyToHundred= {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety","hundred"};
		String str="";
		if(n>0) {
		if(n<10) {
			return s+lessThanTen[n];
		}
		if(n>=10 &&n<=19) {
			return s+tenToTwenty[n%10];
		}
		if(n>19) {
			if(n%10==0) {
				return s+twentyToHundred[n/10-2];
			}else
		return s+twentyToHundred[n/10-2]+" "+lessThanTen[n%10];
		}	
		
	}
		return "zero";

	}


}

