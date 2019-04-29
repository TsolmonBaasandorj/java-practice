package day_28_multid_Array;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class fastFoodRestaurants {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		
//		System.out.println("Data size: " + data.length);
//		
//		System.out.println(data[0]);
//		System.out.println(data[1]);
//		System.out.println(data[data.length-1]);
//		int counter=0;
//		for(String a: data) {
//			System.out.println("#"+counter+"=>"+a);
//			counter++;
//		}
//		System.out.println(counter);
//		int count=0;
//		for(String b: data) {
//			if(b.contains(",VA,")) {
//				System.out.println(b);
//				count++;
//			}
//		}
//		System.out.println(count);
		
		for(String c: data) {
			if(c.contains(",VA,")) {
				String[] resArr = c.split(",");
				System.out.println(resArr[2]+" - "+resArr[1]);
			}
			
		}
		
		
	}

}
