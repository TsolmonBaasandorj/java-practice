package day_31_mthodCon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MethodsWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner scan = new Scanner(System.in);
//String sentence=scan.nextLine();
//countWords(sentence);
googleSearchResult("About 121,000,000 results (0.75 seconds)");
	}
public static void countWords(String sentence ) {
	String[] newArr=sentence.split(" ");
	System.out.println(Arrays.toString(newArr));
	System.out.println("Sentence length: "+newArr.length);
}
public static void googleSearchResult(String sentence) {
	String [] newArr=sentence.split(" ");
	String count= newArr[1].replace(",", "");
	String second=newArr[3].replace("(", "");
	System.out.println("Result count: "+count);
	System.out.println("Time in seconds: "+second);
	
}
}
