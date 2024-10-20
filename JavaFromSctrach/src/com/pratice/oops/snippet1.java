package com.pratice.oops;
class Animal4{
	String name;
	int age;
	void makeSound() {
		System.out.println("Animal makes Sound");
	}
}
class Dog5 extends Animal4{
	String breed;
	@Override
	void makeSound() {
		System.out.println("Dogs barks");
	}
	void fetch() {
		System.out.println("dog is fetching");
	}
}
class cat3 extends Animal4{
	String color;
	@Override
	void makeSound() {
		System.out.println("Cat is meow....");
	}
	void climb() {
		System.out.println("cat is climbing...");
	}
}
public class snippet1 {
	public static void main(String[] args) {
		Dog5 d = new Dog5();
		d.name = "Eagle";
		d.age = 7;
		d.makeSound();
		d.breed = "Golden";
		d.makeSound();
		d.fetch();
		
		cat3 c = new cat3();
		c.color = "black";
		c.climb();
		c.makeSound();
		System.out.println(c.color);
		System.out.println(d.name);
		System.out.println(d.age);
/* output.
 * Dogs barks
Dogs barks
dog is fetching
cat is climbing...
Cat is meow....
black
Eagle
7		
 */
		
	}

}
