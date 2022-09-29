package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	
		int secret = 27;
		Scanner scanner = new Scanner(System.in);
		int num1;
		do {

			System.out.print("Please enter a random number from 1 to 50: ");
			num1 = scanner.nextInt();
			
			if(num1>secret) {
				System.out.println("Please try again!");
			}else if(num1<secret) {
				System.out.println("Please try again!");
			}else {
				System.out.println("YOU WON!");
			}}	
		while(num1!=secret);
		}
			
		
	

}
