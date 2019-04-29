package Day_29_Method;

import java.util.Arrays;

public class warmUpExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] countries = { { "USA", "Washington DC" }, { "Canada ", "Ottawa" }, { "Mexico", "Mexico City" },
				{ "Brasil", "Brasilia" }, { "Peru", "Lima" }, { "Argentina", "Boanes Aeros" }, { "Bolivia", "La Paz" },
				{ "Macedonia", "Scopia" }, { "KAZAKHSTAN", "Nursultan" } };

		for (int i = 0; i < countries.length; i++) {
			for (int j = 0; j < countries[i].length; j++) {
				if(countries[i][j].equals("Washington DC")) {
					System.out.println("Yes");
				}
			}
			
		}

		for (int i = 0; i < countries.length; i++) {
			System.out.println(countries[i][0] + "|");
		}
		System.out.println(countries[0][0]);

		String[] newCity = new String[9];

		for (int i = 0; i < countries.length; i++) {
			newCity[i] = countries[i][1];
		}

		System.out.println(Arrays.deepToString(newCity));

		for (int i = 0; i < countries.length; i++) {
			if (countries[i][0].equals("Bolivia")) {
				if (countries[i][1].equals("La Paz")) {
					System.out.println("Bolivia test passed");
				} else
					System.out.println("Bolivia test failed");
				break;
			}

		}

	}
}
