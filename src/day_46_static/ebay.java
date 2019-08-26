package day_46_static;

public class ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer cm1 = new Customer("Abdallah Aleies", "AbdallahAleies@gmail.com");
Customer cm2 = new Customer("ADILET KYRGYZ", "Adilet@yahoo.com");
Customer cm3 = new Customer("Anastasia Zasi", "Anastasia@outlook.com");
System.out.println(cm3.count);
System.out.println(Customer.count);
Customer cm4 = new Customer("Burak", "Burak@yahoo.com");
System.out.println(cm1.toString());
System.out.println(cm2.toString());
System.out.println(cm3.toString());

System.out.println(Customer.count); 
cm1.count=10;
System.out.println(cm1.count);

	}

}
