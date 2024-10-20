package com.pratice.oops;
class laptop{
	String name ="asus";
}
class bike{
	String name ="FZ";
}
class dad{
	int money = 1000000;
}
class son extends dad{
	
}
public class inheritanace {
	public static void main(String[] args) {
		laptop l = new laptop();
		System.out.println(l.name);   //asus
		bike b = new bike();
		System.out.println(b.name);   //FZ
		son s = new son();
		System.out.println(s.money);  //1000000
	}
}
