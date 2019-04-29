package day_34_methodContinue;

public class mahahaha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(at3("longword","foo"));
		
	}
	public static String at3(String target,String word) {
		String first=target.substring(0,3);
		String last=target.substring(3);
		String newWord=first+word+last;
		
		return newWord;
	}
}
