package com.pratice.oops;
class Animal{  // super or base class
	void eat() {
		System.out.println("This animal can eat");
	}
}
class Dog extends Animal{   //derived class   single inheritance
	void barks() {
		System.out.println("The dogs barks");
	}
}
public class singleInherintance {
	public static void main(String[] args) {
    Dog d = new Dog();
    d.barks();
    d.eat();
	}

}
