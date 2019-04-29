package day15_string;

public class startAndEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word1="eclipse";
//char first = word1.charAt(0);
//
//if(first=='e') {
//	System.out.println("Match");
//}else System.out.println("Not match");


if(word1.startsWith("e")) {
	System.out.println("True");
}else System.out.println("False");

if(word1.endsWith("ipse")) {
	System.out.println("True");
}else System.out.println("False");

System.out.println(word1.toUpperCase());

String word2="mmm.Jackson";

if(word2.startsWith("Mr.")) {
	System.out.println("man");
}else if(word2.startsWith("Mrs.")) {
	System.out.println("married woman");
}else if(word2.startsWith("Ms.")) {
	System.out.println("Some woman");
}else if(word2.startsWith("Dr.")) {
	System.out.println("Doctor man or woman");
}else System.out.println("Unknown status!");






















	}

}
