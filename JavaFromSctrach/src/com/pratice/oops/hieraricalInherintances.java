package com.pratice.oops;
// one superclass extends two sub class
class Animal2{  
	void eat() {
		System.out.println("this animal eats");
	}
}
class Dog3 extends Animal2{
	void bark() {
		System.out.println("this animal barks");
	}
}
class cat extends Animal2{
	void move() {
		System.out.print("this animal can move");
	}
}
public class hieraricalInherintances {

	public static void main(String[] args) {
    cat c = new cat();
    c.eat();
    c.move();
	}

}
