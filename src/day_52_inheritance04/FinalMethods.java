package day_52_inheritance04;

public class FinalMethods {
public final void method1() {
	System.out.println("Final method 1");
}
public final static void staticMethod(String word) {
	System.out.println("staticMethod"+word);
}
}

class Sub extends FinalMethods{
	//CAN NOT OVERRIDE SINCE IT IS A FINAL METHOD
//	public final void method1() {
//		System.out.println("OverRide method 1");
//	}
	// CAN NOT OVERRIDED BECAUSE JAVA LOOKS AT IT AS A NEW INDEPENDENT METHOD
//	Again can not overrided
	
}