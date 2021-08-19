package com.corejava;

import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter an alphabet:");
		char alph = sc.next().charAt(0);		//takes an alphabet to compare with vowels
		if(alph == 'a' || alph == 'A' || alph == 'e' || alph == 'E' || alph == 'i' || alph == 'I' || alph == 'o' || alph == 'O' || alph == 'u' || alph == 'U')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
	}
}

