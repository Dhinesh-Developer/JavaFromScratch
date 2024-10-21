package sctrach_Exception_pratice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			int a = in.nextInt();
			a = a/0;    // java.lang.ArithmeticException: 
			System.out.println(a);
		}
		catch(InputMismatchException e) {  // java.util.InputMismatchException
			System.out.println(e);
		}
		catch(ArithmeticException a) {
			System.out.println(a);
		}
		System.out.println("Program end");
	}

}
