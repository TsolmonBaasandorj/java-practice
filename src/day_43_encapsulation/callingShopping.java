package day_43_encapsulation;

public class callingShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Shopping n = new Shopping("CoDress",350);
    System.out.println(n.total("Shoes", 150));
    System.out.println(n.toString());
n.setItem(n.getItem().substring(2));
n.setPrice(n.getPrice()-150);
System.out.println(n);
Shopping n2 = new Shopping("haha", 45.8);
System.out.println(n2.toString());
Shopping n3= new Shopping();
System.out.println(n3);
Shopping n4= new Shopping("bling",11.1);
System.out.println(n4);
n4.setPrice(n4.getPrice()-3);
n4.setItem(n4.getItem().replace("ing", "ow"));
System.out.println(n4);
	}

}
