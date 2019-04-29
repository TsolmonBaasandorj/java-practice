package day22_ReCap;

import java.util.Arrays;
import java.util.Scanner;

public class arrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num: ");
		
		int num=scan.nextInt();
	
		
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				System.out.println(num+ " is not prime number");
	            return;
			} 
				
			
			
		}
		
		System.out.println(num+" is prime number");
		
		
        
	}

}
