package com.syntax.class07;

import java.util.Scanner;
public class Homework6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double price = 1;
		double payment;
		Scanner scanner = new Scanner(System.in);
		
		do {

			System.out.println("You need to pay $" + price);
			System.out.println("Please insert payment: ");
			payment = scanner.nextDouble();
			
			if(payment>price) {
				System.out.println("Please give less");
			}else if(payment<price) {
				System.out.println("Please give more");
			}else {
				System.out.println("Please enjoy your coffee!");
			}}	
		while(payment!=price);
		}
			
		
	

}
