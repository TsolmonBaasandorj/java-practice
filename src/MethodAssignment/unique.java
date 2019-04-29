package MethodAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 2, 1, 5, 5, 3, 34, 8, 8,7};

		int count = 0;
		
		List<Integer> list= new ArrayList<>();

		
			for (int i = 0; i < num.length; i++) {
				count = 0;
				for (int j = 0; j < num.length; j++) {
					if (num[i] == num[j]) {
						count++;
					}
				}
				if (count == 1) {
					System.out.println(num[i]);
					list.add(num[i]);}
		}

		System.out.println(list);
		

	}

}
