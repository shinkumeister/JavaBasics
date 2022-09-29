package com.syntax.class06;

import java.util.Scanner;

public class TaskEnhaced1 {


        public static void main(String[] args) {
            // TODO Auto-generated method stub
    Scanner input=new Scanner(System.in);
    System.out.println("What month you were born? ");
    String season=input.nextLine();
    String month =null;

    if (season.equalsIgnoreCase("January") ||season.equalsIgnoreCase("February") || season.equalsIgnoreCase("December")) {
        month="Winter";
        
    }else if(season.equalsIgnoreCase("March")  ||season.equalsIgnoreCase("April") ||season.equalsIgnoreCase("May")) {
        month= "Spring";
        
    }else if(season.equalsIgnoreCase("June") || season.equalsIgnoreCase("july") || season.equalsIgnoreCase("August")) {
        month="Summer";
        
    }else if(season.equalsIgnoreCase("September") || season.equalsIgnoreCase("October") || season.equalsIgnoreCase("November")) {
        month="Fall";
    }else{
        System.out.println("invalid");
    }
    	System.out.println("You were born in the season " + month);
        }



        }