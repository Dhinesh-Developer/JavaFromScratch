package com.objectAndClasses;
import java.util.Scanner;
class student{
	int marks;
	String name;
	// parameterized constructor
	public student(int marks,String name) {
		this.marks = marks;
		this.name = name;
		System.out.println(name+" your result is- "+marks);
	}
	// default constructor.
	public student() {
	System.out.println("This is default constructor ");
	}
	public student(int a,int b) {
		System.out.println("The sum is -"+(a+b));
		}
}
public class constructors {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		student s = new student(100,"Kumar");
		System.out.println(s.name);  // null  default value
	    student s1 = new student();
	    student s2 = new student(10,20);
		in.close();
	}
}
