package com.objectAndClasses;

public class program2 {
	// Function without parameter.
	void iphone() {
		System.out.println("iphone mobile");
	}
	void oppo() {
		System.out.println("oppo mobile");
	}
	void poco() {
		System.out.println("oppo mobile");
	}
	void vivo() {
		System.out.println("vivo mobile");
	}
	
	
	// Function with
	parameter.
    int a;
    int b;
    void add(int a,int b) {
    	int c =a+b;
    	System.out.println(c);
    }
    void garden(int price,int count) {
    	int total_Money = price*count;
    	System.out.println("Total amount - "+total_Money);
    }


public static void main(String[] args) {
	program2 p = new program2();
	p.poco();
	p.iphone();
	p.add(10, 20);
	p.garden(20, 5);
}

}
