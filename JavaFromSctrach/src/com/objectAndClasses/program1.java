package com.objectAndClasses;
// classes and object.
class laptop{
	String name = "";
	String processor = "";
	int ram = 0;
	int price = 0;
}
public class program1 {

	public static void main(String[] args) {
		
		laptop l = new laptop();
		l.name = "Asus";
		l.processor = "inteli5";
		l.ram = 8;
		l.price = 50000;
		
		laptop l2 = new laptop();
		l2.name = "Victus";
		l2.processor = "inteli6";
		l2.ram = 12;
		l2.price = 70000;
		
		System.out.println(l.name);
		System.out.println((l2.processor));
	}

}
