package day19_Loops;

public class printLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word = "AMAZON";
int idx=0;


while(idx<word.length()) {
	System.out.print(word.charAt(idx));
	idx++;
}

System.out.println();

int idx2=word.length()-1;


while(idx2>=0) {
	System.out.print(word.charAt(idx2));
	idx2--;
}

	}

}
