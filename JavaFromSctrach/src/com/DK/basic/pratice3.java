package com.DK.basic;

import java.util.Scanner;
// logical operator.

public class pratice3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int mark = in.nextInt();
//		if(mark >= 35) {
//			System.out.println("you are pass");
//		}else {
//			System.out.println("You are fail");
//		}
		
		int num = in.nextInt();
		if(num%3==0 && num%5==0) {
			System.out.println("The number is Divisible by 3 and 5");
		}else {
			System.out.println("The number is not Divisible by 3 and 5");
		}
		
	    // hungry and icrecream = EAT;  
		
		// And operator && symbol pratice ..true+true = true.  false+true = true.
		boolean hungry = true;
		boolean icecream = true;
		if(hungry && icecream)
		{
			System.out.println("EAT");
		}else {
			System.out.println("Dont EAT");
		}
		
		// OR operator.
		//cricket or football = play
		// t or t =t
		//t or f =t
		//f or t = t
		//f or f = f
		boolean cricket = false;
		boolean football = true;
		if(cricket || football) {
			System.out.println("Play");
		}else {
			System.out.println("Not play");
		}
		
		// if the number is even or odd.
		int check = 12;
		if(check%2==0) {
			System.out.println("The number is Even");
		}else {
			System.out.println("The number is odd");
		}
	}

}
