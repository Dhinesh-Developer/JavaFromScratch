package com.pratice.oops;
class person1{
	public String name;
	protected int age;
	private String socialSecurityNumber;
	String address;
	public person1() {
	}
	public person1(String name,int age,String ssn,String address) {
		this.name = name;
		this.age = age;
		this.socialSecurityNumber = ssn;
		this.address = address;
	}
}
class Employee1 extends person1{
	public Employee1(String name,int age,String ssn,String address) {
		super(name,age,ssn,address);
		System.out.println("Hai");
	}
}
public class snippet3 {

	public static void main(String[] args) {
		person1 p = new person1();
		Employee1 e = new Employee1("Kumar",20,"034","VBM");
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.address);
		//error System.out.println(e.socialSecurityNumber);
		
	}

}
