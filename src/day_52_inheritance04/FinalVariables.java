package day_52_inheritance04;

public class FinalVariables {
public final int ROADSTER_MAX_RANGE=610;
public final int MODEL;
public final int RANGE;
public static final String COMPANY_NAME="Cybertek";
public static final String ADMIN_USERNAME;

static {ADMIN_USERNAME="TSOOMOO";}

public FinalVariables() {
	MODEL=320;
}

{RANGE=234;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int MAX_PASSENGERS_COUNT = 5;
//MAX_PASSENGERS_COUNT = 10;can not change
FinalVariables n = new FinalVariables();
System.out.println(n.MODEL);
System.out.println(n.RANGE);
System.out.println(n.ROADSTER_MAX_RANGE);

System.out.println(FinalVariables.ADMIN_USERNAME);
System.out.println(FinalVariables.COMPANY_NAME);
	}

}
