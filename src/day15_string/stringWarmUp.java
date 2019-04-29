package day15_string;

import java.util.Scanner;

public class stringWarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter emoji:");
   String emoji = scan.next();
		
		
		if(emoji.length()!=2) {
			System.out.println("Invalid!");
			return;
		}
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if(first == ':'){
			if(second == ')') {
				System.out.println("Smile");
			}else if(second == '(') {
				System.out.println("Sad");
			}else if(second == '/') {
				System.out.println("Upset");
			}else if(second=='p') {
				System.out.println("Confused");
			}
		}else if(first == ';') {
			if(second==')') {
				System.out.println("Happy");
			}else if(second=='(') {
				System.out.println("Mad");
				
			}
			
		}else if(first == '(') {
			if(second==':') {
				System.out.println("Smile");
			}
			
		}else if(first == ')') {
			if(second ==';') {
				
				System.out.println("Flirt");
			}
			
			
			
			
		}
		
		
	}

}
