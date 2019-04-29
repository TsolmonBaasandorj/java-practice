package day20_ForLoops;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter number: ");
int num=scan.nextInt();
int sum=0;

if(num>0) {
for(int i=1; i<=10; i++) {
	sum = num*i;
	System.out.println(num + " * " + i +"= " + sum);
}

	} else
        System.out.println("Invalid input");
     return;
	}
}
