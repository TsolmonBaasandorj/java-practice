package day_36_WrapperClass;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // AUTOBOXING
// Autoboxing is converting from primitive --> wrapper class object, 
		//convert from primitive to object
	
		// Unboxing : convert object into primitive
		//            convert wrapper class to primitive
		Integer num1 = 1234;
		int n=5;
		Integer num2=n;
		System.out.println(num1.valueOf(123));
		
		
		
		//Unboxing  -> object -> primitive
		
		Double d1=new Double(34.2);
		double d2=d1;
		
		System.out.println("d1: "+d1);
		System.out.println("d2: "+d2);
		
		long l1 = new Long(6000000);//unboxing
		Long l2 = new Long(343434443);//noBoxing
		long l3 = l2; //unboxing
		Long l4 = l3;//autoboxing
		
		Integer num3 = Integer.valueOf(345);
		
		
	}

}
