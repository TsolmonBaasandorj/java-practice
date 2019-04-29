package day21_ReCap;

import java.util.Scanner;

public class unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter word");
String word= scan.next();
String unique = "";

for(int i=0; i<word.length(); i++) {
	char letter = word.charAt(i);
	
	if(!unique.contains(""+letter)) {
		unique=unique+letter;
	}
}

System.out.println(unique);
	}

}
