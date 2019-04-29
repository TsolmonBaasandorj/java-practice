package mentor1;

import java.util.Arrays;
import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//String email="info@cybertekschool.com";
//String[] newWord=email.split("@");
//System.out.println(Arrays.toString(newWord));
//		for(int i=0; i<newWord.length; i++) {
//
//			System.out.println("Email id: "+newWord[i]);
//			return;
//			//System.out.println("Email domain: ");
//		}
		String date = "";
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		int day = scan.nextInt();
		int year = scan.nextInt();
		String[] monthWords = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		String[] numbersLessThanTen = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };
		String[] numbersBetweenTenAndTwenty = { "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
				"Seventeen", "Eighteen", "Nineteen" };
		String[] multiplesOfTen = { "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
		String[] yearWords = { "Hundred", "Thousand" };

		
		date = monthWords[month - 1] + " ";

		if (day < 10) {
			date = date + numbersLessThanTen[day - 1] + " ";
		} else if (day > 10 && day < 19) {
			date = date + numbersBetweenTenAndTwenty[day % 10 - 1] + " ";
		} else if (day >= 20) {
			date = date + " " + multiplesOfTen[day / 10 - 2] + " " + numbersLessThanTen[day % 10 - 1] + " ";}
		
		int firstDigit=(year/1000);
		int secondDigit=(year/100)%10;
		int thirdDigit=(year/10)%10;
		int forthDigit=(year%10);
		
		if(year>=1000) {
			date=date+numbersLessThanTen[firstDigit-1] +" "+ yearWords[1]+" ";}
		
		if(secondDigit==0) {
			date=date;
		}else {
			date=date+numbersLessThanTen[secondDigit-1]+" "+yearWords[0]+" ";}
		if(thirdDigit==0) {
			date=date+numbersLessThanTen[forthDigit-1];
		}
		if(thirdDigit==1 && forthDigit==0) {
			date=date+numbersLessThanTen[9];
		}else if((thirdDigit*10 + forthDigit)>=10 && (thirdDigit*10 + forthDigit)<20) {
			date=date+numbersBetweenTenAndTwenty[forthDigit];
		}else {
			date=date+multiplesOfTen[thirdDigit-2]+" ";
			date=date+numbersLessThanTen[forthDigit-1];
		}
		System.out.println(date);

	}

}
