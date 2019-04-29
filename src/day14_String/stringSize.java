package day14_String;

public class stringSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1= "Good morning!";
		
		if(str1.equalsIgnoreCase("good morning!")) {
			System.out.println("match");
		}else 
			System.out.println("Not match");
		
		
		
		
		//System.out.println(str1.toLowerCase());
		
		str1 = str1.toUpperCase();
		
		
		System.out.println(str1);
		
		
		if(str1.toLowerCase().equals("good morning!")) {
			System.out.println("match");
		}else 
			System.out.println("do not match");
			
			
		String name = "Tsolmon";
		System.out.println(name.length());
			
	
	
		int length = name.length();
		System.out.println("My name's length: " + length);
	
	String userName = "Tsoomooo";
	
	if(userName.length()==8) {
		System.out.println("Valid username");
	}else 
		System.out.println("Invalid username");
		
		
		if(userName.length()>6) {
			System.out.println("Good username");
		}
		
		int userNameLength= userName.length();
		
		if(userNameLength<6) {
			System.out.println("invalid, too short");
			
		}else 
			System.out.println("Good");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
	

}
