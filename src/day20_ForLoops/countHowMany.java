package day20_ForLoops;

import java.util.Scanner;

public class countHowMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    Scanner scan = new Scanner(System.in);
//    System.out.println("Enter word:");
//    String word=scan.nextLine();
		
		String word = "aaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaa";
	int count=0;
	
	for(int i=0; i<word.length();i++) {
		if(word.charAt(i)=='b') {
			count++;
		}
	}
	System.out.println("Count: "+count);
	
	
	}

}
