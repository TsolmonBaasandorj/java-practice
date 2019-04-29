package day_27_mArray;

public class tools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Java --> programming language
		Selenium --> Test Automation
		TestNG --> Unit Tests
		JUnit --> Unit Tests
		Cucumber --> BDD Style testing
		Git --> Version control
		Maven --> Building and execution for project*/
		
		String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};
		
		for(String a: tools) {
			a.toLowerCase();
			if(a.equals("Java")) {
				System.out.println("Java --> programming language");
			}else if(a.equals("Selenium")) {
				System.out.println("Selenium --> Test Automation");
			}else if(a.equals("TestNG" )||a.equals( "JUnit")) {
				System.out.println("Unit Tests");
			}else if(a.equals("Cucumber")) {
				System.out.println("BDD Style testing");
			}else if(a.equals("Git")) {
				System.out.println("Version Control");
			}else if(a.equals("Maven")) {
				System.out.println("Building and execution for project");
			}else 
				System.out.println("Unknown tools");
		}
	}

}
