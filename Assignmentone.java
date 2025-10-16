package com.codegnan.fundamentals;

import java.util.Scanner;

public class Assignmentone {

	public static void main(String[] args) {
		//char[] radiusofcircle;
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		//first problem
//		System.out.println("Enter radius value ");
//		int radius=sc.nextInt();
//		double area= 3.14 * (radius*radius);
//		System.out.println(area);
		
		//Second problem 
//		System.out.println("Enter the price");
//		double price=sc.nextDouble();
//		System.out.println("Enter the rate of interest ");
//		double rate=sc.nextDouble();
//		System.out.println("Enter the time in years");
//		double time=sc.nextDouble();
		
		//double sip=(price*rate*time)/100;
		//System.out.println(sip);
		
		//third problem
//		double amount=price*(1+rate/100)*(time*time);
//		double comp=amount-price;
//		System.out.println(comp);
		
		//problem fourth
//
//		System.out.println("Enter Student name ");
//		String name=sc.nextLine();
//		System.out.println("Enter Student Roll Number");
//		int roll=sc.nextInt();
//		System.out.println("Enter Student age ");
//		int age=sc.nextInt();
//		System.out.println("Enter Student grade");
//		String grade=sc.next();
//		
//		System.out.println("Student name is "+name + " Student roll number is "+roll +" Student age is "+age +" Student grade is"+grade);
//		
		
		//fifth problem
		System.out.println("Enter the principle rate");
		double principal=sc.nextDouble();
		System.out.println("Enter the rate of interest ");
		double rate=sc.nextDouble();
		System.out.println("Enter the time in months");
		int time=sc.nextInt();
		
		double year=time/12;
		double simple =(principal*rate*year)/100;
		
		System.out.println("Simple interest is "+simple);
		
		double amount=(principal*(1+rate/100))*(year*year);
		double compound = amount-principal;
		System.out.println("the compound interest is " +compound);
	}

	

}
