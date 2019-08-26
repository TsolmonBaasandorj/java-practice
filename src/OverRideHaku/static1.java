package OverRideHaku;

public class static1 {

	static int n=100;
	
	public static void main(String[] args) {
		static1 over=new static1();
		over.n=20;
		System.out.println(over.n);
		over.method();
		
		method(1,2,3,44,3,2,2,2);
	}
	
	public static void method(int...n) {
		System.out.println(n[0]);
	}
	
	
	
}
