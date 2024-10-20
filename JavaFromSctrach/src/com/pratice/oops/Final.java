package com.pratice.oops;
class A1{
	final void disp() {
		System.out.println("A");
	}
}
class B1 extends A1{
	// cannot override method
}
final class C1{
	
}
//class D1 extends C1{
	// cannot ovveride.
//}
public class Final {

	public static void main(String[] args) {
		final int a = 20;
		//a=30; error cannot change the value.
		System.out.println(a);
		B1 b = new B1();
		b.disp();
	}

}
