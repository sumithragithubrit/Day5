package com.coreproblems;

import java.util.Scanner;

public class swaping {

	public static void main(String[] args) {
		System.out.println("enter number1");
		Scanner Scan=new Scanner(System.in);
         int num1 = Scan.nextInt();
         System.out.println("enter number1");
         int num2=Scan.nextInt();
         int temp;
         temp=num1;
         num1=num2;
         num2=temp;
         System.out.println("number1 after swaping"+num1);
         System.out.println("number2 after swaping"+num2);
	}

}
