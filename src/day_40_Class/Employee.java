package day_40_Class;

public class Employee {
public String name;//can be used anywhere in project
public String jobTitle;
public double salary;// can only be used in same package


public void work() {
	System.out.println(name+" is working...");
}
public void goToBreak() {
	System.out.println(name+" is going to break...");
}
public void attendMeeting() {
	System.out.println(name+" is going to attend meeting...");
}
public void introduce() {
	System.out.println("Name["+name+"], JobTitle[ "+jobTitle+"], Salary[ "+salary +"]");
}

}
