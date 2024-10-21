package sctrach_Exception_pratice;

import java.util.Scanner;

public class program2 {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			int a = in.nextInt();
			int b = in.nextInt();
			 int c = a/b;
		}catch(ArithmeticException e) {
			System.out.println(e+"Give correct value");
		}
		System.out.println("program ends");
	}

}
