package day_61_Polymorphism03;
import day_60_Polymorphism02.*;
public class DownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AppleDevice appDev = new Ipad();
//appDev can access use method, startingPrice variable
appDev.use();
Ipad ipad = (Ipad)appDev;
ipad.draw();
System.out.println(ipad.startingPrice);
AppleDevice dev2 = new Mac();
dev2.use();
//1.using another reference variable
Mac mac= (Mac)dev2;
//2.cast and call in single statement
((Mac)dev2).code();
mac.code();
System.out.println(mac.model);
	}

}
