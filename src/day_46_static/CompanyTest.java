package day_46_static;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println(Company.cname);
System.out.println(Company.cname.toUpperCase());
//Company.cname.toUpperCase();
//System.out.println();

Company c = new Company();
System.out.println(c.cname);
c.companyInfo();
Company.companyInfo();
}

}
