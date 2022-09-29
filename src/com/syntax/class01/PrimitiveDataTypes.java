package com.syntax.class01;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
		// storing and representing numeric values;
		byte box1 = 127;
		short box2 = 32767;
		int box3 = 100000; //most popular
		long box4 = 1065585855858585L;  //used for credit cards and transaction numbers, use L or l at end if number is very high
		
		//storing and representing decimal values
		float variable1 = 1.99F; //smaller than double
		double variable2 = 99.99;
		
		//storing single characters
		char container = 'a';
		char dollar = '$';
		
		//storing yes or no
		boolean hot = true;
		boolean tired = false;
		
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(box4);
		System.out.println(variable1);
		System.out.println(variable2);
		System.out.println(container);
		System.out.println(dollar);
		System.out.println(hot);
		System.out.println(tired);

		
	}

}
