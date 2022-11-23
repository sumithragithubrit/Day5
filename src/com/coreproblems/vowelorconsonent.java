package com.coreproblems;

import java.util.Scanner;

public class vowelorconsonent {

	public static void main(String[] args) {
		System.out.println("Enter Alphabets from A to Z");
		Scanner Scan=new Scanner(System.in);
         char ch = Scan.next().charAt(0);
         if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
         {
        	 System.out.println("It is a vowel"); 
         }
         else
         {
        	 System.out.println("It is a Consonent"); 
         }
	}

}
