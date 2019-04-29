package day20_ForLoops;

import java.util.ArrayList;
import java.util.Scanner;

public class neighbours {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//Scanner scan = new Scanner(System.in);
//System.out.println("Enter word: ");
//String word=scan.next();
//
//for(int i=0; i<word.length()-1;i++) {
//	if(word.charAt(i)==word.charAt(i+1)) {
//		System.out.println("beep-" + word.charAt(i));
//	
//}
//	}
//

//     *
//    * *
//   * * *
//  * * * *
// * * * * *
 
 for(int i=0; i<5; i++) {
	 for(int j=0; j<5-i; j++) {
		 System.out.print(" ");
	 }
	 for(int k=0; k<i+1; k++) {
		 System.out.print("* ");
	 }
	 System.out.println();
 }

	}
}
