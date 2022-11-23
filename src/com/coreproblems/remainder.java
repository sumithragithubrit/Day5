package com.coreproblems;

import java.util.Scanner;

public class remainder {

	public static void main(String[] args) {
		System.out.println("Enter Devidend value");
		Scanner Scan=new Scanner(System.in);
          int Dividend = Scan.nextInt(); 
         System.out.println("Enter Divisor");
         int Divisor=Scan.nextInt();
         double Quotient=(Dividend/Divisor);
         System.out.println("Quotient value"+Quotient);
         double Remainder=(Dividend%Divisor);
         System.out.println("Quotient value"+Remainder);
	}

}
