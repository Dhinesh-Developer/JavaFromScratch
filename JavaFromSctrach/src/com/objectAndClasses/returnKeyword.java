package com.objectAndClasses;
// Return keyword.
public class returnKeyword {
	static int getSoap(int money) {
		int soap =18;
		int rem = money-soap;
		return rem;
	}
	int a,b;
	int sum(int a,int b) {
		this.a = a;
		this.b = b;
		return a+b;
	}
	String getname(String name)
	{
		System.out.println("My name: "+name);
		return name;
	}
	public static void main(String[] args) {
		int bal = getSoap(20);
		System.out.println(bal);
		returnKeyword rk = new returnKeyword();
		System.out.println("Addition of Two number: "+rk.sum(2, 3));
		fp.getname("Kumar");
	}

}
