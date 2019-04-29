package day_33_methodContinue;

import java.util.Scanner;

public class PayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter how many hours you worked:");
int hour=scan.nextInt();
System.out.println("Enter how much is your rate:");
int rate=scan.nextInt();

System.out.println("Your total: "+getHourlyPay(hour,rate));

	}
public static int getHourlyPay(int hours, int rate) {
	int total=hours*rate;
	
	if(hours==0) {
		System.out.println("Invalid hours!");
		return 0;
	}if(rate==0 || rate<0) {
		System.out.println("Invalid rate!");
		return 0;
	}
	return total;
}
}
