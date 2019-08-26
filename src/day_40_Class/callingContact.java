package day_40_Class;

public class callingContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Contact n = new Contact();
n.name="Muugii";
n.phoneNumber="999-999-9999";
n.email="Muugii_99@yahoo.com";
n.call(n.name, n.phoneNumber, n.email);
System.out.println();
n.call2();
n.sendMessage();
n.sendEmail();
System.out.println();
Contact n2= new Contact();
n2.name="Orhan Sultanov";
n2.phoneNumber="571-999-3322";
n2.email="orhan_333@gmail.com";

n2.call(n2.name, n2.phoneNumber, n2.email);
n2.call2();
n2.sendEmail();
n2.sendMessage();
n.call2();

	}

}
