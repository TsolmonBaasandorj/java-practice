package day24_Array;

public class firstAndlastValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] number= {20,6,1,2,3,4,5,6,20,50,40,40};
             
	if(number[0]==number[number.length-1]) {
		System.out.println("true");
	}else 
		System.out.println("false");
		int count=0;

		
		for(int i=0; i<number.length;i++) {
	if(number[i]==40) {
		count++;
	}
}
System.out.println(count);
	}

}
