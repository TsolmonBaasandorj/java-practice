package day_37_ArrayList;

import java.util.ArrayList;

public class MyCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> myCities = new ArrayList<>();
myCities.add("Darkhan");
myCities.add("Erdenet");
myCities.add("Ulaanbaatar");
myCities.add("Sterling");
myCities.add("Arlington");
myCities.add("Sterling");


for(String city: myCities) {
	System.out.print(city+ " ");
}
System.out.println();
for(int i=0; i<myCities.size(); i++) {
	System.out.print(myCities.get(i)+" ");
	
	
}
System.out.println();
myCities.remove("Sterling");
System.out.println(myCities);

System.out.println("Is list empty? "+myCities.isEmpty());
myCities.add(0,"Bishkek");
//myCities.add(1,"Nursultan");
System.out.println(myCities);

myCities.set(0, "UB");
System.out.println(myCities);

int idx = myCities.indexOf("Erdenet");
System.out.println(idx);
myCities.set(idx, "Bulgan");
System.out.println(myCities);
myCities.clear();
System.out.println(myCities.isEmpty());

	}

}
