package Day_29_Method;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHello();
		study();
		code();

		System.out.println(sayHell02("Hello"));
		//1234
		//123
		//12
		//1
		int idx=4;
			
		for(int i=0; i<=3; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=idx; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
			idx--;
		}
		//1,2,3,4,10
		
	}
public static void sayHello() {
	System.out.println("Hello friends!");
		
}
public static String sayHell02(String str) {
	return str.substring(0,1);
}
public static void study() {
	System.out.println("Hello!");
	System.out.println("Student is studying");
}
public static void code() {
	System.out.println("Inside code method");
	System.out.println("Student is coding Java!");
}

}
