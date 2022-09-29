package com.syntax.class06;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your country: ");
		String country = scanner.nextLine();
		
		switch (country) {
		
			case "America":
				System.out.println("The user speaks english");
				break;
			case "Spain":
				System.out.println("The user speaks spanish");
				break;
			case "Philippines":
				System.out.println("The user speaks tagalog");
				break;
			case "Japan":
				System.out.println("The user speaks japanese");
				break;
			case "Korea":
				System.out.println("The user speaks Korean");
				break;
			case "Thailand":
				System.out.println("The user speaks thai");
				break;
			case "Greece":
				System.out.println("The user speaks greek");
				break;
			default:
				System.out.println("Country is unknown.");
				break;
		}
		
	}

}
