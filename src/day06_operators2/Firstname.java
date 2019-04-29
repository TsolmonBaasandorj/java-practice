package day06_operators2;

import java.util.Scanner;

public class Firstname {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name ? ");
		String firstName = scan.nextLine();
		System.out.println("Nice to meet you " + firstName + "!");
	}

}

