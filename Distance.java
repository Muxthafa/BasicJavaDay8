package com.corejava;

public class Distance {
	public static void euclideanDistance(int x, int y){
		double d=Math.sqrt(Math.pow(x,x)+Math.pow(y,y));
		System.out.println("Distance is : "+d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		euclideanDistance(x,y);
	}

}
