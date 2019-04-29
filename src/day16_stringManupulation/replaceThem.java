package day16_stringManupulation;

public class replaceThem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sentence = "Coding is fun, it is my hobby!!";
String withNoSpace = sentence.replaceAll(" ", "");
System.out.println(withNoSpace);
System.out.println(sentence.replaceAll("hobby", "work"));

String mixed="&^@#$ja-vla@#$";
mixed = mixed.replace("&^@#$", "");
System.out.println(mixed);
mixed=mixed.replace("-", "");
System.out.println(mixed);
mixed=mixed.replace("l", "");
System.out.println(mixed);
mixed=mixed.replace("@#$", "");
System.out.println(mixed);


String result="About 115,000,000 results 0.60 seconds";
result=result.replace("About ", "");
System.out.println(result);
result=result.substring(0, result.indexOf(" "));
System.out.println(result);
	}

}
