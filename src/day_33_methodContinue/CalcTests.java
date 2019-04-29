package day_33_methodContinue;

public class CalcTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(warmup.add(1,2));
System.out.println(warmup.multiply(2,3));
System.out.println(warmup.minus(5,3));
System.out.println(warmup.divide(9,3));

int addResult=warmup.add(1,2);
int mulResult=warmup.multiply(2,3);
int minResult=warmup.minus(5,3);
double divResult=warmup.divide(6,3);

System.out.println("Add result: "+addResult);
System.out.println("Multiply result: "+mulResult);
System.out.println("Minus result: "+minResult);
System.out.println("Division result: "+divResult);

int a=10, b=5;
int myResult=warmup.multiply(a,b);
System.out.println(myResult);


int[] num= {1,2};
double resultArr=warmup.multiply(num[0],num[1]);
System.out.println(resultArr);


if(warmup.add(10, 16) == 26) {
	System.out.println("Add Unit Test Passed");
}else {
	System.out.println("Add Unit Test Failed");
}
	}

}
