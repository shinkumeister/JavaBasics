package com.syntax.class12;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Please enter Mom's first name: ");	
		String mom = scanner.nextLine();
		System.out.print("Please enter Dad's first name: ");	
		String dad = scanner.nextLine();
		System.out.print("Please enter the gender of the baby: ");	
		String gender = scanner.nextLine();
		
		if(gender.equalsIgnoreCase("boy")) {
			System.out.print("Suggested baby name: " + dad.substring(0,dad.length()/2) + mom.substring(mom.length()/2, mom.length()));
		}else if(gender.equalsIgnoreCase("girl")) {
			System.out.print("Suggested baby name: " + mom.substring(0,mom.length()/2) + dad.substring(dad.length()/2, dad.length()));
		}else {
			System.out.println("Please enter valid answers");
		}
		
	}

}
