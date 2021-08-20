package com.corejava;

import java.util.Scanner;

public class SumOfThree {
	public static void sumzero(int[] arr, int n) {
		boolean found = false;
		int count = 0;
		for(int i=0; i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;j<n;j++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						count++;
						System.out.println("Triplets are "+arr[i]+","+arr[j]+","+arr[k]);
						found = true;
					}
					
					
				}
			}
		}
		if(found==false) {
			System.out.println("No triplets found");
		}
		System.out.println("Total triplet pairs : "+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int num = sc.nextInt();
		int[] a = new int[num];
		System.out.println("Enter the elements of the array :");
		for(int i=0;i<num;i++) {
			a[i]=sc.nextInt();
		}
		sumzero(a,num);
		sc.close();
	}

}
