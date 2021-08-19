package com.corejava;

import java.util.Scanner;

public class QuotRem {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the dividend:");
		int num=sc.nextInt();
		System.out.println("Enter the divisor:");
		int den=sc.nextInt();
		sc.close();
		int quotient = num/den;		//gives quotient
		int reminder = num% den;	//gives reminder
		System.out.println("quotient: "+quotient);
		System.out.println("reminder: "+reminder);
	}
}
