package day26_arrayContinue;

import java.util.Arrays;
import java.util.Random;

public class day_26WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[]PopularNames= {
		"James","Mary",
		"John","Patricia",
		"Robert","Jennifer",
		"Michael","Linda",
		"William","Elizabeth",
		"David","Barbara",
		"Richard","Susan",
		"Joseph","Jessica",
		"Thomas","Sarah",
		"Charles","Margaret",
		"Christopher","Karen",
		"Daniel","Nancy",
		"Matthew","Lisa",
		"Anthony","Betty",
		"Donald","Dorothy",
		"Mark","Sandra",
		"Paul","Ashley",
		"Steven","Kimberly",
		"Andrew","Donna",
		"Kenneth","Emily",
		"George","Carol",
		"Joshua","Michelle",
		"Kevin","Amanda",
		"Brian","Melissa",
		"Edward","Deborah",
		"Ronald","Stephanie",
		"Timothy","Rebecca",
		"Jason","Laura",
		"Jeffrey","Helen",
		"Ryan","Sharon",
		"Jacob","Cynthia",
		"Gary","Kathleen",
		"Nicholas","Amy",
		"Eric","Shirley",
		"Stephen","Angela",
		"Jonathan","Anna",
		"Larry","Ruth",
		"Justin","Brenda",
		"Scott","Pamela",
		"Brandon","Nicole",
		"Frank","Katherine",
		"Benjamin","Samantha",
		"Gregory","Christine",
		"Raymond","Catherine",
		"Samuel","Virginia",
		"Patrick","Debra",
		"Alexander","Rachel",
		"Jack","Janet",
		"Dennis","Emma",
		"Jerry","Carolyn",
		"Tyler","Maria",
		"Aaron","Heather",
		"Henry","Diane",
		"Jose","Julie",
		"Douglas","Joyce",
		"Peter","Evelyn",
		"Adam","Joan",
		"Nathan","Victoria",
		"Zachary","Kelly",
		"Walter","Christina",
		"Kyle","Lauren",
		"Harold","Frances",
		"Carl","Martha",
		"Jeremy","Judith",
		"Gerald","Cheryl",
		"Keith","Megan",
		"Roger","Andrea",
		"Arthur","Olivia",
		"Terry","Ann",
		"Lawrence","Jean",
		"Sean","Alice",
		"Christian","Jacqueline",
		"Ethan","Hannah",
		"Austin","Doris",
		"Joe","Kathryn",
		"Albert","Gloria",
		"Jesse","Teresa",
		"Willie","Sara",
		"Billy","Janice",
		"Bryan","Marie",
		"Bruce","Julia",
		"Noah","Grace",
		"Jordan","Judy",
		"Dylan","Theresa",
		"Ralph","Madison",
		"Roy","Beverly",
		"Alan","Denise",
		"Wayne","Marilyn",
		"Eugene","Amber",
		"Juan","Danielle",
		"Gabriel","Rose",
		"Louis","Brittany",
		"Russell","Diana",
		"Randy","Abigail",
		"Vincent","Natalie",
		"Philip","Jane",
		"Logan","Lori",
		"Bobby","Alexis",
		"Harry","Tiffany",
		"Johnny","Kayla"};	

System.out.println("Total names: "+PopularNames.length);

System.out.println(Arrays.toString(PopularNames));

for(int i=0; i<PopularNames.length-1; i++) {
	System.out.println(PopularNames[i]+" "+PopularNames[i+1]);
}
String maleName="";
String femaleName="";
int count=0;

for(int i=0; i<PopularNames.length-1; i++) {
	
	if(i%2==0) {
		maleName+=PopularNames[i]+", ";
		count++;
		
	}else
		femaleName+=PopularNames[i]+", ";
        
       
	
		
}

System.out.println("All male name: "+maleName);
System.out.println("All female name: "+femaleName);

System.out.println("count: "+count);

Random random = new Random();
int r = random.nextInt(PopularNames.length);
System.out.println("Random name: "+ PopularNames[r]);

for(int i=0; i<PopularNames.length; i++) {
	if(PopularNames[i].length()<=4) {
		System.out.print(PopularNames[i].toUpperCase()+", ");}
}


String names3to4 = "";
String names5to6 = "";
String names7to8 = "";


for(int i=0; i<PopularNames.length; i++) {
	if(PopularNames[i].length()>=3 && PopularNames[i].length()<=4) {
		names3to4+=PopularNames[i]+", ";
	}if(PopularNames[i].length()>=5 && PopularNames[i].length()<=6) {
		names5to6+=PopularNames[i]+", ";
	}if(PopularNames[i].length()>=7 && PopularNames[i].length()<=8) {
		names7to8+=PopularNames[i]+", ";
	}
}
System.out.println("Names length 3 to 4: "+ names3to4);
System.out.println("Names length 5 to 6: "+ names5to6);
System.out.println("Names length 7 to 8: "+ names7to8);


for(int i=0; i<PopularNames.length; i+=2) {
	String temp=PopularNames[i];
	PopularNames[i]=PopularNames[i+1];
	PopularNames[i+1]=temp;
	
}
System.out.println(Arrays.toString(PopularNames));









	}

}
