package day_35_practice;

public class EncryptionFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		String word="munkhna";
//		char first=word.charAt(0);
//		
//		int position=alphabet.indexOf(first);
//		System.out.println("Position:"+ position);
//		
//		char enChar=encrypted.charAt(position);
		//System.out.println(first+" --> "+enChar);
		
		for(int i=0; i<word.length(); i++) {
			char ch=word.charAt(i);
			int position2=alphabet.indexOf(ch);
	       System.out.println(ch+" --> "+encrypted.charAt(position2)+" ");
		}
	}

}
