package day_42_Class;

public class Person {
protected String name;
private int age;

public String getterName() {
	return name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public void setName(String name, int age) {
	this.name=name;
	this.age=age;
	System.out.println("Name: "+name+" age: "+age );
}
}
