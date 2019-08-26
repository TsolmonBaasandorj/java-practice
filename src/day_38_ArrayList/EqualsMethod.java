package day_38_ArrayList;
import java.util.*;
public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//List<String> friend1 = new ArrayList<>();
//List<String> friend2 = new ArrayList<>();
//
//friend1.add("Roman");friend1.add("Orhan");friend1.add("Natalia");friend1.add("Elizabeth");
//
//friend2.add("Roman");friend2.add("Natalia");friend2.add("Orhan");friend2.add("Elizabeth");
//
//if(friend1.equals(friend2)) {
//	System.out.println("Same friends!");
//}else {
//	System.out.println("Different friends!");
//}
//int index=0;
//if(!friend1.equals(friend2)) {
//for(int i=0; i<friend1.size(); i++) {
//	for(int j=0; j<friend2.size(); j++) {
//		if(!friend1.get(i).equals(friend2.get(j))) {
//			index=i;
//		}
//	}
//
//}
//}
		ArrayList<String> wordList = new ArrayList<>();
		wordList.add("hi");
		wordList.add("hey");
		wordList.add("hi");
		wordList.add("yo");
		wordList.add("hi");
		wordList.add("hi");
		wordList.add("hi");
		
		String targetWord="hi";
		
		for(int i=0; i<wordList.size();i++) {
			if(wordList.get(i).equals(targetWord)) {
				wordList.remove(targetWord);
			}
		}
		System.out.println(wordList);
		
	}
public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String>wordList2){
	ArrayList<String> combineAL= new ArrayList<>();
	for(int i=0; i<wordList1.size(); i++) {
		combineAL.add(wordList1.get(i));
	}
	for(int j=0; j<wordList2.size(); j++) {
		combineAL.add(wordList2.get(j));
	}
	
	return combineAL;}
public static void removeAll(ArrayList<String> wordList , String targetWord){
	while(wordList.contains(targetWord)) {
	 for(int i=0; i<wordList.size(); i++) {
		 if(wordList.get(i).equals(targetWord)) {
			 wordList.remove(i);
		 }
	 }
	}
	 System.out.println(wordList);
	}
public static ArrayList<Integer> appendPosSum(ArrayList<Integer> num){
	  ArrayList<Integer> posNum = new ArrayList<>();
	  int sum=0;
	  for(int i=0; i<num.size(); i++){
	    if(num.get(i)>0){
	      posNum.add(num.get(i));
	      sum=sum+num.get(i);
	    }
	  }
	  posNum.add(sum);
	  return posNum;
	}
}
