package day_43_encapsulation;

public class MicroCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Computer comp1 = new Computer();
Computer comp2 = new Computer();
System.out.println(comp1.toString());
System.out.println(comp2.toString());

comp1.setBrand("Mac");
comp1.setOs("macOS High Sierra");
comp1.setPrice(2000.0);

comp2.setBrand("Dell XPS");
comp2.setOs("Windows 10");
comp2.setPrice(1300);

System.out.println(comp1.toString());
System.out.println(comp2.toString());

Computer comp3 = new Computer("ASUS", "Windows 7", 640);
System.out.println(comp3);
comp3.setOs("Windows 11");
comp3.setPrice(comp3.getPrice()-200);
System.out.println(comp3);

	}

}
