package com.functional;

public class distance {
	public static void main(String[]args) {
		int x=Integer.valueOf(args[0]);
		int y=Integer.valueOf(args[1]);
		int p=x*x+y*y;
		double distance =Math.pow(p,0.5);
		System.out.println("distance is"+distance);
		
	}

}
