package day_47_staticBlock;

public class VariableAccess {
	int myInstanceVar=40;
	static int myStaticVariable = 55;
public static void main(String[] args) {
	VariableAccess n = new VariableAccess();
	System.out.println(n.myInstanceVar);
	System.out.println(n.myStaticVariable);
	System.out.println(VariableAccess.myStaticVariable);
	
	
}
}
