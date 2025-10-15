package com.codegnan.fundamentals;

import java.util.Scanner;

public class TrangleAreaCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base of traingle");
		double base =sc.nextDouble();
		System.out.println("enter height of traingle");
		double height=sc.nextDouble();
		double area=0.5*base*height;
		System.out.println("Area of traingle "+area);
		sc.close();
	}

}
