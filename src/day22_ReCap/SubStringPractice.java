package day22_ReCap;

public class SubStringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word="java";
System.out.println(word.substring(0,1));
System.out.println(word.substring(1,2));
System.out.println(word.substring(2,3));
System.out.println(word.substring(3,4));

System.out.println("===========FOR LOOP============");

String word2="java";
for(int i=0; i<word.length(); i++) {
	System.out.println(word2.charAt(i));
}
	System.out.println("=============REVERSE============");

for(int i=word.length()-1; i>=0;i--) {
	System.out.println(word.substring(i,i+1));
}
System.out.println("============***=============");
int start = 1;
int end = 5;
String word3="UnitedStates";
System.out.println(word3.substring(start, end));
	}

}
