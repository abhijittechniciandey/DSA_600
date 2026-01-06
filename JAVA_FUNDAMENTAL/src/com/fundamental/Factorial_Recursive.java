package com.fundamental;


public class Factorial_Recursive {
	
	static int checkFactorial(int num) {
		if(num==0) {
			return 1;
		}
		return num * checkFactorial(num-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(checkFactorial(5));

	}

}
