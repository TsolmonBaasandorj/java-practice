package day_41_Class;

public class car {
String make;
String model;
int currentSpeed;
String color;

public String printCarInfo() {
	return "car make["+make+"], model["+model+"], "+"color["+color+"],"+
"cuurentSpeed["+currentSpeed+"]";
}

public void showCurrentSpeed(int speedLimit) {
	
	if(currentSpeed<=speedLimit) {
		System.out.println(make+" is driving at "+ currentSpeed+" mph"+", following speed limit -"+speedLimit);
	}else 
		System.out.println(make+" is driving at "+ currentSpeed+" mph"+", over the speed limit -"+speedLimit);
}

public void accellerate(int mph) {
	currentSpeed=currentSpeed+mph;
	//System.out.println(currentSpeed);
}


}
