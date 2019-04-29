package day16_stringManupulation;

import java.util.Scanner;

public class Url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner scan = new Scanner(System.in);    //amazon.com
//String url = scan.next();
//String domain="";
//String com="";
//char lastDot = (char) (url.length()-4);
//domain=url.substring(4,url.length()-4);
//com=url.substring(url.length()-3);
//
//if(url.startsWith("www.") || (lastDot=='.')) {
//	System.out.println("Domain: " + domain);
//	System.out.println("Extention: " +com );
//	}
	
String sentence = "i wrote [100000000] lines of code today";
int first=sentence.indexOf("[")+1;
int second=sentence.indexOf("]");

System.out.println(second);
System.out.println("The number is: " + sentence.substring(first, second));

 String codeCount =sentence.substring(first, second);

int count = Integer.parseInt(codeCount);
if(count>20) {
	System.out.println("Wrote more than 20 lines of code today!!!");
}else {
	System.out.println("Not enough coding for today");
}



	
	
}
 }


