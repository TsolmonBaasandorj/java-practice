package day08_Chapter3;

public class Relationals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double d1=23.56;
		double d2=20.43;
		
		
		
		System.out.println(d1>d2);
		boolean check = d1>=d2;
		
		
		System.out.println("Check: "+check);
		
		char ch1 = 'a';
			char ch2 = 'j'	;
			char ch3 = 'A';
			System.out.println(ch2>ch1);//true 'j'>'a'
			System.out.println(ch2>ch3);//true 'a'>'A'
		
		boolean b=true==false;
		System.out.println("B: "+b);//false;
		
		boolean b1=true!=false;
		System.out.println("B: "+b1);//true;
		
	}

}
