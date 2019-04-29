package day_32_methodContinue;

import java.util.Scanner;

public class methodWithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
   
		giveMe10$(n);
		
		System.out.println(giveMeYourName());
		//giveMeYourName();
	
//		System.out.println(giveMe10$());
//		int i=giveMe10$();
		
	}
public static int giveMe10$(int num) {
	
	Scanner scan = new Scanner(System.in);
	while(num!=10) {
		System.out.println("Give me $10! ");
		num=scan.nextInt();
	}
	System.out.println("Thank you!");
	
	return 10;
}
public static String giveMeYourName() {
	String n="Tsolmon";
	return n;
}

}
