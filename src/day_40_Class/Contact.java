package day_40_Class;

public class Contact {

	String name;
	String phoneNumber;
	String email;
	
	public void call(String name, String phoneNumber, String email) {
		
		System.out.println("I am calling-> "+name+"\n"+"Her phone number is: "
		+phoneNumber+"\n"+ "Her email is: "+email);
		
		}
	public void call2() {
        System.out.println("Calling " + name +" .... ");
    }
    
    public void sendMessage() {
        System.out.println("Sending message to " + phoneNumber +" | name: " + name);
    }
    
    public void sendEmail() {
        System.out.println("Sending email to " + email +" ....");   
    }
	
}
