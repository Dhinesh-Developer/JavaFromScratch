package sctrach_Exception_pratice;

import java.util.Scanner;
class DivisonExample{
	void divideNumber(int num,int den) {
		try {
			int res = num/den;
			System.out.println("result is: "+res);
		}catch(ArithmeticException a) {
			System.out.println("Canno div num by zero");
		}
	}
}
public class program3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		DivisonExample d = new DivisonExample();
		d.divideNumber(a, b);
	}

}
