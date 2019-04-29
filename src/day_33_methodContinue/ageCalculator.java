package day_33_methodContinue;

public class ageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Age: "+calculateAge(2020));
	}
	public static int calculateAge(int year) {
		int age=2019-year;
		if(age<1) {
			System.out.println("Invalid age!");
			System.exit(0);
		}
		if(age>=1 && age<=14) {
			System.out.println("Child");
		}if(age>=15 && age<=25 ) {
			System.out.println("Youth");
		}if(age>=26 && age<=65) {
			System.out.println("Adult");
		}if(age>65) {
			System.out.println("Seniour");
		}
		return age;
	}

}
