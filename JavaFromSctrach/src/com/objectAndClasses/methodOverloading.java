package com.objectAndClasses;
// Method Overloading.
//  it work based on function name ,return type and parameter.
public class methodOverloading {
	void display() {
		System.out.println("hello world");
	}
	void display(String name) {
		System.out.println("hai "+name);
	}
	int display(int a) {
		int b = a;
		return a+b;
	}
	int display(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		methodOverloading mo = new methodOverloading();
		mo.display();
		mo.display("Kumar");
		System.out.println("The sum is - "+mo.display(2));
		System.out.println("The sum is - "+mo.display(10,20));
	}

}
