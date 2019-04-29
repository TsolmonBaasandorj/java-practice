package day09_String;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Java";
		String str2="Java";
		System.out.println(str1==str2);
		System.out.println(str1=="java");
		System.out.println(str2=="Java");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals("Java"));
		System.out.println(str2.contentEquals("java"));
		
		
		
		//String today = new String("Java");
		//String str = new String("Hello");
		
		
		//String month = "March";
		String month = new String("March");
		String month2=new String("March");
		
		System.out.println(month == month2);//false because java is not doing values comparison. 
		//It is just checking if month and month2 are pointing to same location in memory.
		
		System.out.println(month.equals(month2));
		System.out.println(month.contentEquals("March"));
		//in the above examples, by using equals method , java is checking if values are the same.
		
		
		
	}

}
