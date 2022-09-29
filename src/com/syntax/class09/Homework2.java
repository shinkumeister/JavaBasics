package com.syntax.class09;

public class Homework2 {

	public static void main(String[] args) {
		

		String[] animal= {"Dog", "Cat","Sheep","Goat","Cow",};
		
		for(int i=0; i<animal.length; i++) {
			System.out.print(animal[i]+" ");
		}
		System.out.println();
		for(String name: animal) {
			System.out.print(name+ " ");
		
		}
		
		}
	}

