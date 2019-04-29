package day16_stringManupulation;

public class capitalCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Moscow is a capital of Russia";  

		//Baku , Azarbaijan

System.out.println(str.replace("Moscow", "Baku").replace("Russia","Azerbaijan"));
System.out.println();

String email = "Tsolmon_Baasandorj@gmail.com";

String company = "google";

String newEmail = email.replace("gmail", company);
System.out.println(newEmail);


	}

}
