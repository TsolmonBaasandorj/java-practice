package day26_arrayContinue;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String words = "java, kava, html, selenium";

String[] myWords=words.split(",");
for(String a: myWords) {
	System.out.println(a);
	
	
}
System.out.println(Arrays.toString(myWords));

String diceresult = "1-20 of 1461 positions";

String[] newWord= diceresult.split(" ");

System.out.println(newWord[2]);

String[] newWord2= diceresult.split("of");
for(String a: newWord2) {
	System.out.println(a.trim());
}

String sentence="I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";


String[] firstArr= sentence.split("I");
String[] secondArr= sentence.split("happy");
String[] thirdArr=sentence.split(" ");
for(String a: firstArr) {
	System.out.println(a);
}
System.out.println();

for(String b: secondArr) {
	System.out.println(b);
}
System.out.println();

for(String c: thirdArr) {
	System.out.println(c);
}


String word="java";
char[] charsArray = word.toCharArray();

for(char ch: charsArray) {
	System.out.println(ch);
}











	}

}
