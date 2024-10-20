package com.DK.basic;

import java.util.Scanner;

// String A - Z.
public class StringAtoZ {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Checking reference are equal it will store in String pool .
		// it will store in heap segment inside String pool
		String s1 = "Kumar";
		String s2 = "Kumar";
		System.out.println(s1==s2);   //output = true
		
		// it will store in heap part , creating a new Address
		String s3 = new String("Kumar");
		System.out.println(s3);  // this also String output = Kumar
		String s4 = new String("Kumar");
		if(s3==s4)   // output = Both are  not equal
		{
			System.out.println("Both values are equal");
		}else {
			System.out.println("Both are  not equal");
		}
		
		
		// equals function . checking the values are equal.
		System.out.println(s3.equals(s4));  // output = true.
		System.out.println(s1.equals(s4));  // this also equals ,because checking values.
		
		
		
		// code snippet1
		String a = "one";
		String b = "one";
		String c=b;
		System.out.println(c==a); //output = true.  pointing same references
		
		
		// code snippet2
		String x ="one";
		String y = new String("one");
		System.out.println(x==y); // output = false.
		
		// code snippet3   //Ee sala Cup namdhey output.
		//String RCB = "win";
		String RCB = in.nextLine();  // getting input from user optional.
		if(RCB.equals("win")) {
			System.out.println("Ee sala Cup namdhey");
		}else {
			System.out.println("No cup");
		}
	}

}
