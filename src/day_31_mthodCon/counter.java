package day_31_mthodCon;

import java.util.Scanner;

public class counter {

	public static void main(String[] args) {
		
// TODO Auto-generated method stub
	Scanner scan =new Scanner(System.in);
//	System.out.println("Enter number:");
//	int n=scan.nextInt();
	
	System.out.println("Enter car type:");
	String carType=scan.next();
	System.out.println("Enter speed:");
	int speed=scan.nextInt();
	drive(carType, speed);
//        countUp(n);
//		System.out.println();
//		countDown(n);
//		
//	}
//
//public static void countUp(int num) {
//	for(int i=1; i<=num; i++) {
//		System.out.print(i+" ");
//	}
//	if(num<1) {
//		System.out.println("Invalid value");
	} 

public static void countDown(int num) {
	for(int i=num; i>0; i--) {
		System.out.print(i+" ");
	}
	
}
public static void drive(String car, int speed) {
	
	System.out.println(car+" is driving "+speed+" mph");
	
}
}
