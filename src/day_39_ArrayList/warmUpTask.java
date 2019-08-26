package day_39_ArrayList;
import java.util.*;
public class warmUpTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> cities = new ArrayList<>();
        
        cities.add("Tokyo"); cities.add("New York");cities.add(0,"Paris");cities.add("Pittsburgh");cities.add(1,"Berlin");cities.add("Madrid");
        cities.add("Moscow");cities.add("Istanbul");cities.add("Washington D.C.");cities.add("Amsterdam");cities.add("Zurich");cities.add("Singapore");
        cities.add("Milan");cities.add("Toronto");cities.add("London");cities.add("Lima");
        
      //  System.out.println(cities.set(0, cities.get(1)));
        
        
        for(int i=0; i<cities.size(); i++) {
        	System.out.print("1: "+cities.get(i)+"|");
        }
        System.out.println();
        
        for(String a: cities) {
        	System.out.print("2: "+a+"|");
        }
        
        System.out.println();
        
        System.out.print("3: "+cities.toString().toUpperCase()+" ");
        
        System.out.println();
        
        for(int i=0; i<cities.size(); i++) {
        	String city=cities.get(i).toUpperCase();
        	cities.set(i, city);
        	}
        System.out.println("4: "+cities);
        
        int maxLength=0;
        int minLength=100;
        int indexMax=0;
        int indexMin=0;
        for(int i=0; i<cities.size(); i++) {
        	if(cities.get(i).length()>maxLength) {
        		maxLength=cities.get(i).length();
        		indexMax=i;
        	}
        	if(cities.get(i).length()<minLength) {
        		minLength=cities.get(i).length();
        		indexMin=i;
        	}
        }
        
        System.out.println("Max: "+cities.get(indexMax));
        System.out.println("Min: "+cities.get(indexMin));
        
        List<String> citiesMoreThan6= new ArrayList<>();
        
        for(int i=0; i<cities.size(); i++) {
        	if(cities.get(i).length()>6) {
        		citiesMoreThan6.add(cities.get(i));
        	}
        }
        System.out.println(citiesMoreThan6);
        
        
        
        
	}

}
