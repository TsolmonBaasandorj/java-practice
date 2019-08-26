package OverRideHaku;
import java.util.*;
public class bbb{
	public List<aaa> list;

public bbb(aaa... s) {
	list=new ArrayList<>();
	for(int i=0; i<s.length; i++) {
		list.add(s[i]);
	}
	
}
public aaa obj(String a) {
	for(int i=0; i<list.size(); i++) {
		if(list.get(i).getName().equals(a)) {
			return list.get(i);
		}
	}
	return null;
}

public List<Integer> obj(double pr) {
	List<Integer> newList = new ArrayList<>();
	for(int i=0; i<list.size(); i++) {
		if(list.get(i).getPrice()==pr) {
			newList.add(i);
		}
	}
	return newList;
}
public void remove(String b) {
	for(int i=0; i<list.size(); i++) {
		if(list.get(i).getName().equals(b)) {
			list.remove(i);
		}
	}
}






}
