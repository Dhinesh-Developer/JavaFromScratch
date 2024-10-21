package sctrach_Exception_pratice;

import java.util.Scanner;
class NotValidException extends Exception{
	public NotValidException(String s) {
		super(s);
	}
	
}
public class customException {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			int age = in.nextInt();
			if(age<18) {
				throw new NotValidException("Age is below 19 , so not allowed");
			}
		}
		catch(NotValidException n) {
			System.out.println(n);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
