package day_42_Class;
import java.util.*;
public class StringShoesToObject {

	public static void main(String[] args) {
	
Shoes n = new Shoes();
String data = "Bruno Magli,9.5";
int idx=data.indexOf(",");
n.brand=data.substring(0,idx);
n.size=Double.parseDouble(data.substring(idx+1));
System.out.println(n.getShoesData());

// second option

n.setShoesData(data.substring(0,idx), Double.parseDouble(data.substring(idx+1)));
System.out.println(n.getShoesData());



Scanner scan = new Scanner(System.in);
System.out.println("What shoes brand?");
String brand = scan.next();
System.out.println("What is your size?");
double size = scan.nextDouble();

Shoes n2= new Shoes();
n2.setShoesData(brand, size);
System.out.println(n2.getShoesData());


	}

}
