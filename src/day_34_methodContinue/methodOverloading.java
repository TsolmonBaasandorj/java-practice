package day_34_methodContinue;

public class methodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     add(2.2,12);
     add("Hello","World");
	}
	public static void add(int num1, int num2) {
		int result=num1+num2;
		System.out.println("Result: "+result);
	}
	public static void add(double num1, double num2) {
		double result=num1+num2;
		System.out.println("Result: "+result);
	}
	public static void add(String str1, String str2) {
		String result=str1+str2;
		System.out.println("Result: "+result);
	}
}
