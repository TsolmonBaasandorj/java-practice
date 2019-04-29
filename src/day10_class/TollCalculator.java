package day10_class;

import java.util.Scanner;

public class TollCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Vehicle Type: "); //1,2
		int carType = scan.nextInt();
		System.out.println("Is it rush hour: yes | no");
		String rushHour = scan.next();
		boolean isRushHour;
	
		if(rushHour.equalsIgnoreCase("yes")) {
			isRushHour=true;
			
		}else {
			isRushHour=false;
		}
		
	double price = 0.0;
	if(carType==1) {
	
		if(isRushHour) {
			price = 30.0;//A
		}else {
			price = 5.0;//B
		}
	}else if(carType==2) {
		if(isRushHour) {
			price = 40.0;//C
		}else {
			price = 15;//D
		}
	} System.out.println(price);
		
	}

}
