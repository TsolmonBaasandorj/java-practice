package day_54_inheritanceREVIEW;
class data1{
	private String password ="123456";
	private final int age= 40;
	
	public String getPassword() {
		return password;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setPassword( String password ) {
		this.password = password;
	}
	
//	public void setAge(int age) {     final variable cannot have setter
//		this.age = age;
//	}
	
}


class finalKeyword {
	

	/*
	 final:  value cannot be changed
	 		 variable, class and methods
	 		 
	 		 variable: 
	 		 		1. local variable: does not need to be initialized immediately
	 		 							cannot be re-assigned.
	 		 		2. 	instance variable: needs to be initialized 	immediately
	 		 							can be initialized in either instance block or constructor 
	 		 		
	 		 		3.  static variable: needs to be initialized immediately
	 		 							can be initialized in static block
	 		 							
	 		 class : class cannot extended,
	 		 			abstract class cannot be final.
	 		 
	 		 method: cannot be override
	 
	 */
	
	 final String name;
	 final static String school;
	 static {
			school ="Cybertek";
		    }
	 
	 {
	 name = "Batch 11";
	 }
//	public finalKeyword() {
//		name="Batch 13"; 
//	} 
//	can initialize only one time, if two second initiation will give error.
	
	public static void main(String[] args) {
		final boolean result;
		//	result = true;   final vairable cannot be re-assigned
		
		
	}
}
