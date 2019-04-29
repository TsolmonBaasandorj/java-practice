package warmUpPrimeNumber;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
String newWord="";
		for(int i=0; i<6; i++) {
			System.out.println("Enter word");
			String word=scan.next();
			if(word.contentEquals("java")) {
				continue;}
			newWord=newWord+word + ", ";
		}
		System.out.println("The summary of the words: "+(newWord.length()>1 ? newWord.substring(0, newWord.length()-2) : ""));
	}

}
