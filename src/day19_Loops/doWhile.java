package day19_Loops;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    String separator = scan.next();
		    int count = scan.nextInt();
		    for(int i=0; i<count; i++) {
		    	System.out.print(word+separator);
		    }
	}

}
