package day_49_inheritance02_2;

import day_49_inheritance02.Device;
//IPAD IS-A Device . IPAD is a subclass in a different package
public class Ipad extends Device{
  public void readEBook(String title) {
	System.out.println("Reading a book "+title+" using "+ brand +" ipad.");
	System.out.println("Model - "+model);
	//System.out.println("Price: "+price);//not inherited
	//System.out.println("Made in: "+counrty); not visible
}
}
