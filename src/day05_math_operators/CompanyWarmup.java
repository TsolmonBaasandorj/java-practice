package day05_math_operators;

public class CompanyWarmup {
	public static void main(String[] args) {
		String companyName = "Facebook";
		String address = "Silicon valley, CA";
		int numberOfEmployees = 10000;
		int revenue = 4000000;
		boolean isTechCompany = true;
		
		
		System.out.println("  ");
		int x = 333;
		String s = "amigo " + x;
		System.out.println("The Company name is: " + companyName);
		System.out.println("The address is: " + address);
		System.out.println("The number of employees is: " + numberOfEmployees);
		System.out.println("The revenue is: " + revenue);
		System.out.println(isTechCompany);
		
		System.out.println("");
		
		System.out.println(s);
		int num1=10;
		int num2=20;
		System.out.println(num1+ ""+num2);
		
		String aboutCompany = "Company Facebook is located in Silicon Valley,\n CA and 10000 ppl for it. \n Its reevenue is ### and it is a tech company-true! ";
		System.out.println(aboutCompany);
	}

}
