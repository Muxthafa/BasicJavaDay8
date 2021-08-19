package com.corejava;

import java.util.Scanner;

public class LargestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number:");
		int num2 = sc.nextInt();
		System.out.println("Enter the third number:");
		int num3 = sc.nextInt();
		sc.close();
		
		if(num1>num2) {			// if first number > second number
			if(num1>num3) {		// if first number > third number
				System.out.println("First number is largest!");
			}
			else {				//third number must be largest
				System.out.println("Third number is largest!");
			}
		}
		else if(num2>num3) {	// if second number > third number
			System.out.println("Second number is largest!");
		}
		else					//third number must be largest
		{
			System.out.println("Third number is largest");
		}

	}

}
