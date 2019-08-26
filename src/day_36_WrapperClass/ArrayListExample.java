package day_36_WrapperClass;
import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> languages = new ArrayList<>();
languages.add("Mongolian");
languages.add("Russian");
languages.add("English");
languages.set(1, "Chinese");
System.out.println(languages.get(0));
System.out.println(languages.get(1));
System.out.println("Number of languages: "+languages.size());
languages.remove(1);
//System.out.println(languages.get(0));

System.out.println(languages.toString());



	}

}
