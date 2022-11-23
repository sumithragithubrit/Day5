package com.coreproblems;

import java.util.Scanner;

public class evenorodd {
	static void m1( int x)
	{
		if(x%2==0)
		{
			System.out.println("entered  number is even");
		}
		else
		{
			System.out.println("entered  number is odd");
		}
	}
	

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner Scan=new Scanner(System.in);
         int num = Scan.nextInt();
		m1(num);
		
	}

}
