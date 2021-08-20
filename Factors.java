package com.corejava;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");	//number to find prime factor
		int n=sc.nextInt();
		sc.close();
		System.out.println("Prime factors of "+n+" are");
		for(int i=2;i<=n;i++)			//logic to print prime factors
		{
			while(n%i == 0)
			{
				System.out.println(i+" ");
				n=n/i;
			}
		}
	}

}
