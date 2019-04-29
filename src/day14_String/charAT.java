package day14_String;

public class charAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word = "COMPUT ER";

System.out.println(word.charAt(0));
System.out.println(word.charAt(1));
System.out.println(word.charAt(2));
System.out.println(word.charAt(3));
System.out.println(word.charAt(4));
System.out.println(word.charAt(5));
System.out.println(word.charAt(6));
System.out.println(word.charAt(7));
System.out.println(word.charAt(8));


		
		String word2="Nava";
		
		
		if(word2.charAt(0)==('N')) {
			
		System.out.println("N is first char");
		
		} else 
			System.out.println("N is not first char");
		
		
		
		String word3="three";
		
		char first = word3.charAt(0);
		char last = word3.charAt(4);
		
		if(first==last) {
			System.out.println("First and last are same");
		}else 
			System.out.println("First and last are not same");
		
		
		
		
		String word4="TsoomooM";
		System.out.println(word4.charAt(word4.length()-1));
		
		char first1 =(char) word4.charAt(0);
	    char last1 = (char) (word4.length()-1);
		
		System.out.println(word4.charAt(0));
		System.out.println(word4.charAt(word4.length()-1));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
