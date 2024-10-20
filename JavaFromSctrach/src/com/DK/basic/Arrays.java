package com.DK.basic;

import java.util.Scanner;

// Arrays in Java. array start from 0
public class Arrays {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
//		String[] s = new String[3];
//		for(int i=0;i<s.length;i++)
//		{
//			s[i] = in.next();
//		}
//		for(String x : s)
//		{
//			System.out.print(x+" ");
//		}
//		
//		
//		
//		int[] a = new int[4];
//		for(int i=0;i<a.length;i++) {
//			a[i] = in.nextInt();
//		}
//		for(int y : a) {
//			System.out.print(y+" ");
//		}
		
		// two Dimensional
		int size1 = in.nextInt();
		int size2 = in.nextInt();
		int[][] d = new int[size1][size2];
		for(int i=0;i<size1;i++){
			for(int j=0;j<size2;j++) {
				d[i][j] = in.nextInt();
			}
		}
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				System.out.print(d[i][j]+" ");
			}
		}
		
		
	}

}
