package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = input.next();
		System.out.println("Hello " + name);
	}

}
