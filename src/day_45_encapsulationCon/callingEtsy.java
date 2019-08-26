package day_45_encapsulationCon;

public class callingEtsy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EtsyAccount acct1 = new EtsyAccount();
System.out.println(acct1);
acct1.setEmail("Tsolmon_mm@yahoo.com");
acct1.setFirstName("Tsolmon");
acct1.setPassword("Tsoomoo");
System.out.println(acct1);

EtsyAccount acct2 = new EtsyAccount();
acct2.setEmail("helirevaroyalhost.info");
acct2.setFirstName("helireva123");
acct2.setPassword("abc12");
System.out.println(acct2.toString());

EtsyAccount acct3 = new EtsyAccount("helireva@royalhost.info", 
		                      "Helireva", "royal234");
System.out.println(acct3.toString());

EtsyAccount acct4 = new EtsyAccount("woodenspoon@gmail.com","WdSpoon");
System.out.println(acct4);

	}

}
