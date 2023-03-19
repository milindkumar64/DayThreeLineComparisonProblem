package com.bridgelabz.ucone;

import java.util.Scanner;

public class CalculateLengthOfLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x1: ");
		int x1 = sc.nextInt();
		
		System.out.println("Enter y1: ");
		int y1 = sc.nextInt();
		
		System.out.println("Enter x2: ");
		int x2 = sc.nextInt();
		
		System.out.println("Enter y1: ");
		int y2 = sc.nextInt();
		
		double lenghtOfLine=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		
		System.out.println("Length of Given Line is :" +lenghtOfLine);
		
		
	}

}
