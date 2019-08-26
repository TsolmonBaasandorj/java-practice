package day_41_Class;

public class BMW {
String make="BMW";
String model;
double price;


public double showPrice(String model) {
	if(model.equals("330i")) {
		price=40250;
	}else if(model.equals("740i")) {
		price=86450;
	}else if(model.equals("m3")) {
		price=66500;
	}else
		System.out.println("Invalid data!");
	return price;
}
}
