package oops.abstraction;

public class Demo {

	public static void main(String[] args) {
		
		Sprint3 obj = new Sprint3(); // Sprint 3 is on abstarct class
		
		obj.compose();
		obj.send();
		obj.attachment();
		obj.reply();obj.forward();
		
		
		Outlook obj2 =  new Sprint3();
		
		obj2.compose();
		obj.attachment();
		obj.forward();
		obj.reply();
		
	}

}
