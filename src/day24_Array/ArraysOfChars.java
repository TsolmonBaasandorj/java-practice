package day24_Array;

public class ArraysOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 char[] values = {'a','b','c'};
 
 for(char value: values) {
	 if(value=='a'){
			System.out.println("a is there" ); 
	 }
 }
 
 String str = "Wooden spoon";
 // this method toCharArray() converts string into array of characters
 char[] chars = str.toCharArray();
 for(char c: chars) {
	
		 System.out.print(c+"_");
}
 System.out.println();
 
 for(int i=chars.length-1; i>=0;i--) {
	 System.out.print(chars[i]+"_");
 }
 System.out.println();
 for(char star : chars) {
	 if(star=='o') {
		 System.out.print("*");
	 }else {
		 System.out.print(star);
	 }
		 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	}

}
