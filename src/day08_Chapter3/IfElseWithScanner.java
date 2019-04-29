package day08_Chapter3;

import java.util.Scanner;

public class IfElseWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);

int passingPercentage = 65;

System.out.println("Enter your score: ");

int yourScorePercentage = scan.nextInt();

if(yourScorePercentage > passingPercentage) {
	System.out.println("You passed! Congratulations! ");
}else {
	System.out.println("You failed. Try again! ");
}
System.out.println("Java is Fun! ");
	}

}
