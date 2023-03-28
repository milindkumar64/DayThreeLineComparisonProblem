package com.bridgelabz.ucfour;

import java.util.Scanner;

public class RefactorUC3UsingOops {
	
	static double lenghtOfFirstLine;
	static double lenghtOfSecondLine;
	
	static void creatingTwoLines()
	{
Scanner sc = new Scanner(System.in);
		
		System.out.println("Put Values for First Line ");
		System.out.println("Enter x1: ");
		int x1 = sc.nextInt();
		
		System.out.println("Enter y1: ");
		int y1 = sc.nextInt();
		
		System.out.println("Enter x2: ");
		int x2 = sc.nextInt();
		
		System.out.println("Enter y1: ");
		int y2 = sc.nextInt();
		
		System.out.println("Put Values for Second Line ");
		System.out.println("Enter p1: ");
		int p1 = sc.nextInt();
		
		System.out.println("Enter q1: ");
		int q1 = sc.nextInt();
		
		System.out.println("Enter p2: ");
		int p2 = sc.nextInt();
		
		System.out.println("Enter q2: ");
		int q2 = sc.nextInt();
		
		 lenghtOfFirstLine=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		 lenghtOfSecondLine=Math.sqrt(Math.pow((p2-p1),2)+Math.pow((q2-q1),2));
		
		System.out.println("Length of both lines are :"+lenghtOfFirstLine+" and "+lenghtOfSecondLine);
	}
	
	static void lineComapare()
	{
		Double length1 = new Double(lenghtOfFirstLine);
		Double length2 = new Double(lenghtOfSecondLine);
		
		int compareValue = length1.compareTo(length2);
		
		if(length1.equals(length2))
		    System.out.println("Both lines are equal");
		else
			System.out.println("Both lines are not equal");
			
		//Comparing Lines
		if (compareValue == 0)
            System.out.println("Line1 and Line2 are equal");
        else if (compareValue < 0)
            System.out.println("Line1 is less than Line2");
        else
            System.out.println("Line1 is greater than Line2");
	}

	public static void main(String[] args) {
		
		creatingTwoLines();
		lineComapare();
	}

}
