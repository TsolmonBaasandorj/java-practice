package day22_ReCap;

public class FindHowMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word="including webpages, images";
int count=0;
for(int i=0; i<word.length();i++) {
	if(word.substring(i,i+1).equals("e")){
		count++;
		word=word.replace("e","");
		int length=word.length();
	}
}
System.out.println(word);
System.out.println(count);


	}

}
