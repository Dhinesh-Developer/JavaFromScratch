package com.DK.basic;
import java.lang.System;  // display purpose.
import java.util.Scanner;  //get input from user.
public class getUserInput {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
//		int a = in.nextInt();   //Getting input from user
//		System.out.println(a);  //Display the output.
		
		// Getting input and add two elements.
//		int num1 = in.nextInt();
//		int num2 = in.nextInt();
//		System.out.println(num1+num2);
		
		//Getting the input for string  nextLine for sentence   and next for one word.
		String s = in.nextLine();
		System.out.println(s);
	}

}
