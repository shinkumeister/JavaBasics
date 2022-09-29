package com.syntax.class08;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	int price;
	String item="";
	int total=0;
	int payment;
	int less;
	int sub;
	
	System.out.println("Please enter what item you want to buy: ");
	item = scanner.nextLine();
	System.out.println("Please enter the price of the item: ");
	price = scanner.nextInt();
	System.out.print("Please insert payment ");
	do {
		payment = scanner.nextInt();
		System.out.println("We have received $"+payment);

		sub= total+payment;
		less = sub-price;
		if(sub<price) {
			System.out.println("You still need to pay $"+less );
			System.out.print("Please insert payment ");
		}else if(sub>price){

			System.out.println("Dont forget to take your change"+less );
			System.out.println("Thank you for your purchase!");
		}
		else{
				System.out.println("Thank you for your purchase!");
			}
		
		total = sub;
		
	}while (price!=total);
		
	
	
	}

}
