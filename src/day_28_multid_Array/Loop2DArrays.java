package day_28_multid_Array;

import java.util.Arrays;

public class Loop2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] pizzas ={ {"pineapple", "pepperoni"},
		             {"anchovies", "mushroom", "olives"},
		             {"4 cheese"},
		             {"tomatoes", "chiken", "japalenios","onions"},
		             {"green peppers", "zuccini","brocolli","spinach","shrimp"}};

for(String[] a: pizzas) {
	System.out.print(a.length+"-");
	System.out.println(Arrays.toString(a));
}
System.out.println();

for(int i=0; i<pizzas.length; i++) {
System.out.println(pizzas[i].length+" - "+Arrays.toString(pizzas[i]));
}
int[][] students = {{4,5,6}, {7,8,9},{10,11,12}};

for(int i=0; i<students.length; i++) {
	for(int j=0; j<students[i].length; j++) {
		System.out.print(students[i][j]);
	}
}

	}

}
