package com.corejava;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();	//enter the number
		sc.close();
		if(num%2 == 0)			//dividing value by 2 gives either 0 or 1, if the reminder is 0 then even else odd
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

}
