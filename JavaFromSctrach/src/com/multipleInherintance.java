package com.pratice.oops;
interface printable{
	void display();
}
interface showable{
	void display();
}
class all implements printable,showable{
	@Override
	public void display() {
		System.out.println("Class ALL");
	}
}
public class multipleInherintance {

	public static void main(String[] args) {
		all a = new all();
		a.display();
	}

}
