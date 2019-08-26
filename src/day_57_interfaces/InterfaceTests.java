package day_57_interfaces;

public class InterfaceTests {

	public static void main(String[] args) {
		
		
		method(90,56,90);
		
		
		// TODO Auto-generated method stub
//      Tesla t = new Tesla();
//      BMWi8 i8= new BMWi8();
//      t.charge();
//      i8.charge();
//      
//      t.drive();
//      t.selfDrive();
//      
//      Electric el2 = new Tesla();//this is polymorphism . we will 
//      Cat cat = new Cat();
//      cat.keepAsPet();
//      cat.play();
//      cat.respond();
//      
//      Pet.feed("dry food");
//      System.out.println(Pet.friendly);
	}
	public static void method(int num1, int num2, int num3) {
		int middle = 0;	
		if(num1>num2 && num1<num3) {
			middle = num1;
		}else if(num2>num1 && num2<num3) {
			middle = num2;
		}else if(num3>num1 && num3<num2) {
			middle = num3;
		}
		System.out.println(middle);
	}
}
