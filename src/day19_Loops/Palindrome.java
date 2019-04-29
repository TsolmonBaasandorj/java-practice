package day19_Loops;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word="level";
String reversed="";
int idx=word.length()-1;
 while(idx>=0) {
    reversed=reversed+word.charAt(idx);
	 idx--;
 }
 
 if(word.equals(reversed)) {
	 System.out.println("it is palindrome");
 }else {
	 System.out.println("No it is not palindrome");}
 
 
	}

}
