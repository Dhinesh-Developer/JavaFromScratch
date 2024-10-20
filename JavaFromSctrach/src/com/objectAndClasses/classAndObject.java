package com.objectAndClasses;
// one class has many object
public class classAndObject {
 int coffee = 20;
 int tea = 25;
 
	public static void main(String[] args) {
		classAndObject co = new classAndObject();
		System.out.println("Coffee cost: "+co.coffee);
		classAndObject cao = new classAndObject();
		System.out.println("Tea cost: "+cao.tea);
		/*
		 * Coffee cost: 20
		   Tea cost: 25
		 */
	}

}
