package day_56_Abstraction;

public class Nokia extends MobilePhone {
public void call() {
	System.out.println("Nokia is calling");
}

public void text(String message) {
	// TODO Auto-generated method stub
	System.out.println("Nokia sending msg: "+message);
}
}
