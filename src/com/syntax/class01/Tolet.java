package com.syntax.class01;
import java.util.Scanner;
public class Tolet {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Is totolet cute? ");
		boolean totolet = scanner.nextBoolean();
		
		if(totolet) {
			System.out.print("Is the aircon on? ");
			boolean aircon = scanner.nextBoolean();
			if(aircon) {
				System.out.print("Is the aircon with mommy? ");
				boolean mommy = scanner.nextBoolean();	
				System.out.print("Is the aircon with lola? ");
				boolean lolalolo = scanner.nextBoolean();
				if(mommy) {
					System.out.print("Cute totolet will sleep with cute mommy!");
				}else if(lolalolo) {
				System.out.print("Cute totolet will sleep with lolo and lola!");
				}
			}else {
				System.out.print("Cute totolet will sleep with cute mommy!");
			}
			
		}else {
			System.out.print("Wrong decision mommy! I will bite you later!");
		}
		
	}

}
