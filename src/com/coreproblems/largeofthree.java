package com.coreproblems;

import java.util.Scanner;

public class largeofthree {

	public static void main(String[] args) {
		System.out.println("enter number 1");
		Scanner Scan=new Scanner(System.in);
         int num1 = Scan.nextInt();
         System.out.println("enter number 2");
         int num2 = Scan.nextInt();
         System.out.println("enter number 3");
         int num3 = Scan.nextInt();
         if(num1>num2 && num1>num3)
         {
        	 System.out.println(num1+"Is large");
         }
         else if(num2>num1 && num2>num3)
         {
        	 System.out.println(num2+"Is large"); 
         }
         else
         {
        	 System.out.println(num3+"Is large");
         }
	}

}
