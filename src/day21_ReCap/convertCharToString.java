package day21_ReCap;

public class convertCharToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//char ch = 'a';
//char str1=ch;
//System.out.println(ch);
//
//char ch2='v';
//char ctr2=ch2;


String a="anagram";
String b="margana";
String newWord="";
for(int i=b.length()-1; i>=0;i--) {
	newWord=newWord+b.charAt(i);
}
if(b.equalsIgnoreCase(a)) {
	System.out.println("Anagrams");
} else 
	System.out.println("Not Anagrams");


	}

}
