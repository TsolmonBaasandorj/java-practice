package day_43_encapsulation;

public class callingTesla {

	public static void main(String[] args) {
 Tesla tesla = new Tesla();
  tesla.setModel("MODEL 3");
  tesla.setRange(310);
  tesla.setZeroTo60(3.2);
  tesla.setPrice(51450);
  tesla.setSelfDriving(true);
 
  System.out.println("Model: "+tesla.getModel());
  System.out.println("Range: "+tesla.getRange());
  System.out.println("Zeroto60: "+tesla.getZeroTo60());
  System.out.println("Price: "+tesla.getPrice());
  System.out.println("SelfDriving: "+tesla.isSelfDriving());
  System.out.println(tesla.isValidModel("model 3"));
  
  Tesla myTesla = new Tesla();
  myTesla.setTeslaInfo("ROADSTER",620, 1.9, 250000,true);
  System.out.println(myTesla.toString());
  
  if(tesla.getZeroTo60()>myTesla.getZeroTo60()) {
	  System.out.println("Faster model: "+myTesla.getModel());
	  System.out.println("0-60 speed: "+myTesla.getZeroTo60());
  }else {
	  System.out.println("Faster model: " + tesla.getModel());
		System.out.println("0-60 speed: " + tesla.getZeroTo60());
  }
 
	buy(myTesla);
	buy(tesla);
	System.out.println(testDrive("MODEL 3"));
//	Tesla testCar = testDrive("MODEL 3");
//	System.out.println(testCar);
	}

public static void buy(Tesla car) {
	System.out.println("Purchasing: "+car);
}

public static Tesla testDrive(String model) {
	System.out.println("I would like to test drive - "+model);
	System.out.println("Sure, let me build the object and return it, momentarily!");
	Tesla car = new Tesla();
	car.setTeslaInfo(model, 2, 12, 670000, true);
	return car;
}






}