package day_58_Interfaces;

public class ClassA implements Cloneable{
@Override
public Object clone() {
	System.out.println("Cloning");
	return null;
}
}
