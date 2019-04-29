package day06_operators2;

public class ShortHandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  students = 45;
students = students -2;

System.out.println("Students " + students);
int cars = 12;

System.out.println(cars);
cars*=2;

System.out.println(cars);
cars+=cars;

System.out.println(cars);
int shoes = 20;
shoes/=4;

System.out.println(shoes);

double price = 45.50;
int amount = 5;
price+=amount;
System.out.println(price);


int minute = 66;
minute%=60;
System.out.println("Remaining :" + minute);

int pennies = 550;
pennies %=100;
System.out.println(pennies);
	}

}
