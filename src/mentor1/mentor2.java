package mentor1;

import java.util.Arrays;

public class mentor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/////<Print Unique Word>/////
		
//			String[] words= {"apple", "pear", "pear", "apple", "watermelon", "orange", "computer", "colour", "watermelon"};
//			
//			
//			
//			int countUnique=0;
//			
//			for(int i=0; i<words.length; i++) {
//				 countUnique=0;
//				for(int j=0; j<words.length; j++) {
//					if(words[i].equals(words[j])) {
//						countUnique++;}
//					
//				}
//				
//				if(countUnique==1) {
//					System.out.print(words[i]+" ");
//				}
//			}
			
			System.out.println();

	////<Print Unique Words>/////
		
		String[] numbers = {"java, code, python, code, rust, code, rust" };
		
		
		String str = Arrays.toString(numbers);
		
		System.out.println(str);
		
		str = str.replace("[", "");
		str = str.replace("]", "");
		
		System.out.println(str);
     
		String[] newArr = str.split(", ");
		
	System.out.println(newArr[0]);
		int count = 0;
		
		for (int i = 0; i < newArr.length; i++) {
			count = 0;
			for (int j = 0; j < newArr.length; j++) {
				if (newArr[i].equals(newArr[j])) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(newArr[i]+" ");
			}

		}

		
	
/////<Print word that contains "a" letter>//////
	//	[apple, table, banana]
//		String [] word = {"apple", "book", "table", "melon", "banana", "flower" };
//		
//		
//		int countA=0;
//		for(int i=0; i<word.length; i++) {
//			if(word[i].contains("a")) {
//				countA++;
//			}
//		}
//		
//		String[] newWord=new String[countA];
//		
//		int index=-1;
//		System.out.println(Arrays.toString(newWord));
//		
//		for(int i=0; i<newWord.length; i++) {
//			for(int j=index+1; j<word.length; j++) {
//				if(word[j].contains("a")) {
//					newWord[i]=word[j];
//					index=j;
//					break;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(newWord));
//		
//		
		
	}
}
