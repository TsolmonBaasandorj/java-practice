package day_35_practice;

public class decryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(encryptSentence("uirvmwh"));
		System.out.println(encryptSentence("glwzb xozhh rh ufm#"));
	}
	public static char encryptChar(char ch ) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz!";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba#";
		
	int position = encrypted.indexOf(ch);
	char a=alphabet.charAt(position);
	return a;
	}
	public static String encryptWord(String word) {
		String result="";
		for(int i=0; i<word.length(); i++) {
			result=result+encryptChar(word.charAt(i));
		}
		return result;
	}
	
public static String encryptSentence(String sentence) {
	String [] arr=sentence.split(" ");
	String result="";
	for(int i=0; i<arr.length; i++) {
		result=result+encryptWord(arr[i])+" ";
	}
	return result;
}
}
