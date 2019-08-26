package day_38_ArrayList;
import java.util.ArrayList;
import java.util.List;
public class rawArrayList {

	public static void main(String[] args) {
	
 ArrayList list = new ArrayList();
list.add("Saturday");
list.add("Java Day");
list.add(12);
list.add(12.4);
list.add(true);
list.add(false);

System.out.println(list);

String allValues = list.toString();
System.out.println(allValues);

String str=list.get(0).toString();
System.out.println(str);
int n=(Integer)list.get(2);
System.out.println(n);

// All values are stored as a raw type. We can also call it, as a General Object type
	}

}
