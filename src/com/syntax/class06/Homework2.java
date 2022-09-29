package com.syntax.class06;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your letter grade");
		char grade=scanner.next().charAt(0);

		   if (grade=='A'){
		     System.out.println("Excellent");
		   }
		   else  if (grade=='B'){
		     System.out.println("Good");
		   }
		   else  if (grade=='C'){
		     System.out.println("Average");
		   }
		   else  if (grade=='D'){
		     System.out.println("Bad");
		   }
		   else {
		     System.out.println("Not Acceptable");
		   }
	}}

		
		
	


