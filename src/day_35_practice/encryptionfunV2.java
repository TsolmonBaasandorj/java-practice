package day_35_practice;

public class encryptionfunV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("#1: "+encryptSentence("java is fun"));
		System.out.println("#2: "+encryptSentence("i love java"));
		
		//System.out.println(encryptWord("tsoomoo"));
		
	
	}
	public static char encryptChar(char ch ) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		int i=alphabet.indexOf(ch);
		char a=encrypted.charAt(i);
		return a;
//		return encrypted.charAt(alphabet.indexOf(ch));
		
	}
	public static String encryptWord(String word) {
		String result="";
		for(int i=0; i<word.length(); i++) {
			result=result+encryptChar(word.charAt(i));
		} 
		return result;
	}
	
	public static String encryptSentence(String sentence) {
		String[] arr=sentence.split(" ");
		String result="";
	
		for(int i=0; i<arr.length; i++) {
		result=result+encryptWord(arr[i])+" ";
		}
		return result.trim();
	}

}
