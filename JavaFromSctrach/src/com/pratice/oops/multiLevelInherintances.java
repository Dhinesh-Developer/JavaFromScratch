package com.pratice.oops;
import java.lang.System;
// Multi-level Inheritances
class A{
	int one = 1;
}
class B extends A{
	int two = 2;
}
class C extends B{
	int three = 3;
}

// real time examples
class Animal1{
	void eat() {
		System.out.println("this animal eats");
	}
}
class Dog1 extends Animal1{
	void bark() {
		System.out.println("this animal barks");
	}
}
class puppy extends Dog1{
	void weep() {
		System.out.println("this animal weeps");
	}
}
public class multiLevelInherintances {

	public static void main(String[] args) {
		C ob = new C();
		System.out.println(ob.two);
		System.out.println(ob.three);
		System.out.println(ob.one);


		//real time
		puppy p = new puppy();
		p.bark();
		p.eat();
		p.weep();
		/* output.
2
3
1
this animal barks
this animal eats
this animal weeps
		 */

	}

}
