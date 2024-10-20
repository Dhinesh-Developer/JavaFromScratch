package com.pratice.oops;
abstract class Vehicle{
	abstract void speed();
	void brand() {
		System.out.println("FZ");
	}
}
class Bike extends Vehicle{

	@Override
	void speed() {
		System.out.println("50km/h");
	}

}
public class AbstractMethodAndClass {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.brand();
		b.speed();
	}

}
