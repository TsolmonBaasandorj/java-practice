package day_52_inheritance04;
import java.util.*;
public class FinalList {
	
	final static public String COLOR ="PINK";
	
	
	
public static void main(String[] args) {
	
	
	final ArrayList<String> COLORS = new ArrayList<>();
	COLORS.add("Orange");
	COLORS.add("Grey");
	COLORS.add("White");
	COLORS.add("Blue");
	System.out.println(COLORS);
	COLORS.add("Black");
	System.out.println(COLORS);
	//can not create new Object
	//COLORS = new ArrayList<>();//new Object
	//System.out.println(COLORS);
	//COLORS.add("Yellow");
	//System.out.println(COLORS);
	
	
	
}

    
}

