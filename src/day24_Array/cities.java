package day24_Array;

import java.util.Arrays;

public class cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] cities = {"Washington D.C.", "Kiev", "Annandale","Moscow","Istanbul",
		"Baku","Miami","Silver Spring", "Mclean"};
for(int i=0; i<cities.length;i++) {
	if(cities[i].startsWith("M")) {
		System.out.println(cities[i]);
	}
	
}

	}

}
