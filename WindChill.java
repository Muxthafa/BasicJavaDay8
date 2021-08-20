package com.corejava;

public class WindChill {
	/* windChill method is used to calculate effective temperature
	 * @param t is the first parameter corresponding to temperature
	 * @param v is the second parameter corresponding to wind speed
	 */
	public static void windChill(int t, int v){
		double w=((35.74)+(0.6215)*t)+((0.4275)*t-(35.75))*(Math.pow(v,0.16));
		System.out.println(w);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*inputs from command line arguments which stores as string
		 * converting to integer using parseint method
		 */
		int t=Integer.parseInt(args[0]);	//temperature in fahrenheit
		int v=Integer.parseInt(args[1]);	//wind speed in miles/hour
		windChill(t,v);		//function call to windChill
	}

}
