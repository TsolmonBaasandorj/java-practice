package day_46_static;

public class Vehicle {
String type;//instance variable , every object has its own type
static int numberOfVehicles;// shared, one central value
public static void vehicleInfo() {
	//System.out.println(type);
	System.out.println(numberOfVehicles);
	int count = getNumberOfVehicles();
	String make = "Kia";
	make.toUpperCase();
	System.out.println("make: "+make);
	//System.out.println(toString());can not call non-static in static method
	
}

public static int getNumberOfVehicles() {
	return numberOfVehicles;
	
}
public String toString() {
	return "Vehicle type:"+type+" | count:"+numberOfVehicles;
}

}
