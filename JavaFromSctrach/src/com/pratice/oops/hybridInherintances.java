package com.pratice.oops;

// combination of two inheritances ex : multilevel and hieraical inheritances
class Animal3{
	void eat() {
		System.out.println("this animal eats");
	}
}
class Dog4 extends Animal3{
	void bark() {
		System.out.println("this animal barks");
	}
}
class puppy2 extends Dog4{
	void weep() {
		System.out.println("this animal weeps");
	}
}
class cat2 extends Animal3{
	void move() {
		System.out.println("this animal can move");
	}
}
public class hybridInherintances {
	public static void main(String[] args) {
    cat2 c = new cat2();
    c.eat();
    c.move();
    puppy2 p = new puppy2();
    p.bark();
    p.eat();
    p.weep();
	}
}
