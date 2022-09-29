package com.syntax.class09;

public class Homework4 {

	public static void main(String[] args) {

		int[] number= {2000, 150, 600, 725, 310};
		int largest = 0;
		
		for(int i=0; i<number.length; i++) {
			if(number[i]>largest) {
				largest= number[i];
			}
		}
		System.out.print(largest);
		
	
	}

	}


