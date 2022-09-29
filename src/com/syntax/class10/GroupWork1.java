package com.syntax.class10;

public class GroupWork1 {

	public static void main(String[] args) {
		//Write a program to print out duplicate elements from an Array of Strings?
		
		String[] arr= {"Angelo", "Justyna", "Romel", "Aladin", "Puskar", "Isabella", "Viktoriia", 
				"Charles", "Christian", "Liza", "Puskar", "Angelo"};
		
		for(int i=0; i<=arr.length; i++) {
			
			for(int j = i + 1; j<arr.length; j++)
			
				if(arr[i]==arr[j]) {
		
				System.out.println(arr[j]+ " is a duplicate name");
			}
		}
	}

}
