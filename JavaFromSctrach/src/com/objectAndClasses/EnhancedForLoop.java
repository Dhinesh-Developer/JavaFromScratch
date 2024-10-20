package com.objectAndClasses;
//Enhanced For Loop
public class EnhancedForLoop {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		// Enhanced For loop
		for(int x:ar) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		//Traditional For Loop
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		// String also work.
		String[] s = {"one","two","three","four"};
		for(String y:s) {
			System.out.print(y+" ");
		}
	}

}
