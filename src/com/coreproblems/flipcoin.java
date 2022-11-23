package com.coreproblems;
import java.util.Scanner;
import java.util.Random;
public class flipcoin {

	public static void main(String[] args) {
		System.out.println("The number of times to flip coin:");
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		double randomnumbers=Math.random();
		System.out.println(randomnumbers);
		int head=0;
		int tail=0;
		int i;
		for(i=0;i<=N;i++)
		{
		if(randomnumbers<0.5)
		{
			
			  tail ++;
		}
		else
		{
			 
			  head ++;
		}
		  System.out.println("Number of Tails"+tail);
		 double percentageoftail=(tail/N)*100;
		  System.out.println("percentage of tails:"+percentageoftail);
		  
		  System.out.println("Number of Head"+head);
			 double percentageofhead=(head/N)*100;
			  System.out.println("percentage of head:"+percentageofhead);
		}
	
	}

}
