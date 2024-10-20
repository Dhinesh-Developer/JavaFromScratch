package com.pratice.oops;
// super method means calling parent constructor.
// first parent will execute after that only child class execute.
class Animal6{
	public Animal6(String name) {
		System.out.println("Animal "+name);
	}
	void makesound() {
		System.out.println("Animals makes sound");
	}
	int age = 25;
}
class Dog6 extends Animal6{
	public Dog6() {
		super("Lion");
		super.makesound();
		System.out.println(super.age);
		System.out.println("Dog");
	}
}
public class superKeyword {

	public static void main(String[] args) {
		Dog6 d = new Dog6();
/*
 * Animal Lion
Animals makes sound
25
Dog
		
 */
	}
}
