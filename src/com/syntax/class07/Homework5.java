package com.syntax.class07;

import java.util.Scanner;
public class Homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int i = 1;
		String name="";
		
		do {
			System.out.println("Please enter your name: ");
			name = scanner.nextLine();
			i++;
		}
		while(i<4);
		System.out.print("Good afternoon " + name);
	}

}
