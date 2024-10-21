package com.pratice.oops;
interface Animal7{
	int mark = 20;
	void sound() ;	
	default void disp() {
		
	}
}

class cat6 implements Animal7{

	@Override
	public void sound() {
		System.out.println("mawoo");
	}
	
}
public class interfaceConcept {

	public static void main(String[] args) {
		cat6 a = new cat6();
		a.sound();
	}

}
