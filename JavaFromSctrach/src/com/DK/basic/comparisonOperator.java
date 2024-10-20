package com.DK.basic;

import java.util.Scanner;
//Integer number Comparison.
public class comparisonOperator {

	public static void main(String[] args) {
		
//		// comparison operator.
//		System.out.println(7>5);  // output = true  it working like boolean.
//		System.out.println(3>5);  // output = false  it working like boolean.
		
		
		// ouput for this    = N2 is Greater   if both number is equal always execute else part
//		int n1 = 10;
//		int n2 = 10;
//		if(n1<n2){
//			System.out.println("N1 is Greater");
//		}else {
//			System.out.println("N2 is Greater");
//		}
		
		System.out.println(3==4);   // ouput is false
		
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		if(num1>num2)
		{
			System.out.println("num1 is greater");
		}else{
			System.out.println("num2 is greater");
		}
	}

}
