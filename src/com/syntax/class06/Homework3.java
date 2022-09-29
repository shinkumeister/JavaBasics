package com.syntax.class06;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		double num1 = scanner.nextDouble();
		System.out.println("Please enter second number: ");
		double num2 = scanner.nextDouble();
		System.out.println("Please enter operator to use: ");
		char operator = scanner.next().charAt(0);
		double add = num1+num2;
		double minus = num1-num2;
		double multiply = num1*num2;
		double divide = num1/num2;
		
		switch (operator) {
			case '+':
				System.out.println("The sum of the two numbers are "+add);break;
			case '-':
				System.out.println("The difference of the two numbers are "+minus);break;
			case '*':
				System.out.println("The product of the two numbers are "+multiply);break;
			case '/':
				System.out.println("The quotient of the two numbers are "+divide);break;
			default:
				System.out.println("Error");break;
		}
				
			if (operator=='+'){
				System.out.println("The sum of the two numbers are "+add);
				}
				else  if (operator=='-'){
				System.out.println("The difference of the two numbers are "+minus);
				}
				else  if (operator=='*'){
				System.out.println("The product of the two numbers are "+multiply);
				}
				else  if (operator=='/'){
				System.out.println("The quotient of the two numbers are "+divide);
				}
				else {
				System.out.println("Error");
				}
				
				
		}
		
	}
