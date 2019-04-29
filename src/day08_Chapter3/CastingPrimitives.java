package day08_Chapter3;

public class CastingPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//cast double value to int
		
		int i = (int)3.4;
		System.out.println("i: " + i);
		
		double price = 230.50;
		int dollars = (int)price;
		int price1 = (int) dollars;
		System.out.println("dollars: "+dollars);
		System.out.println(price1);
		
		
		
		
		
		int count = 44;
		byte byteCount = (byte)count;
		System.out.println("Bytecount: " +count);
		
		long longValue = 34565L;
		int intValue = (int)longValue;
		System.out.println("Int value: " + longValue);
		
		
		
		
		int large = 5678;
		short small = (short) large;
		System.out.println("Small: "+ small);
		
		
		
		
	}

}
