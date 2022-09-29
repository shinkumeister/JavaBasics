package com.syntax.class08;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int eventotal = 0;
		int oddtotal = 0;
		while(i<=50) {
			
			if(i%2==0) {
				eventotal=eventotal+i;
			
		}else {
				oddtotal = oddtotal+i;
			}
			i++;
	}
		System.out.println("Total of even numbers "+eventotal);
		System.out.println("Total of odd numbers "+oddtotal);

}
}
