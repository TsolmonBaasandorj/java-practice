package day_42_Class;

public class Coffee {
String name;
String size;
double price;
int calories;

public String getCoffeeInfo() {
	
	return name.toUpperCase()+"       "+size.toUpperCase()+"        $"+price+
			"         "+calories+"CAL";
}
	
public void setName(String newName,String size2,double price2, int calories2) {
	name=newName;
	size=size2;
	price=price2;
	calories=calories2;
	
}
	public void setName2(String newName2) {
	
		name=newName2;
	}
	public void setSize(String newSize) {
		if(newSize.equalsIgnoreCase("tall") ||
			newSize.equalsIgnoreCase("grande") ||
			newSize.equalsIgnoreCase("venti")) {
			size = newSize;
		}else {
			System.out.println("ERROR: Invalid Size - " + newSize);
			size = "unknown";
		}
	}
	
}
