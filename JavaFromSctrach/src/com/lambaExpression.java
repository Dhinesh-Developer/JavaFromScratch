package com.pratice.oops;
interface function{
	void disp();
}
public class lambaExpression {
	public static void main(String[] args) {
		function f = new function(){
			public void disp()
			{
				System.out.println("This is like function");
			}
		};
		f.disp();// This is like function
		
		
		// Lamba function.
		function f1 = ()->
		{
			System.out.println("This is Lamba function");
		};
		f1.disp();  //This is Lamba function.
		
	}

}
