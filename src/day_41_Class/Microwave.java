package day_41_Class;

public class Microwave {
String brand;
boolean isOn;

public void turnOn() {
	
	if(isOn) {
		System.out.println(brand+ " microwave is already ON");
	}else {
		System.out.println("Turning on "+brand+" the microwave.");
	}
}
public void turnOff() {
	System.out.println("Turning off the "+brand+" microwave.");
	if(isOn==false) {
		System.out.println(brand+" is already off");
	}
}
public void heat() {
	if(isOn) {
		System.out.println(brand+" microwave heating the pizza");
	}else {
		System.out.println(brand +" microwave is off, cannot heat pizza");
	}
	
}
}
