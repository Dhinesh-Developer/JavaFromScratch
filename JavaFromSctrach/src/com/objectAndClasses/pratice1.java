package com.objectAndClasses;

import java.util.Scanner;
class school{
	String result(int mark) {
		return mark>=35?"pass":"Fail";
	}
}
public class pratice1 {
	String evenOrOdd(int num) {
		if(num%2==0) {
			return "The number is Even";
		}else {
			return "The number is odd";
		}
	}

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 pratice1 p = new pratice1();
		 System.out.println("Enter the number -");
		 int num = in.nextInt();
		 System.out.println("The Entered Number is - "+ p.evenOrOdd(num));
		 school s = new school();
		 System.out.println("Enter your score -");
		 int score = in.nextInt();
		 System.out.println("You result is - "+s.result(score));
	}

}
