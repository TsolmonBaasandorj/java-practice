package day_49_inheritance02_2;

import java.util.Arrays;

import day_49_inheritance02.Device;
import day_49_inheritance02.Ebook;
import day_49_inheritance02.TV;

public class OverSeasFactory {

	public static void main(String[] args) {
		
Device dv = new Device();
dv.brand="Samsung";
//dv.model ="3200".not visible
//dv.price=1000; not visible
//dv.country="Usa"; not visible


TV t = new TV();
t.brand="Apple";
t.watch();
Ipad i = new Ipad();
i.brand="LG";
i.readEBook("Java");

Ebook n = new Ebook();
n.setAuthor("Haku");
n.setTitle("Management");
n.setPages(12);
n.setSize(200);
n.readEBook(20);
	}

}
