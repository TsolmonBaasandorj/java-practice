package Day_30_Method;

import java.util.Random;
import java.util.Scanner;

public class MyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rangePrint();
		doPush10Ups();

		showMe5Numbers();


	}
	public static void showMe5Numbers() {
		Random r = new Random();
		for(int i=1; i<=5; i++) {
			System.out.print(r.nextInt(1000)+" ");
		}
		System.out.println();
		
	}
	public static void doPush10Ups() {
		for(int i=1; i<=10; i++) {
			System.out.println("Pushup - "+i);
		}
		System.out.println("Time to rest");
	}
public static void rangePrint() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two integers:");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	
		if(num1<num2) {
			for(int i=num1; i<=num2; i++) {
			System.out.println(i);
		}
		}else if (num2<num1){
			for(int k=num1; k>=num2; k--) {
			System.out.println(k);
		}
		
	}else
	{System.out.println(num1);
	}
	}

}

