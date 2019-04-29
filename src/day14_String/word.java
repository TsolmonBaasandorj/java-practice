package day14_String;

import java.util.Scanner;

public class word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word1: ");
		String word1 = scan.next();
		System.out.println("Enter a word2: ");
		String word2 = scan.next();
		
		int word1Length = word1.length();
		int word2Length = word2.length();
		
		if(word1Length>word2Length) {
			System.out.println("Word1 is longer than word2");
		}else if (word2Length>word1Length) {
			System.out.println("Word2 is longer than word1");
		}else if(word1Length==word2Length) {
			System.out.println("Word1value and Word2value are the same! ");
		}
		
	}

}
