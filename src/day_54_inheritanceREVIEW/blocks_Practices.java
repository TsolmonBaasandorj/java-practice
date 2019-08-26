package day_54_inheritanceREVIEW;

public class blocks_Practices {
static String names;
String school;
int num1=10;
static int num2=20;

static {
	System.out.println("<Static Block> ");
	names="John";
}
public blocks_Practices() {
	System.out.println("<Constructor> ");
	names="Murodil";
	school="CyberTek";
}

{
	System.out.println("<Init Block>");
	names="Aaron";
	school="CUA";
}

public static void main(String[] args) {
	System.out.println(names);
	blocks_Practices obj = new blocks_Practices();
	System.out.println(obj.names);
	System.out.println(obj.school);
	System.out.println("Init num1: "+obj.num1);
    System.out.println("Static num2: "+num2);
    num2=100;
    obj.num1=1000;
    System.out.println("Init num1: "+obj.num1);
    System.out.println("Static num2: "+num2);

    blocks_Practices obj2 = new blocks_Practices();
    System.out.println("Init num1: "+obj2.num1);
    System.out.println("Static num2: "+num2);
}

}
