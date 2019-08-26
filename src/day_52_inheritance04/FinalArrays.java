package day_52_inheritance04;

import java.util.Arrays;

public class FinalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final int[] TEAMS =new int[] {11,11};
System.out.println("Team1 : "+TEAMS[0]);
System.out.println("Team2 : "+TEAMS[1]);
TEAMS[0]=10;
TEAMS[1]=9;
System.out.println("Team1 : "+TEAMS[0]);
System.out.println("Team2 : "+TEAMS[1]);

//TEAMS = new int[] {10,10,10};

int[] num = new int[] {12,12,12,12,12};	
System.out.println(Arrays.toString(num));
num=new int[] {23,45,64,321,1,2311,1231,213,123};
System.out.println(Arrays.toString(num));
}

}
