package day_50_inheritance03;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee emp = new Employee();
        FullTimeEmployee ft = new FullTimeEmployee();
        Contractor ct = new Contractor();
        
        emp.calculatePay(40, 40);
        ft.calculatePay(40, 45);
        ct.calculatePay(40, 55);
	}

}
