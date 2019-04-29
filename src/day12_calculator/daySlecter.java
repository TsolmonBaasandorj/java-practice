package day12_calculator;

import java.util.Scanner;

public class daySlecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int day1, day2,day3,day4,day5,day6,day7;
Scanner scan = new Scanner(System.in);

System.out.println("Enter a number: ");
int day=scan.nextInt();
switch(day) {

case 1:
	System.out.println("Monday!");
       break;
case 2 :
	System.out.println("Tuesday!");
       break;
case 3 :
	System.out.println("Wednesday!");
       break;
case 4 : 
	System.out.println("Thursday!");
	   break;
case 5 : 
	System.out.println("Friday!");
	   break;
case 6 : 
	System.out.println("Saturday!");
	   break;
case 7 : 
	System.out.println("Sunday!");
	   break;
	default :
		System.out.println("Holiday!!!");

}

	}

}
