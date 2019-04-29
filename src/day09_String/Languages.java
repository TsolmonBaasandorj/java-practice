package day09_String;

public class Languages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int option = 4;
//		
//		if(option==1) {
//			System.out.println("Hello!");
//		}else if(option==2) {
//			System.out.println("Hola!");
//		}else if(option==3) {
//			System.out.println("Merhaba!");
//		}else if(option==4) {
//			System.out.println("Sain uu!");
//		
//		
//		
//		
//		}else if (option==5)	{
//			System.out.println("Privet!");
//		}else if (option==6)	{
//			System.out.println("Yiasou!");
//		}
//		
		
		
		
		countCode("coAcodeBcoleccoreDD");
		
	}
	
	public static int countCode(String str) {
		
		  String temp= str;
		  if(temp.contains("co"))
			  temp=str.substring(str.indexOf("co"));;
		  
		  int count=0;
		  System.out.println("=="+temp);
		  while(temp.contains("co")&&temp.length()>3){
			   System.out.println("start:"+temp);
		    if(temp.charAt(3)=='e'){
		      count++;
		      System.out.println(count);
		    }
		    temp=temp.substring(1);
		    System.out.println("en:"+temp);
		    if(temp.contains("co"))
		    temp=temp.substring(temp.indexOf("co"));
		    System.out.println("end:"+temp);
		    System.out.println();
		  }
		  return count;
		}





	private String str;

		
	


String temp= str;
if(temp.contains("co"))
	  temp=str.substring(str.indexOf("co"));;
int count=0;
while(temp.contains("co")&&temp.length()>3){
  if(temp.charAt(3)=='e'){
    count++;
  }
  temp=temp.substring(1);
  if(temp.contains("co"))
  temp=temp.substring(temp.indexOf("co"));

























