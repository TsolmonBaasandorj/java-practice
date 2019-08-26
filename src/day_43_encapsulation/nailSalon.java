package day_43_encapsulation;

import java.util.ArrayList;

import day_34_methodContinue.main;

public class nailSalon {
private String service;
private int price;
private String server;

public nailSalon(String service, String server, int price) {
this.price=price;
this.service=service;

if(server.equals("Kimmie") || server.equals("Laura") || server.equals("Mel")) {
	this.server=server;
}else {
this.server="unknown";}}

public String getService() {
	return service;
}
public void setService(String service) {
	this.service = service;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}


public String getServer() {
	return server;
}
public void setServer(String server) {
	this.server = server;
}
@Override
public String toString() {
	return "nailSalon [service=" + service + ", price=" + price + ", server=" + server + "]";
}
public String total(String service) {
	this.service=service;
	if(service.equals("manicure")) {
		return service +" is 16";
	}
	if(service.equals("pedicure")) {
		return service +" is 30";
	}
	if(service.equals("gel")) {
		return service+" is 40";
	}
	if(service.equals("maniAndpedi")) {
		return service+ " is 41";
	}
	
	return "Invalid service!";
	
}
public void setServiceInfo(String service,int price,String server) {
	setService(service);
	setPrice(price);
	setServer(server);
}

public static void repeatAL(ArrayList<Boolean> list){
	 int n=list.size();
		
		//            3,
		for(int i=0; i<n; i++) {
			list.add(list.get(i));
			}
		
		System.out.println(list);
	
	}
public static void main(String[] args) {
	  int[] arr = {10, 20, 30};
      int size =arr.length;
      int idx = 0;
      
         
                               

      do {                                                              
           idx++;   
           System.out.println("idx: "+idx);
     } while( idx < size -1);                                        
//                      //2
    System.out.println( arr[idx]);
	
	
	
	
	
//	ArrayList<Boolean> arr=new ArrayList<>();
//	arr.add(true);
//	arr.add(false);
//	arr.add(false);
//	repeatAL(arr);
}

}


