package day07_scanner_operators;

public class PreAndPost2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int messages = 10;
messages++;
++messages;
System.out.println("Messages: " + messages);


int readMessages = --messages;
System.out.println("ReadMessages: " + readMessages);
System.out.println("Messages: " + messages);





int unreadMessages = readMessages--;
System.out.println("unreadMessages: " + unreadMessages);
System.out.println("readMessages: " + readMessages);

int total = unreadMessages++ - readMessages--;
System.out.println("unreadMessages: " + unreadMessages);
System.out.println("readMessages: " + readMessages);
System.out.println("total: " + total);




int count = 20;
int count2 = 10;

int totalCount = ++count + --count2;
System.out.println("count: " +count);
System.out.println("count: " +count2);
System.out.println("totalCount: " +totalCount);



               //21 ->22->23
int myCount = count++ + ++count;
System.out.println("count: " + count);
System.out.println("myCount: " + myCount);








	}

}
