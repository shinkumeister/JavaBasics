package com.syntax.class08;

public class ClockWSeconds {

	public static void main(String[] args) {
		
		for(int a=0; a<=2; a++) {
			for(int b=0; b<=9; b++) {
				if(a==2 && b==4) {
					break;
				}
					for(int c=0; c<=5; c++) {
						for(int d=0; d<=9; d++) {
							for(int e=0; e<=5; e++) {
								for(int f=0; f<=9; f++) {
									System.out.println(a +""+ b +":"+ c +""+ d+":"+e+""+f);
								}
							}
					}
				}
			}
		}
	}

}
