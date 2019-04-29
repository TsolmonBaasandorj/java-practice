package warmUpPrimeNumber;

import java.util.Scanner;

public class calculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
		
int sum=0;
for(int i=0; i<6; i++) {
	System.out.println("Enter number: ");
	int number = scan.nextInt();
	if(number<=0) {
		continue;
	}
	sum = sum+number;
}
System.out.println("The sum of numbers: " + sum);




	}

}
