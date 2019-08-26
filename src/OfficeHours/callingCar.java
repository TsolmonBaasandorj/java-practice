package OfficeHours;

public class callingCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CMD + N mac
Car n = new Car("BMW","v3","67000");
n.setPrice("980000");
System.out.println(n.getMake());
System.out.println(n.getModel());
System.out.println(n.getPrice());
System.out.println(n);

Car corolla = new Car("Toyota","Corolla","2000");
System.out.println(corolla.getMake());
System.out.println(corolla.getModel());
System.out.println(corolla.getPrice());
System.out.println(corolla);
	}

}
