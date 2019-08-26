package day_41_Class;

public class callingCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car info = new car();
info.color="white";
info.currentSpeed=65;
info.make="Toyota";
info.model="Camry";

System.out.println(info.printCarInfo());
info.showCurrentSpeed(70);
System.out.println("Before: "+info.currentSpeed);
info.accellerate(25);
System.out.println("After: "+info.currentSpeed);

	}

}
