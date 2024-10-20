package com.DK.basic;

import java.util.Scanner;

// For Loop.
//  for(start/initialize; end/condition; increment/decrement)
public class forLoop {

	public static void main(String[] args) {

		for(int i=0;i<10;i++) {
			System.out.println("Kumar is the Best");
		}

		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		} // output = 1 2 3 4 5 6 7 8 9 10 

		//
		//		// code snippet3 
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		for(int i=x;i<=y;i++) {
			System.out.print(i+" ");
		}  // output = 5 6 7 8 9 10
		//
		//		// code snippet 4
		//		// print even number between 1 to 10
		int a = in.nextInt();
		int b = in.nextInt();
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

		// count the number of odd numbers.
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int d = scan.nextInt();
		int count = 0;
		for(int i=c;i<=d;i++) {
			if(i%2!=0) {
				count++;
			}
		}
		System.out.println(count);

		// print the number which are divisible by both 3 and 5 , range from 1 to 100


	}

}
