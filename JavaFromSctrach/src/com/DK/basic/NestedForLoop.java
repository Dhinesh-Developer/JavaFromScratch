package com.DK.basic;
import java.util.Scanner;
// Nested for Loop also Pattern 
public class NestedForLoop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		for(int i=0;i<size;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
				
	}

}
