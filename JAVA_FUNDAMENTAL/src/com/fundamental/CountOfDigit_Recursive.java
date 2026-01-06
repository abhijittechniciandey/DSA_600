package com.fundamental;

public class CountOfDigit_Recursive {
	
	static int countofDigit(long n) {
		
		if(n/10==0) 
			return 1;
		return 1+countofDigit(n/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long n = 1234563;
		System.out.print("Number of digits : "
				+ countofDigit(n));

	}

}
