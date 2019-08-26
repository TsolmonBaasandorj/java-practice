package OfficeHours;

public class callingPerson {

	public static void main(String[] args) {
		//when we use constructors certain actions are being taken during the
		//process of creating the object
		//from now on whenever we create an object ,
		//we have to provide the constructor
Person john = new Person("03/03/1993");
john.setFirstName("John");
john.setLastName("Doe");
System.out.println(john.getFirstName());
System.out.println(john.getLastName());
System.out.println(john.getBirthday());
john.setLastName("Smith");


	}

}
