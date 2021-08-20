package com.corejava;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the year:");
		int num = sc.nextInt();
		sc.close();
		boolean leap = false;
		if(num%4 == 0)			//checking divisibility of year by 4
		{
			if(num%100 == 0) {		//checking divisibility of year by 100
				if(num%400 == 0)	//checking divisibility of year by 400
					leap =true;		//boolean set to true
				else
					leap = false;
			}else
			{
				leap= false;
			}
		}else {
			leap=false;
		}
		if(leap == true)
		{
			System.out.println(num+" is a leap year");
		}else {
			System.out.println(num+" is not a leap year");
		}
	}

}
