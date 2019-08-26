package OfficeHours;

public class Person {
private String firstName;
private String lastName;
private String birthday;

public Person(String birthday) {
	this.birthday=birthday;
//this.birthday="01/01/2003";
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getBirthday() {
	return birthday;
}
//we will not able to change birthday in main
//public void setBirthday(String birthday) {
//	this.birthday = birthday;
//}


}
