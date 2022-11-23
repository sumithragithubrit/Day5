package com.coreproblems;

import java.util.Scanner;

public class harmonic {

	public static void main(String[] args) {
		System.out.println("Enter a number");

		Scanner Scan=new Scanner(System.in);
        int Number = Scan.nextInt();
        double i;
        double sum=0.0;
        for(i=1;i<=Number;i++)
        {
        	  sum=sum+(1/i);
        	  
        }
        System.out.println(Number+"hormonic value is"+sum);
       

	}

}
