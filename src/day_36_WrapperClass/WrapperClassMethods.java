package day_36_WrapperClass;

public class WrapperClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Byte.MIN_VALUE);
System.out.println(Byte.MAX_VALUE);
System.out.println(Short.MIN_VALUE);
System.out.println(Short.MAX_VALUE);
System.out.println(Integer.MIN_VALUE);
System.out.println(Integer.MAX_VALUE);
System.out.println(Long.MIN_VALUE);
System.out.println(Long.MAX_VALUE);
System.out.println(Float.MIN_VALUE);
System.out.println(Float.MAX_VALUE);
System.out.println(Double.MIN_VALUE);
System.out.println(Double.MAX_VALUE);

//parseInt--> retuns primitive value
//This line is not doing any boxing
// int count = Integer.parseInt("23456");



int count = Integer.parseInt("12345");
System.out.println("Count: "+count);

//valueOf --> returns a wrapper class object
//the below line is doing unboxing and assigning value to primitive
//int count2 =Integer.valueOf("45674");
int count2= Integer.valueOf("12345");
System.out.println("Count2: "+count2);


System.out.println(Character.isAlphabetic('a'));
System.out.println(Character.isAlphabetic('1'));
System.out.println(Character.isDigit('1'));
System.out.println(Character.isLetter('l'));

String str="java101";
System.out.println(Character.isAlphabetic(str.charAt(0)));
System.out.println(Character.isDigit(str.charAt(4)));



String word="ab123c5dfer1";

for(int i=0; i< word.length(); i++) {
	if(Character.isDigit(word.charAt(i))) {
		System.out.println(word.charAt(i));
	}
}

	}

}
