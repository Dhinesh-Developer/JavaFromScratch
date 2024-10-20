package com.pratice.oops;
class person{
	String name;
	person(String name){
		this.name = name;
		System.out.println(name);  // Kumar
	}
}
class Employee extends person{

	Employee(String name) {
		super(name);
	}

}
public class snippet2 {

	public static void main(String[] args) {
//		person p = new person("Kumar");
		Employee e = new Employee("Kumar");

	}

}
