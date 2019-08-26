package OCA_Quiz;

public class practice {
private char var;
	public static void main(String[] args) {
		
		char var1='a';
		char var2=var1;
		var2='e';
		practice ob1 = new practice();
		ob1.var='i';
		practice ob2=ob1;
		ob2.var='o';
		
		
		
		
		System.out.println(var1+", "+var2);
		System.out.println(ob1.var+", "+ob2.var);
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		Boolean[] bool = new Boolean[2];
		bool[0]=new Boolean(Boolean.parseBoolean("true"));
		bool[1]=new Boolean(null);
		System.out.println(bool[0]+" "+bool[1]);
		
		
		StringBuilder sb = new StringBuilder(5);
		String s="";
		System.out.println(sb.equals(s));
		System.out.println(sb.toString().equals(s.toString()));
		
		String str=" ";
		
		System.out.println("isEmpty: "+str.isEmpty());
		
		
		
		
		
		
		//Integer s=20;
		Integer m=30;
doSum(20,2);
doSum(20.0,30.0);
	}
	public static void doSum(int x, int y) {
		System.out.println("int: "+(x+y));
	}
public static void doSum(Integer x, Integer y) {
	System.out.println("integer: "+(x+y));
}
public static void doSum(double x, double y) {
	System.out.println("double: "+(x+y));
}
public static void doSum(float x, float y) {
	System.out.println("float: "+(x+y));
}
}
