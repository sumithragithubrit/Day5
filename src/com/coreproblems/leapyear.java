package com.coreproblems;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		System.out.println("Enter the Year:");
		Scanner s=new Scanner(System.in);
		int Year=s.nextInt();
		    if(Year>999)
		     {
               if(Year%4==0 || Year%400==0)
             {
             	System.out.println("It is a Leap Year");
             }
               else if(Year%100!=0)
             {
        	    System.out.println("It is a not a Leap Year");	
             }
		     }
		    else
		    {
		    	System.out.println("You Entered year is not 4 digit ");	
		    }
	}

}
