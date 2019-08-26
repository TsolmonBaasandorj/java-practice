package day_43_encapsulation;

public class callingSalon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
nailSalon n = new nailSalon("gel", "Laura", 40);
System.out.println(n);
n.setService("manicure");
n.setPrice(16);
n.setServer("Mel");
System.out.println(n);
System.out.println(n.total("maniAndperi"));
n.setService("pediAndGel");
n.setPrice(70);
System.out.println(n);
n.setService(n.getService().replaceAll("[A]", "!"));
n.setPrice(n.getPrice()-20);
n.setServer(n.getServer().concat(" and Jenny"));
System.out.println(n);
buy(n);
System.out.println(getInfo());

	}
	public static void buy(nailSalon serv) {
		System.out.println("Purchasing: "+serv);
	}
	
	public static nailSalon getInfo() {
		nailSalon bluezen = new nailSalon("wax","Jenny", 90);
		bluezen.setServiceInfo("wax", 18, "Laura");
		System.out.println(bluezen.getServer());
		return bluezen;
	}

}
