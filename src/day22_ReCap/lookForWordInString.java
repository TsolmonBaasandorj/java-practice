package day22_ReCap;

public class lookForWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "He said hi, then she replied hi. hi guys!";
		int count=0;
		for(int i=0; i<sentence.length()-1; i++) {
			if(sentence.substring(i,i+2).equals("hi")) {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
