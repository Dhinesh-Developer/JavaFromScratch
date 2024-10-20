package com.objectAndClasses;
// Functions in java , access using function name.
public class Functions {
	public static void greeting() {  // using the static keyword no need create a object
		System.out.println("Welcome");
	}
	void function() {   
		System.out.println("Function part");
		AllRounder();
	}
	void AllRounder() {
		System.out.println("I am all Rounder");
	}
	public static void main(String[] args) {
		Functions f = new Functions();
		greeting();
		f.function();
	}
}
