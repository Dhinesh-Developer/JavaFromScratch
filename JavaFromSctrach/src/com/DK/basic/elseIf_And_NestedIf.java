package com.DK.basic;

import java.util.Scanner;

public class elseIf_And_NestedIf {

	public static void main(String[] args) {
		
		// else if statements.
		Scanner in = new Scanner(System.in);
		String color = in.next();
		if(color.equals("red")) {
			System.out.println("Traffic color is red");
		}else if(color.equalsIgnoreCase("yellow")) {
			System.out.println("Traffic color is yellow");
		}else {
			System.out.println("Traffic color is green");
		}
		
		//Nested if statements.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the salary: ");
		int salary = in.nextInt();
		System.out.println("Enter the Age: ");
		int age = in.nextInt();
		System.out.println("Enter the Loan Amount: ");
		int loan = in.nextInt();

		if(salary>20000 || age < 25) {
			if(loan <= 50000) {
				System.out.println("Loan is Available "+loan);
			}else {
				System.out.println("Loan in Not Available: "+loan);
			}
		}else {
			System.out.println("You are not eligible to get loan");
		}
	}

}
