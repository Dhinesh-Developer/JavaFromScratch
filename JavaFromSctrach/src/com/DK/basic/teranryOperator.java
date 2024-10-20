package com.DK.basic;

//syntax.
//   variable = (condition) ? valueIfTrue : valueIfFAlse

public class teranryOperator {

	public static void main(String[] args) {
		// Ternary operator.  it will return somsthing, but if else does not return.
		System.out.println(true?"yes":"No"); //output = yes
		String res = true?"yes":"No";
		System.out.println(res);  //yes
		
		
		//snippet 2
		boolean rain = true;
		String result = rain?"Take an umbrella":"Enjoy the sunlight";
		System.out.println(result);
	}

}
