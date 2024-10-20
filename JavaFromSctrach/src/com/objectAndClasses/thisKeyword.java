package com.objectAndClasses;
// this keyword.
public class thisKeyword {
    String myName;
    int mark;
    void display(String myName,int mark) {
    	myName = myName;  // output = null default value
    	this.myName = myName;
    	this.mark = mark;
    	System.out.println(myName+" "+mark);
    }
	public static void main(String[] args) {
		
		thisKeyword tk = new thisKeyword();
		System.out.println(tk.myName); // null
		tk.display("Kumar", 100);
				
	}
}
