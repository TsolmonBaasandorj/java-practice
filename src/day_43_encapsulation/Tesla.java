package day_43_encapsulation;

public class Tesla {
	// Encasulated
private String model;
private int range;
private double zeroTo60;
private double price;
private boolean selfDriving;


@Override
public String toString() {
	return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
			+ ", selfDriving=" + selfDriving + "]";
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	if(isValidModel(model)==true) {
		this.model = model;}
	else {
		System.out.println("Invalid model - "+model);
		this.model="unknown";
	};
	
}
public int getRange() {
	return range;
}
public void setRange(int range) {
	this.range = range;
}
public double getZeroTo60() {
	return zeroTo60;
}
public void setZeroTo60(double d) {
	this.zeroTo60 = d;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public boolean isSelfDriving() {
	return selfDriving;
}
public void setSelfDriving(boolean SelfDriving) {
	this.selfDriving = SelfDriving;
}
public boolean isValidModel(String model) {
	if(model.equalsIgnoreCase("MODEL S") || model.equalsIgnoreCase("MODEL 3")||model.equalsIgnoreCase("MODEL X")||model.equalsIgnoreCase("MODEL Y")|| model.equalsIgnoreCase("ROADSTER")) {
		return true;
	}else
	return false;
}
//method:
//	setTeslaInfo
//	 return type: void
//     params:
//     String model
//	 int range
//	 double zeroTo60
//	 double price
//	 boolean selfDriving

//	 when assigning values, please call setter methods.
//	 try not to use this. etc.
public void setTeslaInfo(String model, int range, double zeroTo60, double price, boolean selfDriving) {
	setModel(model);
	setRange(range);
	setZeroTo60(zeroTo60);
	setPrice(price);
	setSelfDriving(selfDriving);
}


//switch(model){
//case "model s" :
//case "model 3" :
//case "model x" :
//case "model y" :
//case roadster" :
//return true;
//default:
//false;

}
