package com.DK.basic;

import java.util.Scanner;

public class pratice2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		double score = in.nextDouble();
		in.nextLine();
		String dept = in.nextLine();
		System.out.println("My name is "+name);
		System.out.println("My score is "+score/10);
		System.out.println("My dept is "+dept);


	}

}
