package com.pratice.oops;
// this will mainly used for speed up the resources.
class student{
	int marks = 0;
	static String teacher = "Kumar";
	
	static {
		System.out.println("This will first display");
	}
	
	static void dis() {
		System.out.println("Hai");
	}
}
public class static_Keyword {
	static int a  =20;
	public static void main(String[] args) {	
		student s = new student();
		s.marks =90;  
		student s2 = new student();
		student.teacher = "DhineshKumar";  // correct way to access the static 
		System.out.println(s.marks);
		System.out.println(s2.teacher);
		student.dis();
		System.out.println(a);
/*
 * This will first display
90
DhineshKumar
Hai
20

 */
		
	}

}
