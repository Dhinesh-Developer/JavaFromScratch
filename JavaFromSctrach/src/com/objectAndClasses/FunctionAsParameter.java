package com.objectAndClasses;

// Function as parameter
public class FunctionAsParameter {
	int money;
	void getSoap(int money){
		this.money = money;
		System.out.println("You got an Soap");
	}
	
	
	void getChoclate(int money) {
		this.money = money;
		System.out.println("You purchased an chocalate");
	}
	int a,b;
	void sum(int a,int b) {
		this.a = a;
		this.b = b;
		System.out.println(a+b);
	}
	void div(int a,int b) {
		this.a = a;
		this.b = b;
		System.out.println(a/b);
	}
	void sub(int a,int b) {
		this.a = a;
		this.b = b;
		System.out.println(a-b);
	}
	void mul(int a,int b) {
		this.a = a;
		this.b = b;
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		FunctionAsParameter fp = new FunctionAsParameter();
		fp.getSoap(20);
		fp.getChoclate(10);  // output = You got an Soap   	You purchased an chocolate
		fp.sum(10,20);
		fp.sub(10,5);
		fp.mul(10,20);
		fp.div(20,10);
	
		
	}

}
