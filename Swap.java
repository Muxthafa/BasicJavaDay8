package com.corejava;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();
		System.out.println("Before swapping: "+num1+" "+num2);
		sc.close();
		int temp;		//Declaring variable to store temporary value 
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swapping: "+num1+" "+num2);
	}

}
