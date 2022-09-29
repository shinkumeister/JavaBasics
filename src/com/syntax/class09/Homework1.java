package com.syntax.class09;

public class Homework1 {

	public static void main(String[] args) {


		String[] car= {"Toyota","Honda", "Tesla", "Ferrari", "Ford", "Porsche"};
		
		for(int i=0; i<car.length; i++) {
			System.out.print(car[i]+" ");
		}
		System.out.println();
		for(String brand: car) {
			System.out.print(brand+ " ");
		
		}
	}

}