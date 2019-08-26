package day_38_ArrayList;
import java.util.ArrayList;
import java.util.List;
public class ArrayListReplIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] r1= {"1","2","3"};
//		String[] r2= {"4","5"};
//
//		List<String> list = new ArrayList<>();
//		String sentence = "";
//		for (int i = 0; i < r1.length; i++) {
//			list.add(r1[i]);
//		}
//
//		for (int j = 0; j < r2.length; j++) {
//			list.add(r2[j]);
//		}
//
//		for (int i = 0; i < list.size(); i++) {
//			sentence = sentence + list.get(i);
//		}
//		System.out.println(sentence);
		
		List<Integer> num=new ArrayList<>();
		num.add(100);
		num.add(50);
		num.add(10);
		num.add(2);
		num.add(5);
		System.out.println(num);
		num.remove(1);
		System.out.println(num);
		//num.remove(0);
		//System.out.println(num);
	}

}
