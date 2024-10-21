package sctrach_Exception_pratice;

import java.util.Scanner;

public class throwKeyword {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*
		 * try {
			int a=10;
			//throw new Exception();  //java.lang.Exception
			throw new ArithmeticException();  //java.lang.ArithmeticException
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(Exception a) {
			System.out.println(a);
		}
		 */
		
		try {
			int age = in.nextInt();
			if(age<1) {
				{
					throw new ArithmeticException("Age should be greater than 1");
				}
			}
		}finally {
			System.out.println("Program Ended");
		}
		
	}

}
