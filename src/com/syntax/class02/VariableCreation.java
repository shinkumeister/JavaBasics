package com.syntax.class02;

public class VariableCreation {

	public static void main(String[] args) {
		
		//1 way to create variable
		byte b = 10; //create a variable and assign value
		
		//2nd way to create a variable
		int i; //create a variable
		i = 100; //assign value
		
		// we need to create a variable only once
		//then we can use as many times we want/need
		
		//3rd way
		
		//createvariable and declare variable is the same
		int num1, num2, num3;
		
		num1 = 100;
		num2 = 200;
		num3 = 300;
		
		//int num1=100; error because duplicate variable
		
		//can i change the value of a variable?
		
		System.out.println(num2);//will print 200
		num2 = 2000;
		
		System.out.println(num2);//will print 2000
		
	}

}
