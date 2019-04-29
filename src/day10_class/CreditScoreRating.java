package day10_class;

import java.util.Scanner;

public class CreditScoreRating {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//Scanner scan = new Scanner(System.in);
//System.out.println("Enter your credit score:");
//int score = scan.nextInt();
//if(score >=750 && score<=850) {
//	System.out.println("Excellent! Keep it up!");
//}else if (score<=749 && score>=700) {
//	System.out.println("Good");
//}else System.out.println("Do something! It is not good!!!");

String str="abc.xyzxyz";
		int index=0;
	

		for(int i=0; i<str.length();i++){
		  if(str.substring(i).indexOf("xyz")==0){
			 
		    index=i;
		   
		    System.out.println("index: "+index);
		  }
		  System.out.println("iteration: "+i);
		}




	}

}
