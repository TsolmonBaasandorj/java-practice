package day07_scanner_operators;

public class PreAndPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub





int abc = 10;
int abc2 = abc++;
System.out.println("abc" +abc);
System.out.println("abc2" +abc2);





int cvb = 20;
int cvb2 = ++cvb;
System.out.println(cvb);
System.out.println(cvb2);



int bananas = 6;
int pears = bananas++;
int apples = ++bananas;
System.out.println("bananas: " + bananas);
System.out.println("pears: " + pears);
System.out.println("apples: " + apples);




int p1 = 10;
int sum = p1++ +5;
System.out.println(sum);
System.out.println(p1);
//p1+5 and assign to sum
//p1=p1+1


int batteries = 8;
int oldBatteries = 5;
int totalBatteries = batteries ++ + ++oldBatteries;
System.out.println("batteries: " + batteries);//9!!
System.out.println("oldBatteries: " + oldBatteries);//6!!
System.out.println("totalBatteries: " + totalBatteries);//8+6









	}

}
