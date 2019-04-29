package day_28_multid_Array;

import java.util.Arrays;

public class SoccerTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] teams = new String[2][6];
teams[0][0]="Irina";
teams[0][1]="Zarif";
teams[0][2]="Cihan";
teams[0][3]="Habib";
teams[0][4]="Adel";
teams[0][5]="Bojan";

teams[1][0]="Tsoomoo";
teams[1][1]="Muugii";
teams[1][2]="Amir";
teams[1][3]="ELisa";
teams[1][4]="Nuku";
teams[1][5]="Kuba";

System.out.println(teams[0][1]);
System.out.println(teams[1][0]);

System.out.println(teams[0].length);
System.out.println(teams[1].length);
System.out.println(Arrays.deepToString(teams));


int[][] nums= new int[3][4];

nums[0][0]=100;
nums[0][1]=34534;
nums[0][2]=343242;
nums[0][3]=7898;
nums[1][0]=1004;
nums[1][1]=34534;
nums[1][2]=342;
nums[1][3]=8942;
nums[2][0]=1004;
nums[2][1]=34534;
nums[2][2]=342;
nums[2][3]=8942;

System.out.println(Arrays.deepToString(nums));


int[][] scores= {{3,5,10},{7,8,9,10}};


System.out.println("Days played: "+scores[0].length);

System.out.println("Number of values in 1: "+ scores[0].length);
System.out.println("Number of values in 2: "+ scores[1].length);



int[][] values = new int[4][];
values[0]=new int[] {34,23,5};
values[1]=new int[] {34,23,5,45,34,56,67,78};

values[2][0]=55;
values[2][1]=88;
values[3]= new int[] {23,34,56,67,78};







	}

}
