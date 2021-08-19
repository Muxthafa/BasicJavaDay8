package com.corejava;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double head=0.00, tail=0.00;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of times to flip:");
		int num = sc.nextInt();
		Random r = new Random();
		for(int i=0;i<num;i++)
		{
			float res = r.nextFloat();	// random float value
			if(res < 0.5)
			{
				tail++;			// increasing tail side occurence
			}
			else {
				head++;			//increasing head side occurence
			}
		}
		System.out.println("Percentage of Heads: "+(head/num)*100+"%");	//displaying the percentage
		System.out.println("Percentage of Tails: "+(tail/num)*100+"%");
	}

}
