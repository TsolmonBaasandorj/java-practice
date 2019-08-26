package day_47_staticBlock;
import java.util.*;
public class CallingTV {
	  public static void main(String[] args) {
		  
		  
		  
		  Scanner scan=new Scanner(System.in);
			
			
			System.out.println("Please enter number");
			
			int number=scan.nextInt();
			
			System.out.println("Please enter number of digits");
			
			int digit=scan.nextInt();
			int sum=0;
			int temp=number;
			while(temp>0) {
				int value=temp%10;
				sum+=Math.pow(value,digit);
				temp=temp/10;
			}
			
		
			if(number==sum) {
				System.out.println("is a armstrong num");
			}else {
				System.out.println("is not armstrong num");
			}
			
		}
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
//		  
//		  int idx=1;
//		  int num=1;
//	  for(int i=0; i<5; i++) {
//		  for(int k=i ; k<4; k++) {
//			  System.out.print(" ");
//			  
//		  }
//		  for(int j=num; j<=idx; j++) {
//			  System.out.print(j+" ");
//			}
//		  idx+=2;
//		  num++;
//		  
//		  System.out.println();
	    
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  
          //palindrome number
//		  int m=12321;
//		  int n=12321;
//		  int reverse=0;
//		  while(n>0) {
//			  int remainder = n%10;
//			  reverse=reverse*10+remainder;
//			  System.out.println("reverse: "+reverse);
//			  n=n/10;
//		  }
//		  System.out.println(reverse);
//		  
//		  if(m==reverse) {
//			  System.out.println("is palindrome");
//		  }else {
//			  System.out.println("is not palindrome");
//		  }
		  
}
//    char c;
//
//    boolean b;
//
//    float f;
//
//void    printAll(   ) {
//
//    System.out.println("c = "+c);
//
//     System.out.println("b = "+b);
//
//     System.out.println("f = "+f);
//
// }

//public static void main(String[] args) {
//
//CallingTV f = new CallingTV();
//
//    f.printAll();
//
//}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int [] i= new int[45]; 
//	    i= populate(i) ;
//	    System.out.println(Arrays.toString(i));
//}public static void main(String m) {
//	System.out.println("hello");
//}
//	
//	public static int[] populate(int[] r) 
//	{
//		int idx=0;
//		int[] newArr= new int[r.length];//0.0.0.0.0
//		for(int i=0; i<newArr.length; i++) {
//			for(int j=idx+1; j<=newArr.length; j++) {
//			newArr[i]=j;
//			idx=j;
//			break;
//		}
//		}
//		return newArr;
//		
//		
	
	
